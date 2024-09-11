package mess.controller;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import mess.model.RateModel;
import mess.service.RateService;
import mess.service.RateServiceImpl;

import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/finalupdrate")
public class FinalRateUpdate extends HttpServlet {
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter out=response.getWriter();
		int id=Integer.parseInt(request.getParameter("rid"));
		int price=Integer.parseInt(request.getParameter("rprice"));
		String name=request.getParameter("rname");
        RateModel rm=new RateModel(id, name, price);
        RateService rs=new RateServiceImpl();
        boolean b=rs.isUpdateById(rm);
        if(b)
        {
        	RequestDispatcher rd=request.getRequestDispatcher("ViewRate.jsp");
        	rd.forward(request, response);
        }
        else
        {
        	RequestDispatcher rd=request.getRequestDispatcher("AdminDashboard.jsp");
        	rd.forward(request, response);
        	out.println("<h4>Some problem is there</h4>");
        }
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
