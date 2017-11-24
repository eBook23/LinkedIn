/**
 * 
 */
package test;

import static org.junit.Assert.*;

import java.util.List;
import java.util.UUID;

import org.junit.Before;
import org.junit.Test;

import bean.User;
import service.UserService;

/**
 * @author Administrator
 *
 */

public class UserServiceTest {

	UserService userService;
	
	@Before
	public void init(){
		userService=new UserService();
	}
	
	
	/**
	 * 1.����û�
	 * Test method for {@link service.UserService#add(bean.User)}.
	 */
	@Test
	public void testAdd() {
		User user = new User();
		UUID a;
		a=UUID.randomUUID();
		user.setUUID("1003");
		user.setUsername("blice");
		user.setPassword("123456");
		userService.add(user);
	}

	/**
	 * 2.ͨ��Idɾ���û�
	 * Test method for {@link service.UserService#remove(java.lang.String)}.
	 */
	@Test
	public void testRemove() {
		userService.remove("1001");
	}

	
	/**
	 * 3.ͨ���û���ɾ���û�
	 * Test method for {@link service.UserService#remove(java.lang.String)}.
	 */
	@Test
	public void testRemoveByName() {
		userService.removeByUserName("alice");
	}

	/**
	 * 4.ͨ��Id��ѯ�û�
	 * Test method for {@link service.UserService#get(java.lang.String)}.
	 */
	@Test
	public void testGet() {
		User u = userService.get("1001");
		System.out.println(u);
	}
	
	/**
	 * 5.ͨ���û�����ѯ�û�
	 * Test method for {@link service.UserService#queryAllByName(java.lang.String)}.
	 */
	@Test
	public void testGetByName() {
		User u =  userService.getByName("alice");
		System.out.println(u);
	}
	
	/**
	 * 6.��ѯȫ��
	 * Test method for {@link service.UserService#queryAll()}.
	 */
	@Test
	public void testQueryAll() {
		UserService userService = new UserService();
		List<User> list = userService.queryAll();
		for(User user:list){
			System.out.println(user);
			
		}
	}

	/**
	 * 7.�����û�
	 * Test method for {@link service.UserService#update(bean.User)}.
	 */
	@Test
	public void testUpdate() {
		User u=userService.get("1002");
		u.setPassword("842");
		userService.update(u);
	}




	
}
