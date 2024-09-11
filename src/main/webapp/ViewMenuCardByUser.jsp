<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@page import="mess.service.*,mess.model.*,java.util.*" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<link href="css/Viewcusttype.css" rel="stylesheet">
</head>
 <%@include file="UserDashboard.jsp" %>
<body>

  <%
   int userid=Integer.parseInt(session.getAttribute("uid").toString());
  %> 
   <div class="col" style="background-image: url('https://fiverr-res.cloudinary.com/t_main1,q_auto,f_auto/gigs/323599228/original/ceffb005dfd1b386be1c5e2f441300833d453e91.jpg');background-position: center;background-repeat: no-repeat;background-size: cover;">
	<div class="myclass">
	<center><h3><u><mark>Menu-Card</mark></u></h3></center><br>
		<table class="table table-success table-striped">
			<thead>
				<tr>
					<th scope="col">Day</th>
					<th scope="col">Bhaji</th>
					<th scope="col">Dal</th>
					<th scope="col">Poli</th>
					<th scope="col">Rice</th>
					<th scope="col">Sweet</th>
				</tr>
			</thead>
			<tbody>
			<%
			MainuCardService mcs=new MainuCardServiceImpl();
			List<MainuCardModel> list1=mcs.getAllData();
			for(MainuCardModel m:list1)
			{
				%>
				<tr>
				<td><%=m.getDay()%></td>
				<td><%=m.getBhaji()%></td>
				<td><%=m.getDal()%></td>
				<td><%=m.getPoli()%></td>
				<td><%=m.getRice()%></td>
				<td><%=m.getSweet()%></td>
				</tr>
				<%
			}
			%>
			
			</tbody>
		</table>          
    </div>
    </div>
</body>
</html>