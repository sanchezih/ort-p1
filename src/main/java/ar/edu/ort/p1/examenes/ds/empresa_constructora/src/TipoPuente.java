package ar.edu.ort.p1.examenes.ds.empresa_constructora.src;

public enum TipoPuente {

	VIGA(1), ARCO(2), COLGANTE(3);

	private int indice;

	private TipoPuente(int indice) {
		this.indice = indice;
	}

	public int getIndice() {
		return indice;
	}

}
