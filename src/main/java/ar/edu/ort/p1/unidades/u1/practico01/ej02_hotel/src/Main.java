package ar.edu.ort.p1.unidades.u1.practico01.ej02_hotel.src;

import ar.edu.ort.p1.util.UtilArraylist;

public class Main {

	public static void main(String[] args) {

		/* Creo el hotel */
		Hotel hotel = new Hotel("Hotel 9 de Julio", "Cochabamba 1614");

		/* Creo los clientes */
		Cliente c1 = new Cliente("Viviana", 7);
		Cliente c2 = new Cliente("Sandra", 10);

		/* Creo y agrego las habitaciones */
		Habitacion h1 = new Habitacion(101, 500.0);
		Habitacion h2 = new Habitacion(102, 500.0);

		hotel.agregarHabitacion(h1);
		hotel.agregarHabitacion(h2);

		h1.setCliente(c1);

		/* Muestro los totales */
		System.out.println("calcularTotal");
		System.out.println(h1.calcularTotal());
		System.out.println(h2.calcularTotal());

		System.out.println();

		/* Muestro cuales son las habitaciones disponibles al momento */
		System.out.println("Muestro cuales son las habitaciones disponibles al momento");
		UtilArraylist.listarElementos(hotel.obtenerHabitacionesDisponibles());

		System.out.println();

		/* Realizo los checkout */
		System.out.println("Hago checkout de la habitacion 101. Debe abonar $" + hotel.realizarCheckout(101));

		System.out.println();

		/* Muestro cuales son las habitaciones disponibles al momento */
		System.out.println("Muestro cuales son las habitaciones disponibles al momento");
		UtilArraylist.listarElementos(hotel.obtenerHabitacionesDisponibles());
	}

}
