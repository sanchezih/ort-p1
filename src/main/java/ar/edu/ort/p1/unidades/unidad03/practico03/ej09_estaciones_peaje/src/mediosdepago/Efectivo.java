package ar.edu.ort.p1.unidades.unidad03.practico03.ej09_estaciones_peaje.src.mediosdepago;

public class Efectivo extends MedioDePago {

	private static final double DCTO = 0;

	@Override
	public double getDescuento() {
		return DCTO;
	}
}
