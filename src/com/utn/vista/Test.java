package com.utn.vista;

import java.util.ArrayList;

import javax.swing.JOptionPane;

public class Test {

	public static void main(String[] args) {

		ArrayList<Futbolero> jugador = new ArrayList<Futbolero>();

		int cantJugador = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el numero de jugadores: "));
		int x = 0;
		while (x < cantJugador) {
			String jugadorElegido = JOptionPane
					.showInputDialog("Ingrese el tipo de jugador que quiere ingresar para conocer su puntaje :");

			if ("mediocampista".equals(jugadorElegido.toLowerCase())) {

				jugador.add(new Mediocampista(JOptionPane.showInputDialog("Ingrese el nombre del jugador:"),
						JOptionPane.showInputDialog("Ingrese el apellido:"),
						Integer.parseInt(JOptionPane.showInputDialog("Ingrese el numero de camiseta:")),
						Integer.parseInt(JOptionPane.showInputDialog("Ingrese el numero de pases bien hechos:")),
						Integer.parseInt(JOptionPane.showInputDialog(("Ingrese el numero de pases errados:")))));

				x++;
			}

			else if ("delantero".equals(jugadorElegido.toLowerCase())) {
				jugador.add(new Delantero(JOptionPane.showInputDialog("Ingrese el nombre del jugador:"),
						JOptionPane.showInputDialog("Ingrese el apellido:"),
						Integer.parseInt(JOptionPane.showInputDialog("Ingrese el numero de camiseta:")),
						Integer.parseInt(JOptionPane.showInputDialog("Ingrese el numero de goles convertidos:")),
						Integer.parseInt(JOptionPane.showInputDialog("Ingrese la cantidad de goles errados"))));
				x++;
			} else if ("defensor".equals(jugadorElegido.toLowerCase())) {
				jugador.add(new Defensor(JOptionPane.showInputDialog("Ingrese el nombre del jugador:"),
						JOptionPane.showInputDialog("Ingrese el apellido:"),
						Integer.parseInt(JOptionPane.showInputDialog("Ingrese el numero de camiseta:")),
						Integer.parseInt(JOptionPane.showInputDialog("Ingrese el numero de recuperos:")),
						Integer.parseInt(JOptionPane.showInputDialog("Ingrese el numero de pelotas perdidas:"))));
				x++;
			} else if ("arquero".equals(jugadorElegido.toLowerCase())) {
				jugador.add(new Arquero(JOptionPane.showInputDialog("Ingrese el nombre del jugador:"),
						JOptionPane.showInputDialog("Ingrese el apellido:"),
						Integer.parseInt(JOptionPane.showInputDialog("Ingrese el numero de camiseta:")),
						Integer.parseInt(JOptionPane.showInputDialog("Ingrese el numero de pelotas atajadas:")),
						Integer.parseInt(JOptionPane.showInputDialog("Ingrese el numero de goles recibidos"))));
				x++;

			} else {
				JOptionPane.showMessageDialog(null, "No es un tipo de jugador válido", null,
						JOptionPane.WARNING_MESSAGE, null);
			}

		}
		for (Futbolero amiwo : jugador) {
			JOptionPane.showMessageDialog(null, amiwo.toString());
		}
		JOptionPane.showMessageDialog(null, "Basado en calculos matematicos super complejos, el mejor jugador es: "
				+ calculoMejorqueVos(jugador).getNombre());

	}

	public static Futbolero calculoMejorqueVos(ArrayList<Futbolero> jugador) {
		// for (int i=0; i<jugador.size(); i ++) {
		int mejorPuntaje = 0;
		Futbolero mejorJugador = null;
		for (Futbolero juguito : jugador) {
			if (mejorPuntaje < juguito.calculoPuntos()) {
				mejorPuntaje = juguito.calculoPuntos();
				mejorJugador = juguito;
			}

		}
		return mejorJugador;

	}

}
