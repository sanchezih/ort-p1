package tp3_cabinas_peaje.src;

public class PASE extends MedioDePagoElectronico {

	@Override
	public double obtenerDescuento() {
		return 12;
	}

}
