package text;

import static org.junit.Assert.*;

import java.util.UUID;

import org.junit.Before;
import org.junit.Test;

import dao.UserDao;

import bean.User;

public class TestUserDao {

	@Before
	public void setUp() throws Exception {
	}

	@Test
	public void testSaveUser() {
		UUID a=UUID.randomUUID();
		User user = new User();
		UserDao userDao = new UserDao();
		user.setUUID(a.toString());
		user.setUsername("alice");
		user.setPassword("123456");
		userDao.save(user);
		
	}

	@Test
	public void testGet() {
		fail("Not yet implemented");
	}

	@Test
	public void testRemove() {
		fail("Not yet implemented");
	}

	@Test
	public void testQueryAll() {
		fail("Not yet implemented");
	}

	@Test
	public void testQueryAllByName() {
		fail("Not yet implemented");
	}

	@Test
	public void testRemoveByUsername() {
		fail("Not yet implemented");
	}

	@Test
	public void testSaveListOfUser() {
		fail("Not yet implemented");
	}

}
