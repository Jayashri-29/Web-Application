<%@page import="mess.service.PresentServiceImpl"%>
<%@page import="mess.service.PresentService"%>
<%@page import="mess.model.CustomerModel"%>
<%@page import="mess.service.CustomerServiceImpl"%>
<%@page import="mess.service.CustomerService"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Present-days</title>
<link href='css/Addrate.css' rel='stylesheet'>
<style>
table tr td
{
 height:20px;
 width:200px;
}
.conto
{
 text-align: center;
}
</style>
</head>
 <%@include file="UserDashboard.jsp" %>
<body>

      <%
   //int userid=Integer.parseInt(session.getAttribute("uid").toString());
       int userid=Integer.parseInt(request.getParameter("id"));
	   cs=new CustomerServiceImpl();
	   int count=cs.getTotalPresentDaysById(userid);
	   PresentService ps=new PresentServiceImpl();
	   List<PresentDay> list2=ps.getPresentDates(userid);
	   %>
		<div class='col py-3  bg-success bg-opacity-25'>
		  <div class='myclass'>
		     <table class="table table-light table-bordered">              
                  <tr  class="table-active conto">
                    <td>Total Present days</td>
                    <td><%=count%></td>
                  </tr>
                  <tr class="conto"> 
                       <td rowspan="<%=count+1%>">Present Dates</td>              
                  </tr>                  
                    <%
                    for(PresentDay p:list2)
                     {
                      %>
                       <tr class="conto">
                       <td><%=p.getDate()%></td>
                       </tr>
                      <%
                     }
                      %>              
             </table>
		  </div>
		 </div>
		 </div>
		 </div>
		 
</body>
</html>