<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
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
    <!-- formulario-->
    <header class="masthead">
        <div class="container">
            <div class="row h-100 align-items-center justify-content-center text-center">
                <form class="formulario">
                    <h2>Registro Clientes</h2>
                    <div class="contenedor">

                        <div class="input-contenedor">
                            <i class="fas fa-user icon"></i>
                            <input type="text" placeholder="Nombre Completo" id="nombre" name="nombre">

                        </div>

                        <div class="input-contenedor">
                            <i class="fas fa-user icon"></i>
                            <input type="text" placeholder="Rut" id="rut" name="rut">
                        </div>

                        <div class="input-contenedor">
                            <i class="fas fa-envelope icon"></i>
                            <input type="email" placeholder="Email" id="email" name="email">

                        </div>

                        <div class="input-contenedor">
                            <i class="fas fa-key icon"></i>
                            <input type="password" placeholder="Contraseña" id="pwd" name="pwd">
                        </div>
                        <div class="input-contenedor">
                            <i class="fas fa-phone-square-alt icon"></i>
                            <input type="number" placeholder="Fono" id="fono" name="fono">
                        </div>
                        <div class="input-contenedor">
                            <i class="fas fa-user icon"></i>
                            <input type="text" placeholder="direccion" id="direccion" name="direccion">
                        </div>
                        <input type="submit" value="Registrate" class="button">
                    </div>
                </form>
            </div>
        </div>
    </header>
    <!-- Footer-->
    <footer class="bg-light py-5">
        <div class="container">
            <div class="small text-center text-muted">Copyright Delivery © 2020 - </div>
        </div>
    </footer>
    <!-- Bootstrap  JS-->
    <script src="https://cdnjs.cloudflare.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
    <script src="https://stackpath.bootstrapcdn.com/bootstrap/4.5.0/js/bootstrap.bundle.min.js"></script>
    <!-- Third party plugin JS-->
    <script src="https://cdnjs.cloudflare.com/ajax/libs/jquery-easing/1.4.1/jquery.easing.min.js"></script>
    <script src="https://cdnjs.cloudflare.com/ajax/libs/magnific-popup.js/1.1.0/jquery.magnific-popup.min.js"></script>
    <script src="js/scripts.js"></script>
    <script src="js/validaciones.js"></script>
</body>
</html>