package ar.edu.ort.p1.examenes.ds.empresa_logistica.src;

import java.time.LocalDate;
import java.time.Period;

public class Fecha {
	private int dia;
	private Mes mes;
	private int anio;

	public Fecha(int dia, Mes mes, int anio) {
		super();
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

	public Mes getMes() {
		return mes;
	}

	public void setMes(Mes mes) {
		this.mes = mes;
	}

	public int getAnio() {
		return anio;
	}

	public void setAnio(int anio) {
		this.anio = anio;
	}

	static long aniosHastaHoy(int anio) {
		LocalDate pdate = LocalDate.of(anio, 01, 01);
		LocalDate now = LocalDate.now();
		Period diff = Period.between(pdate, now);
		return diff.getYears();
	}

	@Override
	public String toString() {
		return dia + "-" + mes + "-" + anio;
	}
}
