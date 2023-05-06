package ar.edu.ort.p1.examenes.ds.gestor_reclamos_afip.src;

public abstract class Vehiculo implements Tributable {

	private final static double PORCENTAJE_DE_CILINDRADA = 0.1;

	private String marca;
	private String modelo;
	protected int cilindrada;

	/*----------------------------------------------------------------------------*/

	public Vehiculo(String marca, String modelo, int cilindrada) {
		super();
		this.marca = marca;
		this.modelo = modelo;
		this.cilindrada = cilindrada;
	}

	/*----------------------------------------------------------------------------*/

	protected abstract double calcularAdicional();

	/**
	 * Ejercicio B: El metodo determinarImpuesto(), de la/s clase/s que corresponda,
	 * que debe devolver (no mostrar por consola) el monto a abonar en impuestos.
	 */
	@Override
	public double determinarImpuesto() {
		double valorBase = cilindrada * PORCENTAJE_DE_CILINDRADA;
		return valorBase + calcularAdicional();
	}

}
