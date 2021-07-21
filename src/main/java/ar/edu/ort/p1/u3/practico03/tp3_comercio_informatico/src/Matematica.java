package ar.edu.ort.p1.u3.practico03.tp3_comercio_informatico.src;

public class Matematica {

	public static double sumarPorcentaje(double a, double b) {
		return a + calcularPorcentaje(a, b);
	}

	public static double calcularPorcentaje(double a, double b) {
		return (a * b) / 100;
	}
}
