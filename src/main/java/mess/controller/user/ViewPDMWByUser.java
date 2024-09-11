package mess.controller.user;

import jakarta.servlet.RequestDispatcher;
import java.util.*;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

import java.io.IOException;
import java.util.prefs.PreferenceChangeEvent;

import mess.model.*;
import mess.service.*;
import java.io.*;
@WebServlet("/viewpdbyuser")
public class ViewPDMWByUser extends HttpServlet
{
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
	{
		response.setContentType("text/html");
		PrintWriter out=response.getWriter();
		String month=request.getParameter("getmonth");
		HttpSession session1=request.getSession();
		//int userid=Integer.parseInt(session1.getAttribute("uid").toString());
		int userid=Integer.parseInt(request.getParameter("id"));
		
		CustomerModel cm=new CustomerModel();
		cm.setEid(userid);
		 CustomerService cs=new CustomerServiceImpl();
		 int count=cs.getPresentDayMonthWise(cm, month);
         PresentService ps=new PresentServiceImpl();
         List<PresentDay> list=ps.getDatesBtMonth(userid, month);
		 if(count!=0)
		 {
			 RequestDispatcher rd=request.getRequestDispatcher("UserDashboard.jsp");
			 rd.include(request, response);
			 out.println("<html>");
			 out.println("<head>");
			 out.println("<meta charset='ISO-8859-1'>");
			 out.println("<title>Update</title>");
			 out.println("<link href='css/Addrate.css' rel='stylesheet'>");
			 out.println("</head>");
			 out.println("<body>");
			 out.println("<div class='col py-3 bg-success bg-opacity-25'>");
			 out.println("<div class='myclass'>");
			 out.println("<table class='table table-light table-bordered'>");
			 out.println("<tr  class='table-active' style='text-align:center;'>");
			 out.println("<td>Total Present days</td>");
			 out.println("<td>"+count+"</td>");
			 out.println("</tr>");
			 out.println("<tr style='text-align:center;'> ");
			 out.println("<td  rowspan='"+count+1+"'>Present Dates</td>");
			 out.println("</tr>");
			 for(PresentDay p:list)
			 {
			 out.println("<tr style='text-align:center;'>");
			 out.println("<td>"+p.getDate()+"</td>");
			 out.println("</tr>");
			 }
			 out.println("</table>");
			 
			 out.println("</div>");
			 out.println("</div></div></div>");
			 out.println("</body>"); 
		 }
		 else
		 {
			 RequestDispatcher rd=request.getRequestDispatcher("UserDashboard.jsp");
			 rd.include(request, response);
			 out.println("<html>");
			 out.println("<head>");
			 out.println("<meta charset='ISO-8859-1'>");
			 out.println("<title>Update</title>");
			 out.println("<link href='css/UpdateAll.css' rel='stylesheet'>");
			 out.println("</head>");
			 out.println("<body>");
			 out.println("<div class='col py-3 view'>");
			 out.println("<div class='myclass'>");
			 out.println("<div class='center'><h3>Not present on any day</h3></div>");
			 out.println("</div>");
			 out.println("</div></div></div>");
			 out.println("</body>");
			 out.println("<h3>Some problem is there</h3>");
		 }
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
