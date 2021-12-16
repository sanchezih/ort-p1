package ar.edu.ort.p1.unidades.u5.practico05.ej05_suppORT.src;

public class Main {

	public static void main(String[] args) {

		Ticket ticket01 = new Ticket(1, "2021", Sector.DIRECCION, Prioridad.ALTA);
		Ticket ticket02 = new Ticket(2, "2021", Sector.DIRECCION, Prioridad.BAJA);

		SuppORT soporte = new SuppORT();

		soporte.agregarTicket(ticket01);
		soporte.agregarTicket(ticket02);

		/*----------------------------------------------------------------------------*/

		/**
		 * La explotación del método cantTicketsXSectorPrioridad, que retorne la
		 * cantidad de tickets que hay por resolver (aún sin hacerlo) por cada sector y
		 * discriminado por prioridad.
		 */

		soporte.dibujar(soporte.cantTicketsXSectorPrioridad());

		/*----------------------------------------------------------------------------*/

		/**
		 * La explotación del método eliminarTicket, que reciba por parámetro un ID y
		 * borre el ticket para que no sea procesado. Debe devolver el ticket borrado o
		 * null si no existe.
		 */
		soporte.recorrerColaDeTickets();

		soporte.eliminarTicket(1);
		soporte.recorrerColaDeTickets();

		soporte.eliminarTicket(2);
		soporte.recorrerColaDeTickets();

		soporte.dibujar(soporte.cantTicketsXSectorPrioridad());

	}

}
