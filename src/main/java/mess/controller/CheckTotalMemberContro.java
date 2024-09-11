package mess.controller;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import mess.service.CustomerService;
import mess.service.CustomerServiceImpl;
import mess.service.CustomerTypeService;
import mess.service.CustomerTypeServiceImpl;
import mess.model.*;
import java.io.IOException;
import java.util.*;
import java.io.*;
@WebServlet("/checktotal")
public class CheckTotalMemberContro extends HttpServlet {
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	response.setContentType("text/html");
	PrintWriter out=response.getWriter();
	String name=request.getParameter("getname");
	CustomerTypeService cts=new CustomerTypeServiceImpl();
	boolean b=false;;
	List<CustomerTypeModel> list=cts.getAllCustType();	
	for(CustomerTypeModel ctm:list)
	{
	    String type=ctm.getType();
	    if(type.equalsIgnoreCase(name))
	    {
		   b=true;
	    }
	}
    if(b)
    {
	CustomerService cs=new CustomerServiceImpl();
	int count=cs.getTotalMember(name);	
	RequestDispatcher rd=request.getRequestDispatcher("AdminDashboard.jsp");
	rd.include(request, response);
         out.println("<html>");
		 out.println("<head>");
		 out.println("<meta charset='ISO-8859-1'>");
		 out.println("<title>Update</title>");
		 out.println("<link href='css/DisplayPage.css' rel='stylesheet'>");
		 out.println("</head>");
		 out.println("<body>");
		 out.println("<div class='col py-3 view'>");
		 out.println("<div class='myclass'>");
		 out.println("<div class='center'><h3>Total number of "+name+" is "+count+"<br>And they are as follows:</h3></div><br>");
		 List<CustomerModel> list1=cs.getALlNAmes(name);
		 for(CustomerModel m:list1)
		 {
			 out.println("<h3>"+m.getName()+"</h3>");
		 }
		 out.println("</div>");
		 out.println("</div></div></div>");
		 out.println("</body>");
	//out.println("<br><br><br><h3>Total number of "+name+" is "+count+"</h3>");
	}
    else
    {
    	RequestDispatcher rd=request.getRequestDispatcher("AdminDashboard.jsp");
    	rd.include(request, response);
    	out.println("<h3>Invalid customer type</h3>");
    }
}
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
