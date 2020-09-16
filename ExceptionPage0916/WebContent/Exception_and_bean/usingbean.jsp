<%@page import="Exception_and_bean.Customer"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

<!-- Customer cus=new Customer();와 아래는 같은 뜻 -->
<jsp:useBean id="cus" class="Exception_and_bean.Customer" scope="page" />
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<!-- cus.setName("고한솔"); , setAge 등 과 같은 뜻 -->
	<jsp:setProperty property="name" name="cus" value="고한솔" />
	<jsp:setProperty property="age" name="cus" value="26" />
	<jsp:setProperty property="grade" name="cus" value="4" />
	<jsp:setProperty property="number" name="cus" value="5237278" />

	이름:
	<jsp:getProperty property="name" name="cus" /><br /> 나이:
	<jsp:getProperty property="age" name="cus" /><br /> 성적:
	<jsp:getProperty property="grade" name="cus" /><br /> 학번:
	<jsp:getProperty property="number" name="cus" /><br />

	<br />
	<%
	//위와 같은 코드(import 해줘야함)
	//page import="Exception_and_bean.Customer"
	Customer cus2 = new Customer();
	cus2.setName("고한솔");
	cus2.setAge(26);
	cus2.setGrade(4);
	cus2.setNumber("5237278");
	out.print("위와 같은 코드!");
	%>
	<br/>
	<%
	out.println("이름: " + cus2.getName() + "<br/>");
	out.println("나이: " + cus2.getAge() + "<br/>");
	out.println("성적: " + cus2.getGrade() + "<br/>");
	out.println("학번: " + cus2.getNumber() + "<br/>");
	%>


</body>
</html>