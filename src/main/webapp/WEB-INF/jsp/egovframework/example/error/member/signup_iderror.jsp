<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
	<head>
		<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
		<title>회원가입</title>
		<%@ include file="../../include/header.jsp" %>
	</head>
	<body>
		<form name="signup_form" method="post" action="${path}/member/signup.do">
			<label for="id">아이디</label>
			<input name="id" id="id" />
			<br />
			
			<label for="name">이름</label>
			<input name="name" id="name" />
			<br />
			
			<label for="email">이메일</label>
			<input name="email" id="email" />
			<br />
			
			<label for="telNo">전화번호</label>
			<input name="telNo" id="telNo" />
			<br />
			
			<label for="passwd">비밀번호</label>
			<input name="passwd" id="passwd" />
			<br />
			
			<label for="confirmPasswd">비밀번호 확인</label>
			<input name="confirmPasswd" id="confirmPasswd" />
			<br />
			
			<label for="gbnCd">회원 코드 번호</label>
			<input name="gbnCd" id="gbnCd" />
			<br />
			
			<button type="submit">회원가입</button>
			<span style="color: red;">아이디가 이미 존재합니다</span>
			<!-- 
			<c:if test="${msg == 'idError'}">
				<div style="color: red;">
					아이디가 이미 존재합니다
				</div>
			</c:if>
			-->
		</form>
	</body>
</html>