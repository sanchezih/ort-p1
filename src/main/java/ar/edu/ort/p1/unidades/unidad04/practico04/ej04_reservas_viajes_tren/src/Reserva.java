package ar.edu.ort.p1.unidades.unidad04.practico04.ej04_reservas_viajes_tren.src;

public class Reserva {

	private String codigo;
	private int cantViajeros;
	private Recorrido recorrido;

	/*----------------------------------------------------------------------------*/

	public Reserva(String codigo, int cantViajeros, Recorrido recorrido) {
		this.codigo = codigo;
		this.cantViajeros = cantViajeros;
		this.recorrido = recorrido;
	}

	/*----------------------------------------------------------------------------*/

	/**
	 * 
	 * @return
	 */
	public double getPrecio() {
		return this.recorrido.getPrecio() * this.cantViajeros;
	}

	/**
	 * 
	 * @param estacion
	 * @return
	 */
	public int cantVecesRecorrida(Estacion estacion) {
		return this.recorrido.pasaPor(estacion) ? this.cantViajeros : 0;
	}

}
