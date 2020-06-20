<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>

<%@include file="../../include/header.jsp" %>
<c:redirect url="/timetable/list.do">
	<c:param name="msg" value="tableError"/>
</c:redirect>