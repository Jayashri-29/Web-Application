<%@page import="mess.model.CustomerModel"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ page import="mess.service.*,mess.model.*" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<script>
 function show()
 {
	 let id=document.getElementById("id").value;
	 let name=document.getElementById("custmonth").value;
	 let xhttp=new XMLHttpRequest();
 	 xhttp.onreadystatechange=function(){
 		 if(this.readyState==4 && this.status==200){
 			 document.getElementById("h").innerHTML=this.responseText;
 		 }
 	};
 	xhttp.open("GET","GetPresentDayByMonth.jsp?n="+name+"&id="+id,true)
 	xhttp.send();
 }
</script>
<link href="css/Addrate.css" rel="stylesheet">
</head>
 <%@include file="UserDashboard.jsp" %>
<body>

  <%
   //int userid=Integer.parseInt(session.getAttribute("uid").toString());
     int userid=Integer.parseInt(request.getParameter("id"));
     //System.out.println(userid);
  %> 
   <div class="col py-3  bg-success bg-opacity-25">       
       <div class="myclass">
      
        <form name="frm" action="viewpdbyuser" method="POST">
            <input type="hidden" name="id" id="id" value=<%=userid%> class="form-control" required autocomplete="off"/>
			<label for="custmonth" class="form-label">Select Month name</label>
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
			  <input type="submit" name="s" value="Submit" class="btn btn-success"/>
			</div>
		 </form>
		</div> 
       </div>
       </div> 
       </div>     
	
   
    
</body>
</html>