package Dao;

import java.io.InputStream;


public class Pedido{

	private String rut;
	private int id_detalle;
	private int id_pedido;
	private int id_estado;
	
	public Pedido(String rut, int id_detalle, int id_pedido, int id_estado) {
		super();
		this.rut = rut;
		this.id_detalle = id_detalle;
		this.id_pedido = id_pedido;
		this.id_estado = id_estado;
	}
	
	public Pedido() {
		
	}

	public String getRut() {
		return rut;
	}

	public void setRut(String rut) {
		this.rut = rut;
	}

	public int getId_detalle() {
		return id_detalle;
	}

	public void setId_detalle(int id_detalle) {
		this.id_detalle = id_detalle;
	}

	public int getId_pedido() {
		return id_pedido;
	}

	public void setId_pedido(int id_pedido) {
		this.id_pedido = id_pedido;
	}

	public int getId_estado() {
		return id_estado;
	}

	public void setId_estado(int id_estado) {
		this.id_estado = id_estado;
	}
	
	
}