package ar.edu.ort.p1.unidades.unidad02.ejemplos._01_herencia._02_seleccion.src.seleccion;

public class Futbolista extends IntegranteDeSeleccion {

	private int dorsal;
	private String demarcacion;

	/*----------------------------------------------------------------------------*/
	
	/**
	 * 
	 */
	public Futbolista() {
		super();
	}

	/**
	 * 
	 * @param id
	 * @param nombre
	 * @param apellido
	 * @param edad
	 * @param dorsal
	 * @param demarcacion
	 */
	public Futbolista(int id, String nombre, String apellido, int edad, int dorsal, String demarcacion) {
		super(id, nombre, apellido, edad);
		this.dorsal = dorsal;
		this.demarcacion = demarcacion;
	}

	/*----------------------------------------------------------------------------*/

	public void jugarPartido() {
		System.out.println("\tSoy " + this.getNombre() + " " + this.getApellido() + " y estoy jugando un partido...");
	}

	public void entrenar() {
		System.out.println("\tSoy " + this.getNombre() + " " + this.getApellido() + " y estoy entrenando...");
	}

}
