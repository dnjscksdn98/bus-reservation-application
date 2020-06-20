<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
	<head>
		<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
		<title>타임 테이블 생성</title>
		<%@ include file="../include/header.jsp"  %>
		<script>
			function setEndTime() {
				var year = "2020";
				
				var m = document.getElementById("tableMonth");
				var month = m.options[m.selectedIndex].value;
				
				var d = document.getElementById("tableDay");
				var day = d.options[d.selectedIndex].value;
				
				var t = document.getElementById("tableTime");
				var time = t.options[t.selectedIndex].value;
				var hour = time.substring(0, 2);
				
				hour = Number(hour) + 1;
				hour = hour + "";
				time = time.replace(time.substring(0, 2), hour);
				
				document.getElementById("endTime").value = year + month + day + time;
			}
		</script>
	</head>
	<body>
		<%@ include file="../include/nav.jsp" %>
		
		<div class="container text-center">
			
			<form class="form-signin " method="post" action="${path}/timetable/create.do">
				<h2 class="h3 mb-3 font-weight-normal">타임 테이블 생성하기</h2>
			  	  
			  	<select class="form-control mb-2" name="tableMonth" id="tableMonth" style="text-align-last: center;">
			  		<option value="">-- 월 선택 --</option>
			  		<c:forEach var="month" items="${map.months}">
						<c:if test="${Integer.toString(month).length() lt 2}">
							<option value="0${month}">${month}월</option>
						</c:if>
						<c:if test="${Integer.toString(month).length() gt 1}">
							<option value="${month}">${month}월</option>
						</c:if>
					</c:forEach>
			  	</select>
				
				<select class="form-control mb-2" name="tableDay" id="tableDay" style="text-align-last: center;">
					<option value="">-- 일 선택 --</option>
					<c:forEach var="day" items="${map.days}">
						<c:if test="${Integer.toString(day).length() lt 2}">
							<option value="0${day}">${day}일</option>
						</c:if>
						<c:if test="${Integer.toString(day).length() gt 1}">
							<option value="${day}">${day}일</option>
						</c:if>
					</c:forEach>
				</select>
				
				<select class="form-control mb-2" name="tableTime" id="tableTime" onchange="setEndTime()" style="text-align-last: center;">
					<option value="">-- 출발 시간 --</option>
					<c:forEach var="time" items="${map.times}">
						<c:if test="${Integer.toString(time).length() lt 2}">
							<option value="0${time}00">${time}시</option>
						</c:if>
						<c:if test="${Integer.toString(time).length() gt 1}">
							<option value="${time}00">${time}시</option>
						</c:if>
					</c:forEach>
				</select>
				
				<select name="busNo" id="busNo" class="form-control mb-4" style="text-align-last: center;">
					<option value="">-- 버스 번호 --</option>
					<c:forEach var="bus" items="${map.buses}">
						<option value="${bus.getBusNo()}">${bus.getBusNo()}</option>
					</c:forEach>
				</select>
				
				<input type="hidden" class="form-control mb-4" name="endTime" id="endTime" value="" />
				
				<button type="submit" class="btn btn-primary btn-block">생성</button>
			</form>
		</div>
	</body>
</html>