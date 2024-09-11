function checkName(str)
  {
	  let pattern=/^[a-zA-Z]+$/g
	  let result=str.match(pattern);
	  var headingTag=document.getElementById("hname");
	  if(result!=null)
		  {
		   headingTag.innerHTML="";
		  // headingTag.style.color="green";
		   
		  }
	  else
		  {
		   headingTag.innerHTML="Please enter correct name";
		   headingTag.style.color="rgba(255,0,0,0.7)";
		   headingTag.style.textDecoration="underline"
		  }
  }