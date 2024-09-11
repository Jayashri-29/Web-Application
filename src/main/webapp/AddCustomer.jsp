<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@ page import="mess.service.*,mess.model.*,java.util.*"  %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Add-Customer</title>
<script type="text/javascript" src="JS/ValidateEmail.js"></script>
<script type="text/javascript" src="JS/ValidateName.js"></script>
<script type="text/javascript" src="JS/ValidateContact.js"></script>
<link href="css/AddCustomer.css" rel="stylesheet">
</head>
<body>
<%@include file="AdminDashboard.jsp" %>
  <div class="col py-3 bg-success bg-opacity-25">
            <form name='form' action='addcust' method='POST'>
						<div class="myclass">
							<label for="custname" class="form-label">Enter Customer Name</label>
							<br/>
							<input type="text" name="name" value ='' class="form-control" id="custname" onkeyup="checkName(this.value)" required autocomplete="off">
							<br/>
							<h5 id="hname"></h5>
							<label for="custemail" class="form-label">Enter Customer Email</label>
							<br/>
							<input type="text"  name="email" value='' class="form-control" id="custemail" onkeyup="checkEmail(this.value)" required autocomplete="off">
							<br/>
							<h5 id="h"></h5>
							<label for="custcontact" class="form-label">Enter Customer Contact</label>
							<br/>
							<input type="text" name="contact" class="form-control" id="custcontact" onkeyup="checkcontact(this.value)" required autocomplete="off">
							<br/>
							<h5 id="contact"></h5>
							<label for="custtype" class="form-label">Select Customer type</label><br/>						
							<%
							CustomerTypeService cts=new CustomerTypeServiceImpl();
							List<CustomerTypeModel> list=cts.getAllCustType();	
						      %>
						    	  <select name="getcusttype">
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
						    <br><br>
						    
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