<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<!-- jstl core tag -->
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<!-- context path -->
<c:set var="path" value="${pageContext.request.contextPath}" />

<nav class="navbar navbar-default">
 	<div class="container-fluid">
		<div class="navbar-header">
			<a href="${path}/timetable/list.do" class="navbar-brand">Home</a>
      		<c:choose>
				<c:when test="${sessionScope.userId == null}">
					<p class="navbar-text navbar-right">
						<a href="${path}/member/login_view.do" class="navbar-link">Login</a>
						<a href="${path}/member/signup_view.do" class="navbar-link">Signup</a>
					</p>
				</c:when>
				<c:otherwise>
					${sessionScope.userId}님이 로그인중입니다
					<a href="${path}/member/logout.do" class="navbar-brand">Logout</a>
				</c:otherwise>
			</c:choose>
		</div>
	</div>
</nav>
