package ar.edu.ort.p1.examenes._01_oop.estacion_espacial.src;

public abstract class Nave implements Manifestable {

	private String planetaOrigen;
	private String ultimoPlanetaVisitado;
	private int cantTripulantes;

	/*----------------------------------------------------------------------------*/

	public Nave(String planetaOrigen, String ultimoPlanetaVisitado, int cantTripulantes) {
		this.planetaOrigen = planetaOrigen;
		this.ultimoPlanetaVisitado = ultimoPlanetaVisitado;
		this.cantTripulantes = cantTripulantes;
	}

	/*----------------------------------------------------------------------------*/

	public int getCantTripulantes() {
		return cantTripulantes;
	}

	@Override
	public void imprimirManifiesto() {
		System.out.println("Planeta de origen: " + this.planetaOrigen);
		System.out.println("Ultimo planeta visitado: " + this.ultimoPlanetaVisitado);
		System.out.println("Cantidad de tripulantes: " + this.cantTripulantes);
		completarManifiesto();
		System.out.println();
	}

	public abstract void completarManifiesto();

	public abstract boolean sePuedeEstacionar();
}
