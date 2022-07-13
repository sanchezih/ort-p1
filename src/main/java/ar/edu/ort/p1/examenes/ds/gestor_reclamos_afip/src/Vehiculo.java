package ar.edu.ort.p1.examenes.ds.gestor_reclamos_afip.src;

public abstract class Vehiculo implements Tributable {

	private String marca;
	private String modelo;
	private int cilindrada;

	protected abstract double calcularAdicional(double valorBase);

	@Override
	public double determinarImpuesto() {
		double resultado = 0;
		resultado = resultado * 0.3;
		return calcularAdicional(resultado);
	}

}
