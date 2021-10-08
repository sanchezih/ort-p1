package ar.edu.ort.p1.u4.practico04.ej01_restaurant.src;

import ar.edu.ort.p1.util.UtilArrays;

public class Main {

	public static void main(String[] args) {

		Restaurant restaurant = new Restaurant();

		// Test ejercicio B
		System.out.println("Muestro el monto total de pedidos que tomo cada cajero");
		UtilArrays.mostrar(restaurant.montosPorCajero());

		// Test ejercicio C
		System.out.println("\nMuestro el pedido con mas riesgo de no ser entregado");
		restaurant.mostrarPedidoConMasRiesgo();
	}

}
