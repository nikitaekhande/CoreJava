<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
        <%!
        int a=10;
        String name = "nikita";
        int square(){
        	return a*a;
        }
         %>
         
         <%
         out.println("a:" +a);
         out.println("name:" +name);
         
         out.println(square());
         
         
         int b= 20;
         
         if(b<100){
        	 out.println("b is smaller");
         }
         
         else{
        	 
        	 out.println("b is greater");
         }
         %>
         
         <%= a %>
          <%= name%>
          <%=square() %>
          
         Current Time: <%= java.util.Calendar.getInstance().getTime() %>  
         
</body>
</html>