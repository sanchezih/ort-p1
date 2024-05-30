package ar.edu.ort.p1.unidades.unidad05.practico05.ej06_facturas_edificio.src;

import ar.edu.ort.tp1.u5.tda.interfaces.Pila;

public class Main {

	public static void main(String[] args) {

		// Creo facturas sin ningun orden en particular y las meto en la pila

		Pila<Factura> pilaDeFacturas = new PilaDeFacturas();

		pilaDeFacturas.push(new Factura("8-234856-839401", 2, 140, TipoFactura.GAS));
		pilaDeFacturas.push(new Factura("7-012222-671343", 1, 140, TipoFactura.INTERNET));
		pilaDeFacturas.push(new Factura("1-451335-839401", 2, 140, TipoFactura.ABL));
		pilaDeFacturas.push(new Factura("1-931240-453003", 3, 140, TipoFactura.INTERNET));
		pilaDeFacturas.push(new Factura("3-802340-134245", 8, 140, TipoFactura.ABL));
		pilaDeFacturas.push(new Factura("7-928301-839401", 5, 5500, TipoFactura.LUZ));
		pilaDeFacturas.push(new Factura("6-512346-839401", 2, 600, TipoFactura.INTERNET));
		pilaDeFacturas.push(new Factura("2-274912-234111", 4, 700, TipoFactura.INTERNET));
		pilaDeFacturas.push(new Factura("2-892019-839405", 12, 140, TipoFactura.INTERNET));
		pilaDeFacturas.push(new Factura("3-126766-876346", 1, 140, TipoFactura.LUZ));
		pilaDeFacturas.push(new Factura("6-518846-123996", 7, 140, TipoFactura.ABL));

		/*----------------------------------------------------------------------------*/

		Edificio edificio = new Edificio();

		// Test ejercicio B
		System.out.println("Ejercicio B: Catalogo las facturas");
		System.out.println();
		edificio.catalogar(pilaDeFacturas);

		/*----------------------------------------------------------------------------*/

		// Test ejercicio C
		System.out.println();
		System.out.println("Ejercicio C: Monto a abonar por cada servicio");

		double[] array = edificio.montoAAbonarPorTipo();

		for (int i = 0; i < array.length; i++) {
			System.out.println("\t-> " + TipoFactura.values()[i] + " $" + array[i]);
		}

	}
}
