package ar.edu.ort.p1.unidades.unidad02.ejemplos._01_herencia._02_seleccion.src.seleccion;

public class Entrenador extends IntegranteDeSeleccion {

	private String idFederacion;

	/*----------------------------------------------------------------------------*/

	/**
	 * 
	 */
	public Entrenador() {
		super();
	}

	/**
	 * 
	 * @param id
	 * @param nombre
	 * @param apellido
	 * @param edad
	 * @param idFederacion
	 */
	public Entrenador(int id, String nombre, String apellido, int edad, String idFederacion) {
		super(id, nombre, apellido, edad);
		this.idFederacion = idFederacion;
	}

	/*----------------------------------------------------------------------------*/

	/**
	 * 
	 */
	public void dirigirPartido() {
		System.out
				.println("\tSoy " + this.getNombre() + " " + this.getApellido() + " y estoy dirigiendo un partido...");
	}

	/**
	 * 
	 */
	public void dirigirEntrenamiento() {
		System.out.println(
				"\tSoy " + this.getNombre() + " " + this.getApellido() + " y estoy dirigiendo un entrenamiento...");
	}

}
