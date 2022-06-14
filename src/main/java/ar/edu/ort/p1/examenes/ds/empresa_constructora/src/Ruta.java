package ar.edu.ort.p1.examenes.ds.empresa_constructora.src;

public class Ruta extends Vial {

	private int carriles;
	private ColaPuentes puentes;

	public Ruta(String responsable, Dificultad dificultad, int km, int carriles) {
		super(responsable, dificultad, km);
		this.carriles = carriles;
		this.puentes = new ColaPuentes();
	}

	@Override
	public int duracion() {
		return this.carriles * super.getKm() + duracionPuentes();
	}

	private int duracionPuentes() {
		int duracion = 0;
		Puente cent = new Puente("xxx", Dificultad.BAJO, -1, TipoPuente.ARCO);
		Puente puente;

		this.puentes.add(cent);
		puente = this.puentes.remove(); // ihs
		while (puente != cent) {
			duracion = duracion + puente.duracion();
			puentes.add(puente);
			puente = this.puentes.remove();// ihs
		}
		return duracion;
	}

	/*----------------------------------------------------------------------------*/

	// Metodos complementarios

	public void agregarPuente(Puente puente) {
		this.puentes.add(puente);
	}

}
