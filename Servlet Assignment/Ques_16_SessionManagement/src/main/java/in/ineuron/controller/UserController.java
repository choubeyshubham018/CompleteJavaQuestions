package in.ineuron.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class UserController
 */
@WebServlet("/user/*")
public class UserController extends HttpServlet {
	private static final long serialVersionUID = 1L;

   
    public UserController() {
  
    }

    HttpSession session = null;
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println(request.getRequestURI());
		if(request.getRequestURI().endsWith("addName")) {
			System.out.println("userName");
			session=request.getSession();
			session.setAttribute("uname",request.getParameter("uname"));
			session.setAttribute("uage",request.getParameter("uage"));
			RequestDispatcher dispatcher = request.getRequestDispatcher("/userAddress.jsp");
			dispatcher.forward(request, response);
		}
		if(request.getRequestURI().endsWith("address")) {
			session=request.getSession();
			session.setAttribute("city",request.getParameter("city"));
			session.setAttribute("state",request.getParameter("state"));
			RequestDispatcher dispatcher = request.getRequestDispatcher("/userContact.jsp");
			dispatcher.forward(request, response);
			
		}
		if(request.getRequestURI().endsWith("display")) {
			session=request.getSession();
			session.setAttribute("phone",request.getParameter("phone"));
			session.setAttribute("email",request.getParameter("email"));
			RequestDispatcher dispatcher = request.getRequestDispatcher("/display.jsp");
			dispatcher.forward(request, response);
			
		}
		
		
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		doGet(request, response);
	}

}
