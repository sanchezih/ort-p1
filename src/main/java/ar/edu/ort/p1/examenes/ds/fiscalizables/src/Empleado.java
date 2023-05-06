package ar.edu.ort.p1.examenes.ds.fiscalizables.src;

import ar.edu.ort.p1.util.Fecha;

public abstract class Empleado implements Fiscalizable {

	private String dni;
	private int anioIngreso;

	/*----------------------------------------------------------------------------*/

	public Empleado(String dni, int anioIngreso) {
		super();
		this.dni = dni;
		this.anioIngreso = anioIngreso;
	}

	/*----------------------------------------------------------------------------*/

	public String getDni() {
		return this.dni;
	}

	public int antiguedad() {
		return Fecha.anioActual() - this.anioIngreso;
	}

	@Override
	public String toString() {
		return "Empleado [dni=" + dni + ", anioIngreso=" + anioIngreso + "]";
	}

}
