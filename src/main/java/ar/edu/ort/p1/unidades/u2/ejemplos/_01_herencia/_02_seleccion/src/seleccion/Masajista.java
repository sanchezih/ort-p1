package ar.edu.ort.p1.unidades.u2.ejemplos._01_herencia._02_seleccion.src.seleccion;

public class Masajista extends IntegranteDeSeleccion {

	private String titulo;
	private int aniosExperiencia;

	/*------------------------------------------------------------------------*/

	/**
	 * 
	 */
	public Masajista() {
	}

	/**
	 * 
	 * @param id
	 * @param nombre
	 * @param apellido
	 * @param edad
	 * @param titulo
	 * @param aniosExperiencia
	 */
	public Masajista(int id, String nombre, String apellido, int edad, String titulo, int aniosExperiencia) {
		super(id, nombre, apellido, edad);
		this.titulo = titulo;
		this.aniosExperiencia = aniosExperiencia;
	}

	/*------------------------------------------------------------------------*/

	public void darMasaje() {
		System.out.println("\tSoy " + this.getNombre() + " " + this.getApellido() + " y estoy dando un masaje...");
	}

}
