package ar.edu.ort.p1.unidades.u4.practico04.ej04_viajes_tren.src;

public class Recorrido {

	private static double PRECIO_X_ESTACION = 50;
	private static double DCTO = 0.2;
	private Estacion estDestino;
	private Estacion estPartida;

	/*----------------------------------------------------------------------------*/

	public Recorrido(Estacion estDestino, Estacion estPartida) {
		this.estDestino = estDestino;
		this.estPartida = estPartida;
	}

	/*----------------------------------------------------------------------------*/

	public double getPrecio() {
		double precio;

		precio = cantEstacionesRecorridas() * PRECIO_X_ESTACION;
		if (fueCompleto()) {
			precio = precio - precio * DCTO;
		}
		return precio;
	}

	private boolean fueCompleto() {
		return cantEstacionesRecorridas() == Estacion.values().length - 1;
	}

	private int cantEstacionesRecorridas() {
		int idx1;
		int idx2;
		idx1 = this.estDestino.ordinal();
		idx2 = this.estPartida.ordinal();

		return Math.abs(idx1 - idx2); // El valor absoluto asegura que siempre sea positivo
	}

	public boolean pasaPor(Estacion e) {
		int idxPartida, idxDestino, idxE = 0;

		idxPartida = this.estPartida.ordinal();
		idxDestino = this.estDestino.ordinal();
		if (idxPartida > idxDestino) {
			int aux = idxPartida;
			idxPartida = idxDestino;
			idxDestino = aux;
		}
		return idxE >= idxPartida && idxE <= idxDestino;
	}
}
