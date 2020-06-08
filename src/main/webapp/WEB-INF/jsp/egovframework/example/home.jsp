<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
	<head>
		<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
		<title>Home</title>
		<%@ include file="./include/header.jsp" %>
		<script>
			function list(page) {
				location.href = "${path}/timetable/list.do?curPage=" + page;
			}
		</script>
	</head>
	<body>
		<%@ include file="./include/nav.jsp" %>
		<h2>버스 시간표</h2>
		
		<form name="search_form" method="post" action="${path}/timetable/list.do">
			<select name="month">
				<c:forEach var="month" items="${map.months}">
					<c:if test="${Integer.toString(month).length() lt 2}">
						<option value="0${month}">${month}월</option>
					</c:if>
					<c:if test="${Integer.toString(month).length() gt 1}">
						<option value="${month}">${month}월</option>
					</c:if>
				</c:forEach>
			</select>
			<select name="day">
				<c:forEach var="day" items="${map.days}">
					<c:if test="${Integer.toString(day).length() lt 2}">
						<option value="0${day}">${day}일</option>
					</c:if>
					<c:if test="${Integer.toString(day).length() gt 1}">
						<option value="${day}">${day}일</option>
					</c:if>
				</c:forEach>
			</select>
			<select name="time">
				<c:forEach var="time" items="${map.times}">
					<c:if test="${Integer.toString(time).length() lt 2}">
						<option value="0${time}">${time}시</option>
					</c:if>
					<c:if test="${Integer.toString(time).length() gt 1}">
						<option value="${time}">${time}시</option>
					</c:if>
				</c:forEach>
			</select>
			<button type="submit" class="btn btn-default">검색</button>
		</form>
		
		<c:if test="${map.count eq 0}">
			<span style="color: blue;">이 시간대의 버스는 없습니다</span>
		</c:if>
		
		<table border="1" style="width: 600px">
			<tr>
				<th>#</th>
				<th>출발 시간</th>
				<th>도착 시간</th>
				<th>버스 번호</th>
			</tr>
			<c:forEach var="row" items="${map.timetable}">
			
				<tr>
					<td>${row.getSeqNo()}</td>
					<td><a href="${path}/timetable/detail.do?id=${row.getSeqNo()}">${row.getStartTime()}</a></td>
					<td><a href="${path}/timetable/detail.do?id=${row.getSeqNo()}">${row.getEndTime()}</a></td>
					<td>${row.getBusNo()}</td>
				</tr>
			
			</c:forEach>
			
			<tr>
				<td colspan="5">
					<c:if test="${map.pagination.getCurPage() > 1}">
						<a href="javascript:list('1')">[처음]</a>
					</c:if>
					<c:if test="${map.pagination.getCurBlock() > 1}">
						<a href="javascript:list('${map.pagination.getPrevPage()}')">[이전]</a>
					</c:if>
					
					<c:forEach var="num" begin="${map.pagination.getBlockBegin()}" end="${map.pagination.getBlockEnd()}">
						<!-- 현재 페이지면 하이퍼링크 제거 -->
						<c:choose>
							<c:when test="${num == map.pagination.getCurPage()}">
								<span style="color: red;">${num}</span>&nbsp;
							</c:when>
							<c:otherwise>
								<a href="javascript:list('${num}')">${num}</a>&nbsp;
							</c:otherwise>
						</c:choose>
					</c:forEach>
					
					<c:if test="${map.pagination.getCurBlock() <= map.pagination.getTotBlock()}">
						<a href="javascript:list('${map.pagination.getNextPage()}')">[다음]</a>
					</c:if>
					<c:if test="${map.pagination.getCurPage() < map.pagination.getTotPage()}">
						<a href="javascript:list('${map.pagination.getTotPage()}')">[끝]</a>
					</c:if>
				</td>
			</tr>
		</table>
	</body>
</html>