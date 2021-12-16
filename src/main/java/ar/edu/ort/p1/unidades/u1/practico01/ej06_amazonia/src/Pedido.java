package ar.edu.ort.p1.unidades.u1.practico01.ej06_amazonia.src;

import java.util.ArrayList;

public class Pedido {

	private String fechaHora;
	private Estado estado;
	private ArrayList<ItemPedido> items;

	/*----------------------------------------------------------------------------*/

	public boolean hayStockSuficiente() {

		boolean haySuficiente = true;
		int i = 0;
		ItemPedido item;

		while (i < this.items.size() && haySuficiente) {
			item = this.items.get(i);
			if (!item.hayStockSuficiente()) {
				haySuficiente = false;
			} else {
				i++;
			}
		}
		return haySuficiente;
	}

	public ArrayList<Producto> dameListaProductosFaltantes() {

		ArrayList<Producto> productosFaltantes = new ArrayList<Producto>();
		ArrayList<ItemPedido> itemsConStock = new ArrayList<ItemPedido>();

		for (ItemPedido item : this.items) {
			if (!item.hayStockSuficiente()) {
				productosFaltantes.add(item.getProducto());
			} else {
				itemsConStock.add(item);
			}
		}
		this.items = itemsConStock; // Actualizamos la lista de items, quitando los faltantes;
		return productosFaltantes;
	}

	/*----------------------------------------------------------------------------*/

	public void confirmar() {
		descontarStock();
		this.estado = Estado.CONFIRMADO;
	}

	private void descontarStock() {
		for (ItemPedido item : this.items) {
			item.descontarStock();
		}
	}

}
