package edu.ort.u4.tp4.ej04_viajes_tren.src;

import java.util.ArrayList;

public class Empresa {

	private ArrayList<Reserva> reservas;

	public int cantVecesRecorrida(Estacion e) {
		int acuVeces = 0;
		for (Reserva r : this.reservas) {
			acuVeces += r.cantVecesRecorrida(e);
		}
		return acuVeces;
	}

}
