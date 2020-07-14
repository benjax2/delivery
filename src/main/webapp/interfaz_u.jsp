<%@page import="Dao.Registro_local"%>
<%@page import="java.util.List"%>
<%@page import="Model.Crudlocal"%>
<%@page import="java.util.ArrayList"%>

<%@page import="Dao.Registro_cliente"%>
<%@page import="Model.CrudPersona"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
	<meta charset="UTF-8">
	<meta name="viewport"
		content="width=device-width, user-scalable=no, initial-scale=1.0, maximum-scale=1.0, minimum-scale=1.0">
	<title>Interfaz de usuario</title>
	<link rel="shortcut icon" href="./assets/img/favicon.jpg">
	<link rel="stylesheet" href="css/interfaz_usuari.css">
	<link rel="stylesheet" href="css/font-awesome.css">

	<script src="js/jquery-3.2.1.js"></script>
	<script src="js/main.js"></script>
	<style>
		.li_locales:hover{
			background:#F8AF6E !important;
		}
		.li_locales{
			cursor: pointer;
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

				<li><a href="interfaz_u.jsp"><span class="fa fa-home icon-menu"></span>Inicio</a></li>

				<li class="item" menu="1">
					<a href="#"><span class="fa fa-suitcase icon-menu"></span>Bandeja de Compras</a>
				</li>

				<li class="item-submenu" menu="2">
					<a href="#"><span class="fa fa-shopping-bag icon-menu"></span>Tiendas Disponibles</a>
					<ul class="submenu">
						<li class="title-menu"><span class="fa fa-shopping-bag icon-menu"></span>Tiendas</li>
						<li class="go-back">Atras</li>
						
						<%	
                			Crudlocal crudLocal = new Crudlocal();
               			 	List<Registro_local> datos = new ArrayList();          
                			datos = crudLocal.selectAll();   
               			 %>
						
						<%
                			for(Registro_local local: datos){
                	
               			 %>
                	<div>
                		<li style="border:0.5px solid black;padding:10px;" class="li_locales"><%= local.getNombre() %> </li>
        				
        				<%
        				}
        				%>
        			</div>
					
					</ul>
				</li>

				<li><a href="#"><span class="fa fa-envelope icon-menu"></span>Contacto</a></li>
				<li><a href="#"><span class="fa fa-envelope icon-menu"></span>Editar perfil</a></li>
				<li><a href="./index.html">Cerrar Sesion</a></li>
			</ul>
		</nav>
	</header>
	
	<div class="container text-center mt-5 pt-5">

		<h1>Bienvenido este es tu portal de usuario!</h1>
		<p class="mt-5">Lorem, ipsum dolor sit amet consectetur adipisicing elit. Numquam ipsam quo deserunt reprehenderit nam facilis tempore atque veritatis officia neque nesciunt animi sint suscipit iste, consequatur excepturi saepe harum consequuntur!</p>
		<img src="./assets/img/favicon.jpg" class="img-fluid" alt="pepsi">
	</div>
		<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.0/css/bootstrap.min.css">
		<script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.16.0/umd/popper.min.js"></script>
		<script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.0/js/bootstrap.min.js"></script>
</body>

</html>