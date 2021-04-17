package tp3_cabinas_peaje.src;

public abstract class MedioDePagoElectronico extends MedioDePago {
	private int cantDiasDemoraCobro = 2;

	public int getCantDiasDemoraCobro() {
		return cantDiasDemoraCobro;
	}

}
