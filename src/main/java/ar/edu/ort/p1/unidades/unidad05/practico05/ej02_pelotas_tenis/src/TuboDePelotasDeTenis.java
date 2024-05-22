package ar.edu.ort.p1.unidades.unidad05.practico05.ej02_pelotas_tenis.src;

import ar.edu.ort.p1.unidades.unidad05.ejemplos._02_ds.linear._02_pila._03_impl_linkedlist.src.PilaLinkedList;
import ar.edu.ort.tp1.u5.tda.impl.PilaNodos;
import ar.edu.ort.tp1.u5.tda.interfaces.Pila;

public class TuboDePelotasDeTenis extends PilaNodos<PelotaDeTenis> {

	public final static int MAX_PELOTAS = 3;

	/*----------------------------------------------------------------------------*/

	public TuboDePelotasDeTenis() {
		super(MAX_PELOTAS);
		inicializar();
	}

	/*----------------------------------------------------------------------------*/

	/**
	 * 
	 * @return
	 */
	public boolean hayAlgunaPelotaUsada() {
		boolean hayAlgunaPelotaUsada = false;

		// Trabajar con interfaces. Instanciar clases concretas.
		Pila<PelotaDeTenis> pilaAuxiliar = new PilaLinkedList<>();

		while (!isEmpty() && !hayAlgunaPelotaUsada) {
			PelotaDeTenis pelota = this.pop();
			pilaAuxiliar.push(pelota);
			hayAlgunaPelotaUsada = pelota.getEstado() != Estado.NUEVA;
		}
		while (!pilaAuxiliar.isEmpty()) {
			push(pilaAuxiliar.pop());
		}
		return hayAlgunaPelotaUsada;
	}

	/*----------------------------------------------------------------------------*/

	// Metodos complementarios

	private void inicializar() {
		int cantidad = (int) (Math.random() * 4 + 0);
		System.out.println("Creo un tubo con " + cantidad + " pelotas");
		for (int i = 0; i < cantidad; i++) {
			PelotaDeTenis pelota = new PelotaDeTenis();
			int usos = (int) (Math.random() * 11 + 0);
			for (int j = 0; j < usos; j++) {
				pelota.usar();
			}
			this.push(pelota);
			System.out.println(pelota);
		}
	}
}
