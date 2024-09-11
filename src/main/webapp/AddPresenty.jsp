<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ page import="mess.service.*,mess.model.*,java.util.*"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Take-Presenty</title>
<link href="css/AddPresenty.css" rel="stylesheet">
</head>
<body>
	<%@include file="AdminDashboard.jsp"%>
	<div class="col py-3 bg-success bg-opacity-25">
		<form name='form' action='addpresenty' method='POST'>
			<div class="myclass">
				<label for="custemail" class="form-label">Select Customer name</label> 
				<br />
				<%
				CustomerService cs = new CustomerServiceImpl();
				List<Object[]> list = cs.getAll();
				%>
				<select name="getid">
					<option>Select name</option>
					<%
					for (Object obj[] : list) {
					%>
					<option value="<%=obj[0]%>"><%=obj[1]%></option>
					<%
					}
					%>
				</select> 
				<br /> <br>
				<label for="selectdate" class="form-label">Select date</label> <br />
			   <input type="date" name="alldate" class="form-control"
					id="selectdate" required autocomplete="off"> <br>
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