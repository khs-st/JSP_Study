<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<%!String id, pw;%>
	<%
		id = request.getParameter("id");
	pw = request.getParameter("pw");

	//로그인 성공
	if (id.equals("aaa") && pw.equals("1234")) {
		//Cookie cookie = new Cookie("id", id);
		//cookie.setMaxAge(60); // 쿠키의 유효시간 1분, 1분이 지나면 자동으로 삭제
		//response.addCookie(cookie); //응답

		session.setAttribute("id", id);
		session.setAttribute("pw", pw);
		response.sendRedirect("welcomeSession.jsp");
	}

	//로그인 실패
	else {

		response.sendRedirect("LoginSession.html");

	}
	%>
</body>
</html>