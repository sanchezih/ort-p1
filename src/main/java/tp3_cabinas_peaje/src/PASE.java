package tp3_cabinas_peaje.src;

public class PASE extends MedioDePagoElectronico {

	public PASE(int cantDiasDemoraPago) {
		super(cantDiasDemoraPago);
	}

	@Override
	public double obtenerDescuento() {
		if (this.getCantDiasDemoraPago() < 5) {
			return 15;
		} else {
			return 12;
		}

	}
}