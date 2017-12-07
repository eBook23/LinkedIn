package test;

import static org.junit.Assert.*;

import java.util.List;

import org.junit.Before;
import org.junit.Test;

import service.PostService;

import bean.Company;
import bean.Post;


public class PostServiceTest {
	PostService postService = new PostService();
	@Before
	public void setUp() throws Exception {
	}

	@Test
	public void testPostService() {
		fail("Not yet implemented");
	}
	//查找所有职位
	@Test
	public void testQueryAll() {
		List<Post> list= postService.queryAll();
		for(Post c:list){
			System.out.println(c);
		}
	}
	//添加职位
	@Test
	public void testAdd() {
		Post post = new Post();
		post.setUUID("123");
		post.setName("java");
		postService.add(post);
	}
//通过ID删除职位
	@Test
	public void testRemove() {
		postService.remove("123");
	}
//通过名称删除职位
	@Test
	public void testRemoveByPostName() {
		postService.removeByPostName("java");
	}
//通过ID查找职位
	@Test
	public void testGet() {
		Post post =postService.get("123");
		System.out.println(post);
	}
//更新职位
	@Test
	public void testUpdate() {
		Post c =postService.get("123");
		c.setName("php");
		postService.update(c);
	}
//通过姓名查找职位
	@Test
	public void testQueryAllByName() {
		List<Post> list= postService.queryAllByName("java");
		for(Post c:list){
			System.out.println(c);
		}
	}

}
