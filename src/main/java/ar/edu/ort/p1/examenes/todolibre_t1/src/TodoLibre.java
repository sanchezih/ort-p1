package ar.edu.ort.p1.examenes.todolibre_t1.src;

public class TodoLibre {
	
	private static final int CANT_COMUNAS = 15;
	private ColaOrdenes colaOrdenes;

	public TodoLibre() {
		super();
		this.colaOrdenes = new ColaOrdenes();
	}

	// Ejercicio B
	public int[][] cantEnviosEntreComunas() {

		int[][] informe;
		Orden ordenCentinela;
		Orden orden = null;

		informe = new int[CANT_COMUNAS][CANT_COMUNAS];
		ordenCentinela = new OrdenPuertaAPuerta(0, null, 0, null, null, false);

		colaOrdenes.add(ordenCentinela);
		orden = colaOrdenes.remove();

		while (orden != ordenCentinela) {
			procesarOrden(orden, informe);
			colaOrdenes.add(orden);
			orden = colaOrdenes.remove();
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

	// Ejercicio C
	public ListaOrdenesPorMonto ordenesPuertaPuertaPorMonto() {
		ListaOrdenesPorMonto lista;
		Orden ordenCentinela;
		Orden orden;
		lista = new ListaOrdenesPorMonto();
		ordenCentinela = new OrdenPuertaAPuerta(0, null, 0, null, null, false);

		colaOrdenes.add(ordenCentinela);
		orden = colaOrdenes.remove();
		while (orden != ordenCentinela) {
			procesarOrden(orden, lista);
			colaOrdenes.add(orden);
			orden = colaOrdenes.remove();
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

	/* Metodos extra */

	public void agregarOrden(Orden o) {
		this.colaOrdenes.add(o);
	}

	public void dibujarMatrizDeEnvios() {
		System.out.println("\nEjercicio B\nMuestro la matriz de envios");

		int[][] matLetras = cantEnviosEntreComunas();

		for (int i = 0; i < matLetras.length; i++) {
			for (int j = 0; j < matLetras[i].length; j++) {
				System.out.print(matLetras[i][j] + " ");
			}
			System.out.println();
		}
		System.out.println();
	}

	public void mostrarColaDeOrdenes() {
		System.out.println("\nMuestro como esta la cola de ordenes en este momento...");
		colaOrdenes.add(null);
		Orden o = colaOrdenes.remove();
		while (o != null) {
			System.out.println(o.toString());
			colaOrdenes.add(o);
			o = colaOrdenes.remove();

		}
	}

	public void mostrarOrdenesRetiroSucursalSabadosPorMonto() {
		System.out.println(
				"\nEjercicio C\nMuestro las ordenes Puerta a Puerta con envio gratis ordenadas por monto de forma descendente");
		for (Orden o : ordenesPuertaPuertaPorMonto()) {
			System.out.println(o.toString());
		}
	}

}
