function validateName(name){
	var namepatt = /^[a-zA-Z]{3,20}$/;
	return namepatt.test(name);
}

function validateVeno(veno){
	var venopattern =/^[A-Z]{2,2}+[-][0-9]{2,2}+[-][0-9]{4,4}$/;
	return venopattern.test(veno);
}

function validate(){
	document.getElementById("err1").innerHTML="";
	document.getElementById("err3").innerHTML="";
	
	var name = document.getElementById("txtname").value;
	var veno = document.getElementById("txtvehno").value;
	var res = true;
	
	if(!validateName(name)){
		document.getElementById("err1").innerHTML="Name must be min 3 max 20 alphabets";
		res = false;
	}
	
	if(!validateVeno(veno)){
		document.getElementById("err3").innerHTML="Not a valid Car number id";
		res=false;
	}
	return res;
}