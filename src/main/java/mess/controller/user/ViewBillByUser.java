package mess.controller.user;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

import java.io.IOException;
import java.util.List;
import java.io.*;
import mess.model.*;
import mess.service.*;
public class ViewBillByUser extends HttpServlet
{
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
	{
		response.setContentType("text/html");
		PrintWriter out=response.getWriter();
		String month=request.getParameter("getmonth");
		HttpSession session=request.getSession();
		int userid=Integer.parseInt(request.getParameter("id"));
	    //int userid=Integer.parseInt(session.getAttribute("uid").toString());
	    CustomerModel cm=new CustomerModel();
		cm.setEid(userid);
		 CustomerService cs=new CustomerServiceImpl();
		 int pday=cs.getPresentDayMonthWise(cm, month);
		 if(pday!=0)
		 {			 
		 List<CustomerModel> list=cs.getProfileById(userid);
		 int rid=0;
		 String name="";
		 for(CustomerModel m:list)
		 {
			 rid=m.getRid();
			 name=m.getName();
		 }
		 RateService rs=new RateServiceImpl();
		 int rate=rs.getRateById(rid);
		 AdvanceService as=new AdvancServiceImpl();
		 int adv=as.getAdvanceById(userid);
		// out.println("user id="+userid);
		 //out.println("Present day "+pday);
		 //out.println("rate is="+rate);
		 //out.println("adv is="+adv);
		 int price=(rate/30);
		 int total1;
	        //System.out.println(price);
	     int total=pday*price;
	        if(total>adv)
	        {
	        	total1=total-adv;
	        	RequestDispatcher rs1=request.getRequestDispatcher("UserDashboard.jsp");
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
				 out.println("<div class='center'>");
				 out.println("<h3>You paid "+adv+" as advance<br><br>");
				 out.println("Total bill of this month is "+total+"<br><br>");
				 out.println("So "+name+"now you have to paid "+total1+"<h3></div>");
				 out.println("</div>");
				 out.println("</div></div></div>");
				 out.println("</body>");
		         //out.println("<h1>Total bill is "+total+" of "+name+"<h1>");  
	        }
	        else
	        {
	        	total1=adv-total;
	        	RequestDispatcher rs2=request.getRequestDispatcher("UserDashboard.jsp");
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
				 out.println("<div class='center'>");
				 out.println("<h3>You paid "+adv+" as advance<br><br>");
				 out.println("Total bill of this month is "+total+"<br><br>");
				 out.println("So "+name+" u have "+total1+" rupees remaining<h3></div>");
				 out.println("</div>");
				 out.println("</div></div></div>");
				 out.println("</body>");
		        //out.println("<h1>"+name+" u have "+total+" rupees remaining<h1>");  
	        }
		 }
		 else
		 {
			 RequestDispatcher rs2=request.getRequestDispatcher("UserDashboard.jsp");
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
				 out.println("<div class='center'><h1>Not Present on any day in "+month+"</h1></div>");
				 out.println("</div>");
				 out.println("</div></div></div>");
				 out.println("</body>");
		        
	        }
		 }
		 
	

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
