<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

<%@ page errorPage ="error.jsp" %>
<% 
  
String num1 =request.getParameter("n1");
String num2 = request.getParameter("n2");

int a = Integer.parseInt(num1);
int b = Integer.parseInt(num2);
 int x = a/b;
 out.print("division of number is:" +x);



%>




</body>
</html>