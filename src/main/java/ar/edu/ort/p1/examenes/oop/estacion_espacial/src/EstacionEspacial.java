package ar.edu.ort.p1.examenes.oop.estacion_espacial.src;

import java.util.ArrayList;

public class EstacionEspacial {

	private final static int CANT_ATRAQUES = 10; // Este valor es arbitrario
	private ArrayList<PuntoDeAtraque> atraques;

	/*----------------------------------------------------------------------------*/

	public EstacionEspacial() {
		this.atraques = new ArrayList<PuntoDeAtraque>();

		for (int i = 0; i < CANT_ATRAQUES; i++) {
			this.atraques.add(new PuntoDeAtraque());
		}
		System.out.println("Se creo la estacion espacial con " + this.atraques.size() + " atraques.");
		System.out.println();
	}

	/*----------------------------------------------------------------------------*/

	/**
	 * Ejercicio A: imprimirManifiestos(), que muestre por consola los manifiestos
	 * de todas las naves que haya estacionadas.
	 */
	public void imprimirManifiestos() {
		for (PuntoDeAtraque pda : this.atraques) {
			pda.imprimirManifiesto();
		}
	}

	/*----------------------------------------------------------------------------*/

	/**
	 * Ejercicio B: estacionarNave(...), que reciba una nave y la intente estacionar
	 * en el primer punto de atraque libre, siempre que la nave este en condiciones
	 * de estacionarse:
	 * 
	 * - Las naves Cargo pueden estacionarse si y solo si el volumen de carga no
	 * supera 100 m3.
	 * 
	 * - Las naves Cruiser pueden estacionarse si y solo si hay pasajeros.
	 * 
	 * Devuelve si se pudo estacionar o no.
	 * 
	 * @param nave
	 * @return
	 */
	public boolean estacionarNave(Nave nave) {
		boolean sePudo = false;
		PuntoDeAtraque atraqueLibre;

		if (nave.sePuedeEstacionar()) {
			atraqueLibre = buscarAtraqueLibre();
			if (atraqueLibre != null) {
				sePudo = atraqueLibre.estacionar(nave);
			}
		}
		return sePudo;
	}

	/**
	 * 
	 * @return
	 */
	private PuntoDeAtraque buscarAtraqueLibre() {
		int i = 0;
		PuntoDeAtraque atraqueLibre = null;

		while (i < this.atraques.size() && atraqueLibre == null) {
			if (this.atraques.get(i).estaDisponible()) {
				atraqueLibre = this.atraques.get(i);
			} else {
				i++;
			}
		}
		return atraqueLibre;
	}

}
