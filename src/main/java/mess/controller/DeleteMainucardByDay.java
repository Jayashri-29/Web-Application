package mess.controller;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.*;
import mess.service.*;

@WebServlet("/delmainucard")
public class DeleteMainucardByDay extends HttpServlet 
{
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
	{
		response.setContentType("text/html");
		PrintWriter out=response.getWriter();
		String day=request.getParameter("day");
		MainuCardService mcs=new MainuCardServiceImpl();
		boolean b=mcs.delByDay(day);
		if(b)
		{
			RequestDispatcher rd=request.getRequestDispatcher("ViewMainu.jsp");
			rd.forward(request, response);
		}
		else
		{
			RequestDispatcher rd=request.getRequestDispatcher("ViewMainu.jsp");
			rd.include(request, response);	
			out.println("<h4>some problem occured...</h4>");
		}
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
