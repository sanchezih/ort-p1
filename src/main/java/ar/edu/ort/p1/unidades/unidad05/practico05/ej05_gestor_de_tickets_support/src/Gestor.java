package ar.edu.ort.p1.unidades.unidad05.practico05.ej05_gestor_de_tickets_support.src;

import ar.edu.ort.tp1.u5.tda.interfaces.Cola;

public class Gestor {

	private Cola<Ticket> colaDeTickets = new ColaDeTickets();

	/*----------------------------------------------------------------------------*/

	/**
	 * Ejercicio B: La explotacion del metodo eliminarTicket, que reciba por
	 * parametro un ID y borre el ticket para que no sea procesado.
	 * 
	 * Debe devolver el ticket borrado o null si no existe.
	 * 
	 * @param id
	 * @return
	 */
	public Ticket eliminarTicket(int id) {
		System.out.println("Elimino el Ticket con id " + id);

		Ticket ticketBorrado = null;
		Ticket ticketCentinela = new Ticket(-1, null, null, null);
		Ticket ticketActual = null;

		this.colaDeTickets.add(ticketCentinela);
		ticketActual = this.colaDeTickets.remove();

		while (ticketActual != ticketCentinela) {
			if (ticketActual.getId() == id) {
				ticketBorrado = ticketActual;
			} else {
				this.colaDeTickets.add(ticketActual);
			}
			ticketActual = this.colaDeTickets.remove();
		}
		return ticketBorrado;
	}

	/*----------------------------------------------------------------------------*/

	/**
	 * Ejercicio C: La explotacion del metodo cantTicketsXSectorPrioridad, que
	 * retorne la cantidad de tickets que hay por resolver (aun sin hacerlo) por
	 * cada sector y discriminado por prioridad.
	 * 
	 * @return
	 */
	public int[][] cantTicketsXSectorPrioridad() {

		Ticket ticketCentinela = new Ticket(-1, null, null, null);
		Ticket ticketActual = null;
		int[][] cants = new int[Sector.values().length][Prioridad.values().length];

		this.colaDeTickets.add(ticketCentinela);
		ticketActual = this.colaDeTickets.remove();

		while (ticketActual != ticketCentinela) {
			int idxSector = ticketActual.getSector().ordinal();
			int idxPrioridad = ticketActual.getPrioridad().ordinal();

			cants[idxSector][idxPrioridad]++;
			this.colaDeTickets.add(ticketActual);
			ticketActual = this.colaDeTickets.remove();
		}
		return cants;
	}

	/*----------------------------------------------------------------------------*/

	// Metodos complementarios

	/**
	 * 
	 * @param ticket
	 */
	public void agregarTicket(Ticket ticket) {
		this.colaDeTickets.add(ticket);
	}

	/**
	 * 
	 */
	public void recorrerColaDeTickets() {
		Ticket ticketCentinela = new Ticket(-1, null, null, null);
		Ticket ticketActual = this.colaDeTickets.remove();

		this.colaDeTickets.add(ticketCentinela);

		System.out.println("Muestro la cola de tickets al momento...");

		while (ticketActual != ticketCentinela) {
			System.out.println(ticketActual.toString());
			this.colaDeTickets.add(ticketActual);
			ticketActual = this.colaDeTickets.remove();
		}
		System.out.println("Finalizado el recorrido\n");
	}

	/**
	 * 
	 * @param matriz
	 */
	public void dibujar(int[][] matriz) {
		System.out.println("*** MATRIZ DE TICKETS ***");
		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz[i].length; j++) {
				System.out.print(matriz[i][j] + "\t");
			}
			System.out.println();
		}
		System.out.println();
	}

}
