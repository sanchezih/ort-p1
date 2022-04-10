package ar.edu.ort.p1.unidades.u3.practico03.ej09_puerto_parana.src;

public class Velero extends Embarcacion {

	private int cantMastiles;

	public Velero(String matricula, double eslora, int anioFabricacion, String duenio, double valorBase,
			double valorAdicional, int cantMastiles) {
		super(matricula, eslora, anioFabricacion, duenio, valorBase, valorAdicional);
		this.cantMastiles = cantMastiles;
	}

	/**
	 * Se obtiene multiplicando el valorAdicional por la cantidad de mastiles
	 */
	@Override
	public double precioAdicional() {
		return getValorAdicional() * this.cantMastiles;
	}

}
