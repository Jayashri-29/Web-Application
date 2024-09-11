package my.pack;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;


import java.io.IOException;
import java.io.PrintWriter;

/**
 * Servlet implementation class MyServ
 */
public class MyServ extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public MyServ() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		 PrintWriter out=response.getWriter();
		 out.println("I am servlet");
		 /*String name=request.getParameter("pass");
		 CustomerTypeModel ctm= new CustomerTypeModel();
		 ctm.setType(name);
		 CustomerTypeService cts=new CustomerTypeServiceImpl();
		 boolean b=cts.addCustType(ctm);
		 if(b)
		 {
			 RequestDispatcher r=request.getRequestDispatcher("AdminDashboard.jsp");
			 r.include(request, response);
			 out.println("<center><h1>Customer type added successfully...</h1></center>");
		 }
		 else
		 {
			 RequestDispatcher r=request.getRequestDispatcher("AdminDashboard.jsp");
			 r.include(request, response);
			 out.println("<center><h1>Some problem is there</h1></center>");

		 }*/
		
		}

	

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
