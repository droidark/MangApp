<%@ page language="java" pageEncoding="UTF-8" session="false"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
<title>Tutorial: Hello Dojo!</title>
</head>
<body>
	<h1>Unete a MangApp</h1>
	<h2>No te pierdas ninguno de tus titulos favoritos</h2>
	<form:form method="post" action="/mangapp/confirm">
		<table>
			<tr>
				<td><form:label path="username">Usuario</form:label></td>
				<td><form:input path="username"/></td>
			</tr>
			<tr>
				<td><form:label path="email">Email</form:label></td>
				<td><form:input path="email"/></td>
			</tr>
			<tr>
				<td><form:label path="password">Contraseña</form:label></td>
				<td><form:password path="password"/></td>
			</tr>
			<tr>
				<td colspan="2">
					<input type="submit" value="Crear cuenta">
				</td>
			</tr>
		</table>
	</form:form>
</body>
</html>