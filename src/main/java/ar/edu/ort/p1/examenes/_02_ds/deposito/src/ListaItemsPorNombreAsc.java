package ar.edu.ort.p1.examenes._02_ds.deposito.src;

import ar.edu.ort.tp1.u5.tda.impl.ListaOrdenadaNodos;

public class ListaItemsPorNombreAsc extends ListaOrdenadaNodos<String, ItemPedido> {

	@Override
	public int compare(ItemPedido itemPedido1, ItemPedido itemPedido2) {
		return itemPedido1.getNombreProducto().compareTo(itemPedido2.getNombreProducto());
	}

	@Override
	public int compareByKey(String nombre, ItemPedido itemPedido) {
		return nombre.compareTo(itemPedido.getNombreProducto());
	}

}
