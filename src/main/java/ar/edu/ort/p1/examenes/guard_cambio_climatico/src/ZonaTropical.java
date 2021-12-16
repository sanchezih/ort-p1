package ar.edu.ort.p1.examenes.guard_cambio_climatico.src;

public class ZonaTropical extends Zona {

	private static final double TEMP_MIN = 18;
	private static final double ELEV_MAX = 1000;
	private int mmLlovidos;

	@Override
	public boolean enRiesgo() {
		return algunaInferiorA(TEMP_MIN) && getElevacion() <= ELEV_MAX;
	}

}
