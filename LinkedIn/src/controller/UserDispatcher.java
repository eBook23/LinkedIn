package controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class UserDispatcher
 */
public class UserDispatcher extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public UserDispatcher() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		UserController userController=new UserController();
		String url=request.getRequestURI();
		url=url.substring(url.lastIndexOf("/")+1);
		String target=null;
		
		switch(url){
		case "list":
			target=userController.list(request);
		break;
		case "add":
			target=userController.add(request);
		break;
		case "toAdd":
			target=userController.toAdd(request);
		break;
		case "edit":
			target=userController.edit(request);
		break;
		case "toEdit":
			target=userController.toEdit(request);
		break;
		case "del":
			target=userController.del(request);
		break;
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
