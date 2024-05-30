package ar.edu.ort.p1.examenes._02_ds.empresa_constructora.src;

public class ObraCivil extends Obra {

	private String ciudad;
	private int meses;

	public ObraCivil(String responsable, Dificultad dificultad, String ciudad, int meses) {
		super(responsable, dificultad);
		this.meses = meses;
		this.ciudad = ciudad;
	}

	@Override
	public int duracion() {
		return this.meses;
	}

}
