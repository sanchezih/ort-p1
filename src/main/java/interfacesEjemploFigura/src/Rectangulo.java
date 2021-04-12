package interfacesEjemploFigura.src;

public class Rectangulo implements Figura {
	private float lado;
	private float altura;

	public Rectangulo(float lado, float altura) {
		this.lado = lado;
		this.altura = altura;
	}

	public float area() {
		return lado * altura;
	}
}