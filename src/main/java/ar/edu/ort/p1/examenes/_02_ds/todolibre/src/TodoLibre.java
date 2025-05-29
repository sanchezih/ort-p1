package ar.edu.ort.p1.examenes._02_ds.todolibre.src;

import ar.edu.ort.p1.util.UtilCola;

public class TodoLibre {

	private static final int CANT_COMUNAS = 15;
	private ColaDeOrdenes colaDeOrdenes;

	public TodoLibre() {
		super();
		this.colaDeOrdenes = new ColaDeOrdenes();
	}

	/*----------------------------------------------------------------------------*/

	/**
	 * Ejercicio B: El metodo cantEnviosEntreComunas que debe devolver (no mostrar
	 * por consola) la cantidad de envios a realizar desde cada una de las 15
	 * comunas hacia las demas, incluyendo la misma (los envios dentro de la misma
	 * comuna son muy frecuentes).
	 * 
	 * @return
	 */
	public int[][] cantEnviosEntreComunas() {

		int[][] informe;
		Orden ordenCentinela;
		Orden orden = null;

		informe = new int[CANT_COMUNAS][CANT_COMUNAS];
		ordenCentinela = new OrdenPuertaAPuerta(0, null, 0, null, null, false);

		colaDeOrdenes.add(ordenCentinela);
		orden = colaDeOrdenes.remove();

		while (orden != ordenCentinela) {
			procesarOrden(orden, informe);
			colaDeOrdenes.add(orden);
			orden = colaDeOrdenes.remove();
		}
		return informe;
	}

	private void procesarOrden(Orden orden, int[][] informe) {
		int desde = -1;
		int hasta = -1;

		desde = orden.getDomicilioOrigen().getComuna() - 1;
		hasta = orden.getDomicilioEntrega().getComuna() - 1;
		informe[desde][hasta]++;
	}

	/*----------------------------------------------------------------------------*/

	/**
	 * Ejercicio C: El metodo ordenesPuertaPuertaGratisPorMonto() que debe devolver
	 * (no mostrar por consola) todas las ordenes Puerta a Puerta con envio gratis
	 * ordenadas por monto de forma descendente.
	 * 
	 * @return
	 */

	public ListaOrdenesPorMonto ordenesPuertaPuertaGratisPorMonto() {
		ListaOrdenesPorMonto lista = new ListaOrdenesPorMonto();
		Orden ordenCentinela = new OrdenPuertaAPuerta(0, null, 0, null, null, false);
		Orden orden;

		colaDeOrdenes.add(ordenCentinela);
		orden = colaDeOrdenes.remove();
		while (orden != ordenCentinela) {
			procesarOrden(orden, lista);
			colaDeOrdenes.add(orden);
			orden = colaDeOrdenes.remove();
		}
		return lista;
	}

	private void procesarOrden(Orden orden, ListaOrdenesPorMonto lista) {
		OrdenPuertaAPuerta ordenPaP;

		if (orden instanceof OrdenPuertaAPuerta) {
			ordenPaP = (OrdenPuertaAPuerta) orden;
			if (ordenPaP.hasEnvioGratis()) {
				lista.add(ordenPaP);
			}
		}
	}

	/*----------------------------------------------------------------------------*/

	// Metodos complementarios

	public void agregarOrden(Orden orden) {
		this.colaDeOrdenes.add(orden);
	}

	/**
	 * 
	 */
	public void mostrarColaDeOrdenes() {
		System.out.println("Muestro como esta la cola de ordenes en este momento...");
		UtilCola.mostrarColaGenerica(colaDeOrdenes);
	}

	/**
	 * 
	 */
	public void dibujarMatrizDeEnvios() {
		System.out.println("\nEjercicio B: Muestro la matriz de envios");

		int[][] matLetras = cantEnviosEntreComunas();

		for (int i = 0; i < matLetras.length; i++) {
			for (int j = 0; j < matLetras[i].length; j++) {
				System.out.print(matLetras[i][j] + " ");
			}
			System.out.println();
		}
		System.out.println();
	}

	public void mostrarOrdenesPuertaPuertaGratisPorMonto() {
		System.out.println(
				"Ejercicio C: Muestro las ordenes Puerta a Puerta con envio gratis ordenadas por monto (DESC)");
		for (Orden orden : ordenesPuertaPuertaGratisPorMonto()) {
			System.out.println("\t-> " + orden.toString());
		}
		System.out.println();
	}

}
