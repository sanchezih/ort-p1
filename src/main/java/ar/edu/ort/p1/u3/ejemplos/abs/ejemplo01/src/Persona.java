package ar.edu.ort.p1.u3.ejemplos.abs.ejemplo01.src;

public class Persona {

	private String nombre;
	private String apellido;
	private int edad;

	// Constructores
	public Persona() {
		nombre = "";
		apellido = "";
		edad = 0;
	}

	public Persona(String nombre, String apellido, int edad) {
		this.nombre = nombre;
		this.apellido = apellido;
		this.edad = edad;
	}

	// Metodos
	public String getNombre() {
		return nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public int getEdad() {
		return edad;
	}

	public String toString() {
		Integer datoEdad = edad;
		return "Nombre completo: ".concat(nombre).concat(" ").concat(apellido).concat("\nEdad: ")
				.concat(datoEdad.toString());
	}
}