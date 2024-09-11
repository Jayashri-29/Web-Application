<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<link href="css/AddCustomer.css" rel="stylesheet">
</head>
<body>
<%@include file="AdminDashboard.jsp" %>
  <div class="col py-3 bg-success bg-opacity-25">
            <form name='form' action='addmainu' method='POST'>
						<div class="myclass">
							<label for="mainuwname" class="form-label">Enter week day name</label>
							<br/>
							<input type="text" name="dayname" class="form-control" id="mainuwname" required autocomplete="off">
							<br/>
							<label for="mainubname" class="form-label">Enter bhaji name</label>
							<br/>
							<input type="text" name="bname" class="form-control" id="mainubname" required autocomplete="off">
							<br/>
							<label for="mainudname" class="form-label">Enter dal name</label>
							<br/>
							<input type="text" name="dname" class="form-control" id="mainudname" required autocomplete="off">
							<br/>
							<labelclass="form-label">Select Poli</label>
							<table>						                  
						    	<tr>
						    	<td>						    	
						    	<input type="radio" class="form-check-input" id="mainupname" name="politype" value="Yes"/>
						    	<label for="mainupname">YES</label><br>
						    	</td>
						    	<td>						    	
						    	<input type="radio" class="form-check-input" id="mainupname" name="politype" value="No"/>
						    	<label for="mainupname">No</label><br>
						    	</td>
						        </tr>
						        <tr>
						    	<td colspan="2">		
						    	<input type="text" style="width:135px; margin-right: 20px; margin-left: 20px;" class="form-check-input" id="mainupname" name="politypetext" value="" autocomplete="off"/>				    	
						    	<label  for="mainupname">Others</label>						    	
						    	<br>
						    	</td>
						        </tr>
						    </table>
						    <br>
						    <label class="form-label">Select Rice</label>
							    <table>						                  
						    	<tr>
						    	<td>						    	
						    	<input type="radio" class="form-check-input" id="mainubhname" name="bhattype" value="Yes"/>
						    	<label for="mainubhname">YES</label><br>
						    	</td>
						    	<td>						    	
						    	<input type="radio" class="form-check-input" id="mainubhname" name="bhattype" value="No"/>
						    	<label for="mainubhname">No</label><br>
						    	</td>
						        </tr>
						        <tr>
						    	<td colspan="2">		
						    	<input type="text" style="width:135px; margin-right: 20px; margin-left: 20px;" class="form-check-input" id="mainubhname" name="bhattypetext" value="" autocomplete="off" style="margin-right:20px;margin-left:20px;"/>				    	
						    	<label for="mainubhname">Others</label>						    	
						    	<br>
						    	</td>
						        </tr>
						    </table>
						     <br>
						    <label class="form-label">Select Sweet</label>
							    <table>						                  
						    	<tr>
						    	<td>						    	
						    	<input type="radio" class="form-check-input" id="mainusname" name="sweettype" value="Yes"/>
						    	<label for="mainusname">YES</label><br>
						    	</td>
						    	<td>						    	
						    	<input type="radio" class="form-check-input" id="mainusname" name="sweettype" value="No"/>
						    	<label for="mainusname">No</label><br>
						    	</td>
						        </tr>
						        <tr>
						    	<td colspan="2">		
						    	<input type="text" style="width:135px; margin-right: 20px; margin-left: 20px;" class="form-check-input" id="mainusname" name="sweettypetext" value="" autocomplete="off" style="margin-right:20px;margin-left:20px;"/>				    	
						    	<label for="mainusname">Others</label>						    	
						    	<br>
						    	</td>
						        </tr>
						    </table>
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