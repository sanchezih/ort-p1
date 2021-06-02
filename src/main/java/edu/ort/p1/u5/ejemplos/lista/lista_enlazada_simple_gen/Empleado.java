package edu.ort.p1.u5.ejemplos.lista.lista_enlazada_simple_gen;

public class Empleado {

	private String nombre;
	private int edad;
	private String puesto;

	public Empleado(String nombre, int edad, String puesto) {
		super();
		this.nombre = nombre;
		this.edad = edad;
		this.puesto = puesto;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	public String getPuesto() {
		return puesto;
	}

	public void setPuesto(String puesto) {
		this.puesto = puesto;
	}

	@Override
	public String toString() {
		return "Empleado [" + nombre + "]";
	}

}
