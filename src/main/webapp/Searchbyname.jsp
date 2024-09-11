<%@page import="mess.service.*"%>
<%@page import="mess.model.*,java.util.*"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
  <%
   String name=request.getParameter("n");
   CustomerService cs=new CustomerServiceImpl();
   CustomerTypeService cts=new CustomerTypeServiceImpl();
  %>
  <table class="table table-success table-striped">
			<thead>
				<tr>
					<th scope="col">Sr.No.</th>
					<th scope="col">Name</th>
					<th scope="col">Email</th>
					<th scope="col">Catagory</th>
					<th scope="col">Update</th>
					<th scope="col">Delete</th>
				</tr>
			</thead>
			<tbody>
			<%
			List<CustomerModel> list=cs.getallByName(name);
			int sr=0;
			for(CustomerModel m:list)
			{
				%>
				<tr>
				<td><%=++sr%></td>
				<td><%=m.getName()%></td>
				<td><%=m.getEmail()%></td>
				<td><%=cts.getTypeById(m.getCid())%></td>
				<td><a href='updcustomer?eid=<%=m.getEid()%>&name=<%=m.getName()%>&email=<%=m.getEmail()%>&contact=<%=m.getContact()%>&cid=<%=m.getCid()%>&rid=<%=m.getRid()%>' clas='anchorclass'>Update</a></td>
				<td><a href='delcustomer?eid=<%=m.getEid()%>'><i class="bi bi-trash3-fill"></i></a></td>
			    </tr>
				<%
			}
			%>
			
			</tbody>
		</table>
  
</body>
</html>