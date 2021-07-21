package ar.edu.ort.p1.u5.practico05.ej01_libros_dvds.src;

public class Libro {
	private String ISBN;
	private int nroPaginas;

	public Libro(String iSBN, int nroPaginas) {
		super();
		ISBN = iSBN;
		this.nroPaginas = nroPaginas;
	}

	public String getISBN() {
		return ISBN;
	}

	public void setISBN(String iSBN) {
		ISBN = iSBN;
	}

	public int getNroPaginas() {
		return nroPaginas;
	}

	public void setNroPaginas(int nroPaginas) {
		this.nroPaginas = nroPaginas;
	}

}
