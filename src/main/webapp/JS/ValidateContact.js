function checkcontact(str)
  {
	  let pattern=/^[0-9]+$/g
	  let result=str.match(pattern);
	  var headingTag=document.getElementById("contact");
	  if(result!=null && str.length==10)
		  {
		   headingTag.innerHTML="";
		  // headingTag.style.color="green";
		   
		  }
	  else
		  {
		   headingTag.innerHTML="Please enter valid contact";
		   headingTag.style.color="rgba(255,0,0,0.7)";
		   headingTag.style.textDecoration="underline"
		  }
  }/**
 * 
 */