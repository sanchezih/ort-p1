package ar.edu.ort.p1.examenes._02_ds.gestor_reclamos_afip.src;

import ar.edu.ort.tp1.u5.tda.impl.ColaNodos;
import ar.edu.ort.tp1.u5.tda.impl.PilaNodos;
import ar.edu.ort.tp1.u5.tda.interfaces.Cola;
import ar.edu.ort.tp1.u5.tda.interfaces.ListaOrdenada;
import ar.edu.ort.tp1.u5.tda.interfaces.Pila;

public class GestorAfip {

	private ListaOrdenada<Integer, Ciudadano> ciudadanos;
	private Pila<Reclamo> reclamos;

	/*----------------------------------------------------------------------------*/

	public GestorAfip() {
		this.ciudadanos = new ListaDeCiudadanosPorDniDesc();
		this.reclamos = new PilaNodos<>();
	}

	/*----------------------------------------------------------------------------*/

	/**
	 * Ejercicio C: El metodo evaluarReclamos() de la clase que corresponda, que
	 * debe procesar los reclamos de los ciudadanos devolviendo una estructura que
	 * contenga los reclamos a procesar segun lo indicado.
	 * 
	 * @return
	 */
	public Cola<Reclamo> evaluarReclamos() {
		Ciudadano ciudadano = null;
		Reclamo reclamo = null;
		Cola<Reclamo> colaDeReclamos = new ColaNodos<>();

		while (!this.reclamos.isEmpty()) {
			reclamo = this.reclamos.pop();
			System.out.print("\t-> Se analiza " + reclamo.toString() + " - ");
			ciudadano = buscarCuidadano(reclamo.getDni());
			if (ciudadano != null) {
				if (ciudadano.determinarImpuesto() != reclamo.getImpuestoCobrado()) {
					colaDeReclamos.add(reclamo);
					System.out.print("VEREDICTO: A LUGAR");
				} else {
					System.out.print("VEREDICTO: NO A LUGAR");
				}
			} else {
				System.out.print("VEREDICTO: NO A LUGAR");
			}
			System.out.println();
		}
		return colaDeReclamos;
	}

	/**
	 * 
	 * @param dni
	 * @return
	 */
	private Ciudadano buscarCuidadano(int dni) {
		return this.ciudadanos.search(dni);
	}

	/*----------------------------------------------------------------------------*/

	// Metodos complementarios

	public void agregarCiudadano(Ciudadano ciudadano) {
		this.ciudadanos.add(ciudadano);
		System.out.println("\t-> Se agrega " + ciudadano.toString() + " - Deberia pagar un total de $"
				+ ciudadano.determinarImpuesto());
	}

	public void agregarReclamo(Reclamo reclamo) {
		this.reclamos.push(reclamo);
		System.out.println("\t-> Se agrega " + reclamo.toString());
	}

	public void mostrarCiudadanos() {
		System.out.println("Muestro los ciudadanos que hay en la lista...");
		for (Ciudadano ciudadano : ciudadanos) {
			System.out.println("\t-> " + ciudadano);
		}
	}

}
