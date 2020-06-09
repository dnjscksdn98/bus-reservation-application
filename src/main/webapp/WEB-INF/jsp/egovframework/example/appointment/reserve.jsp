<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
	<head>
		<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
		<title>버스 예약</title>
		<%@ include file="../include/header.jsp" %>
	</head>
	<body>
		<%@ include file="../include/nav.jsp" %>
	
		<h2>버스 예약</h2>
		<div>출발지: ${map.startName}</div>
		<div>도착지: ${map.endName}</div>
		<div>총 소요 시간: 약  ${map.section.getTime()}분</div>
		<div>회원 아이디: ${sessionScope.userId}</div>
		<div>
			출발 시간:
			${map.startTime.substring(0, 4)}년
			${map.startTime.substring(4, 6)}월
			${map.startTime.substring(6, 8)}일
			${map.startTime.substring(8, 10)}시
			${map.startTime.substring(10, 12)}분
		</div>
		
		<form name="reserve_form" method="post" action="${path}/appointment/reserve.do">
			<input type="hidden" name="seqNo" value="${map.seqNo}" />
			<input type="hidden" name="sectionNo" value="${map.section.getSectionNo()}" />
			<input type="hidden" name="id" value="${sessionScope.userId}" />
			<input type="hidden" name="startTime" value="${map.startTime}" />
			<button type="submit" class="btn btn-primary">결제하기</button>
		</form>
	</body>
</html>