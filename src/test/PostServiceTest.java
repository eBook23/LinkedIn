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
	//��������ְλ
	@Test
	public void testQueryAll() {
		List<Post> list= postService.queryAll();
		for(Post c:list){
			System.out.println(c);
		}
	}
	//���ְλ
	@Test
	public void testAdd() {
		Post post = new Post();
		post.setUUID("123");
		post.setName("java");
		postService.add(post);
	}
//ͨ��IDɾ��ְλ
	@Test
	public void testRemove() {
		postService.remove("123");
	}
//ͨ������ɾ��ְλ
	@Test
	public void testRemoveByPostName() {
		postService.removeByPostName("java");
	}
//ͨ��ID����ְλ
	@Test
	public void testGet() {
		Post post =postService.get("123");
		System.out.println(post);
	}
//����ְλ
	@Test
	public void testUpdate() {
		Post c =postService.get("123");
		c.setName("php");
		postService.update(c);
	}
//ͨ����������ְλ
	@Test
	public void testQueryAllByName() {
		List<Post> list= postService.getByName("java");
		for(Post c:list){
			System.out.println(c);
		}
	}

}
