package ar.edu.ort.p1.examenes._02_ds.guard_cambio_climatico.src;

public class ZonaTropicalMonzonica extends ZonaTropical {

	private static final double TEMP_MIN = 15;
	private IntensidadViento intensidadViento;

	@Override
	public boolean enRiesgo() {
		/* Se usa el metodo 'enRiesgoMonzonica' para mas legibilidad */
		return super.enRiesgo() || enRiesgoMonzonica();
	}

	public boolean enRiesgoMonzonica() {
		return algunaInferiorA(TEMP_MIN) && this.intensidadViento == IntensidadViento.LEVE;
	}
}
