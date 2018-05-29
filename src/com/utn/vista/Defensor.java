package com.utn.vista;

public class Defensor extends Futbolero {

	
	private int recuperos;
	private int pelotasPerdidas;
	
	Defensor(String nombre, String apellido, int numeroCamiseta, int recuperos, int pelotasPerdidas) {
		super(nombre, apellido, numeroCamiseta);
this.recuperos=recuperos;
this.pelotasPerdidas=pelotasPerdidas;
	}



	@Override
	int calculoPuntos() {
		// TODO Auto-generated method stub
		return recuperos - pelotasPerdidas;
	}

}
