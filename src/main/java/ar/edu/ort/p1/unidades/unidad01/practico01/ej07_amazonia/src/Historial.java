package ar.edu.ort.p1.unidades.unidad01.practico01.ej07_amazonia.src;

import java.util.ArrayList;
import java.util.List;

/**
 * Para tener un modelo desacoplado y con responsabiliades bien delimitadas, se
 * crea la clase Historial para no cargar al Cliente de responsabilidades que no
 * le corresponden.
 * 
 * @author ihsanch
 *
 */
public class Historial {

	private List<Pedido> pedidos;

	/*----------------------------------------------------------------------------*/

	public Historial() {
		this.pedidos = new ArrayList<>();
	}

	/*----------------------------------------------------------------------------*/

	public List<Pedido> getPedidos() {
		return pedidos;
	}

	public void agregarPedido(Pedido pedido) {
		this.pedidos.add(pedido);
	}

	@Override
	public String toString() {
		return "Historial [pedidos=" + pedidos + "]";
	}

}
