package ar.edu.ort.p1.unidades.u5.practico05.ej08_centro_vacunacion.src;

public class PersonaEnCola {

	private Persona persona;
	private OrdenYPrioridad ordenPrioridad;

	public PersonaEnCola(Persona persona, int orden, int prioridad) {
		this.persona = persona;
		this.ordenPrioridad = new OrdenYPrioridad(orden, prioridad);
	}

	public Persona getPersona() {
		return persona;
	}

	public OrdenYPrioridad getOrdenPrioridad() {
		return ordenPrioridad;
	}

}
