<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>

<%
//	서블릿으로부터 전송된 모델 가져오기
int iVal = (int)request.getAttribute("iVal");
Object nullVal = request.getAttribute("nullVal");
%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>데이터형</title>
</head>
<body>
	<h1>데이터형</h1>
	<p><%= iVal %>, <%= nullVal %></p>
	<p>
	
	<!-- servlet에서 넘어온 값들을 표현할때 사용한다. java보다 간결하다 -->
	<h3>EL</h3>
	<ul>
		<li>정수형 출력: ${iVal }</li>
		<li>실수형 출력: ${fVal }</li>
		<li>문자열 출력: ${sVal }</li>
		<li>불린형 출력: ${bVal }</li>
		<li>null 출력: ${nullVal }</li><!-- null값은 출력되지 않음 -->
		<li>객체 출력: ${userVo }</li>
	
	</ul>
	
	
	</p>
</body>
</html>