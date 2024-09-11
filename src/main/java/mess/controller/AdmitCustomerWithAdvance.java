package mess.controller;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import mess.model.AdvanceModel;
import mess.model.CustomerModel;
import mess.service.AdvancServiceImpl;
import mess.service.AdvanceService;
import mess.service.CustomerService;
import mess.service.CustomerServiceImpl;

import java.io.IOException;
import java.io.*;
@WebServlet("/admitWithamount")
public class AdmitCustomerWithAdvance extends HttpServlet {
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	response.setContentType("text/html");
	PrintWriter out=response.getWriter();
	//String email=request.getParameter("email");
	int amount=Integer.parseInt(request.getParameter("advance"));
	int id=Integer.parseInt(request.getParameter("getname"));
	//CustomerModel cm=new CustomerModel();
	//cm.setEmail(email);
	CustomerService cs=new CustomerServiceImpl();
	//boolean b=cs.verifyCustomer(cm);
	//if(b)
	//{
	  //int id=cs.getIdBtEmail(email);
	  AdvanceModel am=new AdvanceModel(amount, id);
	  AdvanceService as=new AdvancServiceImpl();
	  boolean b=as.idAdmitWithAmount(am);
	  if(b)
	  {
		    RequestDispatcher rd=request.getRequestDispatcher("AdminDashboard.jsp");
			rd.include(request, response);
			out.println("<h3>Customer Admited sucessfully with some amount...</h3>");
	  }
	  else
	  {
		  RequestDispatcher rd=request.getRequestDispatcher("AdminDashboard.jsp");
		  rd.include(request, response);
		  out.println("<h3>Some probelm is there..</h3>");
	  }
	/*}
	else
	{
		RequestDispatcher rd=request.getRequestDispatcher("AdminDashboard.jsp");
		rd.include(request, response);
		out.println("<h3>Invalid email address...</h3>");
	}
	}*/
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
