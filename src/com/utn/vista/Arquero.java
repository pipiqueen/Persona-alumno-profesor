package com.utn.vista;

public class Arquero extends Futbolero {

	private int pelotasAtajadas;
	private int goleada;

	Arquero(String nombre, String apellido, int numeroCamiseta, int pelotasAtajadas, int goleada) {

		super(nombre, apellido, numeroCamiseta);
		this.pelotasAtajadas = pelotasAtajadas;
		this.goleada = goleada;

	}

	@Override
	int calculoPuntos() {
		
		return pelotasAtajadas - goleada;
	}
}
