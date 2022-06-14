package ar.edu.ort.p1.examenes.ds.empresa_constructora.src;

public abstract class Obra implements Estimable {

	private String responsable;
	private Dificultad dificultad;

	public Obra(String responsable, Dificultad dificultad) {
		super();
		this.responsable = responsable;
		this.dificultad = dificultad;
	}

	public Dificultad getDificultad() {
		return dificultad;
	}

	/**
	 * Ejercicio B: El metodo estimar(), de la clase que corresponda, que debe
	 * devolver (no mostrar por consola) el tiempo estimado de cada obra.
	 */
	public int estimar() {

		int duracion = this.duracion();
		int indice = this.dificultad.getIndice();
		return duracion * indice;
	}

	public abstract int duracion();

}
