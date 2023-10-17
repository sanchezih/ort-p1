package ar.edu.ort.p1.unidades.u5.practico05.ej05_suppORT.src;

public class Main {

	public static void main(String[] args) {

		SuppORT soporte = new SuppORT();

		soporte.agregarTicket(new Ticket(1, "2021-11-30", Sector.DIRECCION, Prioridad.ALTA));
		soporte.agregarTicket(new Ticket(2, "2021-11-30", Sector.DIRECCION, Prioridad.BAJA));
		soporte.agregarTicket(new Ticket(3, "2021-11-30", Sector.ESCUELA, Prioridad.MEDIA));

		/*----------------------------------------------------------------------------*/

		/**
		 * Ejercicio C: La explotacion del metodo cantTicketsXSectorPrioridad,que
		 * retorne la cantidad de tickets que hay por resolver (aun sin hacerlo) por
		 * cada sector y discriminado por prioridad.
		 */

		soporte.dibujar(soporte.cantTicketsXSectorPrioridad());

		/*----------------------------------------------------------------------------*/

		/**
		 * Ejercicio B: La explotacion del metodo eliminarTicket, que reciba por
		 * parametro un ID y borre el ticket para que no sea procesado. Debe devolver el
		 * ticket borrado o null si no existe.
		 */
		soporte.recorrerColaDeTickets();

		soporte.eliminarTicket(1);
		soporte.recorrerColaDeTickets();

		soporte.eliminarTicket(2);
		soporte.recorrerColaDeTickets();

		soporte.dibujar(soporte.cantTicketsXSectorPrioridad());

	}

}
