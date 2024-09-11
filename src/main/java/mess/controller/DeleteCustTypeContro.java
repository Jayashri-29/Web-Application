 package mess.controller;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import mess.service.CustomerTypeService;
import mess.service.CustomerTypeServiceImpl;

import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/delete")
public class DeleteCustTypeContro extends HttpServlet {
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
	response.setContentType("text/html");
	PrintWriter out=response.getWriter();
	int uid=Integer.parseInt(request.getParameter("uid"));
	CustomerTypeService cts=new CustomerTypeServiceImpl();
	boolean b=cts.isDelTypeByid(uid);
	if(b)
	{
		RequestDispatcher r=request.getRequestDispatcher("ViewCustType.jsp");
	    r.include(request, response);
	}
	else
	{
		out.println("<h1>Some problem is there</h1>");
	}
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
				doGet(request, response);
	}

}
