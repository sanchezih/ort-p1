package ar.edu.ort.p1.unidades.u1.practico01.ej07_amazonia.src;

import java.util.Iterator;

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
		super();
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
	 * Metodo ya provisto llamado getPedidoPendiente que devuelve un objeto de la
	 * clase Pedido con el pedido que posea el cliente en curso (o null si no
	 * tuviera ninguno). Cada cliente puede tener un solo pedido en estado PENDIENTE
	 * a la vez.
	 * 
	 * @return
	 */
	public Pedido getPedidoPendiente() {
		Pedido pedidoADevolver = null;
		Iterator<Pedido> it = this.historial.getPedidos().iterator();

		while (it.hasNext()) {
			Pedido pedido = it.next();
			if (pedido.getEstado() == Estado.PENDIENTE) {
				pedidoADevolver = pedido;
			}
		}
		return pedidoADevolver;
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

		boolean sePuedeAgregar = true;
		Iterator<Pedido> it = this.historial.getPedidos().iterator();

		while (it.hasNext() && sePuedeAgregar) {
			Pedido p = it.next();
			if (p.getEstado() == Estado.PENDIENTE) {
				sePuedeAgregar = false;
			}
		}
		if (sePuedeAgregar) {
			this.historial.agregarPedido(pedido);
		}
	}
}
