package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import bean.User_post;

public class User_PostDao {
	private String sql;
	private Connection connection;
	private Statement stat;
	private PreparedStatement pstat;
	
	public void save(User_post upost){
		this.setSql("insert into user_post values('"+upost.getUser_id()+"','"+upost.getPost_id()+"');");
		try {
			stat = connection.createStatement();
			stat.execute(this.getSql());
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
//		UUID a=UUID.randomUUID();
		
	}
	
	public User_post get(String uid){
		this.setSql("select user_id,post_id from user_post where user_id=?");
		User_post up = new User_post();
		try {
			pstat = connection.prepareStatement(getSql());
			pstat.setString(1, uid);
			ResultSet rs = pstat.executeQuery();
			while(rs.next()){
				up.setUser_id(rs.getString("user_id"));
				up.setPost_id(rs.getString("post_id"));
				
				return up;
				
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			
		}
		return null;
	}
	
	public void remove(String uid){
		this.setSql("delete from user_post where user_id=?");
		try {
			pstat = connection.prepareStatement(getSql());
			pstat.setString(1, uid);
			pstat.execute();
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			
		}
	}
	
	public List<User_post> queryAll(){
		List<User_post> list = new ArrayList<User_post>();
		this.setSql("select user_id,post_id from user_post");
		User_post up;
		try {
			pstat = connection.prepareStatement(getSql());
			ResultSet rs = pstat.executeQuery();
			while(rs.next()){
				up = new User_post();
				up.setUser_id(rs.getString("user_id"));
				up.setPost_id(rs.getString("post_id"));

				list.add(up);
				
			}
			return list;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			
		}
		
		return null;
	}

	
	
	public List<User_post> queryAllByPostId(String pid){
		List<User_post> list = new ArrayList<User_post>();
		this.setSql("select user_id,post_id from user_post where post_id=?");
		User_post up;
		try {
			pstat = connection.prepareStatement(getSql());
			pstat.setString(1, pid);
			ResultSet rs = pstat.executeQuery();
			while(rs.next()){
				up = new User_post();
				up.setUser_id(rs.getString("user_id"));
				up.setPost_id(rs.getString("post_id"));
				

				list.add(up);
				
			}
			return list;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			
		}
		
		return null;
	}
	
	public void removeByPostId(String pid){
		this.setSql("delete from user_post where post_id=?");
		try {
			pstat = connection.prepareStatement(getSql());
			pstat.setString(1, pid);
			pstat.execute();
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			
		}
		
	}
	
	public void updateUser_post(User_post upost){
		this.setSql("delete from user_post where user_id=?");
		try {
			pstat = connection.prepareStatement(getSql());
			pstat.setString(1, upost.getUser_id());
			pstat.execute();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		this.setSql("insert into user_post values('"+upost.getUser_id()+"','"+upost.getPost_id()+"');");
		try {
			stat = connection.createStatement();
			stat.execute(this.getSql());
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