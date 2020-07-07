<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
	<meta charset="UTF-8">
	<meta name="viewport"
		content="width=device-width, user-scalable=no, initial-scale=1.0, maximum-scale=1.0, minimum-scale=1.0">
	<title>Interfaz de usuario</title>
	<link rel="stylesheet" href="css/interfaz_usuari.css">
	<link rel="stylesheet" href="css/font-awesome.css">

	<script src="js/jquery-3.2.1.js"></script>
	<script src="js/main.js"></script>
	
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

						<li><a href="#">Santa isabel - La Cisterna</a></li>
						<li><a href="#">Jumbo - San Miguel</a></li>
						<li><a href="#">Lider - La Cisterna</a></li>
						<li><a href="#">Totus - La Reina</a></li>
						<li><a href="#">Sushi - ñuñoa</a></li>
						<li><a href="#">Ok Market - Santiago Centro</a></li>
					</ul>
				</li>

				<li><a href="#"><span class="fa fa-envelope icon-menu"></span>Contacto</a></li>
				<li><a href="#"><span class="fa fa-envelope icon-menu"></span>Editar perfil</a></li>
				<li><a href="./index.html">Cerrar Sesion</a></li>
			</ul>
		</nav>
	</header>
	
	<div class="container text-center mt-5 pt-5">
		<h1>Bienvenidos a todos a nuestro servicio de delivery!</h1>
		<p class="mt-5">Lorem, ipsum dolor sit amet consectetur adipisicing elit. Numquam ipsam quo deserunt reprehenderit nam facilis tempore atque veritatis officia neque nesciunt animi sint suscipit iste, consequatur excepturi saepe harum consequuntur!</p>
		<img src="./assets/img/favicon.jpg" class="img-fluid" alt="pepsi">
	</div>
		<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.0/css/bootstrap.min.css">
		<script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.16.0/umd/popper.min.js"></script>
		<script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.0/js/bootstrap.min.js"></script>
</body>

</html>