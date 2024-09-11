package mess.controller;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import mess.model.MainuCardModel;
import mess.service.MainuCardService;
import mess.service.MainuCardServiceImpl;

import java.io.IOException;
import java.io.*;
@WebServlet("/addmainu")
public class AddMainuToMainuCard extends HttpServlet {
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	   response.setContentType("text/html");
	   PrintWriter out=response.getWriter();
	   String ptype,btype,stype;
	   String day=request.getParameter("dayname");	
	   String bname=request.getParameter("bname");
	   String dname=request.getParameter("dname");
	   String poli=request.getParameter("politype");
	   String bhat=request.getParameter("bhattype");
	   String sweet=request.getParameter("sweettype");
	   String poli1=request.getParameter("politypetext");
	   String bhat1=request.getParameter("bhattypetext");
	   String sweet1=request.getParameter("sweettypetext");
	   if(poli1=="")
	   {
		   ptype=poli;
	   }
	   else
	   {
		   ptype=poli1;
	   }
	   if(bhat1=="")
	   {
		   btype=bhat;
	   }
	   else
	   {
		   btype=bhat1;
	   }
	   if(sweet1=="")
	   {
		   stype=sweet;
	   }
	   else
	   {
		   stype=sweet1;
	   }
	   /*out.println("1"+poli);
	   out.println("2"+poli1);
	   out.println("3"+ptype);
	   out.println("4"+bhat);
	   out.println("5"+bhat1);
	   out.println("6"+btype);
	   out.println("7"+sweet);
	   out.println("8"+sweet1);    
	   out.println("9"+stype);*/
	   MainuCardModel mcm=new MainuCardModel(day, bname, dname, ptype, btype, stype);
	   MainuCardService mcs=new MainuCardServiceImpl();
	   boolean b=mcs.addItemToCard(mcm);
	   if(b)
	   {
		   RequestDispatcher rd=request.getRequestDispatcher("AdminDashboard.jsp");
		   rd.include(request, response);
		   out.println("<h3>Addedd successfully...</h3>");
	   }
	   else
	   {
		   RequestDispatcher rd=request.getRequestDispatcher("AdminDashboard.jsp");
			rd.include(request, response);
			out.println("<h4>Some Problem occured...</h4>");   
	   }
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
