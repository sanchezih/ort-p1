package edu.ort.u4.tp4.ej04_viajes_tren.src;

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

	public int cantVecesRecorrida(Estacion e) {
		return this.recorrido.pasaPor(e) ? this.cantViajeros : 0;
	}

}
