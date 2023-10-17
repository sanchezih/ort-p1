package ar.edu.ort.p1.unidades.u5.practico05.ej05_suppORT.src;

public class SuppORT {

	private ColaDeTickets colaDeTickets = new ColaDeTickets();

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
		Ticket ticketCent;
		Ticket ticketActual;

		ticketCent = new Ticket(-1, null, null, null);

		this.colaDeTickets.add(ticketCent);
		ticketActual = this.colaDeTickets.remove();

		while (ticketActual != ticketCent) {
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
	 * retorne la cantidad de tickets que hay por resolver (aún sin hacerlo) por
	 * cada sector y discriminado por prioridad.
	 * 
	 * @return
	 */
	public int[][] cantTicketsXSectorPrioridad() {
		Ticket ticketCent;
		Ticket ticketActual;
		int[][] cants;

		cants = new int[Sector.values().length][Prioridad.values().length];
		ticketCent = new Ticket(-1, null, null, null);

		this.colaDeTickets.add(ticketCent);
		ticketActual = this.colaDeTickets.remove();
		while (ticketActual != ticketCent) {
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
		Ticket ticketCentinela;
		Ticket ticketActual;

		ticketCentinela = new Ticket(-1, null, null, null);
		this.colaDeTickets.add(ticketCentinela);
		ticketActual = this.colaDeTickets.remove();

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
