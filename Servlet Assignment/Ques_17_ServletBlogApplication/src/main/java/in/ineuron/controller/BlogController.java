package in.ineuron.controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import in.ineuron.dto.Blog;
import in.ineuron.service.IBlogService;
import in.ineuron.servicefactory.BlogServiceFactory;


@WebServlet("/blog")
public class BlogController extends HttpServlet {
	
	private static final long serialVersionUID = 1L;
    
	private IBlogService service;

	private RequestDispatcher dispatcher;
   
    public BlogController() {
       service = BlogServiceFactory.getBlogService();
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		doPost(request, response);
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	             String cond = request.getParameter("s1");
	             if("save".equals(cond)) {
		          Blog blog = new Blog();
		          blog.setBid(Integer.parseInt(request.getParameter("bid")));
				  blog.setTitle(request.getParameter("title"));
		          blog.setDescription(request.getParameter("description"));
		          blog.setContent(request.getParameter("content"));
	              
		          String status = service.saveBlog(blog);
		          request.setAttribute("status",status);
		           dispatcher = request.getRequestDispatcher("./display.jsp");
		           dispatcher.forward(request, response);
	             }
	             else {
	          
	            	  List<Blog> blog = service.getBlog();
	            	  request.setAttribute("blog",blog);
	            	  dispatcher = request.getRequestDispatcher("/blogDisplay.jsp");
			           dispatcher.forward(request, response);
	             }
	}

}
