package in.ineuron.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import in.ineuron.model.Product;
import in.ineuron.service.IProductService;
import in.ineuron.servicefactory.ProductServiceFactory;


@WebServlet("/product")
public class ProductController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	private IProductService service;
	
    public ProductController() {
        service=ProductServiceFactory.getProductService();
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String pid = request.getParameter("id");
		Product product = service.getProduct(Integer.parseInt(pid));
		request.setAttribute("product", product);
		RequestDispatcher dispatcher = request.getRequestDispatcher("/display.jsp");
		dispatcher.forward(request, response);
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
