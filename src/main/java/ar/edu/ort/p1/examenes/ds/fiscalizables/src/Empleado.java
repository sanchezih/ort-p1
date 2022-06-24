package ar.edu.ort.p1.examenes.ds.fiscalizables.src;

import ar.edu.ort.p1.util.Fecha;

public abstract class Empleado implements Fiscalizable {

	private String DNI;
	private int anioIngreso;

	public Empleado(String dNI, int anioIngreso) {
		super();
		DNI = dNI;
		this.anioIngreso = anioIngreso;
	}

	public String getDNI() {
		return DNI;
	}

	public int antiguedad() {
		return Fecha.anioActual() - this.anioIngreso;
	}

	@Override
	public String toString() {
		return "Empleado [DNI=" + DNI + ", anioIngreso=" + anioIngreso + "]";
	}

}
