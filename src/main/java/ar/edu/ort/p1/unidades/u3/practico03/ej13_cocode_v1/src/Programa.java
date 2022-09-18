package ar.edu.ort.p1.unidades.u3.practico03.ej13_cocode_v1.src;

import java.util.ArrayList;

public class Programa implements Calificable {

	private String id;
	private String nombre;
	private String nomResponsable;
	private boolean pasoPruebasUnitarias;
	private ArrayList<Fuente> fuentes;

	public Programa(String id, String nombre, String nomResponsable, boolean pasoPruebasUnitarias) {
		this.id = id;
		this.nombre = nombre;
		this.nomResponsable = nomResponsable;
		this.pasoPruebasUnitarias = pasoPruebasUnitarias;
		this.fuentes = new ArrayList<Fuente>();
	}

	/*----------------------------------------------------------------------------*/

	/**
	 * Ejercicio B: Realizar los metodos indiceCalidad de las clases calificables.
	 */
	@Override
	public double indiceCalidad() {
		return pasoPruebasUnitarias ? promedioIndiceCalidadFuentes() : 0;
	}

	private double promedioIndiceCalidadFuentes() {
		double acu = 0;
		int cantFuentes = this.fuentes.size();
		for (Fuente f : this.fuentes) {
			acu += f.indiceCalidad();
		}
		return cantFuentes > 0 ? acu / cantFuentes : 0;
	}

	/*----------------------------------------------------------------------------*/

	/**
	 * Ejercicio D: El metodo mostrarDetalleDeMetodo de la clase Programa que recibe
	 * el nombre de un metodo y muestra por consola su cantidad de parametros,
	 * instrucciones y ramificaciones, ademas del indice de calidad.
	 * 
	 * Si no existe, se informa tal situacion.
	 * 
	 * @param nombreMetodo
	 */
	public void mostrarDetalleDeMetodo(String nombreMetodo) {
		Metodo m;
		m = buscarMetodo(nombreMetodo);
		if (m != null) {
			m.mostrarDatos();
		} else {
			System.out.println("No existe metodo " + nombreMetodo);
		}
	}

	private Metodo buscarMetodo(String nombreMetodo) {
		int i = 0;
		Metodo metodoEncontrado = null;
		while (i < this.fuentes.size() && metodoEncontrado == null) {
			Fuente f = this.fuentes.get(i);
			if (f instanceof FuenteProgramacion) {
				metodoEncontrado = ((FuenteProgramacion) f).buscarMetodo(nombreMetodo);
			}
			i++;
		}
		return metodoEncontrado;
	}

	/*----------------------------------------------------------------------------*/

	/**
	 * Ejercicio E: El metodo listadoFuentesMayoresAlPromedio de la clase Programa
	 * que retorne una lista de fuentes cuyo indice de calidad supere al promedio.
	 * 
	 * @return
	 */
	public ArrayList<Fuente> listadoFuentesMayoresAlPromedio() {
		ArrayList<Fuente> lista = new ArrayList<Fuente>();
		double promCalidadFuentes = promedioIndiceCalidadFuentes();
		for (Fuente f : this.fuentes) {
			if (f.indiceCalidad() > promCalidadFuentes) {
				lista.add(f);
			}
		}
		return lista;
	}

	@Override
	public String toString() {
		return "Programa [Nombre=" + nombre + ", Responsable=" + nomResponsable + "]";
	}

	/*----------------------------------------------------------------------------*/

	// Metodos complementarios

	public void agregarFuente(Fuente fuente) {
		this.fuentes.add(fuente);
	}
}
