package ar.edu.ort.p1.unidades.unidad04.practico04.ej10_circulo_cine_fantastico.src;

import com.github.sanchezih.util.Fecha;

public class Ticket {

	private Fecha fecha;
	private String titulo;
	private String nombreEspectador;

	/*----------------------------------------------------------------------------*/

	/**
	 * 
	 * @param fecha
	 * @param titulo
	 * @param nombreEspectador
	 */
	public Ticket(Fecha fecha, String titulo, String nombreEspectador) {
		this.fecha = fecha;
		this.titulo = titulo;
		this.nombreEspectador = nombreEspectador;
	}

	/*----------------------------------------------------------------------------*/

	@Override
	public String toString() {
		return "Ticket [fecha=" + fecha + ", titulo=" + titulo + ", espectador=" + nombreEspectador + "]";
	}

}
