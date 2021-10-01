package ar.edu.ort.p1.extra.examenes._2021c2._1p_gestionauditorias.tema1.src;

public class Empleado {
	private String nombre;
	private String apellido;
	private int legajo;

	public Empleado(String nombre, String apellido, int legajo) {
		super();
		this.nombre = nombre;
		this.apellido = apellido;
		this.legajo = legajo;
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

	public int getLegajo() {
		return legajo;
	}

	public void setLegajo(int legajo) {
		this.legajo = legajo;
	}

	public void mostrar() {
		System.out.println("Nombre: " + nombre + " Apellido: " + apellido + " Legajo: " + legajo);
	}

}
