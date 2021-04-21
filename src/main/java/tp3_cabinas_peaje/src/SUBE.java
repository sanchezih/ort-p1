package tp3_cabinas_peaje.src;

public class SUBE extends MedioDePagoElectronico {
	double descuento = 0.1;

	public SUBE(int cantDiasDemoraPago) {
		super(cantDiasDemoraPago);
	}

	@Override
	public double obtenerDescuento() {
		return descuento;
	}
}
