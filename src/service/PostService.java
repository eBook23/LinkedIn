package service;

import java.sql.Connection;
import java.util.List;

import bean.Post;
import dao.PostDao;
import tools.DbUtil;

public class PostService {
	PostDao postDao=new PostDao();



	public List<Post> queryAll(){
		return postDao.queryAll();
		
	}
	
	
	public void add(Post post){
		postDao.save(post);
		
	}
	
	public void remove(String id){
		postDao.remove(id);
	
	}
	public void removeByPostName(String name){
		postDao.removeByPostname(name);
	}
	
	public Post get(String id){
		return postDao.get(id);
	
	}
	
	public void update(Post post){
		
		postDao.updatePost(post);
	}
	
	public List<Post> getByName(String name){
		return postDao.queryAllByName(name);
		
	}
}
