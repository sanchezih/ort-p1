package ar.edu.ort.p1.examenes._02_ds.empresa_constructora.src;

public abstract class Obra implements Estimable {

	private String responsable;
	private Dificultad dificultad;

	/*----------------------------------------------------------------------------*/

	public Obra(String responsable, Dificultad dificultad) {
		this.responsable = responsable;
		this.dificultad = dificultad;
	}

	/*----------------------------------------------------------------------------*/

	public Dificultad getDificultad() {
		return dificultad;
	}

	/**
	 * Ejercicio B: El metodo estimar(), de la clase que corresponda, que debe
	 * devolver (no mostrar por consola) el tiempo estimado de cada obra.
	 */
	public int estimar() {
		return this.duracion() * this.dificultad.getIndice();
	}

	public abstract int duracion();

	/*----------------------------------------------------------------------------*/

	// Metodos complementarios

	public void mostrarInformacion() {
		System.out.println(this.getClass().getSimpleName() + " responsabilidad de " + this.responsable
				+ " - Tiempo estimado: " + estimar() + " meses");
	}
}
