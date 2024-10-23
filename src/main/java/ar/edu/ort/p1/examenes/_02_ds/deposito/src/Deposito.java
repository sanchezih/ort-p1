package ar.edu.ort.p1.examenes._02_ds.deposito.src;

import java.util.ArrayList;
import java.util.List;

import ar.edu.ort.tp1.u5.tda.interfaces.ListaOrdenada;

public class Deposito {

	private static final int CANT_RACKS = 2;
	private Rack[] racks;
	private List<Pedido> pedidos;

	/*----------------------------------------------------------------------------*/

	public Deposito() {
		this.racks = new Rack[CANT_RACKS];
		this.pedidos = new ArrayList<Pedido>();
		inicializar();
	}

	/*----------------------------------------------------------------------------*/

	/**
	 * Ejercicio C: El metodo getInformeDePrioridades(), en la clase que
	 * corresponda, que retorne la cantidad total de productos (No de items) que
	 * historiacamente se pidieron, segun el nivel de prioridad del pedido al que
	 * pertenecen.
	 * 
	 * @return
	 */
	public int[] getInformeDePrioridades() {
		int[] informe = new int[Prioridad.values().length];

		for (Pedido pedido : this.pedidos) {
			pedido.sumarPrioridades(informe);
		}
		return informe;
	}

	/*----------------------------------------------------------------------------*/

	/**
	 * Ejercicio D: El metodo ingresarProducto(...), en la clase que corresponda,
	 * que reciba por parametro un producto y lo ingrese en el primer rack que lo
	 * pueda contener. En caso de no encontrar un rack disponible, se debera mostrar
	 * un mensaje de error con la leyenda "El producto no puede ser ingresado".
	 * 
	 * @param producto
	 */
	public void ingresarProducto(Producto producto) {
		System.out.println("\nIntento ingresar " + producto.toString());
		boolean fueIngresado = false;
		int i = 0;

		while (i < this.racks.length && !fueIngresado) {
			System.out.println(
					"\t-> Intento ingresar el producto en el rack " + i + " (" + racks[i].getClass().getSimpleName()
							+ " - Peso Max. " + racks[i].getPesoMaximoSoportado() + " Kg.)");

			fueIngresado = racks[i].ingresarProducto(producto);
			i++;
		}

		if (!fueIngresado) {
			System.out.println("\t\t-> El producto no puede ser ingresado");
		} else {
			System.out.println("\t\t-> El producto fue ingresado");
		}

	}

	/*----------------------------------------------------------------------------*/

	// Metodos complementarios

	private void inicializar() {

		// Creo pedidos
		ListaOrdenada<String, ItemPedido> listaPedido1 = new ListaItemsPorNombre();
		listaPedido1.add(new ItemPedido(1, new Producto("Masilla Anclaflex", "", 32)));
		listaPedido1.add(new ItemPedido(50, new Producto("Ladrillo Portante 12x19x33 ", "", 2)));
		this.pedidos.add(new Pedido("Empresa fantasma 1", Prioridad.NORMAL, listaPedido1));

		ListaOrdenada<String, ItemPedido> listaPedido2 = new ListaItemsPorNombre();
		listaPedido2.add(new ItemPedido(3, new Producto("Pintura Alfaltica", "", 4)));
		this.pedidos.add(new Pedido("Empresa fantasma 2", Prioridad.ALTA, listaPedido2));

		// Creo racks
		this.racks[0] = new Compacto(100, false);
		// this.racks[1] = new Compacto(30, false);
		this.racks[1] = new Industrial(30);
	}

}
