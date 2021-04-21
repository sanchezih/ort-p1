package tp3_cabinas_peaje.src;

public class Cabina {
	private static final int HP1_HORA_MIN = 6;
	private static final int HP1_HORA_MAX = 10;

	private static final int HP2_HORA_MIN = 15;
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

	// Con polimorfismo
	public double cobrar(Vehiculo v) {
		double importeFinal = 0;
		importeFinal = v.getCategoria().tarifaBase;
		if (isHoraPico()) {
			importeFinal = importeFinal + (importeFinal * Cabina.INCREMENTO);
		}
		importeFinal = importeFinal - (importeFinal * this.mp.obtenerDescuento());
		return (importeFinal);
	}
	
	// SIN polimorfismo
	//	public double cobrar(Vehiculo v) {
	//		double res = 0;
	//		System.out.println(
	//				"Vehiculo " + v.toString() + " de tipo " + v.getCategoria() + "\nTarifa base para la categoria = "
	//						+ v.getCategoria().tarifaBase + "\nAhora mismo es hora pico? " + isHoraPico());
	//		if (isHoraPico()) {
	//			res = v.getCategoria().tarifaBase + (v.getCategoria().tarifaBase * Cabina.INCREMENTO);
	//		}
	//
	//		if (this.mp instanceof MedioDePagoElectronico) {
	//			System.out.println("El medio de pago de la cabina es " + this.mp.getClass().getSimpleName()
	//					+ " y tiene una demora en el cobro de " + ((MedioDePagoElectronico) this.mp).getCantDiasDemoraPago()
	//					+ " dia/s. Se hara un decuento del " + this.mp.obtenerDescuento() + "%");
	//			res = res - (v.getCategoria().tarifaBase * this.mp.obtenerDescuento());
	//		} else {
	//			System.out.println("El medio de pago de la cabina es " + this.mp.getClass().getSimpleName()
	//					+ ". Se hara un decuento del " + this.mp.obtenerDescuento());
	//		}
	//		return (res);
	//	}

	public boolean isHoraPico() {
		int hora = Integer.parseInt(EstacionDePeaje.dameHoraActual());
		if ((hora >= HP1_HORA_MIN && hora < HP1_HORA_MAX) || (hora >= HP2_HORA_MIN && hora < HP2_HORA_MAX)) {
			return true;
		} else {
			return false;
		}
	}

	@Override
	public String toString() {
		return "Cabina [id=" + id + ", mp=" + mp + "]";
	}

}
