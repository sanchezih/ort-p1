package ar.edu.ort.p1.examenes.examenes_conducir.src;

public abstract class Examen implements Evaluable {

	private Persona persona;

	public Examen(Persona persona) {
		super();
		this.persona = persona;
	}

}
