package mess.controller;

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
import java.io.PrintWriter;

@WebServlet("/finalcustomerupdate")
public class FCustomerUpdate extends HttpServlet {
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter out=response.getWriter();
		int eid=Integer.parseInt(request.getParameter("id"));
		String name=request.getParameter("name");
		String email=request.getParameter("email");
		String contact=request.getParameter("contact");
		int cid=Integer.parseInt(request.getParameter("gettype"));
		//int rid=Integer.parseInt(request.getParameter("rid"));	
		CustomerService cs=new CustomerServiceImpl();
		CustomerModel cm=new CustomerModel(eid, cid, cid, name, contact, email);
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
