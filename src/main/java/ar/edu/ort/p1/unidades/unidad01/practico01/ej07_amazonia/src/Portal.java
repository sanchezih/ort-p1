package ar.edu.ort.p1.unidades.unidad01.practico01.ej07_amazonia.src;

import java.util.ArrayList;
import java.util.List;

public class Portal {

	private List<Cliente> clientes;
	private List<Producto> productos;

	/*----------------------------------------------------------------------------*/

	/**
	 * 
	 */
	public Portal() {
		this.clientes = new ArrayList<>();
		this.productos = new ArrayList<>();
	}

	/*----------------------------------------------------------------------------*/

	/**
	 * Ejercicio B: La explotacion del metodo procesarPedido de la clase Portal, que
	 * recibe como parametro una instancia de un Cliente y debe:
	 * 
	 * I. Obtener el pedido pendiente del cliente recibido.
	 * 
	 * II. Verificar por cada producto del pedido si posee stock suficiente para
	 * realizarse.
	 * 
	 * III. En caso de no poseer stock suficiente, removerlo del pedido.
	 * 
	 * IV. Devolver una lista de aquellos productos que no pudieron procesarse en el
	 * pedido por falta de stock.
	 * 
	 * @param cliente
	 * @return
	 */
	public List<Producto> procesarPedido(Cliente cliente) {

		List<Producto> lista = new ArrayList<>();
		Pedido pedidoPendiente;

		pedidoPendiente = cliente.getPedidoPendiente(); // Obtengo el pedido pendiente

		if (pedidoPendiente != null && !pedidoPendiente.hayStockSuficiente()) {
			lista = pedidoPendiente.dameListaProductosFaltantes();
		}
		return lista;
	}

	/*----------------------------------------------------------------------------*/

	// Metodos complementarios

	public void agregarCliente(Cliente cliente) {
		this.clientes.add(cliente);
	}

	public void agregarProducto(Producto producto) {
		this.productos.add(producto);
	}
}
