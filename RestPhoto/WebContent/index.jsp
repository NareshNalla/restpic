<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h1> Wel Come  WebService Medicine Bundle Example</h1>
<h5> Do you want test, it's working or not? display v.json object file ?</h5>

<form method=get action="api/medicineservices/v1">
Enter 
<input type="text" name=geo_type value="cuntry" />
<input type="text" name=geo_value value="USA" />
<input type="text" name=medicine_cd value="MD003" />

<input type="submit" value="Submit">

....
<table border=1>

<tr id='blue'><td >    <b>  ${response.medicine_Id}
	    		  </b>	</td><td >    <b>  ${response.geo_type}
	    		  </b>	</td><td ><b>=</b></td><td >    <b>  ${response.geo_value}
	    		   </b>	</td><td >	<b> ${response.medicine_cd}
	    		  </a> </b>   </td><td > <b>${response.medicine_json}	</td></tr> </table> 
</form>
</body>
</html>