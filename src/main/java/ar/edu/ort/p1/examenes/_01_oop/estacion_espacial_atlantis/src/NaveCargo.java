package ar.edu.ort.p1.examenes._01_oop.estacion_espacial_atlantis.src;

public class NaveCargo extends NaveComercial {

	private static final double VOL_MAX_ESTACIONAR = 100;

	private Carga carga;

	/*----------------------------------------------------------------------------*/

	public NaveCargo(String planetaOrigen, String ultimoPlanetaVisitado, int cantTripulantes, String companiaNaviera,
			Carga carga) {
		super(planetaOrigen, ultimoPlanetaVisitado, cantTripulantes, companiaNaviera);
		this.carga = carga;
	}

	/*----------------------------------------------------------------------------*/

	@Override
	public void completarManifiesto() {
		this.carga.imprimirManifiesto();
	}

	/*----------------------------------------------------------------------------*/

	@Override
	public boolean sePuedeEstacionar() {
		return !volumenDeCargaSuperiorA(VOL_MAX_ESTACIONAR);
	}

	private boolean volumenDeCargaSuperiorA(double valor) {
		return carga.volumenSuperiorA(valor);
	}

	@Override
	public String toString() {
		return super.toString() + "\nNaveCargo [carga=" + carga + "]";
	}

}
