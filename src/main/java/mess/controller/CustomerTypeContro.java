package mess.controller;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import mess.model.CustomerTypeModel;
import mess.service.CustomerTypeService;
import mess.service.CustomerTypeServiceImpl;

import java.io.IOException;
import java.io.PrintWriter;
@WebServlet("/addtype1")
public class CustomerTypeContro extends HttpServlet {
		protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
			
			response.setContentType("text/html");
			 PrintWriter out=response.getWriter();
			 String name=request.getParameter("pass");
			 CustomerTypeModel ctm= new CustomerTypeModel();
			 ctm.setType(name);
			 CustomerTypeService cts=new CustomerTypeServiceImpl();
			 boolean b=cts.addCustType(ctm);
			 if(b)
			 {
				 RequestDispatcher r=request.getRequestDispatcher("AdminDashboard.jsp");
				 r.include(request, response);				 
				 out.println("<h3>Customer type added successfully...</h3>");
			 }
			 else
			 {
				 RequestDispatcher r=request.getRequestDispatcher("AdminDashboard.jsp");
				 r.include(request, response);
				 out.println("<center><h3>Some problem is there</h3></center>");

			 }
			
			}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		doGet(request, response);
	}

}
