<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<!-- jstl core tag -->
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<!-- context path -->
<c:set var="path" value="${pageContext.request.contextPath}" />

<div class="d-flex flex-column flex-md-row align-items-center p-3 px-md-4 mb-3 bg-white border-bottom shadow-sm">
	<h5 class="my-0 mr-md-auto font-weight-normal"><a class="p-2 text-dark" href="${path}/timetable/list.do">춘천 고속</a></h5>
	<nav class="my-2 my-md-0 mr-md-3">
		<c:choose>
			<c:when test="${sessionScope.userId == null}">
   				<a class="p-2 text-dark" href="${path}/member/signup_view.do">회원가입</a>
   				<a class="p-2 btn btn-outline-primary" href="${path}/member/login_view.do">로그인</a>
   			</c:when>
   			<c:otherwise>
   				<a class="p-2 text-dark" href="#">${sessionScope.userId}</a>
   				<c:if test="${sessionScope.memberCd == '003002'}">
   					<a class="p-2 text-dark" href="${path}/timetable/create_view.do">타임테이블 생성</a>
   				</c:if>
   				<a class="p-2 btn btn-outline-primary" href="${path}/member/logout.do">로그아웃</a>
   			</c:otherwise>
  		</c:choose>
	</nav>
</div>
