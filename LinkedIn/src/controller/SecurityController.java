package controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import bean.User;

import service.UserService;

public class SecurityController {
	UserService userService=new UserService();
	
	public String login(HttpServletRequest req){
		String username=req.getParameter("username");
		String password=req.getParameter("password");
		User u=userService.getByName(username);
		if(u==null){
			return "login.jsp";
		}else if(u.getPassword().endsWith(password)){
			HttpSession session=req.getSession();
			session.setAttribute("user", u);
			return "index.jsp";
		}else{
			return "login.jsp";
		}
	}
	public String logout(HttpServletRequest req){
		HttpSession session=req.getSession();
		session.invalidate();
		return "login.jsp";
	}
}
