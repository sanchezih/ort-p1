package edu.ort.p1.u5.practico05.ej08_centro_vacunacion.src;

public class PersonaEnCola {

	private Persona persona;
	private OrdenYPrioridad ordenPrioridad;

	public PersonaEnCola(Persona persona, int orden, int pri) {
		setPersona(persona);
		setOrdenPrioridad(orden, pri);
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

	private void setOrdenPrioridad(int orden, int pri) {
		ordenPrioridad = new OrdenYPrioridad(orden, pri);
	}

}
