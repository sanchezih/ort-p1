package ar.edu.ort.p1.util;

public class Matematica {

	public static double sumarPorcentaje(double a, double b) {
		return a + calcularPorcentaje(a, b);
	}

	public static double calcularPorcentaje(double a, double b) {
		return (a * b) / 100;
	}

	public static double promedio(double acu, double total) {
		double porc = 0;
		if (total > 0) {
			porc = acu / total;
		}
		return porc;
	}

	public static double porcentaje(int casos, int total) {
		return promedio(casos, total);
	}
}
