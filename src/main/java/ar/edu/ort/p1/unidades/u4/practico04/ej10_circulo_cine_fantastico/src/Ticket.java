package ar.edu.ort.p1.unidades.u4.practico04.ej10_circulo_cine_fantastico.src;

import ar.edu.ort.p1.util.Fecha;

public class Ticket {

	private Fecha fecha;
	private String titulo;
	private String nombreEspectador;

	/**
	 * 
	 * @param fecha
	 * @param titulo
	 * @param nombreEspectador
	 */
	public Ticket(Fecha fecha, String titulo, String nombreEspectador) {
		super();
		this.fecha = fecha;
		this.titulo = titulo;
		this.nombreEspectador = nombreEspectador;
	}

	@Override
	public String toString() {
		return "Ticket [fecha=" + fecha + ", titulo=" + titulo + ", espectador=" + nombreEspectador + "]";
	}

}
