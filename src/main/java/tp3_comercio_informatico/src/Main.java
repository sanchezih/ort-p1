package tp3_comercio_informatico.src;

public class Main {
	public static void main(String[] args) {

		Historial h1 = new Historial();
		Comercio c1 = new Comercio(h1);

		Insumo i1 = new Insumo("Microprocesador", 20, 100, Tipo.HARDWARE);
		Insumo i2 = new Insumo("Motherboard", 20, 100, Tipo.HARDWARE);
		Insumo i3 = new Insumo("Teclado", 10, 2, Tipo.PERIFERICO);

		// Servicio sa1 = new ServicioDeArmado(4);
		Servicio sr1 = new ServicioDeReparacion(2, 5);
		// Servicio sr2 = new ServicioDeReparacion(2, 2);
		// Servicio sr3 = new ServicioDeReparacion(2, 1);

		// h1.itemsVendidos.add(i1);
		// h1.itemsVendidos.add(i2);
		// h1.itemsVendidos.add(sa1);
		h1.itemsVendidos.add(sr1);
		// h1.itemsVendidos.add(sr2);
		// h1.itemsVendidos.add(sr3);

		System.out.println("El monto total facturado de los items vendidos es: " + h1.montoTotalFacturado());
		System.out.println(
				"La cantidad de servicios de reparación con nivel de dificultad <2 es: " + h1.cantServiciosSimples());

	}

}
