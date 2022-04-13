package ar.edu.ort.p1.unidades.u3.practico03.ej09_puerto_parana.src;

public class Yate extends Embarcacion {

	private int camarotes;

	public Yate(String matricula, double eslora, int anioFabricacion, String duenio, double valorBase,
			double valorAdicional, int camarotes) {
		super(matricula, eslora, anioFabricacion, duenio, valorBase, valorAdicional);
		this.camarotes = camarotes;
	}

	/**
	 * Se obtiene multiplicando el valorAdicional por la cantidad de camarotes
	 */
	@Override
	public double getPrecioAdicional() {
		return getValorAdicional() * this.camarotes;
	}
}
