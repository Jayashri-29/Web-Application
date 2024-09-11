package mess.controller.user;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

import java.io.IOException;
import java.io.*;
@WebServlet("/logout")
public class LogoutbyUser extends HttpServlet 
{	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		response.setContentType("text/html");
		PrintWriter out=response.getWriter();
		HttpSession session=request.getSession();
		try {
			Object obj=session.getAttribute("uid");
			String s=String.valueOf(obj);
			int eid=Integer.parseInt(s);
				if(eid!=0)
				{
				 session.removeAttribute(s);
				 session.invalidate();
				// System.out.println(session);
				 response.sendRedirect("Login.jsp");
			     //RequestDispatcher o=request.getRequestDispatcher("Login.jsp");
			     //o.forward(request, response);
				}
			}
			catch(Exception ex)
			{
	    		response.sendRedirect("UserDashboard.jsp");
				System.out.println("error in logout----->"+ex);
			}
 	}


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
