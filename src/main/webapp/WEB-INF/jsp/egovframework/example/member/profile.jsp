<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
	<head>
		<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
		<title>프로필</title>
		<%@ include file="../include/header.jsp" %>
		<link type="text/css" rel="stylesheet" href="<c:url value='/css/egovframework/pricing.css'/>"/>
	</head>
	<body>
		<%@include file="../include/nav.jsp" %>
		
		<div class="container">
		
			<div class="pricing-header px-3 py-3 pt-md-5 pb-md-4 mx-auto text-center">
				<h1>예약 현황</h1>
			</div>
			
			<form method="post" action="#">
				<input type="hidden" name="seqNo" value="${map.appointment.getSeqNo()}" />
				<input type="hidden" name="sectionNo" value="${map.appointment.getSectionNo()}" />
				<input type="hidden" name="id" value="${map.appointment.getId()}" />
  				<input type="hidden" name="startTime" value="${map.appointment.getStartTime()}" />
  				
  				<div class="card-deck mb-3 text-center">
    				<div class="card mb-4 shadow-sm">
      					<div class="card-header">
        					<h4 class="my-0 font-weight-normal">출발지</h4>
      					</div>
      					<div class="card-body">
        					<strong>${map.startName}</strong>
      					</div>
    				</div>
    				
    				<div class="card mb-4 shadow-sm">
      					<div class="card-header">
        					<h4 class="my-0 font-weight-normal">도착지</h4>
      					</div>
      					<div class="card-body">
        					<strong>${map.endName}</strong>
      					</div>
    				</div>
    				
    				<div class="card mb-4 shadow-sm">
      					<div class="card-header">
        					<h4 class="my-0 font-weight-normal">가는 날</h4>
      					</div>
      					<div class="card-body">
        					<strong>
        						${map.appointment.getStartTime().substring(0, 4)}년
								${map.appointment.getStartTime().substring(4, 6)}월
								${map.appointment.getStartTime().substring(6, 8)}일
								${map.appointment.getStartTime().substring(8, 10)}시
								${map.appointment.getStartTime().substring(10, 12)}분
        					</strong>
      					</div>
    				</div>		
				</div>
				
				<button type="submit" class="btn btn-outline-danger">예약 취소</button>
			</form>
		</div>
	</body>
</html>