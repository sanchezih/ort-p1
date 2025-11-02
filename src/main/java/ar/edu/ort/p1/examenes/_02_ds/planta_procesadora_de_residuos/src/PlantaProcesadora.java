package ar.edu.ort.p1.examenes._02_ds.planta_procesadora_de_residuos.src;

public class PlantaProcesadora {
	private static final int CANT_FILA = 4;
	private static final int CANT_MAX = 2;

	private PilaDeResiduo[][] terreno;
	private ColaDeResiduo[] canieriaTransporte;

	/*----------------------------------------------------------------------------*/

	public PlantaProcesadora() {
		this.terreno = new PilaDeResiduo[CANT_FILA][TipoDeResiduo.values().length];
		this.canieriaTransporte = new ColaDeResiduo[TipoDeResiduo.values().length];

		inicializarTerreno();
		inicializarCanieriaTransporte();
	}

	/*----------------------------------------------------------------------------*/

	private void inicializarCanieriaTransporte() {
		for (int i = 0; i < CANT_FILA; i++) {
			for (int j = 0; j < TipoDeResiduo.values().length; j++) {
				this.terreno[i][j] = new PilaDeResiduo(CANT_MAX);
			}
		}
	}

	private void inicializarTerreno() {
		for (int i = 0; i < TipoDeResiduo.values().length; i++) {
			this.canieriaTransporte[i] = new ColaDeResiduo();
		}
	}

	/**
	 * Recibe un residuo e intenta agregarlo en la primera posicion libre en la
	 * parte del terreno que le corresponda.
	 * 
	 * Devuelve true si pudo hacerlo (falso si no pudo).
	 * 
	 * @param residuo
	 * @return
	 */
	public boolean agregarResiduo(Residuo residuo) {
		int i = 0;
		boolean pudeAgregar = false;
		PilaDeResiduo pilaActual = null;
		int numeroColumna = residuo.getTipoDeResiduo().ordinal();

		while (i < CANT_FILA && !pudeAgregar) {
			pilaActual = this.terreno[i][numeroColumna];
			if (!pilaActual.isFull()) {
				pilaActual.push(residuo);
				pudeAgregar = true;
			} else {
				i++;
			}
		}
		return pudeAgregar;
	}

	/*----------------------------------------------------------------------------*/

	/**
	 * Extrae del terreno todos los residuos del tipo indicado por el parametro y
	 * los procesa para ingresarlos finalmente a la canieria correspondiente
	 * siguiendo el criterio establecido mas arriba.
	 * 
	 * @param tipoDeResiduo
	 */
	public void clasificar(TipoDeResiduo tipoDeResiduo) {
		ListaResiduoOrdenada residuosOrdenados = new ListaResiduoOrdenada();
		PilaDeResiduo residuosApilados;

		for (int i = 0; i < CANT_FILA; i++) {
			residuosApilados = this.terreno[i][tipoDeResiduo.ordinal()];
			extraerResiduos(residuosApilados, residuosOrdenados);
		}
		enviarResiduosCanieria(residuosOrdenados, tipoDeResiduo);
	}

	private void extraerResiduos(PilaDeResiduo pilaResiduos, ListaResiduoOrdenada residuosOrdenados) {
		while (!pilaResiduos.isEmpty()) {
			residuosOrdenados.add(pilaResiduos.pop());
		}
	}

	private void enviarResiduosCanieria(ListaResiduoOrdenada residuosOrdenados, TipoDeResiduo tipoDeResiduo) {
		while (!residuosOrdenados.isEmpty()) {
			this.canieriaTransporte[tipoDeResiduo.ordinal()].add(residuosOrdenados.removeAt(0));
		}

	}

	/*----------------------------------------------------------------------------*/

	public void mostrarTerreno() {
		System.out.println("=== Terreno de la Planta ===");

		// Encabezado
		System.out.print("Fila\\Tipo");
		for (TipoDeResiduo tipo : TipoDeResiduo.values()) {
			System.out.print("\t" + tipo.name());
		}
		System.out.println();

		// Contenido
		for (int i = 0; i < 4; i++) {
			System.out.print("Fila " + i);
			for (int j = 0; j < TipoDeResiduo.values().length; j++) {
				PilaDeResiduo pila = terreno[i][j];
				String estado = pila.isEmpty() ? "Vacia" : (pila.isFull() ? "Llena" : "Parcial");
				System.out.print("\t" + estado);
			}
			System.out.println();
		}
	}

}
