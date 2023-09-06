package ar.edu.ort.p1.unidades.u2.ejemplos._01_herencia._02_seleccion.src.seleccion;

public class IntegranteDeSeleccion {

	protected int id;
	protected String nombre;
	protected String apellido;
	protected int edad;

	/*----------------------------------------------------------------------------*/

	/**
	 * 
	 */
	public IntegranteDeSeleccion() {
	}

	/**
	 * 
	 * @param id
	 * @param nombre
	 * @param apellido
	 * @param edad
	 */
	public IntegranteDeSeleccion(int id, String nombre, String apellido, int edad) {
		this.id = id;
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

	public void concentrarse() {
		System.out.println("\tSoy " + this.getNombre() + " " + this.getApellido() + " y estoy concentrandome...");
	}

	public void viajar() {
		System.out.println("\tSoy " + this.getNombre() + " " + this.getApellido() + " y estoy viajando...");
	}

}
