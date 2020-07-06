function validac(){
	var nombre = document.getElementById('nombre');
	var rut = document.getElementById('rut');
	var email = document.getElementById('email');
	var fono = document.getElementById('fono');
	var direccion = document.getElementById('direccion');
	var giro = document.getElementById('giro');
	var patente = document.getElementById('patente');

	if(nombre.value == 0 || nombre.value ==" "){
		alert("Ingrese un nombre porfavor...");
		return false;
	}else if(rut.value == 0 || rut.value ==" "){
		alert("Ingrese un rut porfavor...");
		return false;
	}else if(email.value == 0 || email.value ==" "){
		alert("Ingrese un email porfavor...");
		return false;
	}else if(fono.value == 0 || email.value ==" "){
		alert("Ingrese un numero valido porfavor...");
		return false;
	}
	else if(direccion.value == 0 || direccion.value ==" "){
		alert("Ingrese una direccion valida porfavor...");
		return false;
	}
	else if(giro.value == 0 || giro.value ==" "){
		alert("Ingrese una giro valida porfavor...");
		return false;
	}else if(patente.value == 0 || patente.value ==" "){
		alert("Ingrese una patente valida porfavor...");
		return false;
	}
}