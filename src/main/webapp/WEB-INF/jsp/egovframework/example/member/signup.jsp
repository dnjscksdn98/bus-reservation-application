	<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
	<head>
		<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
		<title>회원가입</title>
		<%@ include file="../include/header.jsp" %>
		<link type="text/css" rel="stylesheet" href="<c:url value='/css/egovframework/signin.css'/>"/>
	</head>
	<body>
	
		<div class="container text-center">
			<form class="form-signin " name="signup_form" method="post" action="${path}/member/signup.do" enctype="multipart/form-data">
				<h2 class="h3 mb-3 font-weight-normal">회원가입</h2>
			  	  
			  	<div>
					<label for="id" class="sr-only">아이디</label>  
				    <input class="form-control" name="id" id="id" placeholder="아이디를 입력하세요" required autofocus />
				</div>
				
				<div>
				    <label for="name" class="sr-only">이름</label>  
				    <input class="form-control" name="name" id="name" placeholder="이름을 입력하세요" required />
				</div>
				  
				<div>
				    <label for="email" class="sr-only">이메일 주소</label>
				    <input class="form-control" name="email" id="email" placeholder="이메일 주소를 입력하세요" required />				  
			    </div>
			      
			    <div>
				    <label for="telNo" class="sr-only">전화번호</label>
				    <input class="form-control" name="telNo" id="telNo" placeholder="전화번호를 입력하세요(-없이)" required />
			  	</div>
			  	  
			  	<div>
				    <label for="passwd" class="sr-only">암호</label>
				    <input type="password" class="form-control" name="passwd" id="passwd" placeholder="패스워드를 입력하세요" required />
			  	</div>
			  	  
			  	<div>
				    <label for="confirmPasswd" class="sr-only">암호 확인</label>
				    <input type="password" class="form-control" name="confirmPasswd" id="confirmPasswd" placeholder="패스워드를 다시 입력하세요" required>
			  	</div>
			  	  
			  	<select class="form-control" name="gbnCd">
			  		<option value="">-- 사용자 구분 --</option>
			  		<option value="003001">고객</option>
			  		<option value="003002">관리자</option>
			  		<option value="003003">기사</option>
			  	</select>
			  	
			  	<select class="form-control" name="genderCd">
			  		<option value="">-- 성별 --</option>
			  		<option value="001001">남자</option>
			  		<option value="001002">여자</option>
			  	</select>
				  
				<label for="file" class="sr-only">프로필 사진 선택</label>
				<input type="file" name="file" id="file" />

			    <button type="submit" class="btn btn-primary btn-block">회원가입</button>
			</form>
		</div>
		
	</body>
</html>