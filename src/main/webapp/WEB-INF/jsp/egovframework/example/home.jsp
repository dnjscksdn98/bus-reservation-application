<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
	<head>
		<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
		<title>고속 버스 예매</title>
		<%@ include file="./include/header.jsp" %>
		<link type="text/css" rel="stylesheet" href="<c:url value='/css/egovframework/pricing.css'/>"/>
		<script>
			function list(page) {
				location.href = "${path}/timetable/list.do?curPage=" + page;
			}
			
			function handleStartChange1() {
				document.getElementById("startCd").value = "002001";
			}
			function handleStartChange2() {
				document.getElementById("startCd").value = "002002";
			}
			function handleStartChange3() {
				document.getElementById("startCd").value = "002003";
			}
			function handleStartChange4() {
				document.getElementById("startCd").value = "002004";
			}
			
			function handleEndChange1() {
				document.getElementById("endCd").value = "002001";
			}
			function handleEndChange2() {
				document.getElementById("endCd").value = "002002";
			}
			function handleEndChange3() {
				document.getElementById("endCd").value = "002003";
			}
			function handleEndChange4() {
				document.getElementById("endCd").value = "002004";
			}
		</script>
	</head>
	
		<body>
    		<%@include file="./include/nav.jsp" %>
    		<c:if test="${msg == 'reserveSuccess'}">
    			<div class="alert alert-warning alert-dismissible fade show" role="alert">
					결제가 완료되었습니다!
				    <button type="button" class="close" data-dismiss="alert" aria-label="Close">
				    	<span aria-hidden="true">&times;</span>
				    </button>
				</div>
    		</c:if>

			<div class="pricing-header px-3 py-3 pt-md-5 pb-md-4 mx-auto text-center">
				<h1 class="display-4">고속 버스 예매</h1>
				<p class="lead">좌석 예매</p>
			</div>

			<div class="container">
				<form method="post" action="${path}/home_section.do">
					<input type="hidden" name="startCd" id="startCd" value="" />
					<input type="hidden" name="endCd" id="endCd" value="" />
	  				<div class="card-deck mb-3 text-center">
	    				<div class="card mb-4 shadow-sm">
	      					<div class="card-header">
	        					<h4 class="my-0 font-weight-normal">출발지</h4>
	      					</div>
	      					<div class="card-body">
	        					<ul class="list-unstyled mt-3 mb-4">
	          						<li class="mb-2">
	          							<button onclick="handleStartChange1()" type="button" class="btn btn-block btn-outline-secondary">한림대학교</button>
	          						</li>
	          						<li class="mb-2">
	          							<button onclick="handleStartChange2()" type="button" class="btn btn-block btn-outline-secondary">춘천역</button>
	          						</li>
	          						<li class="mb-2">
	          							<button onclick="handleStartChange3()" type="button" class="btn btn-block btn-outline-secondary">시외 버스 터미널</button>
	          						</li>
	          						<li class="mb-2">
	          							<button onclick="handleStartChange4()" type="button" class="btn btn-block btn-outline-secondary">남춘천역</button>
	          						</li>
	        					</ul>
	      					</div>
	    				</div>
	    				
	    				<div class="card mb-4 shadow-sm">
	      					<div class="card-header">
	        					<h4 class="my-0 font-weight-normal">도착지</h4>
	      					</div>
	      					<div class="card-body">
	        					<ul class="list-unstyled mt-3 mb-4">
	          						<li class="mb-2">
	          							<button onclick="handleEndChange1()" type="button" class="btn btn-block btn-outline-secondary">한림대학교</button>
	          						</li>
	          						<li class="mb-2">
	          							<button onclick="handleEndChange2()" type="button" class="btn btn-block btn-outline-secondary">춘천역</button>
	          						</li>
	          						<li class="mb-2">
	          							<button onclick="handleEndChange3()" type="button" class="btn btn-block btn-outline-secondary">시외 버스 터미널</button>
	          						</li>
	          						<li class="mb-2">
	          							<button onclick="handleEndChange4()" type="button" class="btn btn-block btn-outline-secondary">남춘천역</button>
	          						</li>
	        					</ul>
	      					</div>
	    				</div>
	    				
	    				<div class="card mb-4 shadow-sm">
	      					<div class="card-header">
	        					<h4 class="my-0 font-weight-normal">가는 날</h4>
	      					</div>
	      					<div class="card-body">
	        					<select name="month" class="form-control mb-2" style="text-align-last: center;">
	        						<option value="">-- 월 --</option>
									<c:forEach var="month" items="${map.months}">
										<c:if test="${Integer.toString(month).length() lt 2}">
											<option value="0${month}">${month}월</option>
										</c:if>
										<c:if test="${Integer.toString(month).length() gt 1}">
											<option value="${month}">${month}월</option>
										</c:if>
									</c:forEach>
								</select>
								<select name="day" class="form-control mb-2" style="text-align-last: center;">
									<option value="">-- 일 --</option>
									<c:forEach var="day" items="${map.days}">
										<c:if test="${Integer.toString(day).length() lt 2}">
											<option value="0${day}">${day}일</option>
										</c:if>
										<c:if test="${Integer.toString(day).length() gt 1}">
											<option value="${day}">${day}일</option>
										</c:if>
									</c:forEach>
								</select>
								<select name="time" class="form-control mb-4" style="text-align-last: center;">
									<option value="">-- 출발 시간 --</option>
									<c:forEach var="time" items="${map.times}">
										<c:if test="${Integer.toString(time).length() lt 2}">
											<option value="0${time}">${time}시</option>
										</c:if>
										<c:if test="${Integer.toString(time).length() gt 1}">
											<option value="${time}">${time}시</option>
										</c:if>
									</c:forEach>
								</select>
	        					<button type="submit" class="btn btn-lg btn-block btn-outline-primary">예약</button>
	      					</div>
	    				</div>		
					</div>
				</form>

  				<footer class="pt-4 border-top">
  					<div class="pricing-header px-3 py-3 pb-md-4 mx-auto text-center">
						<p class="lead">좌석 검색</p>
					</div>
  				
    				<div class="row text-center d-flex justify-content-center">
      					<form class="form-inline" name="search_form" method="post" action="${path}/timetable/list.do">
							<select name="month" class="form-control mr-2 mb-2" style="text-align-last: center;">
								<option value="">-- 월 --</option>
								<c:forEach var="month" items="${map.months}">
									<c:if test="${Integer.toString(month).length() lt 2}">
										<option value="0${month}">${month}월</option>
									</c:if>
									<c:if test="${Integer.toString(month).length() gt 1}">
										<option value="${month}">${month}월</option>
									</c:if>
								</c:forEach>
							</select>
							<select name="day" class="form-control mr-2 mb-2" style="text-align-last: center;">
								<option value="">-- 일 --</option>
								<c:forEach var="day" items="${map.days}">
									<c:if test="${Integer.toString(day).length() lt 2}">
										<option value="0${day}">${day}일</option>
									</c:if>
									<c:if test="${Integer.toString(day).length() gt 1}">
										<option value="${day}">${day}일</option>
									</c:if>
								</c:forEach>
							</select>
							<select name="time" class="form-control mr-2 mb-2" style="text-align-last: center;">
								<option value="">-- 출발 시간 --</option>
								<c:forEach var="time" items="${map.times}">
									<c:if test="${Integer.toString(time).length() lt 2}">
										<option value="0${time}">${time}시</option>
									</c:if>
									<c:if test="${Integer.toString(time).length() gt 1}">
										<option value="${time}">${time}시</option>
									</c:if>
								</c:forEach>
							</select>
							<button type="submit" class="btn btn-outline-secondary mb-2">검색</button>
						</form>
						
						<c:if test="${map.count eq 0}">
							<span style="color: blue;">이 시간대의 버스는 없습니다</span>
						</c:if>
					</div>
						
					<div class="row text-center d-flex justify-content-center">
						<table class="table table-hover" border="1" style="width: 600px">
							<tr>
								<th>#</th>
								<th>출발 시간</th>
								<th>도착 시간</th>
								<th>버스 번호</th>
							</tr>
							<c:forEach var="row" items="${map.timetable}">
							
								<tr>
									<td>${row.getSeqNo()}</td>
									<td>
										<a href="${path}/timetable/detail.do?id=${row.getSeqNo()}">
											${row.getStartTime().substring(0, 4)}년
											${row.getStartTime().substring(4, 6)}월
											${row.getStartTime().substring(6, 8)}일
											${row.getStartTime().substring(8, 10)}시
											${row.getStartTime().substring(10, 12)}분
										</a>
									</td>
									<td>
										<a href="${path}/timetable/detail.do?id=${row.getSeqNo()}">
											${row.getEndTime().substring(0, 4)}년
											${row.getEndTime().substring(4, 6)}월
											${row.getEndTime().substring(6, 8)}일
											${row.getEndTime().substring(8, 10)}시
											${row.getEndTime().substring(10, 12)}분
										</a>
									</td>
									<td>${row.getBusNo()}</td>
								</tr>
							
							</c:forEach>
							
						</table>
					</div>
						
					<div class="row d-flex justify-content-center">
						<nav aria-label="Page navigation example">
						  <ul class="pagination">
						  	<c:if test="${map.pagination.getCurPage() > 1}">
						  		<li class="page-item">
						  			<a class="page-link" href="javascript:list('1')">[처음]</a>
						  		</li>
							</c:if>
							
							<c:if test="${map.pagination.getCurBlock() > 1}">
								<li class="page-item">
									<a class="page-link" aria-label="Previous" href="javascript:list('${map.pagination.getPrevPage()}')">
										<span aria-hidden="true">&laquo;</span>
									</a>
								</li>
							</c:if>
							
							<c:forEach var="num" begin="${map.pagination.getBlockBegin()}" end="${map.pagination.getBlockEnd()}">						
								<c:choose>
									<c:when test="${num == map.pagination.getCurPage()}">
										<li class="page-item disabled">
									    	<span class="page-link">${num}</span>
									    </li>
									</c:when>
									<c:otherwise>
										<li class="page-item">
											<a class="page-link" href="javascript:list('${num}')">${num}</a>
										</li>
									</c:otherwise>
								</c:choose>
							</c:forEach>
						    
						    <c:if test="${map.pagination.getCurBlock() <= map.pagination.getTotBlock()}">
						    	<li class="page-item">
									<a class="page-link" href="javascript:list('${map.pagination.getNextPage()}')">
										<span aria-hidden="true">&raquo;</span>
									</a>
								</li>
							</c:if>
							<c:if test="${map.pagination.getCurPage() < map.pagination.getTotPage()}">
								<li class="page-item">
									<a class="page-link" href="javascript:list('${map.pagination.getTotPage()}')">[끝]</a>
								</li>
							</c:if>
						    
						  </ul>
						</nav>
					</div>
  				</footer>
			</div>
		</body>

</html>