<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Add-Customer-Type</title>
<script type="text/javascript" src="JS/ValidateWithSpace.js"></script>
<link href="css/Addcusttype.css" rel="stylesheet">
</head>
<body>
<%@include file="AdminDashboard.jsp" %>
  <div class="col py-3 bg-success bg-opacity-25">
            <form name='form' action='addtype1' method='POST'>
						<div class="myclass">
							<label for="custtype" class="form-label">Enter Customer type</label>
							<br/>
							<input type="text" name="pass" class="form-control" id="custtype" onkeyup="checkwithspace(this.value)" required autocomplete="off">
							<h5 id="nwiths"></h5>
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