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
	private Connection connection;
	private Statement stat;
	private PreparedStatement pstat;
	
	public void save(User user){
		this.setSql("insert into user values('"+user.getUUID()+"','"+user.getUsername()+"','"+user.getPassword()+"');");
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
		this.setSql("select UUID,username,password from user where UUID=?");
		User user = new User();
		try {
			pstat = connection.prepareStatement(getSql());
			pstat.setString(1, id);
			ResultSet rs = pstat.executeQuery();
			while(rs.next()){
				user.setUUID(rs.getString("UUID"));
				user.setUsername(rs.getString("username"));
				user.setPassword(rs.getString("password"));
				
		
				return user;
				
			}
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
		this.setSql("select UUID,username,password from user");
		User user;
		try {
			pstat = connection.prepareStatement(getSql());
			ResultSet rs = pstat.executeQuery();
			while(rs.next()){
				user = new User();
				user.setUUID(rs.getString("UUID"));
				user.setUsername(rs.getString("username"));
				user.setPassword(rs.getString("password"));
				

				list.add(user);
				
			}
			return list;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			
		}
		
		return null;
	}

	
	
	public List<User> queryAllByName(String sname){
		List<User> list = new ArrayList<User>();
		this.setSql("select UUID,username,password from user where username=?");
		User user;
		try {
			pstat = connection.prepareStatement(getSql());
			pstat.setString(1, sname);
			ResultSet rs = pstat.executeQuery();
			while(rs.next()){
				user = new User();
				user.setUUID(rs.getString("UUID"));
				user.setUsername(rs.getString("username"));
				user.setPassword(rs.getString("password"));
				

				list.add(user);
				
			}
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
	
	public void save(List<User> list){
		
		for(User user:list){
			this.setSql("insert into user values('"+user.getUUID()+"','"+user.getUsername()+"','"+user.getPassword()+"');");
			try {
				this.pstat = this.connection.prepareStatement(this.getSql());
				this.pstat.addBatch();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}
		try {
			this.pstat.executeBatch();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
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

	public Statement getStat() {
		return stat;
	}

	public void setStat(Statement stat) {
		this.stat = stat;
	}

	public PreparedStatement getPstat() {
		return pstat;
	}

	public void setPstat(PreparedStatement pstat) {
		this.pstat = pstat;
	}
	
	
}
