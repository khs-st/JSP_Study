<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Error.jsp</title>
</head>
<body>
	request 오류가 발생했습니다. 관리자에게 문의하세요.
	<br /> 오류 내용:
	<%
	String errorMessage = (String) request.getAttribute("error_message");
%>
	<%=errorMessage%>
</body>
</html>