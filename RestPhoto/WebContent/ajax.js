function mainsearch(){  
	 var word = $('#aa').val().trim();
	  //alert("ok")
	  $.ajax({  
	    type: "GET",  
	    url: "api/employeeservices/getemployeedetail?employeeId="+word,  
	    data: "", 
	    dataType: 'json',
	    success: function(response){
	      // we have the response
	     //alert("response")
	      userInfo = " <br><table border=1>";
	                   
	    
    	    	  userInfo+= "<tr id='blue'><td >    <b>  " + response.dateOfJoining +
	    		  " </b>	</td><td >    <b>  " + response.firstName +
	    		  " </b>	</td><td '><b>=</b></td><td >    <b>  " + response.lastName+
	    		  " </b>	</td><td >	<b> " +response.dateOfJoining+
	    		  "</a> </b>   </td><td > <b>"+response.email+"	</td></tr>";  
             
	    
	    
	      
	      userInfo+= "</table></center>";
    	  $('#info').html("" + userInfo);
	      $('#errormain').fadeOut();
	      $('#cont').fadeOut();
	      $('#info').fadeIn();
	      $('#info1').html("" + foundInfo);
	
		  $('#info1').fadeIn();	   	
	      if(response.status == "SUCCESS"){
	    	  alert("sucess")
	    	 
	    	  userInfo = "<table class='words'><tr class='name'><th class='name' style='width:160px'><b> NAME </b></th><th class='name' style='width:12px'><b>  </b></th><th class='name' style='width:420px'><b>MEANING </b></th><th class='name' style='width:160px'><b> LIKES </b></th></tr>";
	    	  var totallength= response.result.length;
	    	 
	    	 
	          if(totallength!=0)
	    	   {
	    	      for(i =0 ; i < totallength ; i++){
	    	    	  userInfo+= "<tr id='blue'><td class='name' style='width:160px'>    <b>  " + response.result[i].firstName +"<td><tr>"
		    		     }
	    	    
				 
	    	  }
	    	  else
	    	  {  
                userInfo+= "<tr id='blue'> <td class='name' style='width:160px'><b> nnnnnnnnnnn user";
	    		  
	    	
	    	  } 
	          userInfo+= "</table></center>";
	    	  $('#info').html("" + userInfo);
		      $('#errormain').fadeOut();
		      $('#cont').fadeOut();
		      $('#info').fadeIn();
		      $('#info1').html("" + foundInfo);
		
			  $('#info1').fadeIn();	   				
	      
	      }
	      else{
	    	  errorInfo = "";
	    	  for(i =0 ; i < response.result.length ; i++){
	    		  errorInfo += " <br>&nbsp;";
	    		  errorInfo += " &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;" + response.result[i].code;
	    		 
	    	  }
	    	  $('#errormain').html(" " + errorInfo);
	    	  $('#info').fadeOut();
	    	  $('#errormain').fadeIn();
	    	  $('#errorquick').fadeOut();
	    	  $('#cont').fadeIn();
	    	  $('#info1').fadeOut();
	    	  $('#pagination').fadeOut();
	    	  $('#pagination1').fadeOut();
	      }	  
	      
	    },  
	    error: function(e){  
	    	
	    	 $('#info').html("" + errorInfo);
		      $('#errormain').fadeOut();
		      $('#cont').fadeOut();
		      $('#info').fadeIn();
		      $('#info1').html("" + foundInfo);
		
			  $('#info1').fadeIn();	   			   
	      alert('Database Communication Error please try again: ');
	      /* alert('Database Communication Error please try again: ' + e); */
	    }  
	    
	  });  	  
}  
