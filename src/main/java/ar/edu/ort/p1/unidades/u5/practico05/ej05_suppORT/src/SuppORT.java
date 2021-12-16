package ar.edu.ort.p1.unidades.u5.practico05.ej05_suppORT.src;

import ar.edu.ort.tp1.u5.tda.Cola;
import ar.edu.ort.tp1.u5.tda.nodos.ColaNodos;

public class SuppORT {

	private Cola<Ticket> colaDeTickets = new ColaNodos<>();

	public void recorrerColaDeTickets() {
		Ticket ticketCentinela;
		Ticket ticketActual;

		ticketCentinela = new Ticket(-1, null, null, null);
		this.colaDeTickets.add(ticketCentinela);
		ticketActual = this.colaDeTickets.remove();

		System.out.println("Comienzo a mostrar la cola de tickets...");

		while (ticketActual != ticketCentinela) {
			System.out.println(ticketActual.toString());
			this.colaDeTickets.add(ticketActual);
			ticketActual = this.colaDeTickets.remove();
		}
		System.out.println("Finalizado el recorrido\n");
	}

	public void agregarTicket(Ticket ticket) {
		this.colaDeTickets.add(ticket);
	}

	public Ticket eliminarTicket(int id) {
		Ticket ticketBorrado = null;
		Ticket ticketCent;
		Ticket ticketActual;

		ticketCent = new Ticket(-1, null, null, null);

		this.colaDeTickets.add(ticketCent);
		ticketActual = this.colaDeTickets.remove();

		while (ticketActual != ticketCent) {
			if (ticketActual.getID() == id) {
				ticketBorrado = ticketActual;
			} else {
				colaDeTickets.add(ticketActual);
			}
			ticketActual = colaDeTickets.remove();
		}
		return ticketBorrado;
	}

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
			colaDeTickets.add(ticketActual);
			ticketActual = colaDeTickets.remove();
		}
		return cants;
	} /* Métodos 'values()' y 'ordinal()': https://youtu.be/-Q1f3eCPsfY */

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
