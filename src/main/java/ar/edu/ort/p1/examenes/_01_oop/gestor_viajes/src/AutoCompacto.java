package ar.edu.ort.p1.examenes._01_oop.gestor_viajes.src;

public class AutoCompacto extends Auto {

	private static final double ADICIONAL_POR_PORTAEQUIPAJE = 500.0;
	private boolean tienePortaEquipajes;

	/**
	 * Ejercicio 1
	 * 
	 * @param id
	 * @param costoBaseKm
	 * @param tieneAC
	 * @param tipoCombustible
	 * @param tienePortaEquipajes
	 */
	public AutoCompacto(String id, double costoBaseKm, boolean tieneAC, TipoCombustible tipoCombustible,
			boolean tienePortaEquipajes) {
		super(id, costoBaseKm, tieneAC, tipoCombustible);
		this.tienePortaEquipajes = tienePortaEquipajes;
	}

	@Override
	public double getAdicional() {
		return this.tienePortaEquipajes ? ADICIONAL_POR_PORTAEQUIPAJE : 0.0;
	}

}
