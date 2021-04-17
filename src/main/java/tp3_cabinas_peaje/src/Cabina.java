package tp3_cabinas_peaje.src;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

import polimorfismo.src.polimorfismo.Entrenador;

public class Cabina {
	private static final int HP1_HORA_MIN = 6;
	private static final int HP1_HORA_MAX = 10;
	private static final int HP2_HORA_MIN = 17;
	private static final int HP2_HORA_MAX = 20;
	private static final double INCREMENTO = 0.08;
	private int id;
	private MedioDePago mp;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public static int getHp1HoraMin() {
		return HP1_HORA_MIN;
	}

	public static int getHp1HoraMax() {
		return HP1_HORA_MAX;
	}

	public static int getHp2HoraMin() {
		return HP2_HORA_MIN;
	}

	public static int getHp2HoraMax() {
		return HP2_HORA_MAX;
	}

	public static double getIncremento() {
		return INCREMENTO;
	}

	public MedioDePago getMp() {
		return mp;
	}

	public void setMp(MedioDePago mp) {
		this.mp = mp;
	}

	public double cobrar(Vehiculo v) {

		System.out.println("Soy la cabina " + this.id + ", mi medio de pago es " + this.mp.getClass().getSimpleName()
				+ " y voy a cobrarle al vehiculo " + v.toString());

		System.out.println("En este momento el medio de pago " + this.mp.getClass().getSimpleName()
				+ " tiene una demora en el cobro de " + ((MedioDePagoElectronico) this.mp).getCantDiasDemoraPago());

		System.out.println("Ahora mismo es hora pico? " + isHoraPico());
		System.out.println("La tarifa base para la categoria " + v.getCategoria() + " es " + v.getCategoria().tarifaBase
				+ " y tiene un descuento del " + this.mp.obtenerDescuento());

		return (v.getCategoria().tarifaBase - (v.getCategoria().tarifaBase / this.mp.obtenerDescuento()));

	}

	public boolean isHoraPico() {
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("HH");
		LocalDateTime now = LocalDateTime.now();
		int hora = Integer.parseInt(dtf.format(now));
		if ((hora >= HP1_HORA_MIN && hora < HP1_HORA_MAX) || (hora >= HP2_HORA_MIN && hora < HP2_HORA_MAX)) {
			return true;
		} else {
			return false;
		}
	}

}
