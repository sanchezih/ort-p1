package ar.edu.ort.p1.unidades.unidad05.practico05.ej07_academia_cursos.src;

import java.util.ArrayList;
import java.util.List;

import ar.edu.ort.p1.unidades.unidad05.practico05.ej07_academia_cursos.src.listasordenadas.ListaDeAlumnosPorEdadDesc;
import ar.edu.ort.tp1.u5.tda.interfaces.ListaOrdenada;

public class Curso {

	private static final int CINCO = 5;

	private String codigo;
	private String titulo;
	private int hsDuracion;
	private NivelCurso nivel;
	private ListaOrdenada<Integer, Alumno> listaDeAlumnosPorEdadDesc = new ListaDeAlumnosPorEdadDesc();

	/*----------------------------------------------------------------------------*/

	public Curso(String codigo, String titulo, int hsDuracion, NivelCurso nivel) {
		this.codigo = codigo;
		this.titulo = titulo;
		this.hsDuracion = hsDuracion;
		this.nivel = nivel;
	}

	/*----------------------------------------------------------------------------*/

	public String getCodigo() {
		return codigo;
	}

	public String getTitulo() {
		return titulo;
	}

	public NivelCurso getNivel() {
		return nivel;
	}

	@Override
	public String toString() {
		return "Curso [codigo=" + codigo + ", titulo=" + titulo + ", hsDuracion=" + hsDuracion + ", nivel=" + nivel
				+ "]";
	}

	public void agregarAlumno(Alumno alumno) {
		this.listaDeAlumnosPorEdadDesc.add(alumno);
	}

	/*----------------------------------------------------------------------------*/

	/**
	 * 
	 * @return
	 */
	public double calcularPromedio() {
		double acum = 0;
		double promedio = 0;

		if (listaDeAlumnosPorEdadDesc.size() > 0) {
			for (Alumno alumno : this.listaDeAlumnosPorEdadDesc) {
				acum += alumno.getEdad();
			}
			promedio = acum / this.listaDeAlumnosPorEdadDesc.size();
		}
		return promedio;
	}

	/*----------------------------------------------------------------------------*/

	/**
	 * Ejercicio D: La explotacion del metodo top5AlumnosMasLongevos, de la clase
	 * Curso que retorne a los 5 alumnos mas longevos (mayor edad) que posea (si no
	 * llega a 5, devolver los que haya). Asumir que no hay edades repetidas.
	 * 
	 * @return
	 */
	public List<Alumno> top5AlumnosMasLongevos() {
		List<Alumno> alumnos = new ArrayList<>();
		int idx = 0;

		while (idx < this.listaDeAlumnosPorEdadDesc.size() && idx < CINCO) {
			alumnos.add(this.listaDeAlumnosPorEdadDesc.get(idx));
			idx++;
		}
		return alumnos;
	}

	/*----------------------------------------------------------------------------*/

	// Metodos complementarios

	public void mostrarTop5AlumnosMasLongevos() {
		System.out.println("Muestro los 5 alumnos mas longevos del cusro " + this.getCodigo());
		for (Alumno alumno : top5AlumnosMasLongevos()) {
			System.out.println("\t" + alumno);
		}
		System.out.println();
	}

}
