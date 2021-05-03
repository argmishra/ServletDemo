<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>  
<style><%@include file="/WEB-INF/css/style.css"%></style>
<meta charset="ISO-8859-1">
<title>Servlet Demo</title>
</head>
<body>

<div class="row">
<div class="column"> <h3> RequestDispatcher Demo </h3> 
<form action="demoRD" method="post">  
Name:<input type="text" name="name"/>  
<input type="submit" value="Show"/>  
</form>
</div>
<div class="column"> <h3> SendRedirect Demo </h3> 
<form action="demoSR">  
<input type="submit" value="Show"/>  
</form>
</div>
</div>

<hr>

<div class="row">
<div class="column"> <h3> Servlet Config Demo </h3> 
<form action="demoConfig">  
<input type="submit" value="Show"/>  
</form>
</div>
<div class="column"> <h3> Servlet Context Demo </h3> 
<form action="demoContext">  
<input type="submit" value="Show"/>  
</form>
</div>
<div class="column"> <h3> Filter Demo </h3> 
<form action="demoFilter">  
<input type="submit" value="Show"/>  
</form>
</div>

</div>

<hr> 

<div class="row">
<div class="column"> <h3> Cookie Demo </h3> 
<form action="demoCreateCookie" method="get">  
Name:<input type="text" name="name"/>  
<input type="submit" value="Show"/>  
</form>
</div>
<div class="column"> <h3> Hidden URL Demo </h3> 
<form action="demoCreateHF" method="get">  
Name:<input type="text" name="name"/>  
<input type="submit" value="Show"/>  
</form>
</div>
<div class="column"> <h3> URL Rewriting Demo </h3> 
<form action="demoCreateUR" method="get">  
Name:<input type="text" name="name"/>  
<input type="submit" value="Show"/>  
</form>
</div>
<div class="column"> <h3> Session Demo </h3> 
<form action="demoCreateSession" method="get">  
Name:<input type="text" name="name"/>  
<input type="submit" value="Show"/>  
</form>
</div>
</div>

</body>
</html>