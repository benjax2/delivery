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

	<script src="../js/jquery-3.2.1.js"></script>
	<script src="../js/main.js"></script>
	<style>
		.card-img-top {
    	width: 100%;
    	height: 15vw;
    	object-fit: cover;
		}
	</style>
	<!-- script>
		function recibir() {	
			var id = document.getElementById("id").value;
			var p = document.getElementById("p");
			localStorage.setItem("id", id);
			p.value = localStorage.getItem("id");
			console.log(p.value);
			localStorage.clear("id");
			} 
	</script -->
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
				<li><a href="../index.html">Cerrar Sesion</a></li>
			</ul>
		</nav>
	</header>
	
	<div class="container text-center mt-3 pt-3">
		<div class="row">
			<div class="d-flex col-lg-4"></div>
			<div class="d-flex col-lg-4 justify-content-center">
				<h1>Productos</h1>
			</div>
			<div class="d-flex col-lg-4 justify-content-end">	
				<!-- Button to Open the Modal -->
 	 			<button type="button" class="btn btn-primary" data-toggle="modal" data-target="#myModal">
    				Agregar producto
  				</button>
  				<!-- modal2 boton eliminar-->
  			<div class="d-flex col-lg-4 justify-content-end">	
				<!-- Button to Open the Modal -->
 	 			<button type="button" class="btn btn-primary" data-toggle="modal" data-target="#myModal2">
    				Eliminar
  				</button>
  			</div>	
  			</div>
  		</div>
  		<!-- The Modal -->
  	<div class="modal" id="myModal" style="margin-top:10%">
    	<div class="modal-dialog">
      		<div class="modal-content">
      
        <!-- Modal Header -->
        <div class="modal-header">
          <h4 class="modal-title">Agregar productos:</h4>
          <button type="button" class="close btn btn-info" data-dismiss="modal">&times;</button>
        </div>
        
        <!-- Modal body -->
        <div class="modal-body">
          <form action="../ProcesoProducto" method="post">
  			<div class="form-group">
    			<input type="text" class="form-control" id="nombre" name="nombre" placeholder="Nombre de producto">
  			</div>
  			<div class="form-group">
    			<input type="number" class="form-control" id="precio" name="precio" placeholder="Precio de producto">
  			</div>
  			<div class="form-group">
    			<input type="number" class="form-control" id="stock" name="stock" placeholder="Stock">
  			</div>
  			
  			 <div class="form-group">
    			<input type="text" class="form-control" id="url" name="url" placeholder="Foto (url)">
  			</div>
  			<button type="submit" class="btn btn-info">Agregar</button>
		</form>
        </div>
        
        <!-- Modal footer -->
        <div class="modal-footer">
          <button type="button" class="btn btn-danger" data-dismiss="modal">Close</button>
        </div>
        
      </div>
    </div>
  </div>
  
  <!-- MODAL2 -->
  	<div class="modal" id="myModal2" style="margin-top:10%">
    	<div class="modal-dialog">
      		<div class="modal-content">
      
        <!-- Modal Header -->
        <div class="modal-header">
          <h4 class="modal-title">Eliminar producto</h4>
          <button type="button" class="close btn btn-info" data-dismiss="modal">&times;</button>
        </div>
        
        <!-- Modal body -->
        <div class="modal-body">
          <form action="../EliminarProducto" method="post">
  			<div class="form-group">
    			<input type="text" class="form-control" id="nombre" name="nombre" placeholder="Ingrese nombre del producto">
  			</div>

  			<button type="submit" class="btn btn-info">Eliminar</button>
		</form>
        </div>
        
        <!-- Modal footer -->
        <div class="modal-footer">
          <button type="button" class="btn btn-danger" data-dismiss="modal">Close</button>
        </div>
        
      </div>
    </div>
  </div>
		<br><hr>
		<!-- Llamado Sql -->
		<%	
           Crudproducto crudproducto = new Crudproducto();
           List<Producto> datos = new ArrayList();          
           datos = crudproducto.selectAll();   
         %>
						

		
		<!-- Card Productos -->
		<section class="row widgets">
										<%
           for(Producto local: datos){
                	
        	%>
			<div class="col-12 col-md-4 col-lg-4 mt-2">

				<div class="card" style="width: 18rem;">
				<form class="formulario" method="POST" action="../EliminarProducto">
						<h5 class="card-title" style="margin-top: 10px;" ><%= local.getNombre() %></h5>
						<input type="text" name="id_prod" id="id" value="<%= local.getId_producto() %>" readonly hidden="true"><br>
  					<img class="card-img-top"  src="<%= local.getFoto() %>">
  					<% System.out.println(local.getFoto()); %>
  					<div class="card-body">
    					<h6 class="card-text"><strong>Valor: $ <%= local.getPrecio() %> &nbsp; &nbsp; &nbsp; &nbsp; Stock: <%= local.getStock() %> </strong></h6>
    					
    					<input type="submit" value="Eliminar" class="button" name="eliminar">
    					<!-- input type="submit" value="Editar" class="button" name="editar"--> 
    					<!-- p class="card-text"><strong>Stock: </strong></p -->
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