function validac(){
	var nombre = document.getElementById('nombre').value;
	var rut = document.getElementById('rut').value;
	var email = document.getElementById('email').value;
	var pwd = document.getElementById('pwd').value;
	var fono = document.getElementById('fono').value;;
	var direccion = document.getElementById('direccion').value;
	
    if(nombre.length == 0 || nombre == null || /^\s+$/.test(nombre)){
        alert('Ingrese un nombre!');
        return false;
      }else if (!/^[0-9]+[-|‐]{1}[0-9kK]{1}$/.test(rut)){
          alert('Debe ingresar un rut valido!');
          return false;
        }else if(!(/\S+@\S+\.\S+/.test(email))){
        alert('Debe escribir un correo válido!');
        return false;
        }else if(!/^(?=.*[a-z])(?=.*[A-Z])(?=.*\d)[a-zA-Z\d]{8,}$/.test(pwd)){
        alert("ingrese contraseña valida");
        return false;
        }else if(!/^(\+?56)?(\s?)(0?9)(\s?)[9876543]\d{7}$/.test(fono)){
          alert('Debe ingresar un numero de telefono!');
          return false;
        }else if(direccion.length == 0 || direccion == null || /^\s+$/.test(direccion)){
            alert('Ingrese una direccion!');
            return false;
          }
}

function validal(){
	var nombre = document.getElementById('nombre').value;
	var rutr = document.getElementById('rut').value;
	var email = document.getElementById('email').value;
	var pwd = document.getElementById('pwd').value;
	var fono = document.getElementById('fono').value;;
	var direccion = document.getElementById('direccion').value;
	var giro = document.getElementById('giro').value;
	var patente = document.getElementById('patente').value;
	
    if(nombre.length == 0 || nombre == null || /^\s+$/.test(nombre)){
        alert('Ingrese un nombre!');
        return false;
      }else if (!/^[0-9]+[-|‐]{1}[0-9kK]{1}$/.test(rutr)){
          alert('Debe ingresar un rut valido!');
          return false;
        }else if(!(/\S+@\S+\.\S+/.test(email))){
        alert('Debe escribir un correo válido!');
        return false;
      }else if(!/^(?=.*[a-z])(?=.*[A-Z])(?=.*\d)[a-zA-Z\d]{8,}$/.test(pwd)){
          alert("ingrese contraseña valida");
          return false;
          }else if(!/^(\+?56)?(\s?)(0?9)(\s?)[9876543]\d{7}$/.test(fono)){
          alert('Debe ingresar un numero telefonico!');
          return false;
        }else if(direccion.length == 0 || direccion == null || /^\s+$/.test(direccion)){
            alert('Ingrese una direccion!');
            return false;
            }else if(giro.length == 0 || giro == null || /^\s+$/.test(giro)){
                alert('Ingrese su giro!');
                return false;
              }else if(patente.length == 0 || patente == null || /^\s+$/.test(patente)){
                  alert('Debe ingresar una patente valida!');
                  return false;
                }
}