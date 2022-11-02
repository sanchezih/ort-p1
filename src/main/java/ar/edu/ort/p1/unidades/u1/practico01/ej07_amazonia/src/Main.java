package ar.edu.ort.p1.unidades.u1.practico01.ej07_amazonia.src;

import java.util.ArrayList;

public class Main {
	public static void main(String[] args) {

		// Creo una serie de clientes
		Cliente estefania = new Cliente("Estefania", "Dominguez", "Colon 965", "estefania@mail.com", "45536974");
		Cliente gabriel = new Cliente("Gabriel", "Dominguez", "Cabildo 2211", "gabriel@mail.com", "45536974");
		Cliente omar = new Cliente("Omar", "Dominguez", "Colon 410", "omar@mail.com", "45536974");

		// Creo una serie de productos
		Producto dune = new Producto("Dune", 159.00, 8);
		Producto romeoYJulieta = new Producto("Romeo y Julieta", 189.00, 0);
		Producto fahrenheit451 = new Producto("Fahrenheit 451", 120.00, 19);

		// Creo un portal
		Portal portal = new Portal();

		// Agrego los productos al portal
		portal.agregarProducto(dune);
		portal.agregarProducto(romeoYJulieta);
		portal.agregarProducto(fahrenheit451);

		// Agrego los clientes al portal
		portal.agregarCliente(estefania);
		portal.agregarCliente(gabriel);
		portal.agregarCliente(omar);

		// Creo los pedidos
		ArrayList<ItemPedido> pedidoEstefania01 = new ArrayList<ItemPedido>();
		pedidoEstefania01.add(new ItemPedido(1, dune));
		pedidoEstefania01.add(new ItemPedido(1, romeoYJulieta));

		ArrayList<ItemPedido> pedidoEstefania02 = new ArrayList<ItemPedido>();
		pedidoEstefania02.add(new ItemPedido(3, fahrenheit451));

		// Asigno los pedidos a los clientes
		estefania.agregarPedido(new Pedido("30/08/2018", pedidoEstefania01));
		estefania.agregarPedido(new Pedido("01/01/2020", pedidoEstefania02)); // Este pedido no deberia ingresar

		/*----------------------------------------------------------------------------*/

		// Test ejercicio B
		System.out.println(estefania.getPedidoPendiente());

		System.out.println(
				"Los siguientes productos no pudieron ser procesados por falta de stock y se eliminaran del pedido: "
						+ portal.procesarPedido(estefania));

		System.out.println(estefania.getPedidoPendiente());
		System.out.println();

		// Test ejercicio C
		estefania.confirmarPedido();
		System.out.println(estefania.getNombre() + ": " + estefania.getHistorial());

	}
}
