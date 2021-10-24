package ar.edu.ort.p1.u4.practico04.ej04_viajes_tren.src;

import java.util.ArrayList;

public class Empresa {

	private ArrayList<Reserva> reservas;

	public Empresa() {
		this.reservas = new ArrayList<Reserva>();
	}

	/*----------------------------------------------------------------------------*/

	public double recaudacionTotal() {
		double acu = 0;
		for (Reserva r : this.reservas) {
			acu += r.getPrecio();
		}
		return acu;
	}

	/*----------------------------------------------------------------------------*/

	public int cantVecesRecorrida(Estacion e) {
		int acuVeces = 0;
		for (Reserva r : this.reservas) {
			acuVeces += r.cantVecesRecorrida(e);
		}
		return acuVeces;
	}

	/*----------------------------------------------------------------------------*/
	/* Metodos extra */

	public void agregarReserva(Reserva r) {
		this.reservas.add(r);
	}
}
