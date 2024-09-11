<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<link href="css/Addrate.css" rel="stylesheet">
</head>
 <%@include file="UserDashboard.jsp" %>
<body>
<%
int userid=Integer.parseInt(request.getParameter("id"));
%>
   <div class="col py-3  bg-success bg-opacity-25">
	
	  <form name='form' action='viewbillbyuser' method='POST'>
		<div class="myclass">
		    <input type="hidden" name="id" id="id" value=<%=userid%> class="form-control" required autocomplete="off"/>
			<label for="custmonth" class="form-label">Enter Month name</label>
			<br/>
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
			<br/><br/>
			<div class="d-flex justify-content-center">
			<input type="submit" name="s" value="Submit" class="btn btn-success" />
			</div>
		</div>
       </form>        
	  </div>

</body>
</html>