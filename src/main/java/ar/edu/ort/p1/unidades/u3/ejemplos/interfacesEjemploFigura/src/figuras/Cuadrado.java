package ar.edu.ort.p1.unidades.u3.ejemplos.interfacesEjemploFigura.src.figuras;

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