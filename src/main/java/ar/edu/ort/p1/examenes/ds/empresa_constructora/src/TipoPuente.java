package ar.edu.ort.p1.examenes.ds.empresa_constructora.src;

public enum TipoPuente {

	VIGA(10), ARCO(20), COLGANTE(30);

	private int indice;

	private TipoPuente(int indice) {
		this.indice = indice;
	}

	public int getIndice() {
		return indice;
	}

}
