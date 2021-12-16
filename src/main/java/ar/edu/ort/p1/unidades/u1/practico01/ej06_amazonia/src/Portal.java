package ar.edu.ort.p1.unidades.u1.practico01.ej06_amazonia.src;

import java.util.ArrayList;

public class Portal {
	private ArrayList<Cliente> clientes;
	private ArrayList<Producto> productos;

	/**
	 * Ejercicio B: La explotacion del metodo procesarPedido de la clase Portal, que
	 * recibe como parametro una instancia de un Cliente y debe: I. Obtener el
	 * pedido pendiente del cliente recibido. II. Verificar por cada producto del
	 * pedido si posee stock suficiente para realizarse. III. En caso de no poseer
	 * stock suficiente, removerlo del pedido. IV. Devolver una lista de aquellos
	 * productos que no pudieron procesarse en el pedido por falta de stock.
	 * 
	 * @param cliente
	 * @return
	 */
	public ArrayList<Producto> procesarPedido(Cliente cliente) {

		ArrayList<Producto> lista = new ArrayList<Producto>();
		Pedido pedidoPendiente;

		pedidoPendiente = cliente.getPedidoPendiente();
		if (pedidoPendiente != null && !pedidoPendiente.hayStockSuficiente()) {
			lista = pedidoPendiente.dameListaProductosFaltantes();
		}
		return lista;
	}
}
