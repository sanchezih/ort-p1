package ar.edu.ort.p1.u1.practico01.ej10_ortland.src;

import java.util.ArrayList;

public class Juego {

	private String nombre;
	private ArrayList<Mesa> mesas;

	public String getNombre() {
		return nombre;
	}

	public int dameLugaresDisp() {
		int cantLugares = 0;

		for (Mesa m : this.mesas) {
			cantLugares += m.dameLugaresDisp();
		}
		return cantLugares;
	}

	public Resultado acomodarJugador(String nombreJugador, int edad) {
		Resultado res = Resultado.SIN_DISPONIBILIDAD;
		int i = 0;
		Mesa mesa = mesaConMasParticipantes();

		if (mesa != null) {
			mesa.agregarParticipante(new Participante(nombreJugador, edad));
			res = Resultado.ASIGNACION_OK;
		}

		return res;
	}

	private Mesa mesaConMasParticipantes() {
		int maxParticipantes = -1;
		Mesa mesaMax = null;

		for (Mesa m : this.mesas) {
			int cant = m.cantParticipantes();

		}
		return null;
	}

}
