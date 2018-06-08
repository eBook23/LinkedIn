package controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import bean.User;

import service.UserService;

public class SecurityController {
	private UserService userService=new UserService();
	
	public String login(HttpServletRequest req){
		String username=req.getParameter("username");
		String password=req.getParameter("password");
		List<User> list=userService.queryAll();
		User user=null;
		Boolean flag=false;
		for(User u:list){
			if(u.getUsername().equals(username)){
				flag=true;
				user=u;
				break;
			}
		}
		if(!flag){
			//用户不存在
			return "../login.html";
		}else if(user.getPassword().equals(password)&&user.getPower()==1){
			//登陆成功
			HttpSession session=req.getSession();
			session.setAttribute("user", user);
			return "/WEB-INF/content/admin/index.jsp";
		}else if(user.getPassword().equals(password)&&user.getPower()==0){
			HttpSession session=req.getSession();
			session.setAttribute("user", user);
			return "/WEB-INF/index.jsp";
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
