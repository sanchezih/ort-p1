package ar.edu.ort.p1.unidades.u3.ejemplos._04_polimorfismo_basado_en_interfaces._01_figuras.src;

public class Rectangulo implements Figura {

	private float lado;
	private float altura;

	public Rectangulo(float lado, float altura) {
		this.lado = lado;
		this.altura = altura;
	}

	@Override
	public float calcularArea() {
		return lado * altura;
	}

}