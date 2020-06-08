<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
	<head>
		<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
		<title>상세 페이지</title>
		<%@ include file="../include/header.jsp" %>
		
		<script>
			$(document).ready(function() {				
				$("#showReserveBtn").click(function() {
					$("#reserve").show();
				})
			})
		</script>
	</head>
	<body>
		<%@ include file="../include/nav.jsp" %>
	
		<div>출발 시간: ${map.detail.getStartTime()}</div>
		<div>도착 시간: ${map.detail.getEndTime()}</div>
		<div>버스 번호: ${map.bus.getBusNo()}</div>
		<div>버스 이름: ${map.bus.getBusName()}</div>
		<div>남은 좌석: ${map.bus.getSeatCnt()}</div>
		
		<button id="showReserveBtn">예약하기</button>
		
		<div id="reserve" style="display: none">
			<form name="reserve_form" method="post" action="${path}/section.do">
				<input type="hidden" name="seqNo" value="${map.detail.getSeqNo()}" />
				<input type="hidden" name="startTime" value="${map.detail.getStartTime()}" />
			
				<label for="startCd">출발지 선택</label>
				<select name="startCd" id="startCd">
					<option value='' selected>-- 출발지 선택 --</option>
					<option value="002001">학교</option>
					<option value="002002">춘천역</option>
					<option value="002003">시외 버스 터미널</option>
					<option value="002004">남춘천역</option>
				</select>
				
				<label for="endCd">도착지 선택</label>
				<select name="endCd" id="endCd">
					<option value="" selected>-- 도착지 선택 --</option>
					<option value="002001">학교</option>
					<option value="002002">춘천역</option>
					<option value="002003">시외 버스 터미널</option>
					<option value="002004">남춘천역</option>
				</select>
				
				<button type="submit">예약</button>
			</form>
		</div>
	</body>
</html>