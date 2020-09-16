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
		//쿠키를 지우는 프로세스
	Cookie[] cookies = request.getCookies();

	if (cookies != null) {
		//쿠키 배열 길이만큼 반복문 수행
		for (int i = 0; i < cookies.length; i++) {
			if (cookies[i].getValue().equals("aaa")) {
		//MaxAge를 0으로 바꾼다.
		cookies[i].setMaxAge(0);
		//그걸 다시 addCookie 한다.
		response.addCookie(cookies[i]);
			}
		}
	}

	//로그아웃을 하였으면 다시 로그인페이지로 이동
	response.sendRedirect("Login.html");

	//response.sendRedirect("cookietest.jsp");
	%>
</body>
</html>