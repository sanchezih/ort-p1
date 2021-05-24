package edu.ort.u4.tp4.ej04_viajes_tren.src;

import java.util.ArrayList;

public class Empresa {

	private ArrayList<Reserva> reservas;

	public Empresa(ArrayList<Reserva> reservas) {
		super();
		this.reservas = reservas;
	}

	public ArrayList<Reserva> getReservas() {
		return reservas;
	}

	public void setReservas(ArrayList<Reserva> reservas) {
		this.reservas = reservas;
	}

	public int cantVecesRecorrida(Estacion e) {
		int acuVeces = 0;
		for (Reserva r : this.reservas) {
			acuVeces += r.cantVecesRecorrida(e);
		}
		return acuVeces;
	}

	public double recaudacionTotal() {
		double acu = 0;
		for (Reserva r : this.reservas) {
			acu += r.getPrecio();
		}
		return acu;
	}
}
