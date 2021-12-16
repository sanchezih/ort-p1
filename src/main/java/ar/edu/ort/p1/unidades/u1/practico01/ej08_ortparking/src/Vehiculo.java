package ar.edu.ort.p1.unidades.u1.practico01.ej08_ortparking.src;

import java.util.ArrayList;

public class Vehiculo {

	private String patente;
	private Llave llave;
	private ArrayList<Persona> autorizados;

	public String getPatente() {
		return patente;
	}

	public Vehiculo(String patente) {
		this.patente = patente;
		this.autorizados = new ArrayList<Persona>();
	}

	public boolean esPersonaAutorizada(String p) {
		return false;

	}

	/**
	 * Tambien cada vehiculo cuenta con un metodo ya desarrollado que permite
	 * devolver la cantidad de meses que adeuda llamado getMesesAdeudados().
	 * 
	 * @return
	 */
	public int getMesesAdeudados() {

		return 2;
	}
}
