package edu.ort.p1.extra.exa._2021c1._2p.tema1.resuelto.src;

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
		Orden ordenCent;
		Orden orden = null;

		informe = new int[CANT_COMUNAS][CANT_COMUNAS];
		ordenCent = new OrdenPuertaAPuerta(0, null, 0, null, null, false);

		colaOrdenes.add(ordenCent);
		orden = colaOrdenes.remove();

		while (orden != ordenCent) {
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
		Orden e;
		Orden orden;
		lista = new ListaOrdenesPorMonto();
		e = new OrdenPuertaAPuerta(0, null, 0, null, null, false);

		colaOrdenes.add(e);
		orden = colaOrdenes.remove();
		while (orden != e) {
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
		System.out.println("\nEjercicio C\nMuestro ordenesPuertaPuertaPorMonto");
		for (Orden o : ordenesPuertaPuertaPorMonto()) {
			System.out.println(o.toString());
		}
	}

}
