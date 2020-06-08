<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
	<head>
		<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
		<title>버스 예약</title>
		<%@ include file="../include/header.jsp" %>
		<%@ include file="../include/session_check.jsp" %>
	</head>
	<body>
		<%@ include file="../include/nav.jsp" %>
	
		<h2>버스 예약</h2>
		<div>출발지: ${map.startName}</div>
		<div>도착지 코드: ${map.endName}</div>
		<div>총 소요 시간: 약  ${map.section.getTime()}분</div>
		
		<div>출발 시간: ${map.startTime}</div>
		
		<form name="reserve_form" method="post" action="${path}/appointment/reserve.do">
			<input type="hidden" name="seqNo" value="${map.seqNo}" />
			<input type="hidden" name="sectionNo" value="${map.section.getSectionNo()}" />
			
			<label for="id">회원 아이디</label>
			<input name="id" value="${sessionScope.userId}" />
			
			<label for="startTime">출발 시간</label>
			<input name="startTime" value="${map.startTime}" />
			
			<button type="submit">결제하기</button>
		</form>
	</body>
</html>