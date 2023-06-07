package ar.edu.ort.p1.examenes.ds.gestor_reclamos_afip.src;

public class Arma implements Tributable {

	private final static int VALOR_IMPUESTO = 200;

	private String marca;
	private String modelo;
	private int numeroDeSerie;

	/*----------------------------------------------------------------------------*/

	public Arma(String marca, String modelo, int numeroDeSerie) {
		this.marca = marca;
		this.modelo = modelo;
		this.numeroDeSerie = numeroDeSerie;
	}

	/*----------------------------------------------------------------------------*/

	/**
	 * Ejercicio B: El metodo determinarImpuesto(), de la/s clase/s que corresponda,
	 * que debe devolver (no mostrar por consola) el monto a abonar en impuestos.
	 */
	@Override
	public double determinarImpuesto() {
		return VALOR_IMPUESTO;
	}

}
