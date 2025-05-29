package ar.edu.ort.p1.unidades.unidad05.practico05.ej08_centro_de_vacunacion.src;

public class PersonaEnCola {

	private Persona persona;
	private PrioridadYOrden prioridadYOrden;

	/*----------------------------------------------------------------------------*/

	/**
	 * 
	 * @param persona
	 * @param prioridad
	 * @param orden
	 */
	public PersonaEnCola(Persona persona, int prioridad, int orden) {
		this.persona = persona;
		this.prioridadYOrden = new PrioridadYOrden(prioridad, orden);
	}

	/*----------------------------------------------------------------------------*/

	public Persona getPersona() {
		return persona;
	}

	public PrioridadYOrden getPrioridadYOrden() {
		return prioridadYOrden;
	}

}
