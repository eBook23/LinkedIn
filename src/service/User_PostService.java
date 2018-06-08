package service;

import java.sql.Connection;
import java.util.List;

import bean.User_post;

import dao.User_PostDao;

import tools.DbUtil;

public class User_PostService {
	User_PostDao upDao=new User_PostDao();



	public List<User_post> queryAll(){
		return upDao.queryAll();
		
	}
	
	
	public void add(User_post company){
		upDao.save(company);
		
	}
	
	public void remove(String id){
		upDao.remove(id);
	
	}
	public void removeByPostId(String pid){
		upDao.removeByPostId(pid);
	}
	
	public User_post get(String id){
		return upDao.get(id);
	
	}
	
	public void update(User_post upost){
		
		upDao.updateUser_post(upost);
	}
	
	public List<User_post> queryAllByPostId(String pid){
		return upDao.queryAllByPostId(pid);
		
	}
}
