package ar.edu.ort.p1.u4.practico04.ej04_viajes_tren.src;

public class Main {

	public static void main(String[] args) {
		Empresa empresa = new Empresa();

		empresa.agregarReserva(new Reserva("res01", 1, new Recorrido(Estacion.BUENOS_AIRES, Estacion.LUJAN)));
		empresa.agregarReserva(new Reserva("res02", 2, new Recorrido(Estacion.BUENOS_AIRES, Estacion.LUJAN)));
		empresa.agregarReserva(new Reserva("res03", 2, new Recorrido(Estacion.BUENOS_AIRES, Estacion.BRAGADO)));

		/*----------------------------------------------------------------------------*/

		/**
		 * Ejercicio B: La explotacion del metodo recaudacionTotal que retorne el monto
		 * total recaudado segun el precio de todas las reservas.
		 */
		System.out.println("La recaudacion total es: " + empresa.recaudacionTotal());

		/**
		 * Ejercicio C: La explotacion del metodo cantVecesRecorrida que reciba una
		 * estacion por parametro y retorne cuantas personas pasaran por esa estacion,
		 * de acuerdo a las reservas existentes.
		 */
		System.out.println("Pasaran " + empresa.cantVecesRecorrida(Estacion.CHIVILCOY) + " personas");

	}

}
