<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Admin-Dashboard</title>
<link rel="stylesheet"
	href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css" />
<link
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.3/dist/css/bootstrap.min.css"
	rel="stylesheet" />
</head>
<body>
	<div class="container-fluid">
		<div class="row flex-nowrap">
			<div class="col-auto col-md-3 col-xl-2 px-sm-2 px-0 bg-light text-dark">
				<div class="dropdown pb-2 pt-4 pl-5">
					<a
						class="d-flex align-items-center justify-content-center text-black text-decoration-none dropdown-toggle"
						data-bs-toggle="dropdown" aria-expanded="false"> <img
						src="https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcQWOcPv5gl0htCApaTRCW2qjD3Ks5YqxInAGiuomxkKsvbjSnd09HuRC7RBJOlZPvnbC1s&usqp=CAU"
						alt="hugenerd" width="90" height="90" class="rounded-circle">
						<span class="d-none d-sm-inline mx-1 fs-4">Admin</span>
					</a>
					<ul class="dropdown-menu dropdown-menu-dark text-small">
						<li><a class="dropdown-item" href="Login.jsp">Sign out</a></li>
					</ul>
				</div>
				<hr>
				<div class="d-flex flex-column align-items-center align-items-sm-start px-2 pt-0 min-vh-100">
				  <div class="dropdown">
					<button class="btn btn-lg" type="button" style="font-size: 20px;" data-bs-toggle="dropdown" 
					aria-expanded="false"><i class="fs-4 bi-people"></i>  Customer-type</button>
					<ul class="dropdown-menu">
						<li><a class="dropdown-item" href="AddCustType.jsp">Add Type</a></li>
						<li><hr class="dropdown-divider"></li>
						<li><a class="dropdown-item" href="ViewCustType.jsp">View Type</a></li>
					</ul>
				  </div>
				  
				  <div class="dropdown">
					<button class="btn  btn-lg" type="button" style="font-size: 20px;" data-bs-toggle="dropdown" 
					aria-expanded="false"><i class="fs-4 bi-table"></i> Rate</button>
					<ul class="dropdown-menu">
						<li><a class="dropdown-item" href="AddRate.jsp">Add Rate</a></li>
						<li><hr class="dropdown-divider"></li>
						<li><a class="dropdown-item" href="ViewRate.jsp">View Rate</a></li>
					</ul>
				  </div>
				  
				  <div class="dropdown">
					<button class="btn btn-lg" type="button" style="font-size: 20px;" data-bs-toggle="dropdown" 
					aria-expanded="false"><i class="fs-4 bi-people"></i> Customer</button>
					<ul class="dropdown-menu">
						<li><a class="dropdown-item" href="AddCustomer.jsp">Register Customer</a></li>
						
						<li><a class="dropdown-item" href="AdmitWithAdvanve.jsp">Admit with<br>advance</a></li>
						
						<li><a class="dropdown-item" href="ViewCustomer.jsp">View Customer</a></li>
						
						<li><a class="dropdown-item" href="AddPresenty.jsp">Mark Attendence</a></li>
					
						<li><a class="dropdown-item" href="CheckTotalMember.jsp">Count TotalMember<br>(Type wise)</a></li>
						
						<li><a class="dropdown-item" href="CheckTotalPresentDays.jsp">Check present<br>days</a></li>
						
						<li><a class="dropdown-item" href="CountTPDMonthWise.jsp">Check present<br>Days monthwise</a></li>
						
						<li><a class="dropdown-item" href="CalculateBill.jsp">Calculate Bill</a></li>						
					</ul>
				  </div>
				  
				  <div class="dropdown">
					<button class="btn btn-lg" type="button" style="font-size: 20px;" data-bs-toggle="dropdown" 
					aria-expanded="false"><i class="fs-4 bi-table"></i> Menu-Card</button>
					<ul class="dropdown-menu">
						<li><a class="dropdown-item" href="AddMainu.jsp">Add Menu</a></li>
						<li><hr class="dropdown-divider"></li>
						<li><a class="dropdown-item" href="ViewMainu.jsp">View Menu</a></li>
				    </ul>
				  </div>
				</div>
				
			</div>


			<script
				src="https://cdn.jsdelivr.net/npm/@popperjs/core@2.11.6/dist/umd/popper.min.js"></script>
			<script
				src="https://cdn.jsdelivr.net/npm/bootstrap@5.2.3/dist/js/bootstrap.min.js"></script>
</body>
</html>