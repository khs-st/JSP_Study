<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ page import="com.kb.www.vo.ArticleVO"%>
<%@page import="java.util.ArrayList"%>
<%
	ArticleVO vo = (ArticleVO) request.getAttribute("num");
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<style>
h1, table {
	text-align: center;
	margin: auto;
}

table, tr, td {
	width: 1000px;
	height: 100px;
	border: 1px solid black;
}
</style>
</head>
<body>
	<h1>게시판</h1>
	<table>

		<tbody>
			<tr>
				<td>글번호</td>
				<td><%=vo.getArticleNumber()%></td>
			</tr>
			<tr>
				<td>글내용</td>
				<td><%=vo.getArticleContents()%></td>
			</tr>

		</tbody>
	</table>
</body>
</html>