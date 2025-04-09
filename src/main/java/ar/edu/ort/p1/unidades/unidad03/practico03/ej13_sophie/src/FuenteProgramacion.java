package ar.edu.ort.p1.unidades.unidad03.practico03.ej13_sophie.src;

import java.util.ArrayList;

public class FuenteProgramacion extends Fuente {

	private TipoProgramacion tipo;
	private ArrayList<Metodo> metodos;

	/*----------------------------------------------------------------------------*/

	public FuenteProgramacion(String nombre, String path, TipoProgramacion tipo) {
		super(nombre, path);
		this.tipo = tipo;
		this.metodos = new ArrayList<Metodo>();
	}

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
		for (Metodo metodo : this.metodos) {
			acu += metodo.indiceCalidad();
		}
		return cantFuentes > 0 ? acu / cantFuentes : 0;
	}

	/*----------------------------------------------------------------------------*/

	public Metodo buscarMetodo(String nombreMetodo) {
		int i = 0;
		Metodo metodoEncontrado = null;

		while (i < this.metodos.size() && metodoEncontrado == null) {
			Metodo metodo = this.metodos.get(i);
			if (metodo.getNombre().equals(nombreMetodo)) {
				metodoEncontrado = metodo;
			}
			i++;
		}
		return metodoEncontrado;
	}

	/*----------------------------------------------------------------------------*/

	// Metodos complementarios
	public void agregarMetodo(Metodo metodo) {
		this.metodos.add(metodo);
	}
}
