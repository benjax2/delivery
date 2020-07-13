package Dao;

import java.io.InputStream;


public class Estado_pedido {
	
	private int id_estado;
	private String nombre_estado;
	private int fecha_c;
	
	public Estado_pedido(int id_estado, String nombre_estado, int fecha_c) {
		super();
		this.id_estado = id_estado;
		this.nombre_estado = nombre_estado;
		this.fecha_c = fecha_c;
	}
	
	public Estado_pedido(){
		
	}

	public int getId_estado() {
		return id_estado;
	}

	public void setId_estado(int id_estado) {
		this.id_estado = id_estado;
	}

	public String getNombre_estado() {
		return nombre_estado;
	}

	public void setNombre_estado(String nombre_estado) {
		this.nombre_estado = nombre_estado;
	}

	public int getFecha_c() {
		return fecha_c;
	}

	public void setFecha_c(int fecha_c) {
		this.fecha_c = fecha_c;
	}
	
	
}
