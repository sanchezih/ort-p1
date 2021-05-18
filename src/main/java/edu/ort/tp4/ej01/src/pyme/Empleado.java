package edu.ort.tp4.ej01.src.pyme;

public class Empleado {

	private String dni;
	private String apellido;
	private double sueldo;

	public Empleado(String dni, String apellido, double sueldo) {
		super();
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
