package ar.edu.ort.p1.examenes.ds.guard_cambio_climatico.src;

public class ZonaSeca extends Zona {

	private static final double TEMP_MAX = 43;
	private static final double INS_MAX = 90;
	private double porcInsolacion;

	@Override
	public boolean enRiesgo() {
		return tempPromedio() > TEMP_MAX && porcInsolacion <= INS_MAX;
	}



}
