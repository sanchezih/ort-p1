package ar.edu.ort.p1.unidades.u3.practico03.ej07_figuras.src;

public class Rectangulo extends Figura {

	private double base;
	private double altura;

	public Rectangulo(String color, double base, double altura) {
		super(color);
		this.base = base;
		this.altura = altura;
	}

	@Override
	public double calcularArea() {
		return this.base * this.altura;
	}

	@Override
	public double calcularPerimetro() {
		return 2 * this.base + 2 * this.altura;
	}

}
