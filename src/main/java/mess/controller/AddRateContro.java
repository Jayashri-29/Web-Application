package mess.controller;

import jakarta.servlet.RequestDispatcher;
import java.util.*;
import jakarta.servlet.ServletException;
import java.io.*;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import mess.model.RateModel;
import mess.service.RateService;
import mess.service.RateServiceImpl;

import java.io.IOException;
@WebServlet("/addrate")
public class AddRateContro extends HttpServlet {
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	response.setContentType("text.html");
	PrintWriter out=response.getWriter();
	String name=request.getParameter("getratename");	
	int price=Integer.parseInt(request.getParameter("price"));
	RateModel rm=new RateModel(name, price);
	RateService rs=new RateServiceImpl();
	List<RateModel> list=rs.getAll();
	boolean flag=false;
	for(RateModel m:list)
	{
		System.out.println(m.getName());
		if(m.getName().equalsIgnoreCase(name))
		{
			flag=true;
			break;
		}
	}
	if(!flag)
	{
	 boolean b=rs.isAddRate(rm);
	 if(b)
	 {
		 RequestDispatcher rd=request.getRequestDispatcher("AdminDashboard.jsp");
		 rd.include(request, response);			
		 out.println("<center><h3>Rate added successfully</h3></center>");
	  }
	  else
	  {
	 	 RequestDispatcher rd=request.getRequestDispatcher("AdminDashboard.jsp");
		 rd.include(request, response);
		 out.println("<center><h3>Some problem is there</h3></center>");
	  }
	}
	else
	{
		 RequestDispatcher rd=request.getRequestDispatcher("AdminDashboard.jsp");
		 rd.include(request, response);
		 out.println("<center><h3>"+name+" is allready present</h3></center>");
	}
	
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
