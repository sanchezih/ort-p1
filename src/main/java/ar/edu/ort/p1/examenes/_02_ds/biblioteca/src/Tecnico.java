package ar.edu.ort.p1.examenes._02_ds.biblioteca.src;

public class Tecnico extends Libro {

	private Complejidad complejidad;

	/*----------------------------------------------------------------------------*/

	public Tecnico(String codigo, String titulo, String autor, Complejidad complejidad) {
		super(codigo, titulo, autor);
		this.complejidad = complejidad;
	}

	/*----------------------------------------------------------------------------*/

	public boolean puedeLeer(Usuario usuario) {
		return complejidad != Complejidad.ALTA || (usuario instanceof Docente);
	}

}
