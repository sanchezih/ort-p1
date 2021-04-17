package tp3_cabinas_peaje.src;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

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
		double importeACobrar = 0;

		System.out.println("Voy a cobrarle al vehiculo " + v.toString());
		System.out.println("Es hora pico? " + isHoraPico());
		System.out.println(v.getCategoria().tarifaBase);
		
		double desc = this.getMp().obtenerDescuento();

	
		
		
		return importeACobrar;

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
