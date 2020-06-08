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
	
		<div class="container">
			<h2>구간 선택하기</h2>
			
			<div>
				출발 시간: 				
				${map.detail.getStartTime().substring(0, 4)}년
				${map.detail.getStartTime().substring(4, 6)}월
				${map.detail.getStartTime().substring(6, 8)}일
				${map.detail.getStartTime().substring(8, 10)}시
				${map.detail.getStartTime().substring(10, 12)}분
			</div>
			<div>
				도착 시간: 				
				${map.detail.getEndTime().substring(0, 4)}년
				${map.detail.getEndTime().substring(4, 6)}월
				${map.detail.getEndTime().substring(6, 8)}일
				${map.detail.getEndTime().substring(8, 10)}시
				${map.detail.getEndTime().substring(10, 12)}분
			</div>
			<div>버스 번호: ${map.bus.getBusNo()}</div>
			<div>버스 이름: ${map.bus.getBusName()}</div>
			<div>남은 좌석: ${map.bus.getSeatCnt()} 개</div>
			
			<button id="showReserveBtn" class="btn btn-default">구간 선택하기</button>
			
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
					
					<button type="submit" class="btn btn-primary btn-sm">예약하기</button>
				</form>
			</div>
		</div>
	</body>
</html>