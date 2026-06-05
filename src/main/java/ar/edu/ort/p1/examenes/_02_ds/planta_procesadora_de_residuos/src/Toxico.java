package ar.edu.ort.p1.examenes._02_ds.planta_procesadora_de_residuos.src;

public class Toxico extends Residuo {

	private int reactividad;
	private boolean esCorrosivo;

	/*----------------------------------------------------------------------------*/

	public Toxico(String fecha, double peligrosidad, int reactividad, boolean esCorrosivo) {
		super(fecha, peligrosidad);
		this.reactividad = reactividad;
		this.esCorrosivo = esCorrosivo;
	}

	/*----------------------------------------------------------------------------*/

	@Override
	public double calcularToxicidad() {
		double toxicidad;
		if (this.esCorrosivo) {
			toxicidad = this.reactividad;
		} else {
			toxicidad = getPeligrosidad() * this.reactividad;
		}
		return toxicidad;
	}

	@Override
	public TipoDeResiduo getTipoDeResiduo() {
		return TipoDeResiduo.TOXICO;
	}

}
