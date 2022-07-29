package ar.edu.ort.p1.examenes.oop.examenes_conducir.src;

import ar.edu.ort.p1.util.pojo.Persona;

public abstract class Examen implements Evaluable {

	private Persona persona;
	private String fecha;

	public Examen(String fecha, Persona persona) {
		super();
		this.fecha = fecha;
		this.persona = persona;
	}

}
