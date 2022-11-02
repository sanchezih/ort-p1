package ar.edu.ort.p1.examenes.ds.gestor_reclamos_afip.src;

public class Moto extends Vehiculo {

	private final static double COEFICIENTE_IMPONIBLE_CALLE = 100;
	private final static double COEFICIENTE_IMPONIBLE_DEPORTIVA = 150;
	private final static double COEFICIENTE_IMPONIBLE_CHOPERA = 200;

	private Tipo tipo;

	/*----------------------------------------------------------------------------*/

	public Moto(String marca, String modelo, int cilindrada, Tipo tipo) {
		super(marca, modelo, cilindrada);
		this.tipo = tipo;
	}

	/*----------------------------------------------------------------------------*/

	@Override
	protected double calcularAdicional() {
		double resultado;
		if (this.tipo.equals(Tipo.CALLE)) {
			resultado = COEFICIENTE_IMPONIBLE_CALLE;
		} else {
			if (this.tipo.equals(Tipo.DEPORTIVA)) {
				resultado = COEFICIENTE_IMPONIBLE_DEPORTIVA;
			} else {
				resultado = COEFICIENTE_IMPONIBLE_CHOPERA;
			}
		}
		return resultado;
	}

}
