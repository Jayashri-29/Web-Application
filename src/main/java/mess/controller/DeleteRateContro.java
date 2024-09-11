package mess.controller;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import mess.service.RateService;
import mess.service.RateServiceImpl;

import java.io.IOException;
import java.io.*;
@WebServlet("/delrate")
public class DeleteRateContro extends HttpServlet {
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	response.setContentType("text/html");
	PrintWriter out=response.getWriter();
	int id=Integer.parseInt(request.getParameter("rid"));
	RateService rs=new RateServiceImpl();
	boolean b=rs.delRate(id);
	if(b)
	{
		RequestDispatcher rd=request.getRequestDispatcher("ViewRate.jsp");
		rd.forward(request, response);
	}
	else
	{
		RequestDispatcher rd=request.getRequestDispatcher("UserDashboard.jsp");
		rd.include(request, response);
		out.println("<h4>Some Problem is there</h4>");
	}
	}
  
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
