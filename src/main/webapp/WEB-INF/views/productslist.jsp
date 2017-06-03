<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@ page isELIgnored="false" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="sec" uri="http://www.springframework.org/security/tags"%>
 
<html>
 
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
    <title>Lista de productos</title>
	<link href="<c:url value="/static/bootstrap/css/bootstrap.min.css" />" rel="stylesheet"></link>
	<link href="<c:url value="/static/app.css" />" rel="stylesheet"></link>
    <link href="<c:url value="/static/font-awesome/css/font-awesome.min.css" />" rel="stylesheet" type="text/css"></link>
</head>
 
<body>
    <div class="generic-container">
        <%@include file="authheader.jsp" %> 
        <%@include file="menu.jsp" %>  
        <div class="panel panel-default">
              <!-- Default panel contents -->
            <div class="panel-heading"><span class="lead">Lista de productos </span></div>
            <table class="table table-hover">
                <thead>
                    <tr>
                        <th>ID</th>
                        <th>Descripción</th>
                        <th>Unidad</th>
                        <th>Precio Unitario</th>
                        <th>Fecha de carga</th>
                        <th>Fecha de modificación</th>
                        <sec:authorize access="hasRole('ADMIN')">
                            <th width="100"></th>
                        </sec:authorize>
                        <sec:authorize access="hasRole('ADMIN')">
                            <th width="100"></th>
                        </sec:authorize>
                	</tr>
                </thead>
                <tbody>
                <c:forEach items="${productos}" var="producto">
                    <tr>
                        <td>${producto.id}</td>
                        <td>${producto.descripcion}</td>
                        <td>${producto.unidad}</td>
                        <td>${producto.precioUnitario}</td>
                        <td>${producto.fechaCarga}</td>
                        <td>${producto.fechaModificacion}</td>
                        <sec:authorize access="hasRole('ADMIN')">
                            <td><a href="<c:url value='/edit-product-${producto.id}' />" class="btn btn-success custom-width">editar</a></td>
                        </sec:authorize>
                        <sec:authorize access="hasRole('ADMIN')">
                            <td><a href="<c:url value='/delete-product-${producto.id}' />" class="btn btn-danger custom-width">eliminar</a></td>
                        </sec:authorize>
                    </tr>
                </c:forEach>
                </tbody>
            </table>
        </div>
        <sec:authorize access="hasRole('ADMIN')">
            <div class="well">
                <a href="<c:url value='/add-product' />">Agregar nuevo producto</a>
            </div>
        </sec:authorize>
    </div>
</body>
</html>