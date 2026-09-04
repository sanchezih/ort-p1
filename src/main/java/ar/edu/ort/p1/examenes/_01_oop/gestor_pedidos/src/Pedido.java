package ar.edu.ort.p1.examenes._01_oop.gestor_pedidos.src;

import java.util.ArrayList;
import java.util.List;

public class Pedido {

	private List<Item> items;

	/*----------------------------------------------------------------------------*/

	/**
	 * Ejercicio B: Los metodos constructores de todos los tipos de Items que
	 * encuentres
	 */
	public Pedido() {
		this.items = new ArrayList<Item>();
	}

	/*----------------------------------------------------------------------------*/

	/**
	 * Ejercicio E: El metodo agregarItem() del Pedido, que debe asegurarse de no
	 * incluir items nulos en su coleccion
	 * 
	 * @param item
	 */
	public void agregarItem(Item item) {
		if (item != null) {
			this.items.add(item);
		}
	}

	/**
	 * Ejercicio F: El metodo evaluar() del Pedido, que debe devolver una estructura
	 * conteniendo el precio y peso totales del pedido, segun lo especificado
	 * 
	 * @return
	 */
	public InfoVenta evaluar() {
		int peso = 0;
		float precio = 0;

		for (Item item : this.items) {
			peso = peso + item.obtenerPeso();
			precio = precio + item.obtenerPrecio();
		}
		return new InfoVenta(precio, peso);
	}

}
