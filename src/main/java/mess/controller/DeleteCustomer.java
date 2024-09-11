package mess.controller;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import java.io.*;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import mess.service.CustomerService;
import mess.service.CustomerServiceImpl;

import java.io.IOException;
@WebServlet("/delcustomer")
public class DeleteCustomer extends HttpServlet {
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	response.setContentType("text/html");
	PrintWriter out=response.getWriter();
	int id=Integer.parseInt(request.getParameter("eid"));
	CustomerService cs=new CustomerServiceImpl();
	boolean b=cs.isDelBtId(id);
	if(b)
	{
		RequestDispatcher rd=request.getRequestDispatcher("ViewCustomer.jsp");
		rd.forward(request, response);
	}
	else
	{
		RequestDispatcher rd=request.getRequestDispatcher("ViewCustomer.jsp");
		rd.include(request, response);	
		out.println("<h4>some problem occured...</h4>");
	}
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
