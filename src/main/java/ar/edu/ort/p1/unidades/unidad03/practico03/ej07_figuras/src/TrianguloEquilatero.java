package ar.edu.ort.p1.unidades.unidad03.practico03.ej07_figuras.src;

public class TrianguloEquilatero extends Figura {

	private double lado;

	/*----------------------------------------------------------------------------*/

	public TrianguloEquilatero(String color, double lado) {
		super(color);
		this.lado = lado;
	}

	/*----------------------------------------------------------------------------*/

	@Override
	public double calcularArea() {
		return (this.lado * calcularAltura()) / 2;
	}

	private double calcularAltura() {
		return Math.sqrt(this.lado * this.lado - (this.lado / 2) * (this.lado / 2));
	}

	@Override
	public double calcularPerimetro() {
		return 3 * this.lado;
	}

}
