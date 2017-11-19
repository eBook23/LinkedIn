package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import bean.Post;


public class PostDao {
	private String sql;
	private Connection connection;
	private Statement stat;
	private PreparedStatement pstat;
	
	public void save(Post post){
		this.setSql("insert into user values('"+post.getUUID()+"','"+post.getName()+"');");
		try {
			stat = connection.createStatement();
			stat.execute(this.getSql());
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
//		UUID a=UUID.randomUUID();
		
	}
	
	public Post get(String id){
		this.setSql("select UUID,name from post where UUID=?");
		Post post = new Post();
		try {
			pstat = connection.prepareStatement(getSql());
			pstat.setString(1, id);
			ResultSet rs = pstat.executeQuery();
			while(rs.next()){
				post.setUUID(rs.getString("UUID"));
				post.setName(rs.getString("name"));
				
				return post;
				
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			
		}
		return null;
	}
	
	public void remove(String id){
		this.setSql("delete from post where UUID=?");
		try {
			pstat = connection.prepareStatement(getSql());
			pstat.setString(1, id);
			pstat.execute();
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			
		}
	}
	
	public List<Post> queryAll(){
		List<Post> list = new ArrayList<Post>();
		this.setSql("select UUID,name from post");
		Post post;
		try {
			pstat = connection.prepareStatement(getSql());
			ResultSet rs = pstat.executeQuery();
			while(rs.next()){
				post = new Post();
				post.setUUID(rs.getString("UUID"));
				post.setName(rs.getString("name"));
				

				list.add(post);
				
			}
			return list;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			
		}
		
		return null;
	}

	
	
	public List<Post> queryAllByName(String sname){
		List<Post> list = new ArrayList<Post>();
		this.setSql("select UUID,name from post where name=?");
		Post post;
		try {
			pstat = connection.prepareStatement(getSql());
			pstat.setString(1, sname);
			ResultSet rs = pstat.executeQuery();
			while(rs.next()){
				post = new Post();
				post.setUUID(rs.getString("UUID"));
				post.setName(rs.getString("name"));
				

				list.add(post);
				
			}
			return list;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			
		}
		
		return null;
	}
	
	public void removeByUsername(String name){
		this.setSql("delete from post where name=?");
		try {
			pstat = connection.prepareStatement(getSql());
			pstat.setString(1, name);
			pstat.execute();
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			
		}
		
	}
	
	public void save(List<Post> list){
		
		for(Post post:list){
			this.setSql("insert into user values('"+post.getUUID()+"','"+post.getName()+"');");
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
