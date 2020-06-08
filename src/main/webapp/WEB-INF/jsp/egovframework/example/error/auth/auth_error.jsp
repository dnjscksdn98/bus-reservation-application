<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
	<head>
		<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
		<title>로그인</title>
		<%@ include file="../../include/header.jsp" %>
	</head>
	<body>
		<div class="alert alert-danger" role="alert">로그인을 먼저 하세요!</div>
		
		<div class="container">
		<h2 class="text-center">로그인</h2>
		
		<form class="form-horizontal" name="login_form" method="post" action="${path}/member/login.do">
		  <div class="form-group">
		    <label for="id" class="col-sm-2 control-label">아이디</label>
		    <div class="col-sm-10">
		      <input class="form-control" id="id" name="id" placeholder="아이디를 입력하세요">
		    </div>
		  </div>
		  <div class="form-group">
		    <label for="passwd" class="col-sm-2 control-label">비밀번호</label>
		    <div class="col-sm-10">
		      <input type="password" class="form-control" id="passwd" name="passwd" placeholder="비밀번호를 입력하세요">
		    </div>
		  </div>
		  <div class="form-group">
		    <div class="col-sm-offset-2 col-sm-10">
		      <button type="submit" class="btn btn-default">로그인</button>
		    </div>
		  </div>
		</form>
		</div>
	</body>
</html>