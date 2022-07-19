package ar.edu.ort.p1.util;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.Calendar;

/**
 * Clase Fecha Java
 * 
 * @author ihsanch
 *
 */
public class Fecha {

	private int dia;
	private int mes;
	private int anio;

	// Constructores
	public Fecha() {
	}

	public Fecha(int dia, int mes, int anio) {
		this.dia = dia;
		this.mes = mes;
		this.anio = anio;
	}

	// Getters y Setters
	public int getDia() {
		return dia;
	}

	public int getMes() {
		return mes;
	}

	public int getAnio() {
		return anio;
	}

	public void setDia(int dia) {
		dia = dia;
	}

	public void setMes(int mes) {
		mes = mes;
	}

	public void setAnio(int anio) {
		anio = anio;
	}

	/**
	 * Metodo para comprobar si la fecha es correcta
	 * 
	 * @return
	 */
	public boolean fechaCorrecta() {
		boolean diaCorrecto, mesCorrecto, añoCorrecto;
		añoCorrecto = anio > 0;
		mesCorrecto = mes >= 1 && mes <= 12;
		switch (mes) {
		case 2:
			if (esBisiesto()) {
				diaCorrecto = dia >= 1 && dia <= 29;
			} else {
				diaCorrecto = dia >= 1 && dia <= 28;
			}
			break;
		case 4:
		case 6:
		case 9:
		case 11:
			diaCorrecto = dia >= 1 && dia <= 30;
			break;
		default:
			diaCorrecto = dia >= 1 && dia <= 31;
		}
		return diaCorrecto && mesCorrecto && añoCorrecto;
	}

	/**
	 * Metodo privado para comprobar si el anio es bisiesto. Este metodo lo utiliza
	 * el metodo fechaCorrecta
	 * 
	 * @return
	 */
	private boolean esBisiesto() {
		return (anio % 4 == 0 && anio % 100 != 0 || anio % 400 == 0);
	}

	/**
	 * Metodo que modifica la fecha cambiandola por la del dia siguiente
	 */
	public void diaSiguiente() {
		dia++;
		if (!fechaCorrecta()) {
			dia = 1;
			mes++;
			if (!fechaCorrecta()) {
				mes = 1;
				anio++;
			}
		}
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
		LocalDate currentDate = LocalDate.now();
		return new Fecha(currentDate.getDayOfMonth(), currentDate.getMonth().getValue(), currentDate.getYear());
	}

	/**
	 * Devuelve el anio actual en int
	 */
	public static int anioActual() {
		return Calendar.getInstance().get(Calendar.YEAR);
	}

	/**
	 * Método toString para mostrar la fecha
	 */
	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		if (dia < 10) {
			sb.append("0");
		}
		sb.append(dia);
		sb.append("-");
		if (mes < 10) {
			sb.append("0");
		}
		sb.append(mes);
		sb.append("-");
		sb.append(anio);
		return sb.toString();
	}
}