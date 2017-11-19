package service;

import java.sql.Connection;
import java.util.List;

import bean.Post;
import dao.PostDao;
import tools.DbUtil;

public class PostService {
	Connection connection;
	PostDao postDao;

	
	public PostService(){
		connection = DbUtil.getInstance().getConnection();
		postDao = new PostDao();
		postDao.setConnection(connection);
	}

	public List<Post> queryAll(){
		return postDao.queryAll();
		
	}
	
	
	public void add(Post post){
		postDao.save(post);
		
	}
	
	public void remove(String id){
		postDao.remove(id);
	
	}
	
	public Post get(String id){
		return postDao.get(id);
	
	}
	
	public void update(Post post){
		
		//DataBase.updateStudent(student);
	}
	
	public List<Post> queryAllByName(String name){
		return postDao.queryAllByName(name);
		
	}
}
