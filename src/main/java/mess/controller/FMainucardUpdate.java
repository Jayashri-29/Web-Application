package mess.controller;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import mess.model.*;
import mess.service.*;
@WebServlet("/fmcupd")
public class FMainucardUpdate extends HttpServlet 
{
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
	{
		 response.setContentType("text/html");
		  PrintWriter out=response.getWriter();
		  String day=request.getParameter("day");	
		  String bname=request.getParameter("bhaji");
		  String dname=request.getParameter("dal");
		  String poli=request.getParameter("poli");
		  String bhat=request.getParameter("bhat");
		  String sweet=request.getParameter("sweet");
		  /*System.out.println(day);
		  System.out.println(bname);
		  System.out.println(dname);
		  System.out.println(poli);
		  System.out.println(bhat);
		  System.out.println(sweet);*/
		  MainuCardModel mcm=new MainuCardModel(day, bname, dname, poli, bhat, sweet);
		  MainuCardService mcs=new MainuCardServiceImpl();
		  boolean b=mcs.updatebyDay(mcm);
		  if(b)
			{
				RequestDispatcher rd=request.getRequestDispatcher("ViewMainu.jsp");
				rd.forward(request, response);
			}
			else
			{
				RequestDispatcher rd=request.getRequestDispatcher("AdminDashboard.jsp");
				rd.forward(request, response);
				out.println("<h4>Some problem is there..</h4>");
			}

	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
