package ar.edu.ort.p1.unidades.u4.practico04.ej04_viajes_tren.src;

public class Reserva {

	private String codigo;
	private int cantViajeros;
	private Recorrido recorrido;

	public Reserva(String codigo, int cantViajeros, Recorrido recorrido) {
		super();
		this.codigo = codigo;
		this.cantViajeros = cantViajeros;
		this.recorrido = recorrido;
	}

	public double getPrecio() {
		return this.recorrido.getPrecio();
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
