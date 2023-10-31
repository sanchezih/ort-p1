package ar.edu.ort.p1.examenes.ds.fiscalizador_de_empleados.src;

import ar.edu.ort.p1.util.Fecha;

public abstract class Empleado implements Fiscalizable {

	private String dni;
	private int anioDeIngreso;

	/*----------------------------------------------------------------------------*/

	public Empleado(String dni, int anioDeIngreso) {
		this.dni = dni;
		this.anioDeIngreso = anioDeIngreso;
	}

	/*----------------------------------------------------------------------------*/

	public String getDni() {
		return this.dni;
	}

	public int getAntiguedad() {
		return Fecha.getAnioActual() - this.anioDeIngreso;
	}

	@Override
	public String toString() {
		return "Empleado [dni=" + dni + ", anioDeIngreso=" + anioDeIngreso + "]";
	}

}
