package mess.controller;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import mess.model.CustomerTypeModel;
import mess.model.RateModel;
import mess.service.CustomerTypeService;
import mess.service.CustomerTypeServiceImpl;
import mess.service.RateService;
import mess.service.RateServiceImpl;

import java.io.IOException;
import java.util.List;
import java.io.*;
@WebServlet("/updmainucard")
public class UpdateMainuCard extends HttpServlet
{
   protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
   {
	   response.setContentType("text/html");
	   PrintWriter out=response.getWriter();
	   String day=request.getParameter("day");	
	   String bname=request.getParameter("bhaji");
	   String dname=request.getParameter("dal");
	   String poli=request.getParameter("poli");
	   String bhat=request.getParameter("rice");
	   String sweet=request.getParameter("sweet");
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
		 out.println("<form name='form' action='fmcupd' method='POST'>");
		 out.println("<div class='myclass1'>");
		 out.println("<input type='hidden' name='day' value='"+day+"' class='form-control' required autocomplete='off'><br><br>");
		 out.println("<label>Update Bhaji name</label><br>");
		 out.println("<input type='text' name='bhaji' value='"+bname+"' class='form-control' required autocomplete='off'><br>");
		 out.println("<label>Update Dal name</label><br>");
		 out.println("<input type='text' name='dal' value='"+dname+"' class='form-control' required autocomplete='off'><br>");
		 out.println("<label>Update Poli</label><br>");
		 out.println("<input type='text' name='poli' value='"+poli+"' class='form-control' required autocomplete='off'><br>");
		 out.println("<label>Update rice</label><br>");
		 out.println("<input type='text' name='bhat' value='"+bhat+"' class='form-control' required autocomplete='off'><br>");
		 out.println("<label>Update Sweet</label><br>");
		 out.println("<input type='text' name='sweet' value='"+sweet+"' class='form-control' required autocomplete='off'><br>");
		 out.println("<div class='center'><input type='submit' name='s' value='Submit' class='btn btn-success'/></div>");
		 out.println("</div>");
		 out.println("</form>");
		 out.println("</div></div></div>");
		 out.println("</body>");
   }

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
