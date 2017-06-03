<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@ page isELIgnored="false" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
 
 
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
    <title>Confirmación de registro</title>
	<link href="<c:url value="/static/bootstrap/css/bootstrap.min.css" />" rel="stylesheet"></link>
	<link href="<c:url value="/static/app.css" />" rel="stylesheet"></link>
    <link href="<c:url value="/static/font-awesome/css/font-awesome.min.css" />" rel="stylesheet" type="text/css"></link>
</head>
<body>
    <div class="generic-container">
        <%@include file="authheader.jsp" %>
         
        <div class="alert alert-success lead">
            ${success}
        </div>
         
        <span class="well floatRight">
            Ir a la <a href="<c:url value='/list' />">LISTA DE USUARIOS</a>
        </span>
    </div>
</body>
 
</html>