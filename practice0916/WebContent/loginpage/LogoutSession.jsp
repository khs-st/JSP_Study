<%@page import="java.util.Enumeration"%>
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
	Enumeration enumeration = session.getAttributeNames();
	System.out.println("세션 삭제 전");
	while (enumeration.hasMoreElements()) {
		String sName = enumeration.nextElement().toString();
		String sValue = (String) session.getAttribute(sName);
		System.out.println("sName: " + sName + "<br/>");
		System.out.println("sValue: " + sValue + "<br/>");
	}
	
	//Enumeration이 세션을 읽은 마지막 위치가 마지막 Element이기 때문에 그냥 삭제프로세스를 실행하면 삭제가 되지 않는다.
	//그렇기 때문에 초기값을 다시 읽는 역할을 하는 아래의 구문을 입력해야한다.
	enumeration = session.getAttributeNames();
	//세션을 삭제하는 프로세스
	while (enumeration.hasMoreElements()) {
		String sName = enumeration.nextElement().toString();
		String sValue = (String) session.getAttribute(sName);

		if (sValue.equals("aaa")||sValue.equals("1234")) {
			session.removeAttribute(sName); //여기서 sName은 id를 뜻함;
			//session.removeAttribute("pw");
			//session.removeAttribute("1234");
			//session.removeAttribute("aaa");
		}
		
	}
	enumeration = session.getAttributeNames();
	System.out.println("세션 삭제 후");
	while (enumeration.hasMoreElements()) {
		String sName = enumeration.nextElement().toString();
		String sValue = (String) session.getAttribute(sName);
		System.out.println("sName: " + sName + "<br/>");
		System.out.println("sValue: " + sValue + "<br/>");
	}
	%>
	<a href="sessiontest.jsp">세션 확인</a>
</body>
</html>