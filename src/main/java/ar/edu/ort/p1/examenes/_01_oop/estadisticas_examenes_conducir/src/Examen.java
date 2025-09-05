package ar.edu.ort.p1.examenes._01_oop.estadisticas_examenes_conducir.src;

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
		this.fecha = fecha;
		this.persona = persona;
	}

}
