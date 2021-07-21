package ar.edu.ort.p1.u4.practico04.ej09_estacionamiento.src;

import java.util.Date;

public class Fecha {

	private int dia;
	private int mes;
	private int anio;

	public Fecha(int dia, int mes, int anio) {
		super();
		this.dia = dia;
		this.mes = mes;
		this.anio = anio;
	}

	public int getDia() {
		return dia;
	}

	public int getMes() {
		return mes;
	}

	public int getAnio() {
		return anio;
	}

	public static Fecha hoy() {
		Date date = new Date();
		return new Fecha(date.getDay(), date.getMonth(), date.getYear());
	}

}
