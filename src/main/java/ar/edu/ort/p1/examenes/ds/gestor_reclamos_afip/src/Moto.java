package ar.edu.ort.p1.examenes.ds.gestor_reclamos_afip.src;

public class Moto extends Vehiculo {

	private final static double COEFICIENTE_IMPONIBLE_CALLE = 1600;
	private final static double COEFICIENTE_IMPONIBLE_DEPORTIVA = 6000;
	private final static double COEFICIENTE_IMPONIBLE_CHOPERA = 3000;

	private Tipo tipo;

	public Moto(Tipo tipo) {
		super();
		this.tipo = tipo;
	}

	@Override
	protected double calcularAdicional(double valorBase) {
		double resultado;
		if (this.tipo.equals(Tipo.CALLE)) {
			resultado = valorBase + COEFICIENTE_IMPONIBLE_CALLE;
		} else {
			if (this.tipo.equals(Tipo.DEPORTIVA)) {
				resultado = valorBase + COEFICIENTE_IMPONIBLE_DEPORTIVA;
			} else {
				resultado = valorBase + COEFICIENTE_IMPONIBLE_CHOPERA;
			}
		}
		return resultado;
	}

}
