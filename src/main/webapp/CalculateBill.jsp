<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@page import="mess.model.*,mess.service.*,java.util.*" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<link href="css/Addrate.css" rel="stylesheet">
<script type="text/javascript" src="JS/ValidateEmail.js"></script>
</head>
<body>
<%@include file="AdminDashboard.jsp" %>
  <div class="col py-3 bg-success bg-opacity-25">
            <form name='form' action='calbill' method='POST'>
						<div class="myclass">
				<label for="custemail" class="form-label">Select Customer
					name</label> <br />
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
				 <br/><br/>
				 <label for="custmonth" class="form-label">Select Month name</label> <br /> 
				 <select name="getmonth">
				    <option>Select month</option>
				    <option value="01">January</option>
				    <option value="02">February</option>
				    <option value="03">March</option>
				    <option value="04">April</option>
				    <option value="05">May</option>
				    <option value="06">June</option>
				    <option value="07">July</option>
				    <option value="08">August</option>
				    <option value="09">September</option>
				    <option value="10">Octomber</option>
				    <option value="11">November</option>
				    <option value="12">December</option>				  
				 </select>
				<br />
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
i
</body>
</html>