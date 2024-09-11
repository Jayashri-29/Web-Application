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
import java.io.*;

@WebServlet("/checktotalpresentday")
public class CheckTotalPresentDay extends HttpServlet 
{
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
     response.setContentType("text/html");
     PrintWriter out=response.getWriter(); 
     String name=request.getParameter("getemail");
     CustomerModel cm=new CustomerModel();
     cm.setEmail(name);
     CustomerService cs=new CustomerServiceImpl();
     boolean b=cs.verifyCustomer(cm);
     if(b)
     {    
      int count=cs.getTotalPresentDays(cm);
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
		 out.println("<div class='center'><h1>Total prsent days are "+count+"<h1></div>");
		 out.println("</div>");
		 out.println("</div></div></div>");
		 out.println("</body>");
       //out.println("<h1>Total present days are "+count+"<h1>");
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
 		  out.println("<div class='center'><h1>Not Present on any day<h1></div>");
 		  out.println("</div>");
 		  out.println("</div></div></div>");
 		  out.println("</body>");
          //out.println("<h1>Not Present on any day<h1>");  
      }
	 }
     else
     {
    	 RequestDispatcher rs=request.getRequestDispatcher("Invalidpage.jsp");
         rs.include(request, response); 
     }
	}
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
