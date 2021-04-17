package tp3_cabinas_peaje.src;

public class Efectivo extends MedioDePago {

	@Override
	public double obtenerDescuento() {
		return 20;
	}
}
