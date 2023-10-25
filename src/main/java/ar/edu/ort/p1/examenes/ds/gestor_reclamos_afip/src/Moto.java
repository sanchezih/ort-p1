package ar.edu.ort.p1.examenes.ds.gestor_reclamos_afip.src;

public class Moto extends Vehiculo {

	private final static double COEFICIENTE_IMPONIBLE_CALLE = 100;
	private final static double COEFICIENTE_IMPONIBLE_DEPORTIVA = 150;
	private final static double COEFICIENTE_IMPONIBLE_CHOPERA = 200;

	private TipoDeMoto tipoDeMoto;

	/*----------------------------------------------------------------------------*/

	public Moto(String marca, String modelo, int cilindrada, TipoDeMoto tipoDeMoto) {
		super(marca, modelo, cilindrada);
		this.tipoDeMoto = tipoDeMoto;
	}

	/*----------------------------------------------------------------------------*/

	@Override
	protected double calcularAdicional() {

		double resultado;

		if (this.tipoDeMoto.equals(TipoDeMoto.CALLE)) {
			resultado = COEFICIENTE_IMPONIBLE_CALLE;
		} else {
			if (this.tipoDeMoto.equals(TipoDeMoto.DEPORTIVA)) {
				resultado = COEFICIENTE_IMPONIBLE_DEPORTIVA;
			} else {
				resultado = COEFICIENTE_IMPONIBLE_CHOPERA;
			}
		}
		return resultado;
	}

}
