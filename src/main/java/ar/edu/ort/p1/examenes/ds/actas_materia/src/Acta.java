package ar.edu.ort.p1.examenes.ds.actas_materia.src;

public class Acta {

	private CategoriaExamen categoriaExamen;
	private ListaAlumnosPorNombre alumnos;

	/*----------------------------------------------------------------------------*/

	public Acta(CategoriaExamen categoria) {
		this.categoriaExamen = categoria;
		this.alumnos = new ListaAlumnosPorNombre();
	}

	/*----------------------------------------------------------------------------*/

	public ListaAlumnosPorNombre getAlumnos() {
		return alumnos;
	}

	public void asignar(Alumno alumno) {
		this.alumnos.add(alumno);
	}

	public void mostrar() {
		System.out.println("Categoria: " + this.categoriaExamen);
		for (Alumno a : alumnos) {
			System.out.println("\t-> " + a);
		}
	}
}
