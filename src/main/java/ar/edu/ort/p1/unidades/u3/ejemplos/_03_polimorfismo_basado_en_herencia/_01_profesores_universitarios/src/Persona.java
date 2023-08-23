package ar.edu.ort.p1.unidades.u3.ejemplos._03_polimorfismo_basado_en_herencia._01_profesores_universitarios.src;

public class Persona {

	private String nombre;
	private String apellido;
	private int edad;

	/*----------------------------------------------------------------------------*/

	/**
	 * 
	 */
	public Persona() {
		this.nombre = "";
		this.apellido = "";
		this.edad = 0;
	}

	/**
	 * 
	 * @param nombre
	 * @param apellido
	 * @param edad
	 */
	public Persona(String nombre, String apellido, int edad) {
		this.nombre = nombre;
		this.apellido = apellido;
		this.edad = edad;
	}

	/*----------------------------------------------------------------------------*/

	public String getNombre() {
		return nombre;
	}

	public String getApellido() {
		return apellido;
	}

	@Override
	public String toString() {
		Integer datoEdad = edad;
		return "Nombre completo: ".concat(nombre).concat(" ").concat(apellido).concat("\nEdad: ")
				.concat(datoEdad.toString());
	}
}