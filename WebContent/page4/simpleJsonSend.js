/**
 * 
 */


 $(document).ready(function(event){
	 
	$('#btn1').on("click",jsonSend);
	});
 
 function jsonSend(){
	 console.log("ok");
	 var xhr=new XMLHttpRequest();
	 xhr.onreadystatechange=sendLogin;
	 xhr.open("post",loginURL);
	 xhr.send("hello");
	 
 }
 
 function sendLogin(response){
	 if(response.status==200 && readyState==1)
	 {
		 console.log("sent");
	 }
	 
	 if(response.status==200 && readyState==4)
	 {
		 console.log("ssss"+this.responseText);
	 }
	 
 }
 
 
 


	
