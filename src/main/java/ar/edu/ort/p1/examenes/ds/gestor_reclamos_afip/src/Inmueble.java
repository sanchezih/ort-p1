package ar.edu.ort.p1.examenes.ds.gestor_reclamos_afip.src;

public class Inmueble implements Tributable {

	private final static double COEFICIENTE_IMPONIBLE = 0.3;

	private int superficie;
	private String direccion;
	private double valorFiscal;

	public Inmueble(int superficie, String direccion, double valorFiscal) {
		this.superficie = superficie;
		this.direccion = direccion;
		this.valorFiscal = valorFiscal;
	}

	@Override
	public double determinarImpuesto() {
		return this.valorFiscal * COEFICIENTE_IMPONIBLE;
	}

}
