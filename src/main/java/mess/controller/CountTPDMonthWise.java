package mess.controller;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import java.io.*;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import mess.model.CustomerModel;
import mess.service.CustomerService;
import mess.service.CustomerServiceImpl;

import java.io.IOException;
@WebServlet("/countPDMonthWise")
public class CountTPDMonthWise extends HttpServlet {
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	  response.setContentType("text/html");
	  PrintWriter out=response.getWriter();
	  int eid=Integer.parseInt(request.getParameter("getid"));
	  String month=request.getParameter("getmonth");
	  CustomerService cs=new CustomerServiceImpl();
	  //int eid=cs.getIdBtEmail(email);
	  CustomerModel cm=new CustomerModel();
	  //cm.setEmail(email);
	  cm.setEid(eid);
		  int count=cs.getPresentDayMonthWise(cm, month);
		  if(count!=0)
	      {
	       RequestDispatcher rs=request.getRequestDispatcher("AdminDashboard.jsp");
	       rs.include(request, response);     
	       out.println("<html>");
			 out.println("<head>");
			 out.println("<meta charset='ISO-8859-1'>");
			 out.println("<title>Update</title>");
			 out.println("<link href='css/UpdateAll.css' rel='stylesheet'>");
			 out.println("</head>");
			 out.println("<body>");
			 out.println("<div class='col py-3 view'>");
			 out.println("<div class='myclass'>");
			 out.println("<div class='center'><h1>Total present days are "+count+"<h1></div>");
			 out.println("</div>");
			 out.println("</div></div></div>");
			 out.println("</body>");
	       //out.println("<h1>Total present days are "+count+" in "+month+"<h1>");
	      }
	      else
	      {
	    	 RequestDispatcher rs=request.getRequestDispatcher("AdminDashboard.jsp");
	         rs.include(request, response);  
	         out.println("<html>");
	 		 out.println("<head>");
	 		 out.println("<meta charset='ISO-8859-1'>");
	 		 out.println("<title>Update</title>");
	 		 out.println("<link href='css/UpdateAll.css' rel='stylesheet'>");
	 		 out.println("</head>");
	 		 out.println("<body>");
	 		 out.println("<div class='col py-3 view'>");
	 		 out.println("<div class='myclass'>");
	 		 out.println("<div class='center'><h1>Not present on any day<h1></div>");
	 		 out.println("</div>");
	 		 out.println("</div></div></div>");
	 		 out.println("</body>");
	          out.println("<h1>Not present on any day in "+month+"<h1>");  
	      }
	  }
	 

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
