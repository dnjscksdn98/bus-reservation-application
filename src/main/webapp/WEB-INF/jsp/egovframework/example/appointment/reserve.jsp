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
	
		<div class="container text-center">
			<div class="pricing-header px-3 py-3 pt-md-5 pb-md-4 mx-auto">
				<h1>예약 결제</h1>
			</div>
			<div class="card-deck mb-3 text-center">
   				<div class="card mb-4 shadow-sm">
     				<div class="card-header">
       					<h4 class="my-0 font-weight-normal">출발지</h4>
     				</div>
     				<div class="card-body">
     					<ul class="list-unstyled mt-3 mb-4">
     						<li class="mb-2">
		       					<strong>${map.startName}</strong>
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
		       					<strong>${map.endName}</strong>
		       				</li>
		       			</ul>
     				</div>
   				</div>
   				<div class="card mb-4 shadow-sm">
     				<div class="card-header">
       					<h4 class="my-0 font-weight-normal">시간</h4>
     				</div>
     				<div class="card-body">
     					<ul class="list-unstyled mt-3 mb-4">
     						<li class="mb-2">
		       					<strong>총 소요 시간: 약  ${map.section.getTime()}분</strong>
		       				</li>
		       				<li class="mb-2">
		       					<strong>
		       						출발 시간:
									${map.startTime.substring(0, 4)}년
									${map.startTime.substring(4, 6)}월
									${map.startTime.substring(6, 8)}일
									${map.startTime.substring(8, 10)}시
									${map.startTime.substring(10, 12)}분
		       					</strong>
		       				</li>
		       			</ul>
     				</div>
   				</div>
   			</div>
			
			<form name="reserve_form" method="post" action="${path}/appointment/reserve.do">
				<input type="hidden" name="seqNo" value="${map.seqNo}" />
				<input type="hidden" name="sectionNo" value="${map.section.getSectionNo()}" />
				<input type="hidden" name="id" value="${sessionScope.userId}" />
				<input type="hidden" name="startTime" value="${map.startTime}" />
				<button type="submit" class="btn btn-primary mt-2">결제하기</button>
			</form>
		</div>
	</body>
</html>