package ar.edu.ort.p1.unidades.u3.practico03.ej09_puerto_parana.src;

public class Velero extends Embarcacion {

	private int cantMastiles;

	@Override
	public double precioAdicional() {
		return getValorAdicional() * this.cantMastiles;
	}

}
