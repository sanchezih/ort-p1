package tp3_cabinas_peaje.src;

public class Efectivo extends MedioDePago {
	
	double descuento = 0;

	@Override
	public double obtenerDescuento() {
		return descuento;
	}
}
