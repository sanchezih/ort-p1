package ar.edu.ort.p1.examenes._02_ds.deposito.src;

import ar.edu.ort.tp1.u5.tda.interfaces.ListaOrdenada;

public class Pedido {

	private String empresaSolicitante;
	private Prioridad prioridad;
	private ListaOrdenada<String, ItemPedido> items;

	/*----------------------------------------------------------------------------*/

	public Pedido(String empresaSolicitante, Prioridad prioridad, ListaOrdenada<String, ItemPedido> items) {
		this.empresaSolicitante = empresaSolicitante;
		this.prioridad = prioridad;
		this.items = items;
	}

	/*----------------------------------------------------------------------------*/

	/**
	 * 
	 * @param valores
	 */
	public void sumarPrioridades(int[] valores) {
		int indicePrioridad = this.prioridad.ordinal();

		for (ItemPedido itemPedido : this.items) {
			valores[indicePrioridad] += itemPedido.getCantidad();
		}
	}

}
