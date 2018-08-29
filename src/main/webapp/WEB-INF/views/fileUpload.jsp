<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ include file="fragments/taglibs.jsp"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Upload file here</title>
</head>
<body>
	<form method="POST" action="upload" enctype="multipart/form-data">
		<table>
			<tr>
				<td><label>Select a file to upload</label></td>
				<td><input type="file" name="file" /></td>
			</tr>
			<tr>
				<td><input type="submit" value="Submit" /></td>
			</tr>
		</table>
	</form>
</body>
</html>