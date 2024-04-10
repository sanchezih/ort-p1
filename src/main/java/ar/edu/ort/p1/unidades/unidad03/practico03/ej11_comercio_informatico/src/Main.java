package ar.edu.ort.p1.unidades.unidad03.practico03.ej11_comercio_informatico.src;

public class Main {

	public static void main(String[] args) {

		Historial historial = new Historial();

		historial.agregarFacturable(new Insumo("Percha", 150, 5.0));

		historial.agregarFacturable(new ServicioArmado(4));

		historial.agregarFacturable(new ServicioDeReparacion(1, 5));
		historial.agregarFacturable(new ServicioDeReparacion(2, 7));
		historial.agregarFacturable(new ServicioDeReparacion(1, 8));

		/*----------------------------------------------------------------------------*/

		// Test ejercicio B
		System.out.println("Ejercicio B: El monto total facturado es: $" + historial.montoTotalFacturado());

		System.out.println();

		/*----------------------------------------------------------------------------*/

		// Test ejercicio C
		System.out.println("Ejercicio C: La cantidad de servicios de reparacion con nivel de dificultad menor a 2 es: "
				+ historial.cantServiciosSimples());

	}

}
