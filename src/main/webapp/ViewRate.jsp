<%@page import="mess.service.*,mess.model.*,java.util.*"%>
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
RateService rs=new RateServiceImpl();
%>
	<%@include file="AdminDashboard.jsp"%>
	<div class="col">
	<div class="myclass">
	<center><h3><u>Rate Details</u></h3></center><br>
		<table class="table table-success table-striped">
			<thead>
				<tr>
					<th scope="col">Sr.No.</th>
					<th scope="col">Rate name</th>
					<th scope="col">Price</th>
					<th scope="col">Update</th>
					<th scope="col">Delete</th>
				</tr>
			</thead>
			<tbody>
			<%
			List<RateModel> list=rs.getAll();
			int sr=0;
			for(RateModel m:list)
			{
				%>
				<tr>
				<td><%=++sr%></td>
				<td><%=m.getName()%></td>
				<td><%=m.getPrice()%></td>
				<td><a href='updrate?rid=<%=m.getId()%>&rname=<%=m.getName()%>&rprice=<%=m.getPrice()%>'>Update</a></td>
				<td><a href='delrate?rid=<%=m.getId()%>'><i class="bi bi-trash3-fill"></i></a></td>
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