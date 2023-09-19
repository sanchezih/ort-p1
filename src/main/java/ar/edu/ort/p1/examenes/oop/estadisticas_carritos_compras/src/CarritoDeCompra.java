package ar.edu.ort.p1.examenes.oop.estadisticas_carritos_compras.src;

import java.util.ArrayList;

public class CarritoDeCompra implements Valuable {

	private String id;
	private ArrayList<Item> items;
	private MetodoDePago metodoDePago;
	private Fecha fechaDeCompra;

	/*----------------------------------------------------------------------------*/

	/**
	 * 
	 * @param id
	 * @param items
	 * @param metodoDePago
	 * @param fechaDeCompra
	 */
	public CarritoDeCompra(String id, ArrayList<Item> items, MetodoDePago metodoDePago, Fecha fechaDeCompra) {
		this.id = id;
		this.items = items;
		this.metodoDePago = metodoDePago;
		this.fechaDeCompra = fechaDeCompra;

		metodoDePago.setCarritoDeCompra(this);
	}

	/*----------------------------------------------------------------------------*/

	public String getId() {
		return id;
	}

	public Fecha getFechaDeCompra() {
		return fechaDeCompra;
	}

	/**
	 * 
	 */
	@Override
	public double getPrecio() {
		double precio = precioDeProductos();
		return precio + precio * this.metodoDePago.getDctoORecargo();
	}

	/**
	 * 
	 * @return
	 */
	private double precioDeProductos() {
		double total = 0;
		for (Item item : this.items) {
			total = total + item.getPrecio();
		}
		return total;
	}

	/**
	 * 
	 * @return
	 */
	public boolean pagoConTarjeta() {
		return this.metodoDePago instanceof TarjetaDeCredito;
	}

	/**
	 * 
	 * @return
	 */
	public int getNroDeCuotas() {
		int cantCuotas = 0;
		if (pagoConTarjeta()) {
			cantCuotas = ((TarjetaDeCredito) this.metodoDePago).getNroDeCuotas();
		}
		return cantCuotas;
	}

}
