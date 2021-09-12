package ar.edu.ort.p1.u3.practico03.ej10_comercio_informatico.src;

public class Main {

	public static void main(String[] args) {
		Historial historial = new Historial();

		historial.agregarFacturable(new Insumo("Percha", 150, 5.0));
		historial.agregarFacturable(new ServicioArmado(4));
		historial.agregarFacturable(new ServicioDeReparacion(1, 5));
		historial.agregarFacturable(new ServicioDeReparacion(2, 7));
		historial.agregarFacturable(new ServicioDeReparacion(1, 8));
		
		System.out.println(historial.montoTotalFacturado());
		System.out.println(historial.cantServiciosSimples());

	}

}
