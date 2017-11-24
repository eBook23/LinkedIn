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
		return "../member-list.jsp";
	}
	
	public String addUser(HttpServletRequest req){
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
	
	public String add(HttpServletRequest req){
		return "../member-add.jsp";
	}
	
	public String edit(HttpServletRequest req){
		
		return "";
	}
	
	public String del(HttpServletRequest req){
		userService.removeByUserName(req.getParameter("username"));
		return "list";
	}
	
	public String querry(HttpServletRequest req){
		
		return "";
	}
	
}
