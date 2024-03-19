package ar.edu.ort.p1.unidades.unidad01.practico01.ej08_ortparking.src;

import java.util.ArrayList;
import java.util.List;

public class Vehiculo {

	private String patente;
	private Llave llave;
	private List<Persona> autorizados;

	/*----------------------------------------------------------------------------*/

	/**
	 * 
	 * @param patente
	 */
	public Vehiculo(String patente) {
		this.patente = patente;
		this.autorizados = new ArrayList<Persona>();
	}

	/*----------------------------------------------------------------------------*/

	public String getPatente() {
		return patente;
	}

	/*----------------------------------------------------------------------------*/

	/**
	 * 
	 * @param dni
	 * @return
	 */
	public boolean esPersonaAutorizada(String dni) {
		int i = 0;
		boolean estaAutorizada = false;
		Persona aux;

		while (i < this.autorizados.size() && !estaAutorizada) {
			aux = this.autorizados.get(i);
			// estaAutorizada=aux.getDni() == DNI
		}

		return false; // Para test devuelve siempre false
	}

	/*----------------------------------------------------------------------------*/

	/**
	 * Metodo ya desarrollado que permite devolver la cantidad de meses que adeuda
	 * llamado getMesesAdeudados().
	 * 
	 * @return
	 */
	public int getMesesAdeudados() {
		return 2; // Para test devuelve siempre 2
	}
}
