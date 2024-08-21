package ar.edu.ort.p1.unidades.unidad03.practico03.ej07_figuras.src;

import java.util.ArrayList;
import java.util.List;

public class GrupoDeFiguras {

	private List<Figura> figuras;

	/*----------------------------------------------------------------------------*/

	public GrupoDeFiguras() {
		this.figuras = new ArrayList<>();
	}

	/*----------------------------------------------------------------------------*/

	/**
	 * Ejercicio C: La explotacion del metodo mostrarInfoDeFiguras de la clase
	 * GrupoDeFiguras que muestre por pantalla el color, el area y el perimetro de
	 * cada figura de la lista.
	 */
	public void mostrarInfoDeFiguras() {
		for (Figura figura : this.figuras) {
			System.out.println("Color de la figura: " + figura.getColor());
			System.out.println("Area de la figura: " + figura.calcularArea());
			System.out.println("Perimetro de la figura: " + figura.calcularPerimetro());
			System.out.println();
		}
	}

	/*----------------------------------------------------------------------------*/

	// Metodos complementarios

	public void agregarFigura(Figura figura) {
		this.figuras.add(figura);
	}

}
