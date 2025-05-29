package ar.edu.ort.p1.examenes._02_ds.empresa_constructora.src;

public class Puente extends ObraVial {

	private TipoPuente tipo;

	public Puente(String responsable, Dificultad dificultad, int km, TipoPuente tipo, boolean interprovincial) {
		super(responsable, dificultad, km, interprovincial);
		this.tipo = tipo;
	}

	@Override
	public int duracion() {
		return super.getKmsLongitud() * this.tipo.getIndice();
	}

}
