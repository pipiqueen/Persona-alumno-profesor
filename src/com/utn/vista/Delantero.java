package com.utn.vista;

public class Delantero extends Futbolero {

	private int golesConvertidos;
	private int golesErrados;
	
	Delantero(String nombre, String apellido, int numeroCamiseta, int golesConvertidos, int golesErrados) {
		super(nombre, apellido, numeroCamiseta);
		this.golesConvertidos= golesConvertidos;
		this.golesErrados= golesErrados;
	}

	

@Override
int calculoPuntos() {
	return golesConvertidos - golesErrados;
}
}
