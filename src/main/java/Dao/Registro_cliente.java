package Dao;

public class Registro_cliente {
	String email;
	String pwd;
	int fono;
	String direccion;
	String nombre;
	String rut;
	public Registro_cliente(String nombre, String rut, String email, String pwd, int fono, String direccion) {
		super();
		this.nombre = nombre;
		this.rut = rut;
		this.email = email;
		this.pwd = pwd;
		this.fono = fono;
		this.direccion = direccion;
	}
	public Registro_cliente(){
		
	}

	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getRut() {
		return rut;
	}
	public void setRut(String rut) {
		this.rut = rut;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPwd() {
		return pwd;
	}
	public void setPwd(String pwd) {
		this.pwd = pwd;
	}
	public int getFono() {
		return fono;
	}
	public void setFono(int fono) {
		this.fono = fono;
	}
	public String getDireccion() {
		return direccion;
	}
	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}
	
}

    
    
     

