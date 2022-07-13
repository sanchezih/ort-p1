package ar.edu.ort.p1.examenes.ds.gestor_reclamos_afip.src;

public class Auto extends Vehiculo {

	private final static double ADICIONAL = 0.2;
	private boolean esDeLujo;

	public Auto(boolean esDeLujo) {
		super();
		this.esDeLujo = esDeLujo;
	}

	@Override
	protected double calcularAdicional(double valorBase) {
		return valorBase * ADICIONAL;
	}

}
