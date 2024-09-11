function checkwithspace(str)
  {
	  let pattern=/^[a-zA-Z]+\s[a-zA-Z]+$/g
	  let result=str.match(pattern);
	  var headingTag=document.getElementById("nwiths");
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