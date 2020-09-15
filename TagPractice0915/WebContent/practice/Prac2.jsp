<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@page import="java.util.Arrays" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<%! int age=0;
%>
<%String str=request.getParameter("age"); 
%>
<%

	try{
		age=Integer.parseInt(str);
	}catch(Exception e){
		e.printStackTrace();
		age=0;
	}
	if(age>=20){
		response.sendRedirect("ok.jsp?age="+age);
	}
	else{
		response.sendRedirect("no.jsp?age="+age);
	}
	
	
%>

</body>
</html>