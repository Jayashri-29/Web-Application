package mess.controller;
import java.io.*;
import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import mess.model.CustomerModel;
import mess.service.CustomerService;
import mess.service.CustomerServiceImpl;
import java.io.IOException;
@WebServlet("/finalcustupd")
class FinalCustomerUpdate extends HttpServlet {
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		response.setContentType("text/html");
		PrintWriter out=response.getWriter();
		int eid=Integer.parseInt(request.getParameter("id"));
		String name=request.getParameter("name");
		String email=request.getParameter("email");
		String contact=request.getParameter("contact");
		int cid=Integer.parseInt(request.getParameter("cid"));
		int rid=Integer.parseInt(request.getParameter("rid"));	
		System.out.println(eid);
		System.out.println(name);
		System.out.println(email);
		System.out.println(contact);
		System.out.println(cid);
		System.out.println(rid);
		
		CustomerService cs=new CustomerServiceImpl();
		CustomerModel cm=new CustomerModel(eid, cid, rid, name, contact, email);
		boolean b=cs.isUpdateCustomer(cm);
		if(b)
		{
			RequestDispatcher rd=request.getRequestDispatcher("ViewCustomer.jsp");
			rd.forward(request, response);
		}
		else
		{
			RequestDispatcher rd=request.getRequestDispatcher("AdminDashboard.jsp");
			rd.forward(request, response);
			out.println("<h4>Some problem is there..</h4>");
		}
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
