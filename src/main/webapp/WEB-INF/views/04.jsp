<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ page import="vo.UserVo" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>


<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1>객체접근</h1>
	
	<h2>자바문법</h2>
	<% 
	UserVo userVo = (UserVo)request.getAttribute("vo");
	int num = (int)request.getAttribute("num");
	String str = (String)request.getAttribute("str");
	%>
	name = <%=userVo.getName()%> <br/>
    email = <%=userVo.getEmail() %> <br/>
    password = <%=userVo.getPassword() %> <br/>
	gender = <%=userVo.getGender() %> <br/> 
	
	num = <%=num %> <br/>
	str = <%=str %>	<br/>
	
	
	
	<h2>el</h2>                 
	<ul>
		<li>userVo: ${userVo }</li>
		<li>num: ${num }</li>
		<li>str: ${str }</li>
		<li>name: ${userVo.name }</li>
		<li>email: ${useVo.email }</li>
		<li>password: ${userVo.password }</li>
		<li>gender: ${userVo.gender }</li>
	</ul>
	
	<h3>Scope Test 1</h3>
	<ul>
		<li>Request Scope: ${requestScope.vo }</li>
		<li>Session Scope: ${sessionScope.vo }</li>
		<li>Application Scope: ${applicationScope.vo }</li>
	</ul>
	
	<h3>Scope Text 2</h3>
	<ul>
		<li>${vo }</li>
	</ul>


	
	
</body>
</html>