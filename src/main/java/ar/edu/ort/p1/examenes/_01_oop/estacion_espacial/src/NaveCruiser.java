package ar.edu.ort.p1.examenes._01_oop.estacion_espacial.src;

public class NaveCruiser extends NaveComercial {

	private int cantPasajeros;

	/*----------------------------------------------------------------------------*/

	public NaveCruiser(String planetaOrigen, String ultimoPlanetaVisitado, int cantTripulantes, String companiaNaviera,
			int cantPasajeros) {
		super(planetaOrigen, ultimoPlanetaVisitado, cantTripulantes, companiaNaviera);
		this.cantPasajeros = cantPasajeros;
	}

	/*----------------------------------------------------------------------------*/

	@Override
	public void completarManifiesto() {
		System.out.println("Porc. de pasajeros: " + porcPasajeros() + "%");

	}

	private double porcPasajeros() {
		return this.cantPasajeros * 100 / (this.cantPasajeros + getCantTripulantes());
	}

	/*----------------------------------------------------------------------------*/

	@Override
	public boolean sePuedeEstacionar() {
		return this.cantPasajeros > 0;
	}

}
