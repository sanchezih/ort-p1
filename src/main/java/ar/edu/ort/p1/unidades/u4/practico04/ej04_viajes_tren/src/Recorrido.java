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

	/**
	 * 
	 * @return
	 */
	public double getPrecio() {
		double precio = cantEstacionesRecorridas() * PRECIO_X_ESTACION;

		if (fueCompleto()) {
			precio = precio - precio * DCTO;
		}
		return precio;
	}

	/**
	 * 
	 * @return
	 */
	private boolean fueCompleto() {
		return cantEstacionesRecorridas() == Estacion.values().length - 1;
	}

	/**
	 * 
	 * @return
	 */
	private int cantEstacionesRecorridas() {
		int idx1;
		int idx2;
		idx1 = this.estDestino.ordinal();
		idx2 = this.estPartida.ordinal();

		return Math.abs(idx1 - idx2); // El valor absoluto asegura que siempre sea positivo
	}

	/**
	 * 
	 * @param estacion
	 * @return
	 */
	public boolean pasaPor(Estacion estacion) {
		int idxPartida = this.estPartida.ordinal();
		int idxDestino = this.estDestino.ordinal();
		int idxEstacion = estacion.ordinal();

		if (idxPartida > idxDestino) {
			int aux = idxPartida;
			idxPartida = idxDestino;
			idxDestino = aux;
		}

		return idxEstacion >= idxPartida && idxEstacion <= idxDestino;
	}
}
