package ar.edu.ort.p1.examenes.ds.gestor_reclamos_afip.src;

public class Arma implements Tributable {

	private final static int VALOR_IMPUESTO = 600;

	private String marca;
	private String modelo;
	private int nro;

	@Override
	public double determinarImpuesto() {
		return VALOR_IMPUESTO;
	}

}
