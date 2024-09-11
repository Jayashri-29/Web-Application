package mess.controller.user;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import mess.model.CustomerTypeModel;
import mess.service.CustomerTypeService;
import mess.service.CustomerTypeServiceImpl;

import java.io.IOException;
import java.util.List;
import java.io.*;
@WebServlet("/myupd")
public class UpdateProfileByUser extends HttpServlet 
{
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		response.setContentType("text/html");
		PrintWriter out=response.getWriter();
		int id=Integer.parseInt(request.getParameter("id"));
		String name=request.getParameter("name");
		String email=request.getParameter("email");
		String contact=request.getParameter("contact");
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
		 out.println("<form name='form' action='finalmyupd' method='POST'>");
		 out.println("<div class='myclass1'>");
		 out.println("<input type='hidden' name='id' value='"+id+"' class='form-control' required autocomplete='off'><br><br>");
		 out.println("<label>Update name</label><br>");
		 out.println("<input type='text' name='name' value='"+name+"' class='form-control' required autocomplete='off'><br>");
		 out.println("<label>Update email</label><br>");
		 out.println("<input type='text' name='email' value='"+email+"' class='form-control' required autocomplete='off'><br>");
		 out.println("<label>Update contact</label><br>");
		 out.println("<input type='text' name='contact' value='"+contact+"' class='form-control' required autocomplete='off'><br>");
		 out.println("<br>");		
		 out.println("<div class='center'><input type='submit' name='s' value='Submit' class='btn btn-success'/></div>");
		 out.println("</div>");
		 out.println("</form>");
		 out.println("</div></div></div>");
		 out.println("</body>");
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
