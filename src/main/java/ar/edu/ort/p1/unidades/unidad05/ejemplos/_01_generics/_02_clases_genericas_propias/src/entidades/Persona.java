package ar.edu.ort.p1.unidades.unidad05.ejemplos._01_generics._02_clases_genericas_propias.src.entidades;

public class Persona {

	private static final int LIMITE_MENOR_EDAD = 18;

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

	/**
	 * 
	 * @return
	 */
	public final boolean esMayor() {
		boolean esMayor = false;
		if (edad >= LIMITE_MENOR_EDAD) {
			esMayor = true;
		}
		return esMayor;
	}

	@Override
	public String toString() {
		return nombre;
	}

}
