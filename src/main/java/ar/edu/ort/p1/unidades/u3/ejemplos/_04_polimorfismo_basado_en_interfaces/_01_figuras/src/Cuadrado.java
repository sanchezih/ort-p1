package ar.edu.ort.p1.unidades.u3.ejemplos._04_polimorfismo_basado_en_interfaces._01_figuras.src;

public class Cuadrado implements Figura {

	private float lado;

	public Cuadrado(float lado) {
		this.lado = lado;
	}

	@Override
	public float calcularArea() {
		return lado * lado;
	}

}