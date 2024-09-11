package mess.controller;

import jakarta.servlet.RequestDispatcher;
import java.util.*;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import mess.model.CustomerModel;
import mess.model.CustomerTypeModel;
import mess.model.RateModel;
import mess.service.*;

import java.io.IOException;
import java.io.*;
@WebServlet("/addcust")
public class AddCustomerContro extends HttpServlet {

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	response.setContentType("text/html");
	PrintWriter out=response.getWriter();
	String name=request.getParameter("name");
	String email=request.getParameter("email");
	String contact=request.getParameter("contact");
	String type=request.getParameter("getcusttype");
	int cid=0,rid=0;
	CustomerTypeService cts=new CustomerTypeServiceImpl();
	List<CustomerTypeModel> list=cts.getAllCustType();
	for(CustomerTypeModel m:list)
	{
		if(m.getType().equalsIgnoreCase(type))
		{
			cid=m.getUid();
			break;
		}
	}
	RateService rs=new RateServiceImpl();
	List<RateModel> list1=rs.getAll();
	for(RateModel m:list1)
	{
		if(m.getName().equalsIgnoreCase(type))
		{
			rid=m.getId();
			break;
		}
	}
	CustomerModel cm= new CustomerModel(cid, rid, name, contact, email);
	CustomerService cs=new CustomerServiceImpl();
	boolean b=cs.isAddCust(cm);
	if(b)
	{
		RequestDispatcher rd=request.getRequestDispatcher("AdminDashboard.jsp");
		rd.include(request, response);
		out.println("<h4>Customer Added successfully...</h4>");
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
