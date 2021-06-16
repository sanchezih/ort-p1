package edu.ort.p1.u5.practico05.ej08_centro_vacunacion.src;

import edu.ort.tp1.u5.tda.nodos.ColaNodos;

public class CentroVacunacion {

	private static final int CANT_COLAS = 3;

	private ColaDePersonas[] pacientes;

	public CentroVacunacion() {
		this.pacientes = new ColaDePersonas[CANT_COLAS];
	}

	public ColaNodos<Persona> obtenerColaPorPrioridadYOrden() {
		ColaDePersonas colaFinal = new ColaDePersonas();
		ListaPersonasXPrioridadOrden lista = new ListaPersonasXPrioridadOrden();
		cargarLista(lista);
		pasarListaAcola(lista, colaFinal);
		return colaFinal;
	}

	public void cargarColas(ColaDePersonas colaCargar1, ColaDePersonas colaCargar2, ColaDePersonas colaCargar3) {
		pacientes[0] = colaCargar1;
		pacientes[1] = colaCargar2;
		pacientes[2] = colaCargar3;
	}

	private void pasarListaAcola(ListaPersonasXPrioridadOrden lista, ColaDePersonas cola) {
		for (PersonaEnCola personaEnCola : lista) {
			cola.add(personaEnCola.getPersona());
		}
	}

	private void cargarLista(ListaPersonasXPrioridadOrden lista) {
		for (int i = 0; i < CANT_COLAS; i++) {
			ColaDePersonas cola = this.pacientes[i];
			cargarLista(lista, cola);
		}
	}

	private void cargarLista(ListaPersonasXPrioridadOrden lista, ColaDePersonas cola) {
		int orden = 0;
		while (!cola.isEmpty()) {
			Persona persona = cola.remove();
			orden++;
			PersonaEnCola perEnCola = new PersonaEnCola(persona, orden, persona.getprioridad());
			lista.add(perEnCola);
		}
	}

	/*----------------------------------------------------------------------------*/

	/* Metodos extra */

	public void mostrarLista() {
		ColaNodos<Persona> colaFinal = obtenerColaPorPrioridadYOrden();
		colaFinal.add(null);
		Persona persona = colaFinal.remove();
		int i = 0;
		while (persona != null) {
			System.out.print("Turno " + (i + 1) + " ->\t");
			System.out.println(persona);
			colaFinal.add(persona);
			persona = colaFinal.remove();
			i++;
		}
	}
}
