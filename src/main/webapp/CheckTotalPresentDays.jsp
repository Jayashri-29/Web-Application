<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@page import="mess.service.*,mess.model.*,java.util.*" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<script type="text/javascript" src="JS/ValidateEmail.js"></script>
<link href="css/Addcusttype.css" rel="stylesheet">
</head>
<body>
	<%@include file="AdminDashboard.jsp"%>
	<div class="col py-3 bg-success bg-opacity-25">
		<form name='form' action='checktotalpresentday' method='POST'>
			<div class="myclass">
				<label for="custemail" class="form-label">Select Customer
					name</label> <br />
				<%
				CustomerService cs = new CustomerServiceImpl();
				List<Object[]> list = cs.getAll();
				%>
				<select name="getemail">
					<option>Select name</option>
					<%
					for (Object obj[] : list) {
					%>
					<option value="<%=obj[2]%>"><%=obj[1]%></option>
					<%
					}
					%>
				</select> <br />
				<br />
				<div class="d-flex justify-content-center">
					<input type="submit" name="s" value="Submit"
						class="btn btn-success" />
				</div>
			</div>
		</form>
	</div>
	</div>
	</div>

</body>
</html>