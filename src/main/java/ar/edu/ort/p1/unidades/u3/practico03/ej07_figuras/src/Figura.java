package ar.edu.ort.p1.unidades.u3.practico03.ej07_figuras.src;

public abstract class Figura {
	private String color;

	public Figura(String color) {
		super();
		this.color = color;
	}

	public abstract double calcularArea();

	public abstract double calcularPerimetro();

	public String getColor() {
		return color;
	}

}
