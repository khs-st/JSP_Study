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
String id,pw;
id=request.getParameter("id");
pw=request.getParameter("pw");

%>
<h1>액션태그로 이동!</h1>
<jsp:include page="includeTag.jsp"/>
<h1>jsP:param받기</h1>
아이디: <%=id %> <br/>
비밀번호: <%= pw %> <br/>
</body>
</html>