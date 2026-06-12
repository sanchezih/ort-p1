package ar.edu.ort.p1.examenes._02_ds.gestor_reclamos_afip.src;

import java.util.ArrayList;
import java.util.List;

public class Ciudadano {

	private int dni;
	private String nombre;
	private String apellido;
	private List<Tributable> bienes;

	/*----------------------------------------------------------------------------*/

	public Ciudadano(int dni, String nombre, String apellido) {
		this.dni = dni;
		this.nombre = nombre;
		this.apellido = apellido;
		this.bienes = new ArrayList<>();
	}

	/*----------------------------------------------------------------------------*/

	public int getDni() {
		return dni;
	}

	@Override
	public String toString() {
		return "Ciudadano [dni=" + dni + ", apellido=" + apellido + "]";
	}

	/**
	 * Ejercicio B: El metodo determinarImpuesto(), de la/s clase/s que corresponda,
	 * que debe devolver (no mostrar por consola) el monto a abonar en impuestos.
	 * 
	 * @return
	 */
	public double determinarImpuesto() {
		double resultado = 0;
		for (Tributable tributable : this.bienes) {
			resultado = resultado + tributable.determinarImpuesto();
		}
		return resultado;
	}

	/*----------------------------------------------------------------------------*/

	// Metodos complementarios

	public void agregarBien(Tributable bien) {
		this.bienes.add(bien);
	}
}
