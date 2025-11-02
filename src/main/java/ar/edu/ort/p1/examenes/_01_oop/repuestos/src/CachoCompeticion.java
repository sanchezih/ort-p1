package ar.edu.ort.p1.examenes._01_oop.repuestos.src;

import java.util.ArrayList;

public class CachoCompeticion {

	private ArrayList<Pedido> pedidos;
	private ArrayList<Distribuidor> distribuidores;

	/*----------------------------------------------------------------------------*/

	public CachoCompeticion() {
		this.pedidos = new ArrayList<>();
		this.distribuidores = new ArrayList<>();
	}

	/*----------------------------------------------------------------------------*/

	public boolean esPosibleEnviarPedido(String id) {
		boolean esPosible;
		Pedido elPedido;

		elPedido = buscarPedido(id);
		if (elPedido != null) {
			esPosible = elPedido.esPosibleEnviar();
		} else {
			esPosible = false;
		}
		return esPosible;
	}

	private Pedido buscarPedido(String id) {
		int x = 0;
		Pedido unPedido;
		Pedido pedidoEncontrado = null;

		while (x < pedidos.size() && pedidoEncontrado == null) {
			unPedido = pedidos.get(x);
			if (unPedido.getId() == id) {
				pedidoEncontrado = unPedido;
			} else {
				x++;
			}
		}
		return pedidoEncontrado;
	}

	/*----------------------------------------------------------------------------*/

	public void addPedido(Pedido pedido) {
		this.pedidos.add(pedido);
	}
}
