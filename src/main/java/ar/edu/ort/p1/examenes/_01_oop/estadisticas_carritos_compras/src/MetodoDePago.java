package ar.edu.ort.p1.examenes._01_oop.estadisticas_carritos_compras.src;

import ar.edu.ort.p1.util.Fecha;

public abstract class MetodoDePago {

	private CarritoDeCompra carritoDeCompra;
	private Fecha fechaDePago;

	/*----------------------------------------------------------------------------*/

	public MetodoDePago(Fecha fechaDePago) {
		this.fechaDePago = fechaDePago;
	}

	public void setCarritoDeCompra(CarritoDeCompra carritoDeCompra) {
		this.carritoDeCompra = carritoDeCompra;
	}

	/**
	 * 
	 * @return
	 */
	public int getDiasDeDemoraDePago() {
		return Fecha.diasTranscurridosEntreFechas(carritoDeCompra.getFechaDeCompra(), fechaDePago);
	}

	/**
	 * 
	 * @param metodoDePago
	 * @return
	 */
	public abstract double getDctoORecargo();
}
