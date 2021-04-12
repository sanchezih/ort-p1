package interfacesEjemploFigura.src;

public class Cuadrado implements Figura {
	private float lado;

	public Cuadrado(float lado) {
		this.lado = lado;
	}

	public float area() {
		return lado * lado;
	}
}