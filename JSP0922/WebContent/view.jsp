<%@ page import="com.java.test.MemberBean" %>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
 
     <%
     MemberBean memberInfo= (MemberBean) request.getAttribute("memberInfo");
     %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
이름: <%=memberInfo.getName() %>
아이디: <%=memberInfo.getId() %>
</body>
</html>