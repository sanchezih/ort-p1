package tp3_cabinas_peaje.src;

public abstract class MedioDePagoElectronico extends MedioDePago {

	private int cantDiasDemoraPago;

	public MedioDePagoElectronico(int cantDiasDemoraPago) {
		super();
		this.cantDiasDemoraPago = cantDiasDemoraPago;
	}

	public int getCantDiasDemoraPago() {
		return cantDiasDemoraPago;
	}

}
