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
	 * 1.����û�
	 * @param user
	 */
	public void add(User user){
		userDao.save(user);
		
	}
	
	/**
	 * 2.ͨ��Idɾ���û�
	 * @param id
	 */
	public void remove(String id){
		userDao.remove(id);
	
	}
	
	/**
	 * 3.ͨ���û���ɾ���û�
	 * @param username
	 */
	public void removeByUserName(String username){
		userDao.removeByUsername(username);
	}
	
	/**
	 * 4.ͨ��Id��ѯ�û�
	 * @param id
	 * @return
	 */
	public User get(String id){
		return userDao.get(id);
	
	}
	
	/**
	 * 5.ͨ���û�����ѯ�û�
	 * @param name
	 * @return
	 */
	public User getByName(String name){
		return userDao.getByName(name);
		
	}
	
	/**
	 * 6.��ѯȫ��
	 * @return
	 */
	public List<User> queryAll(){
		return userDao.queryAll();
		
	}
	
	/**
	 * 7.�����û�
	 * @param user
	 */
	public void update(User user){
		
		userDao.updateUser(user);
	}
	

}
