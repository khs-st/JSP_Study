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
		//������� ��ü�� �ְ� ���� ��
	//ArrayList�� ���� ��
	Enumeration enumeration = session.getAttributeNames();
	while (enumeration.hasMoreElements()) {
		String sName = enumeration.nextElement().toString();
		String sValue = (String) session.getAttribute(sName);

		if (sValue.equals("aaa")) {
			out.println(sValue + "�� �ȳ��ϼ���.<br/>");
		}
	}
	%>
	<br />
	<input type="button" value="�α׾ƿ�" onclick="logout()" />
</body>
</html>