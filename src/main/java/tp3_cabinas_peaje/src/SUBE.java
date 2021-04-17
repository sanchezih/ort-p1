package tp3_cabinas_peaje.src;

public class SUBE extends MedioDePagoElectronico {

	public SUBE() {
		super(3);
	}

	double descuento = 10;

	@Override
	public double obtenerDescuento() {
		return descuento;
	}

}
