package ar.edu.ort.p1.util;

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

	public int restar() {
		// TODO Auto-generated method stub
		return 0;
	}

	/**
	 * Metodo que devuelve la fecha de hoy
	 * @return
	 */
	public static Fecha hoy() {
		Date date = new Date();
		return new Fecha(date.getDay(), date.getMonth(), date.getYear());
	}

}
