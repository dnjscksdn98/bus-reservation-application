<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
	<head>
		<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
		<title>로그인</title>
		<%@ include file="../include/header.jsp" %>
		<link type="text/css" rel="stylesheet" href="<c:url value='/css/egovframework/signin.css'/>"/>
	</head>
	<body>
				
		<div class="container text-center">
			<c:if test="${msg == 'success'}">
				<div class="alert alert-info" role="alert">회원가입에 성공했습니다!</div>
			</c:if>
			
			<form class="form-signin " name="login_form" method="post" action="${path}/member/login.do">
				<h2 class="h3 mb-3 font-weight-normal">로그인</h2>
			  	  
			  	<div>
					<label for="id" class="sr-only">아이디</label>  
				    <input class="form-control" name="id" id="id" placeholder="아이디를 입력하세요" required autofocus />
				</div>
				
				<div>
				    <label for="name" class="sr-only">비밀번호</label>  
				    <input class="form-control" name="passwd" id="passwd" type="password" placeholder="비밀번호를 입력하세요" required />
				</div>
				
				<button type="submit" class="btn btn-primary btn-block">로그인</button>
			</form>
		</div>
		
	</body>
</html>