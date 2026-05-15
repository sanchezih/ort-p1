package ar.edu.ort.p1.unidades.unidad04.practico04.ej04_reservas_viajes_tren.src;

public class Recorrido {

	private static final double PRECIO_X_ESTACION = 50;
	private static final double DCTO = 0.2;

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
		
		int idx1 = this.estDestino.ordinal();
		int idx2 = this.estPartida.ordinal();

		return Math.abs(idx1 - idx2); // El valor absoluto asegura que siempre sea positivo
	}

	/**
	 * Retorna true si la estacion recibida como parametro se encuentra dentro del
	 * recorrido, false en caso contrario
	 * 
	 * @param estacion
	 * @return
	 */
	public boolean pasaPor(Estacion estacion) {

		int idxPartida = this.estPartida.ordinal();
		int idxDestino = this.estDestino.ordinal();
		int idxEstacionBuscada = estacion.ordinal();

		return idxEstacionBuscada >= Math.min(idxPartida, idxDestino)
				&& idxEstacionBuscada <= Math.max(idxPartida, idxDestino);
	}
}
