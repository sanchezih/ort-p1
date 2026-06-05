package ar.edu.ort.p1.examenes._02_ds.biblioteca.src;

public abstract class Libro {

	private String codigo;
	private String titulo;
	private String autor;
	private ColaDeUsuarios registro;

	/*----------------------------------------------------------------------------*/

	/**
	 * 
	 * @param codigo
	 * @param titulo
	 * @param autor
	 * @param registro
	 */
	public Libro(String codigo, String titulo, String autor) {
		this.codigo = codigo;
		this.titulo = titulo;
		this.autor = autor;
		this.registro = new ColaDeUsuarios();
	}

	/*----------------------------------------------------------------------------*/

	public boolean esLibro(String codigoLibro) {
		return this.codigo.equals(codigoLibro);
	}

	public void anotar(Usuario u) {
		registro.add(u);
	}

	protected abstract boolean puedeLeer(Usuario usuario);

	/*----------------------------------------------------------------------------*/

	/**
	 * 
	 * @return
	 */
	public UsuariosPorEdad ordenarUsuariosPorEdad() {
	
		UsuariosPorEdad lista = new UsuariosPorEdad();
		Usuario cent = null;
		Usuario actual;
		
		registro.add(cent);
		actual = registro.remove();
		
		while (actual != cent) {
			lista.add(actual);
			registro.add(actual);
			actual = registro.remove();
		}
		
		return lista;
	}

}
