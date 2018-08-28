<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Upload file here bijacz</title>
</head>
<body>
	<form method="POST" action="upload" enctype="multipart/form-data">
    	<input type="file" name="file" /><br/>
    	<input type="submit" value="Submit" />
	</form>
</body>
</html>