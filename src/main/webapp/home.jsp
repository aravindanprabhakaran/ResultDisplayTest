<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Home Page : Result Viewer</title>
<style>
	#addStudent{    
		position: fixed;
    	margin-left: 34%;
    	top: 25%;
	}
	#viewResult{
		position: fixed;
    	margin-left: 60%;
    	top: 25%;
	}
	#SidDiv{
	    margin-left: 42%;
    	position: fixed;
    	top: 16%;
	}
</style>
</head>
<body>
	<h1 align="center">Result Viewer</h1><br><hr>
	<form action="addResultForm">
		<input type="submit" value="Add New Result" id="addStudent" /><br>
	</form>
	<form action="viewResult">
		<div id="SidDiv">
			Student ID : <input type="text" name="sregno" id="Sid"><br>
		</div>
		<input type="submit" value="View Result" id="viewResult" /><br>
	</form>

</body>
</html>