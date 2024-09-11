<%@page import="mess.service.CustomerTypeServiceImpl"%>
<%@page import="mess.service.CustomerTypeService"%>
<%@page import="mess.model.*,java.util.*" %>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<script type="text/javascript" src="JS/ValidateWithSpace.js"></script>
<link href="css/Addrate.css" rel="stylesheet">
</head>
<body>
<%@include file="AdminDashboard.jsp" %>
  <div class="col py-3 bg-success bg-opacity-25">
            <form name='form' action='addrate' method='POST'>
						<div class="myclass">
							<label for="ratetype" class="form-label">Select rate type</label>
							<br/>
							<% 
							  CustomerTypeService cs=new CustomerTypeServiceImpl();
							  List<CustomerTypeModel> list=cs.getAllCustType();
						    %>
							  <select name="getratename">
							    <option>Select type here</option>
							  <%
							     for(CustomerTypeModel m:list)
							      {
							   %>							
							    <option value="<%=m.getType()%>"><%=m.getType()%></option>						
							   <%
							      }
							   %>
							  </select>
							<br/><br/>
							<label for="rateprice" class="form-label">Enter rate price</label>
							<br/>
							<input type="text" name="price" class="form-control" id="rateprice" required autocomplete="off">
							<br/><br/>
							<div class="d-flex justify-content-center">
							<input type="submit" name="s" value="Submit" class="btn btn-success" />
							</div>
						</div>
            </form>                      
        </div>
    </div>
    </div>

</body>
</html>