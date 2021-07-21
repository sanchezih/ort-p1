package ar.edu.ort.p1.u5.practico05.ej08_centro_vacunacion.src;

public class PersonaEnCola {

	private Persona persona;
	private OrdenYPrioridad ordenPrioridad;

	public PersonaEnCola(Persona persona, int orden, int prioridad) {
		setPersona(persona);
		setOrdenPrioridad(orden, prioridad);
	}

	public Persona getPersona() {
		return persona;
	}

	private void setPersona(Persona persona) {
		this.persona = persona;
	}

	public OrdenYPrioridad getOrdenPrioridad() {
		return ordenPrioridad;
	}

	private void setOrdenPrioridad(int orden, int prioridad) {
		ordenPrioridad = new OrdenYPrioridad(orden, prioridad);
	}

}
