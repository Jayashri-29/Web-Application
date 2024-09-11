<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
	<%@ page import="mess.service.*,java.util.*,mess.model.*"%>
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
CustomerTypeService cts=new CustomerTypeServiceImpl();
%>
	<%@include file="AdminDashboard.jsp"%>
	<div class="col myclass">
	<center><h3><u>Customer Type Details</u></h3></center><br>
		<table class="table table-success table-striped">
			<thead>
				<tr>
					<th scope="col">Sr.No.</th>
					<th scope="col">Customer Type</th>
					<th scope="col">Update</th>
					<th scope="col">Delete</th>
				</tr>
			</thead>
			<tbody>
			<%
			List<CustomerTypeModel> list=cts.getAllCustType();
			int sr=0;
			for(CustomerTypeModel m:list)
			{
				%>
				<tr>
				<th><%=++sr%></th>
				<td><%=m.getType()%></td>
				<td><a href='upd?uid=<%=m.getUid()%>&uname=<%=m.getType()%>'>Update</a></td>
				<td><a href='delete?uid=<%=m.getUid()%>'><i class="bi bi-trash3-fill"></i></a></td>
			    </tr>
				<%
			}
			%>
			
			</tbody>
		</table>
	</div>
	</div>
	</div>
</body>
</html>