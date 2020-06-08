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
					<td>${row.getStartTime()}</td>
					<td>${row.getEndTime()}</td>
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