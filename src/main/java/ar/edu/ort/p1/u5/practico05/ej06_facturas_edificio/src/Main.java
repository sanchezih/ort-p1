package edu.ort.p1.u5.practico05.ej06_facturas_edificio.src;

import edu.ort.tp1.u5.tda.Pila;
import edu.ort.tp1.u5.tda.nodos.PilaNodos;

public class Main {

	public static void main(String[] args) {

		Pila<Factura> pilaDeFacturas = new PilaNodos<Factura>();

		pilaDeFacturas.push(new Factura("6", 5, 5500, TipoFactura.LUZ));

		pilaDeFacturas.push(new Factura("6", 2, 600, TipoFactura.INTERNET));
		pilaDeFacturas.push(new Factura("2", 4, 700, TipoFactura.INTERNET));
		pilaDeFacturas.push(new Factura("5", 12, 140, TipoFactura.INTERNET));
		pilaDeFacturas.push(new Factura("4", 1, 140, TipoFactura.LUZ));
		pilaDeFacturas.push(new Factura("3", 1, 140, TipoFactura.ABL));

		pilaDeFacturas.push(new Factura("6", 2, 140, TipoFactura.GAS));
		pilaDeFacturas.push(new Factura("7", 1, 140, TipoFactura.INTERNET));

		pilaDeFacturas.push(new Factura("7", 2, 140, TipoFactura.ABL));
		pilaDeFacturas.push(new Factura("1", 3, 140, TipoFactura.INTERNET));
		pilaDeFacturas.push(new Factura("12", 8, 140, TipoFactura.ABL));

		/*----------------------------------------------------------------------------*/

		/**
		 * La explotación del método catalogar, que reciba por parámetro la pila de
		 * facturas mezcladas y la procese (dejándola vacía) para lograr guardar las
		 * facturas encoladas según el tipo con el cuidado de que queden ordenadas por
		 * número de mes ascendente.
		 */

		Edificio edificio = new Edificio();
		edificio.catalogar(pilaDeFacturas);

		/*----------------------------------------------------------------------------*/

		/**
		 * La explotacion del método montoAAbonarPorTipo, que retorne el monto a abonar
		 * actualmente por cada tipo de servicio.
		 */

		System.out.println("\n\n--Monto a abonar por cada servicio--");
		double[] array = edificio.montoAAbonarPorTipo();
		for (int i = 0; i < array.length; i++) {
			System.out.println(TipoFactura.values()[i] + " " + array[i]);
		}
	}
}
