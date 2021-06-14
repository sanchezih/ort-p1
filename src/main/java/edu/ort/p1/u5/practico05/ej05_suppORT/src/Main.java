package edu.ort.p1.u5.practico05.ej05_suppORT.src;

public class Main {

	public static void main(String[] args) {

		Ticket ticket01 = new Ticket(1, "2021", Sector.DIRECCION, Prioridad.ALTA);
		Ticket ticket02 = new Ticket(2, "2021", Sector.DIRECCION, Prioridad.BAJA);

		SuppORT soporte = new SuppORT();

		soporte.agregarTicket(ticket01);
		soporte.agregarTicket(ticket02);

		soporte.eliminarTicket(1);
	}

}
