package mess.controller;

import jakarta.servlet.RequestDispatcher;
import java.util.*;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import mess.model.PresentDay;
import mess.service.*;
import mess.model.*;
import java.io.IOException;
import java.io.*;

@WebServlet("/addpresenty")
public class AddPresentyOfCustomer extends HttpServlet {
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		// String email = request.getParameter("email");
		int id = Integer.parseInt(request.getParameter("getid"));
		String date = request.getParameter("alldate");

		PresentDay pd = new PresentDay(id, 1, date);
		PresentService ps = new PresentServiceImpl();
		boolean b1 = ps.takePresenty(pd);
		if (b1) {
			RequestDispatcher rd = request.getRequestDispatcher("AdminDashboard.jsp");
			rd.include(request, response);
			out.println("<h4>Presenty done..</h4>");
		} else {
			RequestDispatcher rd = request.getRequestDispatcher("AdminDashboard.jsp");
			rd.include(request, response);
			out.println("<h4>Some problem is there</h4>");
		}
	
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
