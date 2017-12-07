package controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class SecurityDispatcher
 */
public class SecurityDispatcher extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public SecurityDispatcher() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		SecurityController securityController=new SecurityController();
		String url=request.getRequestURI();
		url=url.substring(url.lastIndexOf("/")+1);
		String target=null;
		
		switch(url){
		case "login":
			target=securityController.login(request);
		break;
		case "logout":
			target=securityController.logout(request);
		break;
		case "index":
			target=securityController.index(request);
		}
		if(target.endsWith("jsp")){
			request.getRequestDispatcher(target).forward(request, response);
		}else{
			response.sendRedirect(target);
		}
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request,response);
	}

}
