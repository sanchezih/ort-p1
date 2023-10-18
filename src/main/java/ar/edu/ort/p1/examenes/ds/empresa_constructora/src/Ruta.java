package ar.edu.ort.p1.examenes.ds.empresa_constructora.src;

public class Ruta extends ObraVial {

	private int carriles;
	private ColaDePuentes puentes;

	public Ruta(String responsable, Dificultad dificultad, int km, int carriles, boolean interprovincial) {
		super(responsable, dificultad, km, interprovincial);
		this.carriles = carriles;
		this.puentes = new ColaDePuentes();
	}

	@Override
	public int duracion() {
		return this.carriles * super.getKmsLongitud() + duracionPuentes();
	}

	private int duracionPuentes() {
		int duracion = 0;
		Puente cent = new Puente("xxx", Dificultad.BAJO, -1, TipoPuente.ARCO, false);
		Puente puente;

		this.puentes.add(cent);
		puente = this.puentes.remove();
		while (puente != cent) {
			duracion = duracion + puente.duracion();
			this.puentes.add(puente);
			puente = this.puentes.remove();
		}
		return duracion;
	}

	/*----------------------------------------------------------------------------*/

	// Metodos complementarios

	public void agregarPuente(Puente puente) {
		this.puentes.add(puente);
	}

}
