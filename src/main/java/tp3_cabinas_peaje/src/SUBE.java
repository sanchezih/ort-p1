package tp3_cabinas_peaje.src;

public class SUBE extends MedioDePagoElectronico {
	double descuento = 10;

	public SUBE(int cantDiasDemoraPago) {
		super(cantDiasDemoraPago);
	}

	@Override
	public double obtenerDescuento() {
		return descuento;
	}
}
