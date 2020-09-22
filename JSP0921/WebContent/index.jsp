<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>로그인 테스트</title>
<style>
#LoginFormArea {
	text-align: center;
	width: 250px;
	height: 150px;
	margin: auto;
	border: 1px solid black;
}

h1,h2 {
	text-align: center;
}
</style>
</head>
<body>
	<h1>로그인</h1>
	<section id="LoginFormArea" method="get">
		<form action="Login" method="get">
			<br /> 아이디: <input type="text" name="id" id="id" /><br /> 비밀번호: <input
				type="password" name="pw" id="id" /><br /> <br /> <input
				type="submit" value="로그인" />
		</form>
	</section>

	<a href="Login?page=2"><h1>페이지출력</h1></a>

	<h1>강아지 선택</h1>
	<form action="choiceDog" method="get">
	<h2>
		<input type="checkbox" name="dog" value="푸들" />푸들 <input
			type="checkbox" name="dog" value="진돗개" />진돗개 <input type="checkbox"
			name="dog" value="삽살개" />삽살개 <input type="checkbox" name="dog"
			value="말티즈" />말티즈 <input type="checkbox" name="dog" value="포메라니안" />포메라니안
		<input type="submit" value="선택" />
		</h2>
	</form>
</body>
</html>