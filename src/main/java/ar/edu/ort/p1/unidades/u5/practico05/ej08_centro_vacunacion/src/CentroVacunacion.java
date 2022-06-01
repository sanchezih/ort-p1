package ar.edu.ort.p1.unidades.u5.practico05.ej08_centro_vacunacion.src;

import ar.edu.ort.tp1.u5.tda.nodos.ColaNodos;

public class CentroVacunacion {

	private static final int CANT_COLAS = 3;

	private ColaDePersonas[] colasDePersonas;

	public CentroVacunacion() {
		this.colasDePersonas = new ColaDePersonas[CANT_COLAS];
		inicializarColas();
	}

	/**
	 * Metodo principal
	 * 
	 * @return
	 */
	public ColaNodos<Persona> obtenerColaPorPrioridadYOrden() {
		ColaDePersonas colaFinal = new ColaDePersonas();
		ListaPersonasXPrioridadOrden lista = new ListaPersonasXPrioridadOrden();
		cargarLista(lista);
		pasarListaAcola(lista, colaFinal);
		return colaFinal;
	}

	private void cargarLista(ListaPersonasXPrioridadOrden lista) {
		for (int i = 0; i < CANT_COLAS; i++) {
			ColaDePersonas cola = this.colasDePersonas[i];
			cargarLista(lista, cola);
		}
	}

	private void cargarLista(ListaPersonasXPrioridadOrden lista, ColaDePersonas cola) {
		int orden = 0;
		while (!cola.isEmpty()) {
			Persona persona = cola.remove();
			PersonaEnCola personaEnCola = new PersonaEnCola(persona, orden, persona.getPrioridad());
			orden++;
			lista.add(personaEnCola);
		}
	}

	private void pasarListaAcola(ListaPersonasXPrioridadOrden lista, ColaDePersonas cola) {
		for (PersonaEnCola personaEnCola : lista) {
			cola.add(personaEnCola.getPersona());
		}
	}

	/*----------------------------------------------------------------------------*/

	// Metodos complementarios

	private void inicializarColas() {
		for (int i = 0; i < CANT_COLAS; i++) {
			this.colasDePersonas[i] = new ColaDePersonas();
		}
	}

	public void agregarEnCola(int nroDeCola, Persona p) {
		this.colasDePersonas[nroDeCola].add(p);
	}

	public void mostrarColaPorPrioridadYOrden() {
		ColaNodos<Persona> cola = obtenerColaPorPrioridadYOrden();
		cola.add(null);
		Persona persona = cola.remove();
		int i = 0;
		while (persona != null) {
			System.out.print("Turno " + (i + 1) + " ->\t");
			System.out.println(persona);
			cola.add(persona);
			persona = cola.remove();
			i++;
		}
	}
}
