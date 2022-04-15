package ar.edu.ort.p1.util;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.Date;

public class Fecha {

	private int dia;
	private int mes;
	private int anio;

	public Fecha(int dia, int mes, int anio) {
		this.dia = dia;
		this.mes = mes;
		this.anio = anio;
	}

	public int getDia() {
		return dia;
	}

	public void setDia(int dia) {
		this.dia = dia;
	}

	public int getMes() {
		return mes;
	}

	public void setMes(int mes) {
		this.mes = mes;
	}

	public int getAnio() {
		return anio;
	}

	public void setAnio(int anio) {
		this.anio = anio;
	}

	/**
	 * Metodo que devuelve un numero que indica la diferencia de dias entre una
	 * fecha y hoy.
	 * 
	 * @return
	 */
	public long getCantidadDiasHastaHoy() {
		return ChronoUnit.DAYS.between(LocalDate.of(this.anio, this.mes, this.dia), LocalDate.now());
	}

	/**
	 * Metodo que devuelve la fecha de hoy.
	 * 
	 * @return
	 */
	public static Fecha hoy() {
		Date date = new Date();
		return new Fecha(date.getDay(), date.getMonth(), date.getYear());
	}

}
