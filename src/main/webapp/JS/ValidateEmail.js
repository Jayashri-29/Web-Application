 function checkEmail(str)
  {
	  let pattern=/^[a-z0-9.-_]+@[a-z0-9.-]+\.[a-z]{2,3}$/g
	  let result=str.match(pattern);
	  var headingTag=document.getElementById("h");
	  if(result!=null)
		  {
		   headingTag.innerHTML="";
		  // headingTag.style.color="green";
		   
		  }
	  else
		  {
		   headingTag.innerHTML="Please enter correct email";
		   headingTag.style.color="rgba(255,0,0,0.7)";
		   headingTag.style.textDecoration="underline"
		  }
  }
  