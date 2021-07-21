package ar.edu.ort.p1.u3.practico03.tp3_comercio_informatico.src;

public class Main {

	public static void main(String[] args) {
		Comercio cm = new Comercio();

		cm.agregarFacturable(new Insumo("percha", 150, 5.0));
		cm.agregarFacturable(new ServicioArmado(4));
		cm.agregarFacturable(new ServicioDeReparacion(1, 5));
		cm.agregarFacturable(new ServicioDeReparacion(2, 7));
		cm.agregarFacturable(new ServicioDeReparacion(1, 8));
		System.out.println(cm.montoTotalFacturado());
		System.out.println(cm.cantServiciosSimples());

	}

}
