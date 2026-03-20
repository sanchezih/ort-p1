package ar.edu.ort.p1.unidades.unidad03.practico03.ej07_figuras.src;

public abstract class Figura {

	private String color;

	/*----------------------------------------------------------------------------*/

	public Figura(String color) {
		this.color = color;
	}

	/*----------------------------------------------------------------------------*/

	public String getColor() {
		return color;
	}

	public abstract double calcularArea();

	public abstract double calcularPerimetro();

}
