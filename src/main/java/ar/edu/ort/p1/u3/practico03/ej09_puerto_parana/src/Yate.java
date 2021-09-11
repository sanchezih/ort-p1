package ar.edu.ort.p1.u3.practico03.ej09_puerto_parana.src;

public class Yate extends Embarcacion {

	private int camarotes;

	@Override
	public double precioAdicional() {
		return getValorAdicional() * this.camarotes;
	}
}
