package ar.edu.ort.p1.examenes._01_oop.estadisticas_carritos_compras.src;

import java.util.ArrayList;
import java.util.List;

public class SitioWeb {

	private List<CarritoDeCompra> carritosVendidos;

	/*----------------------------------------------------------------------------*/

	/**
	 * 
	 */
	public SitioWeb() {
		this.carritosVendidos = new ArrayList<CarritoDeCompra>();
	}

	/*----------------------------------------------------------------------------*/

	/**
	 * Retorna el ID del carrito de compra de mayor precio.
	 * 
	 * @return
	 */
	public String idDelCarritoMasCaro() {
		String id = null;
		double precioMax = -1;
		double precioActual;

		for (CarritoDeCompra cdc : this.carritosVendidos) {
			precioActual = cdc.getPrecio();
			if (precioActual > precioMax) {
				precioMax = precioActual;
				id = cdc.getId();
			}
		}
		return id;
	}

	/**
	 * Retorna la cantidad de cuotas promedio con las que se abonaron los carritos
	 * de compra con tarjeta de credito.
	 * 
	 * @return
	 */
	public double nroCuotasPromedio() {
		int cantCarritosConTarjeta = 0;
		int cuotasAcum = 0;
		double promedio = 0;

		for (CarritoDeCompra cdc : this.carritosVendidos) {
			if (cdc.pagoConTarjeta()) {
				cantCarritosConTarjeta++;
				cuotasAcum += cdc.getNroDeCuotas();
			}
		}

		if (cantCarritosConTarjeta > 0) {
			promedio = (double) cuotasAcum / cantCarritosConTarjeta;
		}

		return promedio;
	}

	/*----------------------------------------------------------------------------*/

	// Metodos complemetarios

	public void agregarCarritoVendido(CarritoDeCompra carritoDeCompra) {
		this.carritosVendidos.add(carritoDeCompra);
	}

	public void mostrarPreciosDeCarritosVendidos() {
		for (CarritoDeCompra carritoVendido : this.carritosVendidos) {
			System.out.println("\tCarrito " + carritoVendido.getId() + ": $" + carritoVendido.getPrecio());
		}
	}
}
