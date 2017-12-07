package controller;

import java.util.List;
import java.util.UUID;

import javax.servlet.http.HttpServletRequest;

import bean.User;

import service.UserService;

public class UserController {
	UserService userService=new UserService();
	
	public String list(HttpServletRequest req){
		List<User> users=userService.queryAll();
		req.setAttribute("users", users);
		return "/WEB-INF/content/admin/member/member-list.jsp";
	}
	
	public String listByName(HttpServletRequest req){
		List<User> users=userService.getByName(req.getParameter("username"));
		req.setAttribute("users", users);
		return "/WEB-INF/content/admin/member/member-list.jsp";
	}	
	
	public String ulist(HttpServletRequest req){
		List<User> users=userService.queryAll();
		req.setAttribute("users", users);
		return "/WEB-INF/content/admin/resume/rmember-list.jsp";
	}	
	
	public String add(HttpServletRequest req){
		User u=new User();
		UUID uuid=UUID.randomUUID();
		u.setUUID(uuid.toString());
		u.setUsername(req.getParameter("username"));
		u.setPassword(req.getParameter("password"));
		u.setPhone(req.getParameter("phone"));
		u.setSex(req.getParameter("sex"));
		u.setEmail(req.getParameter("email"));
		userService.add(u);
		return "list";
	}
	
	public String toAdd(HttpServletRequest req){
		return "/WEB-INF/content/admin/member/member-add.jsp";
	}
	
	public String toEdit(HttpServletRequest req){
		User user=userService.get(req.getParameter("id"));
		req.setAttribute("user", user);
		return "/WEB-INF/content/admin/member/member-edit.jsp";
	}
	
	public String edit(HttpServletRequest req) {
		User user=userService.get(req.getParameter("id"));
		user.setEmail(req.getParameter("email"));
		user.setPhone(req.getParameter("phone"));
		user.setSex(req.getParameter("sex"));
		user.setUsername(req.getParameter("username"));
		userService.remove(req.getParameter("id"));;
		userService.add(user);
		return "list";
	}
	
	public String del(HttpServletRequest req){
		userService.removeByUserName(req.getParameter("username"));
		return "list";
	}
	
	public String getByName(HttpServletRequest req) {
		return "listByName?username="+req.getParameter("username");
	}
	
	
}
