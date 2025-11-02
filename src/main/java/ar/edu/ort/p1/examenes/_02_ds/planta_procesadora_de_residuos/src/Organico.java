package ar.edu.ort.p1.examenes._02_ds.planta_procesadora_de_residuos.src;

public class Organico extends Residuo {

	private boolean esTransformable;

	/*----------------------------------------------------------------------------*/

	public Organico(String fecha, double peligrosidad, boolean esTransformable) {
		super(fecha, peligrosidad);
		this.esTransformable = esTransformable;
	}

	/*----------------------------------------------------------------------------*/

	@Override
	public double calcularToxicidad() {
		double toxicidad;

		if (this.esTransformable) {
			toxicidad = 0.0;
		} else {
			toxicidad = getPeligrosidad();
		}
		return toxicidad;
	}

	@Override
	public TipoDeResiduo getTipoDeResiduo() {
		return TipoDeResiduo.ORGANICO;
	}

	
	
	
	
}
