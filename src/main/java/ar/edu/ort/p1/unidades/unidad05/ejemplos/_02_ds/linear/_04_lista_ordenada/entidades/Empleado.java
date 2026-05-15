package ar.edu.ort.p1.unidades.unidad05.ejemplos._02_ds.linear._04_lista_ordenada.entidades;

public class Empleado {

	private String nombre;
	private int edad;
	private Automovil automovil;

	/*----------------------------------------------------------------------------*/

	public Empleado(String nombre, int edad, Automovil automovil) {
		this.nombre = nombre;
		this.edad = edad;
		this.automovil = automovil;
	}

	/*----------------------------------------------------------------------------*/

	public String getNombre() {
		return nombre;
	}

	public int getEdad() {
		return edad;
	}

	public Automovil getAutomovil() {
		return automovil;
	}

	@Override
	public String toString() {
		return "Empleado [nombre=" + nombre + ", \tedad=" + edad + ", \tautomovil=" + automovil + "]";
	}

}
