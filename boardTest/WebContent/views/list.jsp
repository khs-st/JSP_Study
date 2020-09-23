<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ page import="com.kb.www.vo.ArticleVO"%>
<%@page import="java.util.ArrayList"%>
<%
	ArrayList<ArticleVO> list = (ArrayList<ArticleVO>) request.getAttribute("list");
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
<script src="https://code.jquery.com/jquery-1.11.3.js"
	type="text/javascript"></script>

<script type="text/javascript">
function showDetail(articleNum){
	location.href="detail?num="+articleNum;
}
$(document).ready(function () 
		{
		    $('tr').hover(function(){
		        $(this).css('color','blue');
		    }, function() {
		        $(this).css('color','black');
		    });
		});

</script>
</head>
<body>
	<h1>게시판</h1>
	<table>
		<tr>
			<td>글번호</td>
			<td>제목</td>
			<td>조회수</td>
			<td>작성일자</td>
		</tr>
		<%
			if (list.size() > 0) {
			for (int i = 0; i < list.size(); i++) {
		%>
		<tr onclick="showDetail(<%=list.get(i).getArticleNumber()%>)">
			<td ><%=list.get(i).getArticleNumber()%></td>
			<td><%=list.get(i).getArticleSubject()%></td>
			<td><%=list.get(i).getHit()%></td>
			<td><%=list.get(i).getWriteDate()%></td>
		</tr>
		<%
			}
		}
		//else는 게시글이 없을경우
		else {
		%>
		<tr>
			<td colspan="4">게시글이 없습니다.</td>
		</tr>
		<%
			}
		%>
	</table>
</body>
</html>