<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<link href="<c:url value="/static/bootstrap/css/bootstrap.min.css" />" rel="stylesheet"></link>
<link href="<c:url value="/static/app.css" />" rel="stylesheet"></link>
<script src="<c:url value="/static/jquery/jquery.min.js" />"></script>
<script src="<c:url value="/static/bootstrap/js/bootstrap.min.js" />"></script>

<nav class="navbar navbar-default" role="navigation">
	<div class="navbar-header">
    	<button type="button" class="navbar-toggle" data-toggle="collapse" data-target=".navbar-ex1-collapse">
			<span class="sr-only">Deploy navegación</span>
			<span class="icon-bar"></span>
			<span class="icon-bar"></span>
			<span class="icon-bar"></span>    			
        </button>
        <a class="navbar-brand" href="#">Building Ways</a>
    </div>
    <div class="collapse navbar-collapse navbar-ex1-collapse">
    	<ul class="nav navbar-nav">
        	<li class="active"><a href="<c:url value='/list-products' />">Productos</a></li>
        	<li><a href="<c:url value='/list-users' />">Usuarios</a></li>
        	<li class="dropdown">
        		<a href="#" class="dropdown-toggle" data-toggle="dropdown">Desplegable <b class="caret"></b></a>
        		<ul class="dropdown-menu">
        			<li><a href="#">Opc 1</a></li>
        			<li><a href="#">Opc 2</a></li>
        			<li class="divider"></li>
        			<li><a href="#">Opc 3</a></li>
        		</ul>
        	</li>	
        </ul>
    </div>
</nav>