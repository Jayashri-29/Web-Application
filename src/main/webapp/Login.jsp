<%@page import="mess.service.CustomerServiceImpl"%>
<%@page import="mess.service.CustomerService"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Login Page</title>
<link rel="stylesheet"
	href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css" />
<link
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.3/dist/css/bootstrap.min.css"
	rel="stylesheet" />
<style>
 *
 {
            margin: 0;
            padding: 0;
            box-sizing: border-box;
 }
.container-fluid {
	height: 593px;
	border: 2px solid black;
	background-image:url("https://www.atss.in/wp-content/uploads/2021/07/Canteen-Management-ATSS.jpg");
    background-position: center;
    background-repeat: no-repeat;
    background-size: cover;
  

}
.container-fluid .myclass
{
 font-size:40px;
 margin-top:00px;
 text-decoration: underline;
 color:green;
 
 
}
.container {
	height:auto;
	width: 800px;
	border: 2px solid black;
	border-radius: 15px;
	margin-top: 140px;
	margin-left: 210px;
	padding-top: 14px;
	padding-bottom: 30px;
	background-color: white;
	
}
.container .row{
 padding-top: 10px;
 color: black;
}
</style>
</head>
<body>
	<div class="container-fluid">
		<div class="container">
			<div class="row">
				<div class="offset-md-3 col-md-6 offset-md-3">
				    <h3 style="font-family: cursive;">Welcome to Gajanan mess</h3>
				    <br>
					<form name='form' action='' method='POST'>
						<div class="mb-3">
							<label for="exampleInputEmail1" class="form-label fs-6 fw-bold">Enter
								your name</label> <input type="text" name="name" class="form-control"
								required autocomplete="off">
						</div>
						<div class="mb-3">
							<label for="exampleInputPassword1" class="form-label fs-6 fw-bold">Enter
								your password</label> <input type="text" name="pass"
								class="form-control" required autocomplete="off">
						</div>
						<div class="d-flex justify-content-center">
							<input type="submit" name="s" value="Submit" class="btn btn-primary" />
						</div>
						
					</form>
				</div>
			</div>
		</div>
	</div>
	<%
	String btn = request.getParameter("s");
	if (btn != null) {
		String name1 = request.getParameter("name");
		String pass1 = request.getParameter("pass");
        
		if (name1.equals("admin") && pass1.equals("admin"))
		{
			response.sendRedirect("Welcome.jsp");
		}
		else
		{
			CustomerService cs=new CustomerServiceImpl();
	        int result=cs.verifyCustomer(name1, pass1);
			if(result!=0) 
		    {
			HttpSession session1=request.getSession(true);
			session1.setAttribute("uid",result);
			response.sendRedirect("WelcomeUser.jsp");
		    }
		   else
		    {
			 response.sendRedirect("Invalidpage.jsp");
		    }
	      }
	}
	%>
	<script
		src="https://cdn.jsdelivr.net/npm/@popperjs/core@2.11.6/dist/umd/popper.min.js"></script>
	<script
		src="https://cdn.jsdelivr.net/npm/bootstrap@5.2.3/dist/js/bootstrap.min.js"></script>

</body>
</html>