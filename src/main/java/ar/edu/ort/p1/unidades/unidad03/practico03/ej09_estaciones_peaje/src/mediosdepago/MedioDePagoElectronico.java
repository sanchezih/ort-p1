package ar.edu.ort.p1.unidades.unidad03.practico03.ej09_estaciones_peaje.src.mediosdepago;

public abstract class MedioDePagoElectronico extends MedioDePago {

	private int cantDiasDemoraPago;

	/*----------------------------------------------------------------------------*/

	public MedioDePagoElectronico(int cantDiasDemoraPago) {
		super();
		this.cantDiasDemoraPago = cantDiasDemoraPago;
	}

	/*----------------------------------------------------------------------------*/

	public int getDiasDemora() {
		return cantDiasDemoraPago;
	}

	public void setCantDiasDemoraPago(int cantDiasDemoraPago) {
		this.cantDiasDemoraPago = cantDiasDemoraPago;
	}
}