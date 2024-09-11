<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ page import="mess.model.*,mess.service.*,java.util.*" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Check-total-member</title>
<link href="css/Addcusttype.css" rel="stylesheet">
</head>
<body>
<%@include file="AdminDashboard.jsp" %>
  <div class="col py-3 bg-success bg-opacity-25">
            <form name='form' action='checktotal' method='POST'>
						<div class="myclass">
							<label for="ratetype" class="form-label">Select customer type</label>
							<br/>
							<% 
							  CustomerTypeService cs=new CustomerTypeServiceImpl();
							  List<CustomerTypeModel> list=cs.getAllCustType();
						    %>
							  <select name="getname">
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