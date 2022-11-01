package ar.edu.ort.p1.unidades.u5.practico05.ej07_academia_cursos.src;

import java.util.ArrayList;

import ar.edu.ort.p1.unidades.u5.practico05.ej07_academia_cursos.src.listasordenadas.ListaDeAlumnosPorEdad;

public class Curso {

	private final static int CINCO = 5;

	private String codigo;
	private String titulo;
	private int hsDuracion;
	private NivelCurso nivel;
	private ListaDeAlumnosPorEdad listaDeAlumnosPorEdad = new ListaDeAlumnosPorEdad();

	public void agregarAlumno(Alumno a) {
		this.listaDeAlumnosPorEdad.add(a);
	}

	public Curso(String codigo, String titulo, int hsDuracion, NivelCurso nivel) {
		super();
		this.codigo = codigo;
		this.titulo = titulo;
		this.hsDuracion = hsDuracion;
		this.nivel = nivel;
	}

	public String getCodigo() {
		return codigo;
	}

	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public int getHsDuracion() {
		return hsDuracion;
	}

	public void setHsDuracion(int hsDuracion) {
		this.hsDuracion = hsDuracion;
	}

	public NivelCurso getNivel() {
		return nivel;
	}

	public void setNivel(NivelCurso nivel) {
		this.nivel = nivel;
	}

	@Override
	public String toString() {
		return "Curso [codigo=" + codigo + ", titulo=" + titulo + ", hsDuracion=" + hsDuracion + ", nivel=" + nivel
				+ "]";
	}

	/*----------------------------------------------------------------------------*/

	public double calcularPromedio() {
		double acum = 0;
		double promedio = 0;

		if (listaDeAlumnosPorEdad.size() > 0) {
			for (Alumno alumno : this.listaDeAlumnosPorEdad) {
				acum += alumno.getEdad();
			}
			promedio = acum / this.listaDeAlumnosPorEdad.size();
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
	public ArrayList<Alumno> top5AlumnosMasLongevos() {
		ArrayList<Alumno> alumnos = new ArrayList<Alumno>();
		int idx = 0;

		while (idx < this.listaDeAlumnosPorEdad.size() && idx < CINCO) {
			alumnos.add(this.listaDeAlumnosPorEdad.get(idx));
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
