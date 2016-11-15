<%@ page language="java" pageEncoding="UTF-8" session="true"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="utf-8">
		<title>Insert title here</title>
	</head>
	<body>
		<h1>Bienvenido al panel de adminsitración</h1>
		<form:form action="${pageContext.request.contextPath}/logout" method="post">
			<input type="submit" value="Logout">
		</form:form>
	</body>
</html>