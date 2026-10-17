package ar.edu.ort.p1.unidades.unidad05.ejemplos._01_generics._03_metodos_genericos_propios.src.entidades;

public class Persona {

	private String nombre;
	private String apellido;
	private String dni;
	private int edad;

	/*----------------------------------------------------------------------------*/

	public Persona(String nombre, int edad) {
		this.nombre = nombre;
		this.edad = edad;

	}

	public Persona(String nombre, String apellido, String dni) {
		this.nombre = nombre;
		this.apellido = apellido;
		this.dni = dni;
	}

	/*----------------------------------------------------------------------------*/

	public String getNombre() {
		return nombre;
	}

	public int getEdad() {
		return edad;
	}

	public void imprimirDatosPersonales() {
		System.out.println("Nombre:" + nombre);
		System.out.println("Edad:" + edad);
	}

	@Override
	public String toString() {
		return nombre;
	}

}
