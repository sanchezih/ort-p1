package edu.ort.u5.tp5.ej01_dvds;

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
