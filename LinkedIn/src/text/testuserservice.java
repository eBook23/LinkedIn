/**
 * 
 */
package text;

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

public class testuserservice {

	/**
	 * @throws java.lang.Exception
	 */
	@Before
	public void setUp() throws Exception {
	}

	/**
	 * Test method for {@link service.UserService#UserService()}.
	 */
	@Test
	public void testUserService() {
		fail("Not yet implemented");
	}

	/**
	 * Test method for {@link service.UserService#queryAll()}.
	 */
	@Test
	public void testQueryAll() {
		fail("Not yet implemented");
		UserService userService = new UserService();
		List<User> list = userService.queryAll();
		for(User user:list){
			System.out.println(user.getUsername());
			
		}
	}

	/**
	 * Test method for {@link service.UserService#add(bean.User)}.
	 */
	@Test
	public void testAdd() {
		User user = new User();
		UserService userService = new UserService();
		UUID a;
		a=UUID.randomUUID();
		user.setUUID(a.toString());
		user.setUsername("alice");
		user.setPassword("123456");
		userService.add(user);
	}

	/**
	 * Test method for {@link service.UserService#remove(java.lang.String)}.
	 */
	@Test
	public void testRemove() {
		fail("Not yet implemented");
	}

	/**
	 * Test method for {@link service.UserService#get(java.lang.String)}.
	 */
	@Test
	public void testGet() {
		fail("Not yet implemented");
	}

	/**
	 * Test method for {@link service.UserService#update(bean.User)}.
	 */
	@Test
	public void testUpdate() {
		fail("Not yet implemented");
	}

	/**
	 * Test method for {@link service.UserService#queryAllByName(java.lang.String)}.
	 */
	@Test
	public void testQueryAllByName() {
		fail("Not yet implemented");
	}

}
