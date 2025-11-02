package ar.edu.ort.p1.examenes._02_ds.gimnasio.src;

public enum TipoAerobica {
	BICICLETA(15), CINTA(21);

	private int edadMinima;

	/*----------------------------------------------------------------------------*/

	private TipoAerobica(int edadMinima) {
		this.setEdadMinima(edadMinima);
	}

	/*----------------------------------------------------------------------------*/

	public int getEdadMinima() {
		return edadMinima;
	}

	public void setEdadMinima(int edadMinima) {
		this.edadMinima = edadMinima;
	}
}
