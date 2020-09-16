<%@page import="java.util.Enumeration"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<script type="text/javascript">
	function logout() {
		location.href = "LogoutSession.jsp";
	}
</script>
</head>
<body>
	<%
		//순서대로 객체를 넣고 싶을 때
	//ArrayList와 같은 것
	Enumeration enumeration = session.getAttributeNames();
	while (enumeration.hasMoreElements()) {
		String sName = enumeration.nextElement().toString();
		String sValue = (String) session.getAttribute(sName);

		if (sValue.equals("aaa")) {
			out.println(sValue + "님 안녕하세요.<br/>");
		}
	}
	%>
	<br />
	<input type="button" value="로그아웃" onclick="logout()" />
</body>
</html>