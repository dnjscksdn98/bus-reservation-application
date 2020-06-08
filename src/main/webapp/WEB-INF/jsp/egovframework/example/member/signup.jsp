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
	
		<div class="align-items-center justify-content-center container">
		<h2>회원가입</h2>
		<form class="form-horizontal col-lg-6 offset-lg-3" name="signup_form" method="post" action="${path}/member/signup.do" enctype="multipart/form-data">
		  <div class="row">
		  	<div class="form-group col-xs-4">
			    <label for="id">아이디</label>
			    <input class="form-control" name="id" id="id" placeholder="아이디를 입력하세요" />
		    </div>
		  </div>
		  
		  <div class="row">
			  <div class="form-group col-xs-4">
			    <label for="name">이름</label>
			    <input class="form-control" name="name" id="name" placeholder="이름을 입력하세요" />
			  </div>
		  </div>
		  
		  <div class="row">
			  <div class="form-group col-xs-4">
			    <label for="email">이메일 주소</label>
			    <input class="form-control" name="email" id="email" placeholder="이메일 주소를 입력하세요" />
			  </div>
		  </div>
		  
		  <div class="row">
			  <div class="form-group col-xs-4">
			    <label for="telNo">전화번호</label>
			    <input class="form-control" name="telNo" id="telNo" placeholder="전화번호를 입력하세요(-없이)" />
			  </div>
		  </div>
		  
		  <div class="row">
			  <div class="form-group col-xs-4">
			    <label for="passwd">암호</label>
			    <input type="password" class="form-control" name="passwd" id="passwd" placeholder="패스워드를 입력하세요">
			  </div>
		  </div>
		  
		  <div class="row">
			  <div class="form-group col-xs-4">
			    <label for="confirmPasswd">암호 확인</label>
			    <input type="password" class="form-control" name="confirmPasswd" id="confirmPasswd" placeholder="패스워드를 다시 입력하세요">
			  </div>
		  </div>
		  
		  <div class="row">
			  <div class="form-group col-xs-4">
			    <label for="gbnCd">사용자 구분 코드</label>
			    <input class="form-control" name="gbnCd" id="gbnCd" placeholder="사용자 구분 코드를 입력하세요">
			  </div>
		  </div>
		  
		  <div class="row">
			  <div class="form-group col-xs-4">
			    <label for="file">파일 업로드</label>
			    <input type="file" name="file" id="file">
			  </div>
		  </div>
		  <button type="submit" class="btn btn-primary">회원가입</button>
		</form>
		</div>
		
		<!-- 
		<form name="signup_form" method="post" action="${path}/member/signup.do" enctype="multipart/form-data">
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
			
			<label for="file">사진 선택</label>
			<input name="file" id="file" type="file" />
			
			<button type="submit">회원가입</button>
			<c:if test="${msg == 'idError'}">
				<div style="color: red;">
					아이디가 이미 존재합니다
				</div>
			</c:if>
		</form>
		-->
	</body>
</html>