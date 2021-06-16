package edu.ort.p1.u5.practico05.ej08_centro_vacunacion.src;

public class PersonaEnCola {

	private Persona laPersona;
	private OrdenYPrioridad OrdPri;

	public PersonaEnCola(Persona p, int orden, int pri) {
		setLaPersona(p);
		setOrdPri(orden, pri);
	}

	public Persona getLaPersona() {
		return laPersona;
	}

	private void setLaPersona(Persona laPersona) {
		this.laPersona = laPersona;
	}

	public OrdenYPrioridad getOrdPri() {
		return OrdPri;
	}

	private void setOrdPri(int orden, int pri) {
		OrdPri = new OrdenYPrioridad(orden, pri);
	}

}
