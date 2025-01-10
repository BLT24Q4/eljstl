<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>



<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1>연산</h1>
	<ul>
		<li>산술 연산: ${iVal + 10 * 100 / 2 }</li>
		<li>산술 연산: ${fVal + 10 * 100 / 2 }</li>
		<li>비교 연산: ${iVal < 100 }</li>
		<li>논리 연산: ${iVal == 1000 || fVal < 200 }</li>
		<li>null체크: ${empty nullVal }</li>
		<li>null체크: ${not empty userVo }</li>
	</ul>
</body>
</html>