package tp3_cabinas_peaje.src;

public class PASE extends MedioDePagoElectronico {
	


	public PASE() {
		super(2);

	}

	@Override
	public double obtenerDescuento() {

		if (super.getCantDiasDemoraPago() < 5) {
			return 15;
		} else {
			return 12;
		}
	}
}