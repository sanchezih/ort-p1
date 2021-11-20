package ar.edu.ort.p1.extra.examenes.municipalidad_solicitudes.src;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.concurrent.TimeUnit;

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

	public long cantidadDiasHastaHoy() {

		SimpleDateFormat sdf = new SimpleDateFormat("MM/dd/yyyy", Locale.ENGLISH);
		Date firstDate;
		long diff = 0;
		try {
			firstDate = sdf.parse((this.mes.ordinal()+1) + "/" + this.dia + "/" + this.anio);
			long diffInMillies = Math.abs(new Date().getTime() - firstDate.getTime());
			diff = TimeUnit.DAYS.convert(diffInMillies, TimeUnit.MILLISECONDS);
		} catch (ParseException e) {
			e.printStackTrace();
		}
		return diff;
	}

	@Override
	public String toString() {
		return dia + "-" + mes + "-" + anio;
	}

}
