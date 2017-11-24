package controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import bean.User;

import service.UserService;

public class SecurityController {
	UserService userService=new UserService();
	
	public String login(HttpServletRequest req){
		String username=req.getParameter("username");
		String password=req.getParameter("password");
		List<User> list=userService.queryAll();
		User u=null;
		Boolean flag=false;
		for(User t:list){
			if(t.getUsername().equals(username)){
				flag=true;
				u=t;
				break;
			}
		}
		if(!flag){
			//用户不存在
			return "../login.html";
		}else if(u.getPassword().endsWith(password)){
			//登陆成功
			HttpSession session=req.getSession();
			session.setAttribute("user", u);
			return "../index.html";
		}else{
			//密码错误
			return "../login.html";
		}
	}
	public String logout(HttpServletRequest req){
		HttpSession session=req.getSession();
		session.invalidate();
		return "../login.html";
	}
	
	public String index(HttpServletRequest req){
		return "../index.html";
	}
}
