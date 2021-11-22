package ar.edu.ort.p1.extra.examenes.gestion_tickets_v2.src;

public class Main {

	public static void main(String[] args) {

		GestorTareas gestor = new GestorTareas();

		gestor.agregarEmpleado(new Empleado("Juan", "Perez", "AA"));

		// gestor.agregarTicket(new Incidente("Un host", false));
		// gestor.agregarTicket(new Incidente("BB", true));
	//	gestor.agregarTicket(new Bug(TipoBug.INTEGRACION, 4));

		/*----------------------------------------------------------------------------*/

		// Test Ejercicio B
		mostrar(gestor.reporteTiempoPromedioPorPrioridad());

		// Test Ejercicio C
		gestor.asignarTickets();

	}

	public static void mostrar(double[] elementos) {
		for (int i = 0; i < elementos.length; i++) {
			System.out.print(Prioridad.values()[i] + "\t" + elementos[i] + "\n");
		}
		System.out.println();
	}
}
