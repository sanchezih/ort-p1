package ar.edu.ort.p1.u3.practico03.ej08_estaciones_peaje.src.mediosdepago;

public class PASE extends MedioDePagoElectronico {

	private static final int DEMORA_ESP = 5;
	private static final double DCTO = 0.15;
	private static final double DCTO_X_DEM_ESP = 0.12;

	public PASE(int cantDiasDemoraPago) {
		super(cantDiasDemoraPago);
	}

	@Override
	public double getDescuento() {
		return getDiasDemora() <= DEMORA_ESP ? DCTO : DCTO_X_DEM_ESP;
	}
}