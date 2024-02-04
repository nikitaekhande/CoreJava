<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>


 <form action="submitForm"  method ="Get">
 Name:<input type = "text" name ="name"><br></br>
 Email:<input type ="text" name ="email"><br><br>
 Password:<input type = "text" name ="password"><br><br>
 Gender: 
<input type="radio" name="gender" value="male"> Male 
<input type="radio" name="gender" value="female"> Female 
<input type="text" name="other_gender" placeholder="Other">
 
 
 City:
<select name="city">
   <option value="" selected disabled>Select city</option>
   <option value="Pune">Pune</option>
   <option value="Dhule">Dhule</option>
   <option value="Mumbai">Mumbai</option>
   <option value="Bangalore">Bangalore</option>
</select><br><br>
 
 
 <input type ="submit" value ="Resister">
 
 
 </form>

</body>
</html>