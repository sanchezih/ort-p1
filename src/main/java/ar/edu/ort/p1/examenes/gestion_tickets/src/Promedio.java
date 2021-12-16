package ar.edu.ort.p1.examenes.gestion_tickets.src;

public class Promedio {

	private int total;
	private int cantidad;

	public void incrementarPromedio(int valor) {
		this.cantidad++;
		this.total = this.total + valor;
	}

	public double obtenerPromedio() {
		double resultado = 0;
		if (this.cantidad != 0) {
			resultado = this.total / this.cantidad;
		}
		return resultado;
	}

}
