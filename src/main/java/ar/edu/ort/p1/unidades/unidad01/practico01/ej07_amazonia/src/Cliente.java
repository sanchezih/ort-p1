package ar.edu.ort.p1.unidades.unidad01.practico01.ej07_amazonia.src;

import java.util.List;

public class Cliente {

	private String nombre;
	private String apellido;
	private String direccion;
	private String email;
	private String telefono;
	private Historial historial;

	/*----------------------------------------------------------------------------*/

	/**
	 * 
	 * @param nombre
	 * @param apellido
	 * @param direccion
	 * @param email
	 * @param telefono
	 */
	public Cliente(String nombre, String apellido, String direccion, String email, String telefono) {
		this.nombre = nombre;
		this.apellido = apellido;
		this.direccion = direccion;
		this.email = email;
		this.telefono = telefono;
		this.historial = new Historial();
	}

	/*----------------------------------------------------------------------------*/

	public String getNombre() {
		return nombre;
	}

	public Historial getHistorial() {
		return historial;
	}

	/**
	 * Devuelve el pedido en estado PENDIENTE que tiene el cliente o null si no
	 * tuviera ninguno (Cada cliente puede tener un solo pedido en estado PENDIENTE
	 * a la vez).
	 * 
	 * @return
	 */
	public Pedido getPedidoPendiente() {
		
		Pedido pedidoPendienteADevolver = null;
		int i = 0;
		List<Pedido> pedidos = this.historial.getPedidos();

		while (i < pedidos.size() && pedidoPendienteADevolver == null) {
			if (pedidos.get(i).getEstado() == Estado.PENDIENTE) {
				pedidoPendienteADevolver = pedidos.get(i);
			}
			i++;
		}
		return pedidoPendienteADevolver;
	}

	/**
	 * Ejercicio C: La explotacion del metodo confirmarPedido de la clase Cliente
	 * que no recibe parametros y debe:
	 * 
	 * I. Descontar la cantidad pedida del stock de cada producto del pedido
	 * pendiente.
	 * 
	 * II. Cambiar el estado del pedido pendiente a CONFIRMADO.
	 */
	public void confirmarPedido() {
		getPedidoPendiente().confirmar();
	}

	/*----------------------------------------------------------------------------*/

	/**
	 * Cada cliente puede tener un solo pedido en estado PENDIENTE a la vez.
	 * 
	 * @param pedido
	 */
	public void agregarPedido(Pedido pedido) {
		if (getPedidoPendiente() == null) {
			this.historial.agregarPedido(pedido);
		}
	}
}
