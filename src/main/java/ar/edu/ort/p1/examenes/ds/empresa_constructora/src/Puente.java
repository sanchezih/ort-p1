package ar.edu.ort.p1.examenes.ds.empresa_constructora.src;

public class Puente extends Vial {

	private TipoPuente tipo;

	public Puente(String responsable, Dificultad dificultad, int km, TipoPuente tipo) {
		super(responsable, dificultad, km);
		this.tipo = tipo;
	}

	@Override
	public int duracion() {
		return super.getKm() * this.tipo.getIndice();
	}

}
