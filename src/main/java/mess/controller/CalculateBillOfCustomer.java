package mess.controller;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import java.io.*;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import mess.model.CustomerModel;
import mess.model.RateModel;
import java.util.*;
import mess.service.*;

import java.io.IOException;
@WebServlet("/calbill")
public class CalculateBillOfCustomer extends HttpServlet
{
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		response.setContentType("text/html");
	    PrintWriter out=response.getWriter();
	    String monthNo="00";
	    int eid=Integer.parseInt(request.getParameter("getid"));
		  String month=request.getParameter("getmonth");
		  CustomerService cs=new CustomerServiceImpl();
		  //int eid=cs.getIdBtEmail(email);
		  CustomerModel cm=new CustomerModel();
		  //cm.setEmail(email);
		  cm.setEid(eid);
		 
			  int presentcount=cs.getPresentDayMonthWise(cm, month);
			  int rid=0;
			  String name="";
			  if(presentcount!=0)
		      {
				List<CustomerModel> list=cs.getProfileById(eid);
				for(CustomerModel m:list)
				{
					rid=m.getRid();
					name=m.getName();
				}
		        RateService rs=new RateServiceImpl();
		        int rate=rs.getRateById(rid);
		        AdvanceService as=new AdvancServiceImpl();
		        int advance=as.getAdvanceById(eid);
		        int price=(rate/30);
		        //System.out.println(price);
		        int total=presentcount*price;
		        if(total>advance)
		        {
		        	total=total-advance;
		        	RequestDispatcher rs1=request.getRequestDispatcher("AdminDashboard.jsp");
			        rs1.include(request, response);
			        out.println("<html>");
					 out.println("<head>");
					 out.println("<meta charset='ISO-8859-1'>");
					 out.println("<title>Update</title>");
					 out.println("<link href='css/UpdateAll.css' rel='stylesheet'>");
					 out.println("</head>");
					 out.println("<body>");
					 out.println("<div class='col py-3 view'>");
					 out.println("<div class='myclass'>");
					 out.println("<div class='center'><h1>Total bill is "+total+" of "+name+"<h1></div>");
					 out.println("</div>");
					 out.println("</div></div></div>");
					 out.println("</body>");
			        //out.println("<h1>Total bill is "+total+" of "+name+"<h1>");  
		        }
		        else
		        {
		        	total=advance-total;
		        	RequestDispatcher rs2=request.getRequestDispatcher("AdminDashboard.jsp");
			        rs2.include(request, response); 
			         out.println("<html>");
					 out.println("<head>");
					 out.println("<meta charset='ISO-8859-1'>");
					 out.println("<title>Update</title>");
					 out.println("<link href='css/UpdateAll.css' rel='stylesheet'>");
					 out.println("</head>");
					 out.println("<body>");
					 out.println("<div class='col py-3 view'>");
					 out.println("<div class='myclass'>");
					 out.println("<div class='center'><h1>"+name+" have "+total+" rupees remaining<h1></div>");
					 out.println("</div>");
					 out.println("</div></div></div>");
					 out.println("</body>");
			        //out.println("<h1>"+name+" have "+total+" rupees remaining<h1>");  
		        }
		        
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
		         // out.println("<h1>Not present on any day in "+month+"<h1>");  
		      }
		  }                      
	   
	


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
