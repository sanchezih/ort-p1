package ar.edu.ort.p1.examenes._01_oop.estacion_espacial.src;

public class PuntoDeAtraque implements Manifestable {

	private Nave naveEnganchada;

	/*----------------------------------------------------------------------------*/

	public PuntoDeAtraque() {
	}

	public PuntoDeAtraque(Nave naveEnganchada) {
		this.naveEnganchada = naveEnganchada;
	}

	/*----------------------------------------------------------------------------*/

	@Override
	public void imprimirManifiesto() {
		if (!estaDisponible()) {
			this.naveEnganchada.imprimirManifiesto();
		}
	}

	public boolean estaDisponible() {
		return this.naveEnganchada == null;
	}

	public boolean estacionar(Nave nave) {
		boolean sePudo = false;
		if (estaDisponible()) {
			this.naveEnganchada = nave;
			sePudo = true;
		}
		return sePudo;
	}

}
