<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
	<head>
		<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
		<title>회원가입</title>
		<%@ include file="../include/header.jsp" %>
	</head>
	<body>
	
		<div class="container">
			<h2 class="text-center">회원가입</h2>
			<form class="form-horizontal" name="signup_form" method="post" action="${path}/member/signup.do" enctype="multipart/form-data">
			  
			  	  <div class="form-group">
				    <label for="id" class="col-sm-2 control-label">아이디</label>
				    <div class="col-sm-10">
				      <input class="form-control" name="id" id="id" placeholder="아이디를 입력하세요" />
				    </div>
			      </div>
			  
			  
				  <div class="form-group">
				    <label for="name" class="col-sm-2 control-label">이름</label>
				    <div class="col-sm-10">
				      <input class="form-control" name="name" id="name" placeholder="이름을 입력하세요" />
				    </div>
				  </div>
			  
				  <div class="form-group">
				    <label for="email" class="col-sm-2 control-label">이메일 주소</label>
				    <div class="col-sm-10">
				      <input class="form-control" name="email" id="email" placeholder="이메일 주소를 입력하세요" />
				    </div>
				  </div>
			  
				  <div class="form-group">
				    <label for="telNo" class="col-sm-2 control-label">전화번호</label>
				    <div class="col-sm-10">
				      <input class="form-control" name="telNo" id="telNo" placeholder="전화번호를 입력하세요(-없이)" />
				    </div>
				  </div>
			  
				  <div class="form-group">
				    <label for="passwd" class="col-sm-2 control-label">암호</label>
				    <div class="col-sm-10">
				      <input type="password" class="form-control" name="passwd" id="passwd" placeholder="패스워드를 입력하세요">
				    </div>
				  </div>
			  
				  <div class="form-group">
				    <label for="confirmPasswd" class="col-sm-2 control-label">암호 확인</label>
				    <div class="col-sm-10">
				      <input type="password" class="form-control" name="confirmPasswd" id="confirmPasswd" placeholder="패스워드를 다시 입력하세요">
				    </div>
				  </div>
			  
				  <div class="form-group">
				    <label for="gbnCd" class="col-sm-2 control-label">사용자 구분 코드</label>
				    <div class="col-sm-10">
				      <input class="form-control" name="gbnCd" id="gbnCd" placeholder="사용자 구분 코드를 입력하세요">
				    </div>
				  </div>
			  
				  <div class="form-group col-xs-4">
				    <label for="file" class="control-label">프로필 사진 선택</label>
				    <div class="col-sm-10">
				      <input type="file" name="file" id="file">
				    </div>
				  </div>

			  <button type="submit" class="btn btn-primary">회원가입</button>
			</form>
		</div>
		
	</body>
</html>