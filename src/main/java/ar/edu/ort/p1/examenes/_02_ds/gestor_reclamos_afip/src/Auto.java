package ar.edu.ort.p1.examenes._02_ds.gestor_reclamos_afip.src;

public class Auto extends Vehiculo {

	private static final double ADICIONAL = 0.15;

	/*----------------------------------------------------------------------------*/

	public Auto(String marca, String modelo, int cilindrada) {
		super(marca, modelo, cilindrada);
	}

	/*----------------------------------------------------------------------------*/

	@Override
	protected double calcularAdicional() {
		return this.cilindrada * ADICIONAL;
	}

}
