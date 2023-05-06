package ar.edu.ort.p1.examenes.ds.ortcapital.src;

public class ProcesadorBursatil {

	private final static int CANT_AGENTES = 10;

	private AgenteDeBolsa[] agentes;

	public ProcesadorBursatil() {
		this.agentes = new AgenteDeBolsa[CANT_AGENTES];
		inicializarProcesadorBursatil();
	}

	/**
	 * Ejercicio B: El metodo ingresar del procesador bursatil que recibira como
	 * parametro una solicitud y se encargara de asignar la solicitud al primer
	 * agente que pueda tomar solicitudes, siempre y cuando la solicitud esta en
	 * condiciones de poder ser concretada.
	 * 
	 * @param solicitud
	 * @return
	 */
	public boolean ingresar(Solicitud solicitud) {
		boolean sePudoIngresar = false;
		if (solicitud.sePuedeConcretar()) {
			asignar(solicitud); // validar esto
			sePudoIngresar = true;
		}
		return sePudoIngresar;
	}

	/**
	 * 
	 * @param solicitud
	 * @return
	 */
	private boolean asignar(Solicitud solicitud) {
		int i = 0;
		boolean sePudoAsignar = false;
		while (i < agentes.length && !sePudoAsignar) {
			AgenteDeBolsa agente = agentes[i];
			if (agente.puedeTomarSolicitud()) {
				agente.tomarSolicitud(solicitud);
				sePudoAsignar = true;
			}
			i++;
		}
		return sePudoAsignar;
	}

	/**
	 * Ejercicio C: El metodo cantSolicitudesPorAgenteyTipoDeTitulo que debe
	 * devolver (no mostrar por consola) la cantidad de solicitudes que hay por
	 * agente de bolsa y tipo de titulo.
	 * 
	 * @return
	 */
	public int[][] cantSolicitudesPorAgenteyTipoDeTitulo() {
		int[][] matriz = new int[agentes.length][TipoTitulo.values().length];
		for (int i = 0; i < agentes.length; i++) {
			matriz[i] = agentes[i].cantSolicitudesPorTipoTitulo();
		}
		return matriz;
	}

	/**
	 * Ejercicio D: El metodo listarSolicitudesDeCompra que debe devolver (no
	 * mostrar por consola) una lista de todas las solicitudes de compra ordenadas
	 * por precio ofertado.
	 * 
	 * @return
	 */
	public ListaOrdenadaDeSolicitudesPorPrecioOfertado listarSolicitudesDeCompra() {
		ListaOrdenadaDeSolicitudesPorPrecioOfertado lista = new ListaOrdenadaDeSolicitudesPorPrecioOfertado();
		for (AgenteDeBolsa agente : this.agentes) {
			agente.llenarListaDeSolicitudesDeCompra(lista);
		}
		return lista;
	}

	/*----------------------------------------------------------------------------*/

	// Metodos complementarios

	/**
	 * 
	 */
	private void inicializarProcesadorBursatil() {

		// Creacion de los agentes de bolsa
		this.agentes[0] = new AgenteDeBolsa("Marcela", "SuApellido", "17824001", "MAT005");
		this.agentes[1] = new AgenteDeBolsa("Luis", "SuApellido", "17824001", "MAT029");
		this.agentes[2] = new AgenteDeBolsa("Sabrina", "SuApellido", "17824001", "MAT016");
		this.agentes[3] = new AgenteDeBolsa("Adolfo", "SuApellido", "17824001", "MAT098");
		this.agentes[4] = new AgenteDeBolsa("Ezequiel", "SuApellido", "17824001", "MAT020");
		this.agentes[5] = new AgenteDeBolsa("Joaquin", "SuApellido", "17824001", "MAT074");
		this.agentes[6] = new AgenteDeBolsa("Marcelo", "SuApellido", "17824001", "MAT019");
		this.agentes[7] = new AgenteDeBolsa("Agustin", "SuApellido", "17824001", "MAT067");
		this.agentes[8] = new AgenteDeBolsa("Patricio", "SuApellido", "17824001", "MAT080");
		this.agentes[9] = new AgenteDeBolsa("Jesus", "SuApellido", "17824001", "MAT066");
	}

	/**
	 * Metodo que muestra por consola la matriz generada por el metodo
	 * cantSolicitudesPorAgenteyTipoDeTitulo()
	 */
	public void mostrarCantSolicitudesPorAgenteyTipoDeTitulo() {
		int[][] matriz = cantSolicitudesPorAgenteyTipoDeTitulo();
		System.out.println(
				"Ejercicio C --> Muestro la cantidad de solicitudes que hay por agente de bolsa y tipo de titulo");
		System.out.println("\tBO\tAC\tLE");
		for (int i = 0; i < matriz.length; i++) {
			System.out.print(((this.agentes[i]).getMatriculaCNV()) + "\t");
			for (int j = 0; j < matriz[i].length; j++) {
				System.out.print(matriz[i][j] + "\t");
			}
			System.out.println();
		}
		System.out.println();
	}

	/**
	 * 
	 */
	public void mostrarListaOrdenadaDeSolicitudesPorPrecioOfertado() {
		System.out.println(
				"\nEjercicio D --> Muestro una lista de todas las solicitudes de compra ordenadas por precio ofertado");
		for (Solicitud solicitud : listarSolicitudesDeCompra()) {
			System.out.println(solicitud.toString());
		}
	}

}
