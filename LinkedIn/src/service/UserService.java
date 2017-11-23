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


	
	
	/**
	 * 1.添加用户
	 * @param user
	 */
	public void add(User user){
		userDao.save(user);
		
	}
	
	/**
	 * 2.通过Id删除用户
	 * @param id
	 */
	public void remove(String id){
		userDao.remove(id);
	
	}
	
	/**
	 * 3.通过用户名删除用户
	 * @param username
	 */
	public void removeByUserName(String username){
		userDao.removeByUsername(username);
	}
	
	/**
	 * 4.通过Id查询用户
	 * @param id
	 * @return
	 */
	public User get(String id){
		return userDao.get(id);
	
	}
	
	/**
	 * 5.通过用户名查询用户
	 * @param name
	 * @return
	 */
	public List<User> queryAllByName(String name){
		return userDao.queryAllByName(name);
		
	}
	
	/**
	 * 6.查询全部
	 * @return
	 */
	public List<User> queryAll(){
		return userDao.queryAll();
		
	}
	
	/**
	 * 7.更新用户
	 * @param user
	 */
	public void update(User user){
		
		userDao.updateUser(user);
	}
	

}
