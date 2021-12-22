package ar.edu.ort.p1.unidades.u1.practico01.ej02_hotel.src;

import java.util.ArrayList;

import ar.edu.ort.p1.util.UtilArraylist;

public class Main {

	public static void main(String[] args) {

		/* Creo el hotel */
		Hotel hotel = new Hotel("Hotel 9 de Julio", "Cochabamba 1614");

		/* Creo y agrego las habitaciones */
		Habitacion h1=new Habitacion(101, 500.0);
		hotel.agregarHabitacion(h1);
		hotel.agregarHabitacion(new Habitacion(102, 500.0));

		/* Muestro cuales son las habitaciones disponibles */
		System.out.println("Muestro cuales son las habitaciones disponibles");
		UtilArraylist.listarElementos(hotel.obtenerHabitacionesDisponibles());
		
		
		System.out.println(h1.calcularTotal());
		
	}

}
