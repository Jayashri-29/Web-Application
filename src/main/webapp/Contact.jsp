<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<link rel="stylesheet"
	href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css" />
<link
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.3/dist/css/bootstrap.min.css"
	rel="stylesheet" />
<style>
.myclass
{
 margin-left:50px;
 margin-right: 50px;

 padding: 30px;
 padding-left: 50px;
 height:280px;
}
.myclass table,tr,td
{
 padding: 5px;
}
.myclass h2
{
padding-left: 3px;
color: blue;
}
.myclass1
{
 margin-left:50px;
 margin-right: 50px;
 background-color: rgba(0,0,0,0.1);
  padding: 30px;
 padding-left: 50px;
 height:280px;
}
.myclass1 h2
{
padding-left: 3px;
color: blue;
}
.myclass1 table tr td
{
 padding-right: 20px;
}
.myclass1 table tr td
{
 padding: 8px;
}
</style>
</head>
<body>
     
	<section>
	 <div class="container-fluid ">
	   <div class="row p-4 text-center text-bold mb-3">
	     <h1>Contact Us</h1>
	   </div>
	   <div class="row">
	    <div class="col-md-12 col-lg-6">
	     <div class="myclass">
	      <form name=form" action="getmsg" method="POST">
	       <h2>Send your request</h2>
	       <table>
	        <tr>
	           <td>Enter your name</td>
	           <td>Enter your contact number</td>
	        </tr>
	        <tr>
	           <td><input type="text" name="name" value=""/></td>
	           <td><input type="text" name="name" value=""/></td>
	        </tr>
	        <tr>
	           <td>Enter your email</td>
	           <td>Enter your Request</td>
	        </tr>
	        <tr>
	           <td><input type="text" name="name" value=""/></td>
	           <td><input type="text" name="name" value=""/></td>
	        </tr>
	       </table>
	      </form>
	      </div>
	    </div>
	    <div class="col-md-12 col-lg-6">
	       <div class="myclass1">
	         <h2>Reach Us</h2><br>
	         <table>
	           <tr>
	             <td>Phone no:</td>
	             <td>+910 000 000 000</td>
	           </tr>
	           <tr>
	             <td>Email:</td>
	             <td>gajananmess@gmail.com</td>
	           </tr>
	           <tr>
	             <td>Address:</td>
	             <td>something where nothing,</td>
	           </tr>
	           <tr>
	             <td colspan="2" style="padding-left:95px;"> near somewhere</td>
	            
	           </tr>
	         </table>
	     
	       </div>
	    </div>
	   </div>
	 </div>
	</section>
	<script
		src="https://cdn.jsdelivr.net/npm/@popperjs/core@2.11.6/dist/umd/popper.min.js"></script>
	<script
		src="https://cdn.jsdelivr.net/npm/bootstrap@5.2.3/dist/js/bootstrap.min.js"></script>
</body>
</html>