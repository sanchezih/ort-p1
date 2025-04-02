package ar.edu.ort.p1.unidades.unidad03.practico03.ej09_estaciones_peaje.src;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;

import ar.edu.ort.p1.unidades.unidad03.practico03.ej09_estaciones_peaje.src.mediosdepago.Efectivo;
import ar.edu.ort.p1.unidades.unidad03.practico03.ej09_estaciones_peaje.src.mediosdepago.MedioDePagoElectronico;

public class EstacionDePeaje {

	private String id;
	private String descripcion;
	private ArrayList<Cabina> cabinas;

	/*----------------------------------------------------------------------------*/

	public EstacionDePeaje(String id, String descripcion) {
		this.id = id;
		this.descripcion = descripcion;
		this.cabinas = new ArrayList<>();
	}

	/*----------------------------------------------------------------------------*/

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public void agregarCabina(Cabina c) {
		this.cabinas.add(c);

	}

	/**
	 * Metodo de clase que devuelve la hora del momento en el que se invoca.
	 * 
	 * @return
	 */
	public static int dameHoraActual() {
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("HH");
		return Integer.parseInt(dtf.format(LocalDateTime.now()));
	}

	/*----------------------------------------------------------------------------*/

	/**
	 * Ejercicio C: La explotacion del método cabinasConEfectivo que devuelva una
	 * lista unicamente con las cabinas que aceptan efectivo como medio de pago.
	 * 
	 * @return
	 */
	public ArrayList<Cabina> cabinasConEfectivo() {

		ArrayList<Cabina> cabinasConEFE = new ArrayList<>();

		for (Cabina c : this.cabinas) {
			if (c.getMedioDePago() instanceof Efectivo) {
				cabinasConEFE.add(c);
			}
		}
		return cabinasConEFE;
	}

	/*----------------------------------------------------------------------------*/

	/**
	 * Ejercicio D: La explotacion del metodo promedioDemora que devuelva cual es el
	 * promedio de dias de demora entre todas las cabinas que acepten medios de pago
	 * electronicos (SUBE o PASE).
	 * 
	 * @return
	 */
	public double promedioDemora() {

		double sumatoria = 0;
		double cantidad = 0;

		for (Cabina c : this.cabinas) {
			if (c.getMedioDePago() instanceof MedioDePagoElectronico) {
				sumatoria = sumatoria + ((MedioDePagoElectronico) c.getMedioDePago()).getDiasDemora();
				cantidad++;
			}
		}
		return (cantidad > 0 ? (sumatoria / cantidad) : 0);
	}
}
