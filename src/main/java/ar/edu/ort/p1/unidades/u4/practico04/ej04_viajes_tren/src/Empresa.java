package ar.edu.ort.p1.unidades.u4.practico04.ej04_viajes_tren.src;

import java.util.ArrayList;

public class Empresa {

	private ArrayList<Reserva> reservas;

	/*----------------------------------------------------------------------------*/

	public Empresa() {
		this.reservas = new ArrayList<Reserva>();
	}

	/*----------------------------------------------------------------------------*/

	/**
	 * Ejercicio B: La explotacion del metodo recaudacionTotal que retorne el monto
	 * total recaudado segun el precio de todas las reservas.
	 * 
	 * @return
	 */
	public double recaudacionTotal() {
		double acu = 0;
		for (Reserva r : this.reservas) {
			acu += r.getPrecio();
		}
		return acu;
	}

	/*----------------------------------------------------------------------------*/

	/**
	 * Ejercicio C: La explotacion del metodo cantVecesRecorrida que reciba una
	 * estacion por parametro y retorne cuantas personas pasaran por esa estacion,
	 * de acuerdo a las reservas existentes.
	 * 
	 * @param estacion
	 * @return
	 */
	public int cantVecesRecorrida(Estacion estacion) {
		int acuVeces = 0;
		for (Reserva reserva : this.reservas) {
			acuVeces += reserva.cantVecesRecorrida(estacion);
		}
		return acuVeces;
	}

	/*----------------------------------------------------------------------------*/

	// Metodos complementarios

	public void agregarReserva(Reserva reserva) {
		this.reservas.add(reserva);
	}
}
