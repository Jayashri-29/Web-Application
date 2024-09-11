package mess.controller.user;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import mess.model.CustomerModel;
import mess.service.CustomerService;
import mess.service.CustomerServiceImpl;

import java.io.*;
@WebServlet("/finalmyupd")
public class FinalProfileUpdate extends HttpServlet 
{	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
	{
		response.setContentType("text/html");
		PrintWriter out=response.getWriter();
		int id=Integer.parseInt(request.getParameter("id"));
		String name=request.getParameter("name");
		String email=request.getParameter("email");
		String contact=request.getParameter("contact");
		CustomerModel m=new CustomerModel();
		m.setEid(id);
		m.setName(name);
		m.setEmail(email);
		m.setContact(contact);
		CustomerService cs=new CustomerServiceImpl();
		boolean b=cs.updcustomer(m);
		if(b)
		{
			RequestDispatcher rd=request.getRequestDispatcher("ViewProfile.jsp");
			rd.forward(request, response);
		}
		else
		{
			RequestDispatcher rd=request.getRequestDispatcher("UserDashboard.jsp");
			rd.forward(request, response);
			out.println("<h4>Some problem is there..</h4>");
		}
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
