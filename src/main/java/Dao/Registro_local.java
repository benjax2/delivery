package Dao;

public class Registro_local {

	String nombre; 
	String rut;
	String email;
	String pwd;
	int fono;
	String direccion;
	String comuna;
	String giro;
	String patente;
	
	public Registro_local(String nombre, String rut, String email, String pwd, int fono, String direccion,
			String comuna, String giro,String patente) {
		super();
		this.nombre = nombre;
		this.rut = rut;
		this.email = email;
		this.pwd = pwd;
		this.fono = fono;
		this.direccion = direccion;
		this.comuna = comuna;
		this.giro = giro;
		this.patente = patente;
	}
	public Registro_local() {
		
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
	public void setRut_representante(String rut) {
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
	public String getComuna() {
		return comuna;
	}
	public void setComuna(String comuna) {
		this.comuna = comuna;
	}
	public String getGiro() {
		return giro;
	}
	public void setGiro(String giro) {
		this.giro = giro;
	}
	public void setPatente(String patente) {
		this.patente = patente;
	}
	public String getPatente() {
		return patente;
	}

	
}
