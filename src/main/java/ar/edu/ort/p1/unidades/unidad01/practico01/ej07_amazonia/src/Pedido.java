package ar.edu.ort.p1.unidades.unidad01.practico01.ej07_amazonia.src;

import java.util.ArrayList;
import java.util.List;

public class Pedido {

	private String fechaHora;
	private Estado estado;
	private List<ItemPedido> items;

	public Pedido(String fechaHora, List<ItemPedido> items) {
		this.fechaHora = fechaHora;
		this.estado = Estado.PENDIENTE;
		this.items = items;
	}

	public Estado getEstado() {
		return estado;
	}

	/*----------------------------------------------------------------------------*/

	@Override
	public String toString() {
		return "Pedido [fechaHora=" + fechaHora + ", estado=" + estado + ", items=" + items + "]";
	}

	/**
	 * 
	 * @return
	 */
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

	/**
	 * 
	 * @return
	 */
	public List<Producto> dameListaProductosFaltantes() {

		List<Producto> productosFaltantes = new ArrayList<>();
		List<ItemPedido> itemsConStock = new ArrayList<>();

		for (ItemPedido item : this.items) {
			if (!item.hayStockSuficiente()) {
				productosFaltantes.add(item.getProducto());
			} else {
				itemsConStock.add(item);
			}
		}
		this.items = itemsConStock; // Actualizamos la lista de items, quitando los faltantes
		return productosFaltantes;
	}

	/*----------------------------------------------------------------------------*/

	/**
	 * 
	 */
	public void confirmar() {
		descontarStock();
		this.estado = Estado.CONFIRMADO;
	}

	/**
	 * 
	 */
	private void descontarStock() {
		for (ItemPedido item : this.items) {
			item.descontarStock();
		}
	}

}
