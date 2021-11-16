package com.ivv.demo.modelo;
import javax.persistence.Entity;
import javax.persistence.GenerationType;
import javax.persistence.Table;
import javax.persistence.Id;
import javax.persistence.GeneratedValue;

@Entity
@Table(name = "producto")

public class Producto {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	
private long id;
private	String nombre;
private	String marca;
private	String hechoen;
private	float precio;

public Producto () {
	
}

public Producto(long id, String nombre, String marca, String hechoen, float precio) {
	super();
	this.id = id;
	this.nombre = nombre;
	this.marca = marca;
	this.hechoen = hechoen;
	this.precio = precio;
}

public long getId() {
	return id;
}

public void setId(long id) {
	this.id = id;
}

public String getNombre() {
	return nombre;
}

public void setNombre(String nombre) {
	this.nombre = nombre;
}

public String getMarca() {
	return marca;
}

public void setMarca(String marca) {
	this.marca = marca;
}

public String getHechoen() {
	return hechoen;
}

public void setHechoen(String hechoen) {
	this.hechoen = hechoen;
}

public float getPrecio() {
	return precio;
}

public void setPrecio(float precio) {
	this.precio = precio;
}



}
