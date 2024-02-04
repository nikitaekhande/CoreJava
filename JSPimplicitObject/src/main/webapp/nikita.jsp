<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
     <%
     
     String name ="nikita";
   //  String name =request.getParameter("name");
     out.print("welcom:" +name);
     
     %>
     
     
     <form action ="index.jsp" method ="get">
     <input  type="text" name ="name" placeholder ="enter name" >
     <input type = "submit" value ="go"><br></br>
  
     </form>
     
</body>
</html>