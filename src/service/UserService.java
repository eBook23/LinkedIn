package service;

import java.sql.Connection;
import java.util.ArrayList;
import java.util.List;

import bean.User;
import dao.UserDao;
import tools.DbUtil;

public class UserService {
	
	private UserDao userDao=new UserDao();

	public void add(User user){
		userDao.save(user);
		
	}
	

	public void remove(String id){
		userDao.remove(id);
	
	}
	

	public void removeByUserName(String username){
		userDao.removeByUsername(username);
	}
	

	public User get(String id){
		return userDao.get(id);
	
	}
	

	public List<User> getByName(String name){
		return userDao.getByName(name);
		
	}
	

	public List<User> queryAll(){		
		return userDao.queryAll();
		
	}
	

	public void update(User user){
		
		userDao.updateUser(user);
	}
	

}
