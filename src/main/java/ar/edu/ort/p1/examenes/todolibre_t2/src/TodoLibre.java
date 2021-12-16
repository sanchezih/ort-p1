package ar.edu.ort.p1.examenes.todolibre_t2.src;

import ar.edu.ort.p1.examenes.todolibre_t2.src.listasordenadas.ListaOrdenesPorMonto;
import ar.edu.ort.p1.examenes.todolibre_t2.src.listasordenadas.ListaOrdenesPorPrioridad;

public class TodoLibre {

	private final static int CANT_COMUNAS = 15;
	private ColaOrdenes colaOrdenes;

	public TodoLibre() {
		super();
		this.colaOrdenes = new ColaOrdenes();
	}

	/**
	 * B) El metodo reordenarPorPrioridad que debe reordenar todas las ordenes de
	 * acuerdo con su prioridad (las de mayor prioridad van primero).
	 */
	public void reordenarPorPrioridad() {
		System.out.println("\nEjercicio B\n--> Reordeno las ordenes por prioridad...");

		ListaOrdenesPorPrioridad lista = new ListaOrdenesPorPrioridad();

		while (!colaOrdenes.isEmpty()) {
			lista.add(colaOrdenes.remove());
		}
		for (Orden o : lista) {
			colaOrdenes.add(o);
		}

		System.out.println("--> Hecho.");
	}

	/**
	 * C) El metodo ordenesRetiroSucursalSabadosPorMonto que debe devolver (no
	 * mostrar por consola) (dejando todas las ordenes en su estado original) todas
	 * las ordenes Retiro Sucursal cuya sucursal trabaje los sabados, ordenadas por
	 * monto de forma descendente.
	 */

	public ListaOrdenesPorMonto ordenesRetiroSucursalPorMonto() {

		ListaOrdenesPorMonto lista = new ListaOrdenesPorMonto();
		Orden flag = new OrdenPuertaPuerta(0, null, 0, null, false);
		Orden actual;

		colaOrdenes.add(flag);
		actual = colaOrdenes.remove();

		while (actual != flag) {
			procesarOrden(actual, lista);
			colaOrdenes.add(actual);
			actual = colaOrdenes.remove();
		}

		return lista;
	}

	private void procesarOrden(Orden orden, ListaOrdenesPorMonto lista) {
		OrdenRetiroSucursal ordenSuc;
		if (orden instanceof OrdenRetiroSucursal) {
			ordenSuc = (OrdenRetiroSucursal) orden;
			if (ordenSuc.isTrabajaSabados()) {
				lista.add(ordenSuc);
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
		System.out.println(
				"\nEjercicio C\nMuestro ordenes Retiro Sucursal cuya sucursal trabaje los sabados, ordenadas por monto de forma descendente");
		for (Orden o : ordenesRetiroSucursalPorMonto()) {
			System.out.println(o.toString());
		}
	}
}
