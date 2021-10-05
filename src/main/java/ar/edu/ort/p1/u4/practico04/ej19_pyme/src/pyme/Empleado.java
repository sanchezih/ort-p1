package ar.edu.ort.p1.u4.practico04.ej19_pyme.src.pyme;

public class Empleado {

	private String dni;
	private String apellido;
	private double sueldo;

	public Empleado(String dni, String apellido, double sueldo) {
		this.dni = dni;
		this.apellido = apellido;
		this.sueldo = sueldo;
	}

	public String getDni() {
		return dni;
	}

	public void setDni(String dni) {
		this.dni = dni;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public double getSueldo() {
		return sueldo;
	}

	public void setSueldo(double sueldo) {
		this.sueldo = sueldo;
	}

}
