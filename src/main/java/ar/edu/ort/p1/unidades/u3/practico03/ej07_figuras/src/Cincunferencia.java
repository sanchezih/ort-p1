package ar.edu.ort.p1.unidades.u3.practico03.ej07_figuras.src;

public class Cincunferencia extends Figura {

	private double radio;

	public Cincunferencia(String color, double radio) {
		super(color);
		this.radio = radio;
	}

	@Override
	public double calcularArea() {
		return this.radio * this.radio * Math.PI;
	}

	@Override
	public double calcularPerimetro() {
		return 2 * Math.PI * this.radio;
	}
}
