package edu.ort.p1.u5.practico05.ej07_academia_cursos.src;

import java.util.ArrayList;

import edu.ort.p1.u5.practico05.ej07_academia_cursos.src.listasordenadas.ListaAlumnosPorEdad;

public class Curso {
	private final static int CINCO = 5;

	private String codigo;
	private String titulo;
	private int hsDuracion;
	private NivelCurso nivel;
	private ListaAlumnosPorEdad listaAlumnosPorEdad = new ListaAlumnosPorEdad();

	public void agregarAlumno(Alumno a) {
		this.listaAlumnosPorEdad.add(a);
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

	public ArrayList<Alumno> top5AlumnosMasLongevos() {
		ArrayList<Alumno> alumnos = new ArrayList<Alumno>();
		int idx = 0;

		while (idx < this.listaAlumnosPorEdad.size() && idx < CINCO) {
			alumnos.add(listaAlumnosPorEdad.get(idx));
			idx++;
		}
		return alumnos;
	}

	public double calcularPromedio() {
		double acum = 0;

		for (Alumno a : listaAlumnosPorEdad) {
			acum += a.getEdad();
		}
		if (listaAlumnosPorEdad.size() > 0) {
			acum = acum / listaAlumnosPorEdad.size();
		}
		return acum;
	}

	@Override
	public String toString() {
		return "Curso [codigo=" + codigo + ", titulo=" + titulo + ", hsDuracion=" + hsDuracion + ", nivel=" + nivel
				+ "]";
	}

	/*----------------------------------------------------------------------------*/
	
	/* Metodos extra */

	public void mostrarTop5AlumnosMasLongevos() {
		System.out.println("\nMuestro los 5 alumnos mas longevos del cusro " + this.getCodigo());
		for (Alumno a : top5AlumnosMasLongevos()) {
			System.out.println(a);
		}
	}

}
