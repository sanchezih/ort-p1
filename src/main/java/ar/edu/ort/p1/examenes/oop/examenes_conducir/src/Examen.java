package ar.edu.ort.p1.examenes.oop.examenes_conducir.src;

public abstract class Examen implements Evaluable {

	private Persona persona;
	private String fecha;

	/*----------------------------------------------------------------------------*/

	/**
	 * 
	 * @param fecha
	 * @param persona
	 */
	public Examen(String fecha, Persona persona) {
		super();
		this.fecha = fecha;
		this.persona = persona;
	}

}
