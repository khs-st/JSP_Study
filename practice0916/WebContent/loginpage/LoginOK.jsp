<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<!-- 쿠키란 연결이 끊겼을때 어떤 정보를 지속적으로 유지하기 위한 수단으로 사용하는 방식/
	 4kb로 용량이 제한적, 300개까지 데이터 정보 가질 수 있다. /서버에서 생성하여, 서버가 아닌 클라이언트측에 특정 정보를 저장 합니다. 
	 그리고 서버에 요청 할 때 마다 쿠키의 속성값을 참조 또는 변경 할 수 있습니다-->

<%!String id, pw;%>
<%
	id = request.getParameter("id");
pw = request.getParameter("pw");

//로그인 성공
if (id.equals("aaa") && pw.equals("1234")) {
	Cookie cookie = new Cookie("id", id);
	cookie.setMaxAge(60); // 쿠키의 유효시간 1분, 1분이 지나면 자동으로 삭제
	response.addCookie(cookie); //응답
	response.sendRedirect("welcome.jsp");
}

//로그인 실패
else {

	response.sendRedirect("Login.html");

}
%>
<body>
</body>
</html>