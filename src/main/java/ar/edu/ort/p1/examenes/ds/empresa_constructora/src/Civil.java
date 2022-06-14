package ar.edu.ort.p1.examenes.ds.empresa_constructora.src;

public class Civil extends Obra {

	private int meses;

	public Civil(String responsable, Dificultad dificultad, int meses) {
		super(responsable, dificultad);
		this.meses = meses;
	}

	@Override
	public int duracion() {
		return this.meses;
	}

}
