package mess.controller;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import mess.service.*;
import mess.model.*;
import java.util.*;
import java.io.IOException;
import java.io.*;
@WebServlet("/updcustomer")
public class UpdateCustomer extends HttpServlet {
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter out=response.getWriter();
		int eid=Integer.parseInt(request.getParameter("eid"));
		String name=request.getParameter("name");
		String email=request.getParameter("email");
		String contact=request.getParameter("contact");
		int cid=Integer.parseInt(request.getParameter("cid"));
		//int rid=Integer.parseInt(request.getParameter("rid"));
		RequestDispatcher r=request.getRequestDispatcher("AdminDashboard.jsp");
		 r.include(request, response);
		 out.println("<html>");
		 out.println("<head>");
		 out.println("<meta charset='ISO-8859-1'>");
		 out.println("<title>Update</title>");
		 out.println("<link href='css/UpdateAll.css' rel='stylesheet'>");
		 out.println("</head>");
		 out.println("<body>");
		 out.println("<div class='col py-3 view'>");
		 out.println("<form name='form' action='finalcustomerupdate' method='POST'>");
		 out.println("<div class='myclass1'>");
		 out.println("<input type='hidden' name='id' value='"+eid+"' class='form-control' required autocomplete='off'><br><br>");
		 out.println("<label>Update name</label><br><br>");
		 out.println("<input type='text' name='name' value='"+name+"' class='form-control' required autocomplete='off'><br>");
		 out.println("<label>Update email</label><br><br>");
		 out.println("<input type='text' name='email' value='"+email+"' class='form-control' required autocomplete='off'><br>");
		 out.println("<label>Update contact</label><br><br>");
		 out.println("<input type='text' name='contact' value='"+contact+"' class='form-control' required autocomplete='off'><br>");
		 out.println("<label for='custtype' class='form-label'>Update Customer type</label>");
		 CustomerTypeService cts=new CustomerTypeServiceImpl();
		 List<CustomerTypeModel> list=cts.getAllCustType();
			 out.println("<select name='gettype'>");
			 out.println("<option>select type</option>");
			 for(CustomerTypeModel m:list)
			    {
			     out.println("<option value='"+m.getUid()+"'>"+m.getType()+"</option>");			    		    	
		        }
			 out.println("</select>");
		 out.println("<br>");		
		 out.println("<div class='center'><input type='submit' name='s' value='Submit' class='btn btn-success'/></div>");
		 out.println("</div>");
		 out.println("</form>");
		 out.println("</div></div></div>");
		 out.println("</body>");
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		doGet(request, response);
	}

}
