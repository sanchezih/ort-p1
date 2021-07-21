package ar.edu.ort.p1.u3.practico03.tp3_adm_personal.src;

import java.util.Calendar;

public abstract class Empleado {
	private int dni;
	private String nombre;
	private String apellido;
	private int anioIngreso;
	protected double salario;

	public Empleado(int dni, String nombre, String apellido, int anioIngreso) {
		super();
		this.dni = dni;
		this.nombre = nombre;
		this.apellido = apellido;
		this.anioIngreso = anioIngreso;
	}

	public int getDni() {
		return dni;
	}

	public void setDni(int dni) {
		this.dni = dni;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public int getAnioIngreso() {
		return anioIngreso;
	}

	public void setAnioIngreso(int anioIngreso) {
		this.anioIngreso = anioIngreso;
	}

	public String getNombreCompleto() {
		return this.nombre + " " + this.apellido;
	}

	public void mostrarDatos() {
		System.out.println(getNombreCompleto() + " $" + getSalario());
	}

	public int getAniosDeAntiguedad() {
		return Calendar.getInstance().get(Calendar.YEAR) - this.anioIngreso;
	}

	public abstract double getSalario();

}
