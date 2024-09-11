<%@page import="mess.service.MainuCardServiceImpl"%>
<%@page import="mess.service.MainuCardService"%>
<%@page import="java.util.*,mess.model.*" %>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap-icons@1.11.3/font/bootstrap-icons.min.css">
<link href="css/Viewcusttype.css" rel="stylesheet">

</head>
<body>

<%!
MainuCardService mcs=new MainuCardServiceImpl();
%>
	<%@include file="AdminDashboard.jsp"%>
	<div class="col" style="background-image: url('https://fiverr-res.cloudinary.com/t_main1,q_auto,f_auto/gigs/323599228/original/ceffb005dfd1b386be1c5e2f441300833d453e91.jpg');background-position: center;background-repeat: no-repeat;background-size: cover;">
	<div class="myclass">
	<center><h3><u><mark>Mainu-Card</mark></u></h3></center><br>
		<table class="table table-success table-striped">
			<thead>
				<tr>
					<th scope="col">Day</th>
					<th scope="col">Bhaji</th>
					<th scope="col">Dal</th>
					<th scope="col">Chapati</th>
					<th scope="col">Rice</th>
					<th scope="col">Sweet</th>
					<th scope="col">Update</th>
					<th scope="col">delete</th>
				</tr>
			</thead>
			<tbody>
			<%
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
				<td><a href='updmainucard?day=<%=m.getDay()%>&bhaji=<%=m.getBhaji()%>&dal=<%=m.getDal()%>&poli=<%=m.getPoli()%>&rice=<%=m.getRice()%>&sweet=<%=m.getSweet()%>' class='anchorclass'>Update</a></td>
				<td><a href='delmainucard?day=<%=m.getDay()%>'><i class="bi bi-trash3-fill"></i></a></td>
			    </tr>
				<%
			}
			%>
			
			</tbody>
		</table>
	</div>
	</div>
	</div>
	</div>

</body>
</html>