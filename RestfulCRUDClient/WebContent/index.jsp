<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

	<center>Restful CRUD Client</center>
	<form action="ClientServlet" method="get">
		<table>
			<tr>
				<td>Enter EmpId to search</td>
				<td><input type="text" name="id" id="id" /></td>
			</tr>
			<tr>
				<td colspan='2'><input type="submit" value="Submit"
					id="button-1" /></td>
			</tr>
		</table>
	</form>

</body>
</html>