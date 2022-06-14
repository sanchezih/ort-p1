package ar.edu.ort.p1.examenes.ds.empresa_constructora.src;

public abstract class Vial extends Obra {

	private int km;

	public Vial(String responsable, Dificultad dificultad, int km) {
		super(responsable, dificultad);
		this.km = km;
	}

	protected int getKm() {
		return this.km;
	}

}
