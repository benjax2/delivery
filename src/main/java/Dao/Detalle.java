package Dao;

import java.io.InputStream;


public class Detalle {
	
	private int id_detalle;
	private int id_producto;
	private int fecha_pedido;
	
	public Detalle(int detalle, int id_producto, int fecha_pedido) {
		super();
		this.id_detalle = id_detalle;
		this.id_producto = id_producto;
		this.fecha_pedido = fecha_pedido;
	}
	

	public Detalle() {
	}

	public int getDetalle() {
		return id_detalle;
	}

	public void setDetalle(int detalle) {
		this.id_detalle = id_detalle;
	}

	public int getId_producto() {
		return id_producto;
	}

	public void setId_producto(int id_producto) {
		this.id_producto = id_producto;
	}

	public int getFecha_pedido() {
		return fecha_pedido;
	}

	public void setFecha_pedido(int fecha_pedido) {
		this.fecha_pedido = fecha_pedido;
	}
	
}