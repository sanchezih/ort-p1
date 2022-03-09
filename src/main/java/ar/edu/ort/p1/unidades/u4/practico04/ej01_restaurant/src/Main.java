package ar.edu.ort.p1.unidades.u4.practico04.ej01_restaurant.src;

import ar.edu.ort.p1.util.UtilArrays;

public class Main {

	public static void main(String[] args) {

		Restaurant restaurant = new Restaurant();

		restaurant.agregarPedido(new Pedido("Jesica", 1, "R-04", 150.0));
		restaurant.agregarPedido(new Pedido("Silvana", 3, "R-02", 115.0));
		restaurant.agregarPedido(new Pedido("Hugo", 1, "R-03", 60.0));
		restaurant.agregarPedido(new Pedido("Raul", 0, "R-02", 90.0));

		// Test ejercicio B
		System.out.println("-> Muestro el monto total de pedidos que tomo cada cajero");
		UtilArrays.mostrar(restaurant.montosPorCajero());
		System.out.println();

		// Test ejercicio C
		System.out.println("-> Muestro los pedidos");
		System.out.println(restaurant.informeDePedidos() + "\n");

		// Test ejercicio D
		System.out.println("-> Muestro los pedidos con mas riesgo de no ser entregados");
		restaurant.mostrarPedidosConMasRiesgo();
	}

}
