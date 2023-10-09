package ar.edu.ort.p1.unidades.u5.practico05.ej01_libros_dvds.src;

public class Libro {
	private String ISBN;
	private int nroPaginas;

	/*----------------------------------------------------------------------------*/

	/**
	 * 
	 * @param iSBN
	 * @param nroPaginas
	 */
	public Libro(String iSBN, int nroPaginas) {
		super();
		ISBN = iSBN;
		this.nroPaginas = nroPaginas;
	}

	/*----------------------------------------------------------------------------*/

	public int getNroPaginas() {
		return nroPaginas;
	}

}
