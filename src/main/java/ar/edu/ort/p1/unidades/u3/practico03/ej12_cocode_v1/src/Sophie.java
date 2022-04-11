package ar.edu.ort.p1.unidades.u3.practico03.ej12_cocode_v1.src;

import java.util.ArrayList;

public class Sophie {

	private ArrayList<Programa> programas;

	public Sophie() {
		this.programas = new ArrayList<Programa>();
	}

	/*----------------------------------------------------------------------------*/

	/**
	 * Ejercicio C: El metodo programasPorDebajoDe que recibe un umbral de calidad
	 * minima y retorna una lista de programas cuyo indice de calidad este por
	 * debajo de tal valor.
	 * 
	 * @param umbralMinimo
	 * @return
	 */
	public ArrayList<Programa> programasPorDebajoDe(int umbralMinimo) {
		ArrayList<Programa> lista = new ArrayList<Programa>();
		for (Programa p : this.programas) {
			if (p.indiceCalidad() < umbralMinimo) {
				lista.add(p);
			}
		}
		return lista;
	}

	/*----------------------------------------------------------------------------*/

	// Metodos complementarios
	public void agregarPrograma(Programa programa) {
		this.programas.add(programa);
	}
}
