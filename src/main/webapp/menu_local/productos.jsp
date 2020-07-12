<%@page import="Dao.Producto"%>
<%@page import="java.util.List"%>
<%@page import="Model.Crudlocal"%>
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
		<span id="button-menu" class="fa fa-bars"></span>

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
				<li><a href="./index.html">Cerrar Sesion</a></li>
			</ul>
		</nav>
	</header>
	
	<div class="container text-center mt-3 pt-3">

		<h1>Productos</h1>
		<br><hr>
		<!-- Llamado Sql -->
		<%	
           Crudlocal crudLocal = new Crudlocal();
           List<Producto> datos = new ArrayList();          
           datos = crudLocal.selectAll();   
         %>
						

		
		<!-- Card Productos -->
		<section class="row widgets">
										<%
           for(Producto local: datos){
                	
        	%>
			<div class="col-12 col-md-4 col-lg-4 mt-2">

				<div class="card" style="width: 18rem;">
  					<img class="card-img-top"  src="<%= local.getFoto() %>" alt="Card image cap">
  					<% System.out.println(local.getFoto()); %>
  					<div class="card-body">
    					<h5 class="card-title"><%= local.getNombre() %></h5>
    					<p class="card-text"><strong>Precio: $ <%= local.getPrecio() %> </strong></p>
    					<p class="card-text"><strong>Stock: <%= local.getStock() %></strong></p>
   					    <button type="button" class="btn btn-danger">-</button>
   					    <button type="button" class="btn btn-info">Editar</button>
  					</div>
				</div>

			</div>
									<%
        	}
        %>
		</section>	
		
	</div>
		<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.0/css/bootstrap.min.css">
		<script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.16.0/umd/popper.min.js"></script>
		<script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.0/js/bootstrap.min.js"></script>
</body>

</html>