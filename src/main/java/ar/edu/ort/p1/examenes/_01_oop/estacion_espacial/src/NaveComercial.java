package ar.edu.ort.p1.examenes._01_oop.estacion_espacial.src;

public abstract class NaveComercial extends Nave {

	private String companiaNaviera;

	public NaveComercial(String planetaOrigen, String ultimoPlanetaVisitado, int cantTripulantes,
			String companiaNaviera) {
		super(planetaOrigen, ultimoPlanetaVisitado, cantTripulantes);
		this.companiaNaviera = companiaNaviera;
	}

}
