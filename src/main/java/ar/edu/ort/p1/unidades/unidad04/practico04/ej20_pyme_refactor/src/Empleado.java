package ar.edu.ort.p1.unidades.unidad04.practico04.ej20_pyme_refactor.src;

public class Empleado {

	private String dni;
	private String apellido;
	private double sueldo;

	/*----------------------------------------------------------------------------*/

	public Empleado(String dni, String apellido, double sueldo) {
		this.dni = dni;
		this.apellido = apellido;
		this.sueldo = sueldo;
	}

	/*----------------------------------------------------------------------------*/

	public String getDni() {
		return dni;
	}

	public double getSueldo() {
		return sueldo;
	}

	@Override
	public String toString() {
		return "Empleado [dni=" + dni + ", apellido=" + apellido + ", sueldo=" + sueldo + "]";
	}

}
