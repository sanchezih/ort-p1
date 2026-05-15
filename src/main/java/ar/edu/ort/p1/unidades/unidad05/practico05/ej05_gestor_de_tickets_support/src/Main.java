package ar.edu.ort.p1.unidades.unidad05.practico05.ej05_gestor_de_tickets_support.src;

public class Main {

	public static void main(String[] args) {

		Gestor gestor = new Gestor();

		gestor.agregarTicket(new Ticket(1, "2021-11-30", Sector.DIRECCION, Prioridad.ALTA));
		gestor.agregarTicket(new Ticket(2, "2021-11-30", Sector.DIRECCION, Prioridad.BAJA));
		gestor.agregarTicket(new Ticket(3, "2021-11-30", Sector.ESCUELA, Prioridad.MEDIA));

		/*----------------------------------------------------------------------------*/

		/**
		 * Ejercicio C: La explotacion del metodo cantTicketsXSectorPrioridad,que
		 * retorne la cantidad de tickets que hay por resolver (aun sin hacerlo) por
		 * cada sector y discriminado por prioridad.
		 */

		gestor.dibujar(gestor.cantTicketsXSectorPrioridad());

		/*----------------------------------------------------------------------------*/

		/**
		 * Ejercicio B: La explotacion del metodo eliminarTicket, que reciba por
		 * parametro un ID y borre el ticket para que no sea procesado. Debe devolver el
		 * ticket borrado o null si no existe.
		 */
		gestor.recorrerColaDeTickets();

		gestor.eliminarTicket(1);
		gestor.recorrerColaDeTickets();

		gestor.eliminarTicket(2);
		gestor.recorrerColaDeTickets();

		gestor.dibujar(gestor.cantTicketsXSectorPrioridad());

	}

}
