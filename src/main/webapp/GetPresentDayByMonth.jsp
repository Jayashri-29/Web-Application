<%@page import="mess.service.CustomerServiceImpl"%>
<%@page import="mess.service.CustomerService"%>
<%@page import="mess.model.CustomerModel"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
 <%
  String month=request.getParameter("n");
  int id=Integer.parseInt(request.getParameter("id"));
  CustomerModel m=new CustomerModel();
  m.setEid(id);
  String monthNo="00";
	 if(month.equalsIgnoreCase("january"))
	  {
		  monthNo="01";
	  }
	  else if(month.equalsIgnoreCase("february"))
	  {
		  monthNo="02";
	  }
	  else if(month.equalsIgnoreCase("march"))
	  {
		  monthNo="03";
	  }
	  else if(month.equalsIgnoreCase("april"))
	  {
		  monthNo="04";
	  }
	  else if(month.equalsIgnoreCase("may"))
	  {
		  monthNo="05";
	  }
	  else if(month.equalsIgnoreCase("june"))
	  {
		  monthNo="06";
	  }
	  else if(month.equalsIgnoreCase("jully"))
	  {
		  monthNo="07";
	  }
	  else if(month.equalsIgnoreCase("augest"))
	  {
		  monthNo="08";
	  }
	  else if(month.equalsIgnoreCase("september"))
	  {
		  monthNo="09";
	  }
	  else if(month.equalsIgnoreCase("octomber"))
	  {
		  monthNo="10";
	  }
	  else if(month.equalsIgnoreCase("november"))
	  {
		  monthNo="11";
	  }
	  else if(month.equalsIgnoreCase("december"))
	  {
		  monthNo="12";
	  }
	  else
	  {
		  monthNo="00";
		  %>
		 <h3>Incorrect month name<br>Please enter correct month name</h3>;
		 <%
	  }
	 CustomerService cs=new CustomerServiceImpl();
	 int count=cs.getPresentDayMonthWise(m, monthNo);	 
	 if(count!=0)
	 {
		 %>		
		 <h3>Your total present day in <%=month%> month are <%=count%></h3>
		 <%
	 }
	 else
	 {
		 %>
		 <h3>Not present on any day in <%=month%></h3> 
		 <%
	 }
 %>
  
</body>
</html>