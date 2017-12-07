package controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class PostDispatcher
 */
public class PostDispatcher extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private PostController controller = new PostController();
	private String traget;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public PostDispatcher() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String url= request.getRequestURI();
		String myUrl = url.substring(url.lastIndexOf("/")+1);
		
		switch(myUrl) {
		case "list":
			traget = controller.list(request);
			break;
		case "listByName":
			traget = controller.listByName(request);
			break;
		case "toadd":
			traget = controller.toadd(request);
			break;
		case "add":
			traget = controller.add(request);
			break;
		case "remove":
			traget = controller.remove(request);
			break;
		case "getByName":
			traget = controller.getByName(request);
			break;
		case "get":
			traget = controller.get(request);
			break;
		case "update":
			traget = controller.update(request);
			break;
		}
		
		if(traget.endsWith("jsp")) {
			request.getRequestDispatcher(traget).forward(request, response);
		}else {
			response.sendRedirect(traget);
		}
	}
	

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
