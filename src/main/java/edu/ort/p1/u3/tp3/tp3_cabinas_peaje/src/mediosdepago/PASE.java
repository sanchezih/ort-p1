package edu.ort.p1.u3.tp3.tp3_cabinas_peaje.src.mediosdepago;

public class PASE extends MedioDePagoElectronico {

	private static final int DEMORA_ESP = 5;
	private static final double DCTO = 0.15;
	private static final double DCTO_X_DEM_ESP = 0.12;

	public PASE(int cantDiasDemoraPago) {
		super(cantDiasDemoraPago);
	}

	@Override
	public double obtenerDescuento() {
		return getCantDiasDemoraPago() <= DEMORA_ESP ? DCTO : DCTO_X_DEM_ESP;
	}
}