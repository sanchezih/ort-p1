package ar.edu.ort.p1.examenes._01_oop.gestor_pedidos.src;

public enum Tamanio {

	GRANDE(130, 2), //
	MEDIANA(100, 1.5f), //
	PEQUENIA(80, 1);

	private int capacidadCM3;
	private float coefPrecio;

	/*----------------------------------------------------------------------------*/

	private Tamanio(int capacidadCM3, float coefPrecio) {
		this.capacidadCM3 = capacidadCM3;
		this.coefPrecio = coefPrecio;
	}

	/*----------------------------------------------------------------------------*/

	public int getCapacidadCM3() {
		return capacidadCM3;
	}

	public float getCoefPrecio() {
		return coefPrecio;
	}

}
