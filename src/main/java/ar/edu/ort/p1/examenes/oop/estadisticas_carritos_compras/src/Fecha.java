package ar.edu.ort.p1.examenes.oop.estadisticas_carritos_compras.src;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

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

	public static int diasTranscurridos(Fecha fecha1, Fecha fecha2) {
		return (int) ChronoUnit.DAYS.between(LocalDate.of(fecha1.anio, fecha1.mes, fecha1.dia),
				LocalDate.of(fecha2.anio, fecha2.mes, fecha2.dia));
	}
}
