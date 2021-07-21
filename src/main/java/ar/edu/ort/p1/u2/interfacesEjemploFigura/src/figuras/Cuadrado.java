package ar.edu.ort.p1.u2.interfacesEjemploFigura.src.figuras;

public class Cuadrado implements Figura {
	private float lado;

	public Cuadrado(float lado) {
		this.lado = lado;
	}

	@Override
	public float area() {
		return lado * lado;
	}

}