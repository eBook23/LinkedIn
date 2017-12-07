package controller;

import java.util.UUID;

import javax.servlet.http.HttpServletRequest;

import bean.Company;
import bean.Post;
import service.PostService;

public class PostController {
	PostService postService = new PostService();
	
	public Post getPost(HttpServletRequest request) {
		Post post = new Post();
		post.setName(request.getParameter("name"));
		post.setUUID(request.getParameter("pno")==null?UUID.randomUUID().toString():request.getParameter("pno"));
		return post;
	}
	
	public String listByName(HttpServletRequest request) {
		request.setAttribute("posts",this.postService.getByName(request.getParameter("name")));
		System.out.println(this.postService.getByName(request.getParameter("name")));
		return "/WEB-INF/content/admin/post/post-list.jsp";
	}
	public String getByName(HttpServletRequest request) {
		return "listByName?name="+request.getParameter("name");
	}	
	public String list(HttpServletRequest request) {
		request.setAttribute("posts",this.postService.queryAll());
		return "/WEB-INF/content/admin/post/post-list.jsp";
	}
	
	public String toadd(HttpServletRequest request) {
		return "/WEB-INF/content/admin/post/post-add.jsp";
	}
	public String add(HttpServletRequest request) {
		postService.add(getPost(request));
		return "list";
	}	
	public String remove(HttpServletRequest request) {
		postService.remove(request.getParameter("pno"));
		return "list";
	}
	public String get(HttpServletRequest request) {
		request.setAttribute("post", postService.get(request.getParameter("pno")));
		return "/WEB-INF/content/admin/post/post-edit.jsp";
	}	

	public String update(HttpServletRequest request) {
		Post post = this.getPost(request);
		postService.update(post); 
		return "list";
	}
	
	
	
}
