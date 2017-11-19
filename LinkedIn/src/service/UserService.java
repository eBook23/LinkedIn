package service;

import java.sql.Connection;
import java.util.ArrayList;
import java.util.List;

import bean.User;
import dao.UserDao;
import tools.DbUtil;

public class UserService {
	Connection connection;
	UserDao userDao;

	
	public UserService(){
		connection = DbUtil.getInstance().getConnection();
		userDao = new UserDao();
		userDao.setConnection(connection);
	}

	public List<User> queryAll(){
		return userDao.queryAll();
		
	}
	
	
	public void add(User user){
		userDao.save(user);
		
	}
	
	public void remove(String id){
		userDao.remove(id);
	
	}
	
	public User get(String id){
		return userDao.get(id);
	
	}
	
	public void update(User user){
		
		//DataBase.updateStudent(student);
	}
	
	public List<User> queryAllByName(String name){
		return userDao.queryAllByName(name);
		
	}
}
