<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
	<head>
		<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
		<title>로그인</title>
		<%@ include file="../include/header.jsp" %>
	</head>
	<body>
		<c:if test="${msg == 'success'}">
			<div style="color: blue;">
				회원가입에 성공했습니다!
			</div>
		</c:if>
		<h2>로그인</h2>
		<form name="login_form" method="post" action="${path}/member/login.do">
			<label for="id">아이디</label>
			<input name="id" id="id" />
			<br />
			
			<label for="passwd">비밀번호</label>
			<input name="passwd" id="passwd" type="password" />
			<br />
			<button type="submit">로그인</button>
		</form>
	</body>
</html>