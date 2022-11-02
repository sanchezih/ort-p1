package ar.edu.ort.p1.examenes.ds.fiscalizables.src;

public class Cargo {

	private String nombreInstitucion;
	private int cantHoras;
	private Nivel tipo;

	public Cargo(String nombreInstitucion, int cantHoras, Nivel tipo) {
		super();
		this.nombreInstitucion = nombreInstitucion;
		this.cantHoras = cantHoras;
		this.tipo = tipo;
	}

	public Nivel getTipo() {
		return tipo;
	}

}
