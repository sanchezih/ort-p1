package ar.edu.ort.p1.unidades.u5.practico05.ej08_centro_vacunacion.src;

import ar.edu.ort.p1.util.UtilCola;

public class CentroDeVacunacion {

	private static final int CANT_COLAS = 3;

	private ColaDePersonas[] colasDePersonas;

	/*----------------------------------------------------------------------------*/

	public CentroDeVacunacion() {
		this.colasDePersonas = new ColaDePersonas[CANT_COLAS];
		inicializarColas();
	}

	/*----------------------------------------------------------------------------*/

	/**
	 * Ejercicio B: La explotacion del metodo obtenerColaPorPrioridadYOrden el cual
	 * debe devolver una nueva y unica cola con todos los vacunables a la espera,
	 * pero ordenados por prioridad, dejando las colas anteriores vacias. Ante
	 * igualdad en la prioridad, se desempata por orden de llegada en la cola
	 * correspondiente. Si persiste el empate, es indistinto quien va primero.
	 * 
	 * @return
	 */
	public ColaDePersonas obtenerColaPorPrioridadYOrden() {
		ColaDePersonas colaFinal = new ColaDePersonas();
		ListaDePersonasPorPrioridadYOrden lista = new ListaDePersonasPorPrioridadYOrden();

		// Cargo la lista con las personas de las colas
		cargarLista(lista);

		// Paso los elementos de la lista a la cola que se pretende retornar
		pasarListaAcola(lista, colaFinal);

		return colaFinal;
	}

	/**
	 * Recorre las 3 colas de personas y carga la lista con esas personas ordenadas
	 * por prioridad y orden
	 * 
	 * @param lista
	 */
	private void cargarLista(ListaDePersonasPorPrioridadYOrden lista) {
		for (int i = 0; i < CANT_COLAS; i++) {
			ColaDePersonas cola = this.colasDePersonas[i];
			cargarLista(lista, cola);
		}
	}

	/**
	 * 
	 * @param lista
	 * @param cola
	 */
	private void cargarLista(ListaDePersonasPorPrioridadYOrden lista, ColaDePersonas cola) {
		int orden = 0;
		while (!cola.isEmpty()) {
			Persona persona = cola.remove();
			PersonaEnCola personaEnCola = new PersonaEnCola(persona, persona.getPrioridad(), orden);
			orden++;
			lista.add(personaEnCola);
		}
	}

	/**
	 * 
	 * @param lista
	 * @param cola
	 */
	private void pasarListaAcola(ListaDePersonasPorPrioridadYOrden lista, ColaDePersonas cola) {
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

	public void agregarEnCola(int nroDeCola, Persona persona) {
		this.colasDePersonas[nroDeCola].add(persona);
	}

	public void mostrarColaPorPrioridadYOrden() {
		System.out.println("Muestro la cola por prioridad y orden");
		UtilCola.mostrar(obtenerColaPorPrioridadYOrden());
	}
}
