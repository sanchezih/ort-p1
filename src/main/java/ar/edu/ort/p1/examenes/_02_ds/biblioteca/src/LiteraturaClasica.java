package ar.edu.ort.p1.examenes._02_ds.biblioteca.src;

public class LiteraturaClasica extends Libro {

	private Genero genero;

	/*----------------------------------------------------------------------------*/

	public LiteraturaClasica(String codigo, String titulo, String autor, Genero genero) {
		super(codigo, titulo, autor);
		this.genero = genero;
	}

	/*----------------------------------------------------------------------------*/

	public boolean puedeLeer(Usuario usuario) {
		return usuario.mayorQue(genero.getEdadMinima());
	}

}
