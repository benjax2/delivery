<%@page import="Dao.Producto"%>
<%@page import="java.util.List"%>
<%@page import="Model.Crudproducto"%>
<%@page import="java.util.ArrayList"%>

<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
	<meta charset="UTF-8">
	<meta name="viewport"
		content="width=device-width, user-scalable=no, initial-scale=1.0, maximum-scale=1.0, minimum-scale=1.0">
	<title>Interfaz de local</title>
	<link rel="stylesheet" href="../css/interfaz_usuari.css">
	<link rel="stylesheet" href="../css/font-awesome.css">
	<link rel="shortcut icon" href="../assets/img/favicon.jpg">
	<script src="../js/jquery-3.2.1.js"></script>
	<script src="../js/main.js"></script>
	<style>
		.card-img-top {
    	width: 100%;
    	height: 15vw;
    	object-fit: cover;
		}
	</style>

</head>

<body>
	<header>
		<span id="button-menu" class="fa fa-bars" hidden="true"></span>
		<a class="navbar-brand js-scroll-trigger" href="productos.jsp" style="color:white">Volver <i class="fas fa-hamburger"></i></a>

		<nav class="navegacion" id="nav">
			<ul class="menu">
				<!-- TITULAR -->
				<li class="title-menu">Todas las categorias</li>
				<!-- TITULAR -->

				<li><a href="../interfaz_l.jsp"><span class="fa fa-home icon-menu"></span>Inicio</a></li>

				<li class="item" menu="1">
					<a href="#"><span class="fa fa-suitcase icon-menu"></span>Pedidos</a>
				</li>

				<li class="item" menu="2">
					<a href="productos.jsp"><span class="fa fa-shopping-bag icon-menu"></span>Productos</a></li>
					
					
				<li><a href="#"><span class="fa fa-envelope icon-menu"></span>Contacto</a></li>
				<li><a href="#"><span class="fa fa-envelope icon-menu"></span>Editar perfil</a></li>
				<li><a href="../index.html">Cerrar Sesion</a></li>
			</ul>
		</nav>
	</header>
	

		<br><hr>
		<!-- Llamado Sql -->
		<%	
           Crudproducto crudproducto = new Crudproducto();
           List<Producto> datos = new ArrayList();          
           datos = crudproducto.buscarId(Integer.parseInt(request.getParameter("id")));   
         %>
						

		
		<!-- Card Productos -->
		<section class="row widgets">
										<%
           for(Producto local: datos){
                	
        	%>
			<div class="col-12 col-md-4 col-lg-4 mt-2">

				<div class="card" style="width: 18rem;margin-left:120%">
				<form class="formulario" method="POST" action="../EditarProducto">
					<div class="card-body">
						<h4 class="card-title text-center" style="margin-top: 10px;" >Editar Producto</h4>
						<input type="text" name="id" id="id" value="<%= local.getId_producto() %>" hidden="true"><br>
						<h6>Nombre</h6><input type="text" name="nombre" id="nombre" value="<%= local.getNombre() %>"><br>
						<h6>Valor</h6><input type="text" name="precio" id="precio" value="<%= local.getPrecio() %>"><br>
						<h6>Stock</h6><input type="text" name="stock" id="stock" value="<%= local.getStock() %>"><br>
						<h6>Foto</h6><input type="text" name="foto" id="foto" value="<%= local.getFoto() %>"><br>
						<br>
    					<input type="submit" value="Editar" class="button btn btn-info" name="Editar"><br>
  					</div>
  				</form>
				</div>
			
			</div>
			<% } %>

		
			
			
			
		</section>	
		
	</div>
		<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.0/css/bootstrap.min.css">
		<script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.16.0/umd/popper.min.js"></script>
		<script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.0/js/bootstrap.min.js"></script>
</body>

</html>