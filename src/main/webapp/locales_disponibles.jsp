<%@page import="Dao.Registro_local"%>
<%@page import="java.util.List"%>
<%@page import="Model.Crudlocal"%>
<%@page import="java.util.ArrayList"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
      
<!DOCTYPE html>
<html lang="Es">
<head>
    <meta charset="utf-8" />
    <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no" />
    <meta name="description" content="" />
    <meta name="author" content="" />
    <title>Delivery!</title>
    <!-- Favicon-->
    <link rel="shortcut icon" href="./assets/img/favicon.jpg">
    <!-- Font Awesome)-->
    <script src="https://use.fontawesome.com/releases/v5.13.0/js/all.js" crossorigin="anonymous"></script>
    <!-- Google fonts-->
    <link href="https://fonts.googleapis.com/css?family=Merriweather+Sans:400,700" rel="stylesheet" />
    <link href="https://fonts.googleapis.com/css?family=Merriweather:400,300,300italic,400italic,700,700italic"
        rel="stylesheet" type="text/css" />
    <!-- Third party plugin CSS-->
    <link href="https://cdnjs.cloudflare.com/ajax/libs/magnific-popup.js/1.1.0/magnific-popup.min.css"
        rel="stylesheet" />
    <!-- Core theme CSS (includes Bootstrap)-->
    <link href="css/styles.css" rel="stylesheet" />
    <link href="css/formulario.css" rel="stylesheet" />
</head>

<body id="page-top">
    <!-- Navigation-->
    <nav class="navbar navbar-expand-lg navbar-light fixed-top py-3" id="mainNav">
        <div class="container">
            <a class="navbar-brand js-scroll-trigger" href="./index.html">Volver <i class="fas fa-hamburger"></i></a>
            </a><button class="navbar-toggler navbar-toggler-right" type="button" data-toggle="collapse"
                data-target="#navbarResponsive" aria-controls="navbarResponsive" aria-expanded="false"
                aria-label="Toggle navigation"><span class="navbar-toggler-icon"></span></button>
            <div class="collapse navbar-collapse" id="navbarResponsive">
                <ul class="navbar-nav ml-auto my-2 my-lg-0">

                    <li class="nav-item"><a class="nav-link js-scroll-trigger" href="#contact"><img
                                src="./assets/img/favicon.jpg" width="50" height="50" class="icon">

                        </a></li>
                </ul>
            </div>
        </div>
    </nav>
    
    <header class="masthead">
        <div class="container">
            <div class="row h-100 align-items-center justify-content-center text-center">
            	<div class="locales_disponibles"></div>
                
               
               <div class="locales_disponibles" style="margin-top:20px;border:4px solid black;padding:50px;background:white;opacity:0.5">
               <h2>Lista de locales disponibles: </h2> <br>
                <%	
                Crudlocal crudLocal = new Crudlocal();
                List<Registro_local> datos = new ArrayList();          
                datos = crudLocal.selectAll();
                
                %>
                
                <%
                for(Registro_local local: datos){
                	
                %>
                <div style="border:1px dashed black">
                <label>Nombre: </label>  <%= local.getNombre() %>
        		<br>
        		<label>Email: </label> <%= local.getEmail() %><br>
        		<label>Direccion: </label> <%= local.getDireccion() %>
        		<br>
        		<label>Comuna: </label> <%= local.getComuna() %>
        		<br>
        		<label>Fono: </label> <%= local.getFono() %>
        		<br>
        		<%
        			}
        			%>
        			</div>
        			
   	
            </div>
        </div>
    </header>
   
    <!-- Bootstrap  JS-->
    <script src="https://cdnjs.cloudflare.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
    <script src="https://stackpath.bootstrapcdn.com/bootstrap/4.5.0/js/bootstrap.bundle.min.js"></script>
    <!-- Third party plugin JS-->
    <script src="https://cdnjs.cloudflare.com/ajax/libs/jquery-easing/1.4.1/jquery.easing.min.js"></script>
    <script src="https://cdnjs.cloudflare.com/ajax/libs/magnific-popup.js/1.1.0/jquery.magnific-popup.min.js"></script>
    <script src="js/scripts.js"></script>
    <script src="js/validaciones.js"></script>
</body>
</html></html>