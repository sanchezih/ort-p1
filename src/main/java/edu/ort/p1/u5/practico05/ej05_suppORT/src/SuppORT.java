package edu.ort.p1.u5.practico05.ej05_suppORT.src;

import edu.ort.tp1.u5.tda.Cola;
import edu.ort.tp1.u5.tda.nodos.ColaNodos;

public class SuppORT {

	private Cola<Ticket> colaDeTickets = new ColaNodos<>();

	public void agregarTicket(Ticket ticket) {
		this.colaDeTickets.add(ticket);
	}

	public Ticket eliminarTicket(int id) {
		Ticket ticketBorrado = null;
		Ticket ticketCent;
		Ticket ticketActual;

		ticketCent = new Ticket(-1, null, null, null);

		colaDeTickets.add(ticketCent);
		ticketActual = colaDeTickets.remove();

		while (ticketActual != ticketCent) {
			if (ticketActual.getID() == id) {
				ticketBorrado = ticketActual;
			} else {
				// colaDeTickets.add(); //revisar
			}
			ticketActual = colaDeTickets.remove();
		}
		return ticketBorrado;
	}

	// public int[][] cantTicketsXSectorPrioridad() {}

}
