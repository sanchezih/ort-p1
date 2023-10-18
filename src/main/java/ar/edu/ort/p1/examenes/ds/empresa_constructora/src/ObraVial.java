package ar.edu.ort.p1.examenes.ds.empresa_constructora.src;

public abstract class ObraVial extends Obra {

	private int kmsLongitud;
	private boolean interprovincial;

	/*----------------------------------------------------------------------------*/

	public ObraVial(String responsable, Dificultad dificultad, int kmsLongitud, boolean interprovincial) {
		super(responsable, dificultad);
		this.kmsLongitud = kmsLongitud;
		this.interprovincial = interprovincial;
	}

	/*----------------------------------------------------------------------------*/

	protected int getKmsLongitud() {
		return this.kmsLongitud;
	}

}
