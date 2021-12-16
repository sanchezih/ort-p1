package ar.edu.ort.p1.unidades.u3.ejemplos.interfacesEjemploFigura.src.figuras;

public class Rectangulo implements Figura {
	private float lado;
	private float altura;

	public Rectangulo(float lado, float altura) {
		this.lado = lado;
		this.altura = altura;
	}

	@Override
	public float area() {
		return lado * altura;
	}

}