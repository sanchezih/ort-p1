package ar.edu.ort.p1.examenes.ds.gestor_reclamos_afip.src;

import java.util.ArrayList;

import ar.edu.ort.p1.examenes.ds.gestor_incidentes.src.Empleado;

public class Ciudadano {

	private int dni;
	private String nombre;
	private String apellido;
	private ArrayList<Tributable> bienes;

	public Ciudadano(int dni, String nombre, String apellido) {
		this.dni = dni;
		this.nombre = nombre;
		this.apellido = apellido;
		this.bienes = new ArrayList<Tributable>();
	}

	public int getDni() {
		return dni;
	}

	public double determinarImpuesto() {
		double resultado = 0;
		for (Tributable t : bienes) {
			resultado = resultado + t.determinarImpuesto();
		}
		return resultado;
	}

	/*----------------------------------------------------------------------------*/

	// Metodos complementarios

	public void agregarBien(Tributable bien) {
		this.bienes.add(bien);
	}
}
