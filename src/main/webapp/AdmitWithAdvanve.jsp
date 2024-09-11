<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@page import="mess.service.*,mess.model.*,java.util.*"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<script type="text/javascript" src="JS/ValidateEmail.js"></script>
<link href="css/Addrate.css" rel="stylesheet">
</head>
<body>
	<%@include file="AdminDashboard.jsp"%>
	<div class="col py-3 bg-success bg-opacity-25">
	<div class="myclass">
		<form name='form' action='admitWithamount' method='POST'>
			<label for="ratetype" class="form-label">Select customer name to admit</label>
			<br />
			<%
			CustomerService cs = new CustomerServiceImpl();
			List<CustomerModel> list = cs.getallWithoutAdvance();
			%>
			<select name="getname">
				<option>Select name</option>
				<%
				for (CustomerModel m : list) {
				%>
				<option value="<%=m.getEid()%>"><%=m.getName()%></option>
				<%
				}
				%>
			</select> 
			<br /><br/>
			<label for="custadv" class="form-label">Enter advance
				amount</label> <br /> <input type="text" name="advance" class="form-control"
				id="custadv" required autocomplete="off"> <br />
		
			<div class="d-flex justify-content-center">
				<input type="submit" name="s" value="Submit" class="btn btn-success" />
			</div>
			</form>
	</div>
	
	</div>
	</div>
	</div>
</body>
</html>