<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<script type="text/javascript">
	function logout() {
		location.href = "Logout.jsp";
	}
</script>

<body>
	<%
		Cookie[] cookies = request.getCookies();
	for (int i = 0; i < cookies.length; i++) {
		String id = cookies[i].getValue();

		if (id.equals("aaa")) {
			out.println(id + "�� �α��� ����");
		}

	}
	%>
	<br />
	<input type="button" value="�α׾ƿ�" onclick="logout()" />
</body>
</html>