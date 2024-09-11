<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@page import="mess.model.*,mess.service.*,java.util.*" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>View-Customer</title>
<link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap-icons@1.11.3/font/bootstrap-icons.min.css">
<link href="css/ViewCustomer.css" rel="stylesheet">
<script>
 function show(name)
 {
	 let xhttp=new XMLHttpRequest();
 	xhttp.onreadystatechange=function(){
 		 if(this.readyState==4 && this.status==200){
 			 document.getElementById("d").innerHTML=this.responseText;
 		 }
 	};
 	xhttp.open("GET","Searchbyname.jsp?n="+name,true)
 	xhttp.send();
 }
</script>
</head>
<body>
<%!
CustomerService cs=new CustomerServiceImpl();
CustomerTypeService cts=new CustomerTypeServiceImpl();
%>
	<%@include file="AdminDashboard.jsp"%>
	<div class="col" style="background-image: url('https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcTPRRZwQlyUC_d-stgRk71YdlD3tKWe_wOTre-9pqdKADsoddV9F_QXezZnCMwiqP5qpD0&usqp=CAU');background-position: center;background-repeat: no-repeat;background-size: cover;">
	<div class="myclass">
	<center><h3><u><mark>Customer Details</mark></u></h3></center><br>
	<div class="first">
	 <h4 class="text-white">Search customer here</h4>
	</div>
	<div class="second">
	<input type="text" name="name" class="text-black" value=""  onkeyup="show(this.value)"/>
	</div>
	<br><br><br>
	<div id="d">
		<table class="table table-success table-striped">
			<thead>
				<tr>
					<th scope="col">Sr.No.</th>
					<th scope="col">Name</th>
					<th scope="col">Email</th>
					<th scope="col">Catagory</th>
					<th scope="col">Advance</th>
					<th scope="col">Update</th>
					<th scope="col">Delete</th>				
				</tr>
			</thead>
			<tbody>
			<%
			List<Object[]> list=cs.getAll();
			int sr=0;
			for(Object obj[]:list)
			{
				%>
				<tr>
				<td><%=++sr%></td>
				<td><%=obj[1]%></td>
				<td><%=obj[2]%></td>
				<% 
				int id=Integer.parseInt(obj[4].toString());
				%>
				<td><%=cts.getTypeById(id)%></td>
				<td><%=obj[6]%></td>
				<td><a href='updcustomer?eid=<%=obj[0]%>&name=<%=obj[1]%>&email=<%=obj[2]%>&contact=<%=obj[3]%>&cid=<%=obj[4]%>' class='anchorclass'>Update</a></td>
				<td><a href='delcustomer?eid=<%=obj[0]%>'><i class="bi bi-trash3-fill"></i></a></td>
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
	</div>

</body>
</html>