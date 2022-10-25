package ar.edu.ort.p1.examenes.ds.gestor_incidentes.src;

public class Promedio {

	private double total;
	private int cantidad;

	public void incrementarPromedio(double valor) {
		this.total = this.total + valor;
		this.cantidad++;
	}

	public double obtenerPromedio() {
		double resultado = 0;
		if (this.cantidad != 0) {
			resultado = this.total / this.cantidad;
		}
		return resultado;
	}
}
