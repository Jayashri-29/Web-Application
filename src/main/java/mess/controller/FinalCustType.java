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


@WebServlet("/finalupd")
public class FinalCustType extends HttpServlet {
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter out=response.getWriter();
			 int id=Integer.parseInt(request.getParameter("id"));
			 String type=request.getParameter("type");
			 CustomerTypeModel ctm=new CustomerTypeModel(id,type);
			 CustomerTypeService cts=new CustomerTypeServiceImpl();
			 boolean b=cts.isupdatecusttype(ctm);
			 if(b)
			 {
				 RequestDispatcher r1=request.getRequestDispatcher("ViewCustType.jsp");
				 r1.include(request, response);
				 out.println("<h3>Customer type updated successfully..</h3>");
			 }
			 else
			 {
				 out.println("<h3>Some Problem is there..</h3>");
			 }
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
