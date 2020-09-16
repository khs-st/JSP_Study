<%@page import="java.util.Enumeration"%>
<%@ page language="java" contentType="text/html; charset=EUC-KR"
	pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
</head>
<body>
	<%!int i = 0;%>
	<%
	Enumeration enumeration = session.getAttributeNames();
	
	while (enumeration.hasMoreElements()) {
		i++;
		String sName = enumeration.nextElement().toString();
		String sValue = (String) session.getAttribute(sName);
		System.out.println("sessiontest");
		System.out.println(sName);
		System.out.println(sValue);
	}
	if (i == 0) {
		out.println("해당 세션이 삭제되었습니다.");
	}
	else{
		out.println("오류인가");
	}
	%>
</body>
</html>