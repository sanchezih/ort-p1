package ar.edu.ort.p1.examenes._01_oop.gestor_viajes.src;

public class AutoPremium extends Auto {

	private static final int MIN_ANTIGUEDAD = 2;
	private static final int ADICIONAL_POR_ANTIGUEDAD = 2500;
	private static final boolean TIENE_AC = true;
	private int antiguedad;

	/**
	 * Ejercicio 1
	 * 
	 * @param id
	 * @param costoBaseKm
	 * @param tipoCombustible
	 * @param antiguedad
	 */
	public AutoPremium(String id, double costoBaseKm, TipoCombustible tipoCombustible, int antiguedad) {
		super(id, costoBaseKm, TIENE_AC, tipoCombustible);
		this.antiguedad = antiguedad;
	}

	@Override
	public double getAdicional() {
		return this.antiguedad <= MIN_ANTIGUEDAD ? ADICIONAL_POR_ANTIGUEDAD : 0.0;
	}

}
