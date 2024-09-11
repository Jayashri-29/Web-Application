package mess.controller;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/updrate")
public class UpdateRate extends HttpServlet {
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	response.setContentType("text/html");
	PrintWriter out=response.getWriter();
	int id=Integer.parseInt(request.getParameter("rid"));
	int price=Integer.parseInt(request.getParameter("rprice"));
	String name=request.getParameter("rname");
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
	 out.println("<form name='form' action='finalupdrate' method='POST'>");
	 out.println("<div class='myclass'>");
	 out.println("<input type='hidden' name='rid' value='"+id+"' class='form-control' required autocomplete='off'><br><br>");	 
	 out.println("<input type='hidden' name='rname' value='"+name+"' class='form-control' required autocomplete='off'><br>");
	 out.println("<label>Update Price</label><br><br>");
	 out.println("<input type='text' name='rprice' value='"+price+"' class='form-control' required autocomplete='off'><br>");
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
