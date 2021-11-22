package ar.edu.ort.p1.extra.examenes.gestion_tickets_v2.src;

public class Main {

	public static void main(String[] args) {

		GestorTareas gestor = new GestorTareas();

		gestor.agregarEmpleado(new Empleado("Juan", "Perez", "AA"));

		gestor.agregarTicket(new Incidente("Un host", false));

	}

}
