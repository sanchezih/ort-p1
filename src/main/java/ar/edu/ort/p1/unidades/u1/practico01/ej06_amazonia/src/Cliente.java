package ar.edu.ort.p1.unidades.u1.practico01.ej06_amazonia.src;

public class Cliente {

	private String nombre;
	private String apellido;
	private String direccion;
	private String email;
	private String telefono;
	private Historial historial;

	/**
	 * La clase Cliente posee un metodo ya provisto llamado getPedidoPendiente que
	 * devuelve un objeto de la clase Pedido con el pedido que posea el cliente en
	 * curso (o null si no tuviera ninguno). Cada cliente puede tener un solo pedido
	 * en estado PENDIENTE a la vez.
	 * 
	 * @return
	 */
	public Pedido getPedidoPendiente() {
		// TODO Auto-generated method stub
		return null;
	}

	/**
	 * Ejercicio C: La explotacion del metodo confirmarPedido de la clase Cliente
	 * que no recibe parametros y debe: I. Descontar la cantidad pedida del stock de
	 * cada producto del pedido pendiente. II. Cambiar el estado del pedido
	 * pendiente a CONFIRMADO.
	 */
	public void confirmarPedido() {
		getPedidoPendiente().confirmar();
	}

}
