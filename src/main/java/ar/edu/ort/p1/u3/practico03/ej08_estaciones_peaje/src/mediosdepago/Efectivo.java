package ar.edu.ort.p1.u3.practico03.ej08_estaciones_peaje.src.mediosdepago;

public class Efectivo extends MedioDePago {

	private static final double DCTO = 0;

	@Override
	public double obtenerDescuento() {
		return DCTO;
	}
}
