<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Add Student - Result Viewer</title>
<style>
	#snodiv{
		position: fixed;
    	top: 3%;
	}
	#snamediv{
	    position: fixed;
    	top: 7%;
	}
	#gpadiv{
	    position: fixed;
    	top: 11%;
	}
	#Submitbutton{
	    position: fixed;
    	top: 15%;
	}
	#sregnoId{
		margin-left : 34px;
	}
	#snameId{
		margin-left : 43px;
	}
</style>
</head>
<body>
	<form action="addStudent">
		<div id="snodiv">
			Student No <input type="number" name="sregno" id="sregnoId"/><br>
		</div>
		<div id="snamediv">
			Name <input type="text" name="sname" id="snameId"/><br>
		</div>
		<div id="gpadiv">
			GPA <input type="text" name="gpa"/><br>
		</div>
		<input id="Submitbutton" type="submit"/><br>
	</form>
</body>
</html>