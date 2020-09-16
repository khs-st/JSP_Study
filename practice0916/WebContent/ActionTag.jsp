<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h1>Action Tag</h1>
<jsp:forward page="index.jsp">
<jsp:param value="paramID" name="id"/>
<jsp:param value="paramPW" name="pw"/>
</jsp:forward>
</body>
</html>