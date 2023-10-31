package ar.edu.ort.p1.examenes.ds.generador_de_actas_para_finales.src;

public class Acta {

	private CategoriaExamen categoriaExamen;
	private ListaAlumnosPorNombre alumnos;

	/*----------------------------------------------------------------------------*/

	/**
	 * 
	 * @param categoria
	 */
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
