package ar.edu.ort.p1.examenes._01_oop.estadisticas_carritos_compras.src;

import java.util.ArrayList;

import ar.edu.ort.p1.util.Fecha;

public class Main {

	public static void main(String[] args) {

		// Creo los productos
		Producto shampoo = new Producto("1432", 100.0);
		Producto desodorante = new Producto("8246", 90.0);
		Producto lavandina = new Producto("8265", 80.0);
		Producto perfume = new Producto("2462", 70.0);
		Producto jabon = new Producto("1176", 30.0);
		Producto dentifrico = new Producto("3484", 50.0);

		/*----------------------------------------------------------------------------*/

		// Precio bruto = 200, como NO es consumidor final = 180
		ArrayList<Item> itemsCarrito01 = new ArrayList<Item>();
		itemsCarrito01.add(new Item(2, shampoo));

		CarritoDeCompra carrito01 = new CarritoDeCompra( //
				"001", //
				itemsCarrito01, //
				new Efectivo(new Fecha(10, 11, 2022), false), //
				new Fecha(10, 11, 2022));

		/*--------*/

		// Precio bruto = 270, como es consumidor final = 229.5
		ArrayList<Item> itemsCarrito02 = new ArrayList<Item>();
		itemsCarrito02.add(new Item(3, desodorante));

		CarritoDeCompra carrito02 = new CarritoDeCompra( //
				"002", //
				itemsCarrito02, //
				new Efectivo(new Fecha(10, 11, 2022), true), //
				new Fecha(10, 11, 2022));

		/*--------*/

		// Precio bruto = 170, como es pago por tx < 10 dias = 178.5
		ArrayList<Item> itemsCarrito03 = new ArrayList<Item>();
		itemsCarrito03.add(new Item(4, jabon));
		itemsCarrito03.add(new Item(1, dentifrico));

		CarritoDeCompra carrito03 = new CarritoDeCompra( //
				"003", //
				itemsCarrito03, //
				new TransferenciaBancaria(new Fecha(28, 03, 2023), "8102876342910973276541"), //
				new Fecha(25, 03, 2023));

		/*--------*/

		// Precio bruto = 170, como es pago por tx > 10 dias = 187
		ArrayList<Item> itemsCarrito04 = new ArrayList<Item>();
		itemsCarrito04.add(new Item(4, jabon));
		itemsCarrito04.add(new Item(1, dentifrico));

		CarritoDeCompra carrito04 = new CarritoDeCompra( //
				"004", //
				itemsCarrito04, //
				new TransferenciaBancaria(new Fecha(25, 04, 2023), "8102876342910973275555"), //
				new Fecha(25, 03, 2023));

		/*--------*/

		// Precio bruto = 320, como paga con tc en 6 ctas = 608
		ArrayList<Item> itemsCarrito05 = new ArrayList<Item>();
		itemsCarrito05.add(new Item(4, lavandina));

		CarritoDeCompra carrito05 = new CarritoDeCompra( //
				"005", //
				itemsCarrito05, //
				new TarjetaDeCredito(new Fecha(25, 04, 2023), 6), //
				new Fecha(10, 11, 2022));

		/*--------*/

		// Precio bruto = 140, como paga con tc en 12 ctas = 392
		ArrayList<Item> itemsCarrito06 = new ArrayList<Item>();
		itemsCarrito06.add(new Item(2, perfume));

		CarritoDeCompra carrito06 = new CarritoDeCompra( //
				"006", //
				itemsCarrito06, //
				new TarjetaDeCredito(new Fecha(25, 04, 2023), 12), //
				new Fecha(10, 11, 2022));

		/*----------------------------------------------------------------------------*/

		SitioWeb sitioWeb = new SitioWeb();
		sitioWeb.agregarCarritoVendido(carrito01);
		sitioWeb.agregarCarritoVendido(carrito02);
		sitioWeb.agregarCarritoVendido(carrito03);
		sitioWeb.agregarCarritoVendido(carrito04);
		sitioWeb.agregarCarritoVendido(carrito05);
		sitioWeb.agregarCarritoVendido(carrito06);

		System.out.println("PRECIOS DE LOS CARRITOS VENDIDOS");
		sitioWeb.mostrarPreciosDeCarritosVendidos();

		System.out.println();
		System.out.println("El id del carrito mas caro es: " + sitioWeb.idDelCarritoMasCaro());

		System.out.println();
		System.out.println("El numero de cuotas promedio es: " + sitioWeb.nroCuotasPromedio());

	}

}
