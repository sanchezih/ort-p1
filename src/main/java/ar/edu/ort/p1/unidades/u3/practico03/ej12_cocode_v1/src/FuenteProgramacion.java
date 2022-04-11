package ar.edu.ort.p1.unidades.u3.practico03.ej12_cocode_v1.src;

import java.util.ArrayList;

public class FuenteProgramacion extends Fuente {
	private ArrayList<Metodo> metodos;
	private TipoProgramacion tipo;

	/*----------------------------------------------------------------------------*/

	/**
	 * Ejercicio B: Realizar los metodos indiceCalidad de las clases calificables.
	 */
	@Override
	public double indiceCalidad() {
		return promedioIndiceCalidadMetodos();
	}

	private double promedioIndiceCalidadMetodos() {
		double acu = 0;
		int cantFuentes = this.metodos.size();
		for (Metodo m : this.metodos) {
			acu += m.indiceCalidad();
		}
		return cantFuentes > 0 ? acu / cantFuentes : 0;
	}

	/*----------------------------------------------------------------------------*/

	public Metodo buscarMetodo(String nombreMetodo) {
		int i = 0;
		Metodo metodoEncontrado = null;
		
		while (i < this.metodos.size() && metodoEncontrado == null) {
			Metodo m = this.metodos.get(i);
			if (m.getNombre().equals(nombreMetodo)) {
				metodoEncontrado = m;
			}
			i++;
		}
		return metodoEncontrado;
	}

	/*----------------------------------------------------------------------------*/

}
