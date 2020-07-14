package Dao;

import java.io.InputStream;

import com.google.protobuf.compiler.PluginProtos.CodeGeneratorResponse.File;

public class Producto {
	private String nombre;
	private int precio;
	private int stock;
	private String foto;
	private int id_producto;
	
	public Producto(int id_producto,String nombre, int precio, int stock,String foto) {
		super();
		this.nombre = nombre;
		this.precio = precio;
		this.stock = stock;
		this.foto = foto;
		this.id_producto = id_producto;
	}
	public Producto(int id_producto) {
		super();
		this.id_producto = id_producto;
	}

	public Producto() {
		
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public int getPrecio() {
		return precio;
	}
	public void setPrecio(int precio) {
		this.precio = precio;
	}
	public int getStock() {
		return stock;
	}
	public void setStock(int stock) {
		this.stock = stock;
	}
	public String getFoto() {
		return foto;
	}
	public void setFoto(String foto) {
		this.foto = foto;
	}
	public int getId_producto() {
		return id_producto;
	}
	public void setId_producto(int id_producto) {
		this.id_producto = id_producto;
	}

	
}
