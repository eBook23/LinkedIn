package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

import bean.User;


public class UserDao {
	private String sql;
	public String getSql() {
		return sql;
	}

	public void setSql(String sql) {
		this.sql = sql;
	}

	public Connection getConnection() {
		return connection;
	}

	public void setConnection(Connection connection) {
		this.connection = connection;
	}

	private Connection connection;
	private Statement stat;
	private PreparedStatement pstat;
	
	public void save(User user){
		this.setSql("insert into user values('"+user.getUUID()+"','"+user.getUsername()+"','"+user.getPassword()+"','"+user.getSex()+"','"+user.getPhone()+"','"+user.getEmail()+"','"+user.getTime()+"',"+user.getPower()+");");
		try {
			stat = connection.createStatement();
			stat.execute(this.getSql());
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
//		UUID a=UUID.randomUUID();
		
	}
	
	public User get(String id){
		this.setSql("select* from user where UUID=?");
		User user = new User();
		try {
			pstat = connection.prepareStatement(getSql());
			pstat.setString(1, id);
			ResultSet rs = pstat.executeQuery();
			rs.next();
			user.setUUID(rs.getString("UUID"));
			user.setUsername(rs.getString("username"));
			user.setPassword(rs.getString("password"));
			user.setSex(rs.getString("sex"));
			user.setPhone(rs.getString("phone"));
			user.setEmail(rs.getString("email"));
			user.setTime(rs.getString("time"));
			user.setPower(rs.getInt("power"));
			return user;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			
		}
		return null;
	}
	
	public void remove(String id){
		this.setSql("delete from user where UUID=?");
		try {
			pstat = connection.prepareStatement(getSql());
			pstat.setString(1, id);
			pstat.execute();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			
		}
	}
	
	public List<User> queryAll(){
		List<User> list = new ArrayList<User>();
		this.setSql("select* from user");
		User user;
		try {
			pstat = connection.prepareStatement(getSql());
			ResultSet rs = pstat.executeQuery();
			while(rs.next()){
				user = new User();
				user.setUUID(rs.getString("UUID"));
				user.setUsername(rs.getString("username"));
				user.setPassword(rs.getString("password"));
				user.setSex(rs.getString("sex"));
				user.setPhone(rs.getString("phone"));
				user.setEmail(rs.getString("email"));
				user.setTime(rs.getString("time"));
				user.setPower(rs.getInt("power"));

				list.add(user);
				
			}
			return list;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			
		}
		
		return null;
	}

	
	
	public List<User> getByName(String sname){
		List<User> list = new ArrayList<User>();
		this.setSql("select* from user where username=?");
		User user;
		try {
			pstat = connection.prepareStatement(getSql());
			pstat.setString(1, sname);
			ResultSet rs = pstat.executeQuery();
			rs.next();
			user = new User();
			user.setUUID(rs.getString("UUID"));
			user.setUsername(rs.getString("username"));
			user.setPassword(rs.getString("password"));
			user.setSex(rs.getString("sex"));
			user.setPhone(rs.getString("phone"));
			user.setEmail(rs.getString("email"));
			user.setTime(rs.getString("time"));
			user.setPower(rs.getInt("power"));
			list.add(user);
			return list;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			
		}
		
		return null;
	}
	
	public void removeByUsername(String username){
		this.setSql("delete from user where username=?");
		try {
			pstat = connection.prepareStatement(getSql());
			pstat.setString(1, username);
			pstat.execute();
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			
		}
	}
	
	public void updateUser(User user){
		remove(user.getUUID());
		save(user);
	}
	
	
	
}
