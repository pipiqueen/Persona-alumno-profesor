package com.utn.vista;

public abstract class Futbolero {

	private String nombre;
	private String apellido;
	private int numeroCamiseta;
	
	Futbolero (String nombre, String apellido, int numeroCamiseta){
		this.nombre= nombre;
		this.apellido= apellido;
		this.numeroCamiseta= numeroCamiseta;
	
		
	}
 abstract int calculoPuntos();
	

	@Override
	public String toString() {
		return "Futbolero [nombre=" + nombre + ", apellido=" + apellido + ", numeroCamiseta=" + numeroCamiseta + "]";
	}
	
	public String getNombre() {
		return this.nombre;
	}
	
}
