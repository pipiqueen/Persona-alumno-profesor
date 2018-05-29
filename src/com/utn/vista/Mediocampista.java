package com.utn.vista;

public class Mediocampista extends Futbolero {

	private int pasesBienHechos;
	private int pasesErrados;
	
	
	Mediocampista(String nombre, String apellido, int numeroCamiseta, int pasesBienHechos, int pasesErrados) {
		super(nombre, apellido, numeroCamiseta);
	this.pasesBienHechos=pasesBienHechos;
	this.pasesErrados=pasesErrados;
	
	}
@Override
int calculoPuntos() {
	
	return pasesBienHechos - pasesErrados;
}
}
