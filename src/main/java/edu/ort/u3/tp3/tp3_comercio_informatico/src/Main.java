package edu.ort.u3.tp3.tp3_comercio_informatico.src;

public class Main {
	public static void main(String[] args) {

		Comercio c1 = new Comercio(new Historial());

		Insumo i1 = new Insumo("Microprocesador", 20, 100, TipoInsumo.HARDWARE);
		Insumo i2 = new Insumo("Motherboard", 20, 100, TipoInsumo.HARDWARE);
		Insumo i3 = new Insumo("Teclado", 10, 2, TipoInsumo.PERIFERICO);

		Servicio sa1 = new ServicioDeArmado(4);
		Servicio sr1 = new ServicioDeReparacion(2, 1);
		Servicio sr2 = new ServicioDeReparacion(2, 2);
		Servicio sr3 = new ServicioDeReparacion(2, 1);

		c1.getHistorial().itemsVendidos.add(i1);
		c1.getHistorial().itemsVendidos.add(i2);
		c1.getHistorial().itemsVendidos.add(i3);
		c1.getHistorial().itemsVendidos.add(sa1);
		c1.getHistorial().itemsVendidos.add(sr1);
		c1.getHistorial().itemsVendidos.add(sr2);
		c1.getHistorial().itemsVendidos.add(sr3);

		// Ejercicio B
		System.out.println(
				"El monto total facturado de los items vendidos es: " + c1.getHistorial().montoTotalFacturado());

		// Ejercicio C
		System.out.println("La cantidad de servicios de reparación con nivel de dificultad <2 es: "
				+ c1.getHistorial().cantServiciosSimples());
	}
}