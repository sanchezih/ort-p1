package ar.edu.ort.p1.unidades.u4.practico04.ej04_viajes_tren.src;

public class Main {

	public static void main(String[] args) {

		Empresa empresa = new Empresa();

		empresa.agregarReserva(new Reserva("res01", 1, new Recorrido(Estacion.BUENOS_AIRES, Estacion.LUJAN)));
		empresa.agregarReserva(new Reserva("res02", 2, new Recorrido(Estacion.BUENOS_AIRES, Estacion.LUJAN)));
		empresa.agregarReserva(new Reserva("res03", 2, new Recorrido(Estacion.BUENOS_AIRES, Estacion.BRAGADO)));

		/*----------------------------------------------------------------------------*/

		// Test ejercicio B
		System.out.println("La recaudacion total es: " + empresa.recaudacionTotal());

		// Test ejercicio C
		System.out.println("Pasaran " + empresa.cantVecesRecorrida(Estacion.CHIVILCOY) + " personas");

	}

}
