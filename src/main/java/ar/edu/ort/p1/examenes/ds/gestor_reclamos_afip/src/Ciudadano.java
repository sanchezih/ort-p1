package ar.edu.ort.p1.examenes.ds.gestor_reclamos_afip.src;

import java.util.ArrayList;

import ar.edu.ort.p1.examenes.ds.gestor_incidentes.src.Empleado;

public class Ciudadano {

	private int dni;
	private String nombre;
	private String apellido;
	private ArrayList<Tributable> bienes;

	/*----------------------------------------------------------------------------*/

	public Ciudadano(int dni, String nombre, String apellido) {
		this.dni = dni;
		this.nombre = nombre;
		this.apellido = apellido;
		this.bienes = new ArrayList<Tributable>();
	}

	/*----------------------------------------------------------------------------*/

	public int getDni() {
		return dni;
	}

	public String getApellido() {
		return apellido;
	}

	public String getNombre() {
		return nombre;
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
