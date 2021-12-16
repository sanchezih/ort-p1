package ar.edu.ort.p1.unidades.u2.ejemplos._02_has_a_vs_is_a.src;

public class Main {
	public static void main(String[] args) {

		/**
		 * Podremos utilizar los metodos setColor(), setVelocidadMaxima​​() y
		 * getInformacion() debido a la relación IS-A de la clase Automovil con la clase
		 * Vehiculo.
		 */
		Automovil unAutomovil = new Automovil();
		unAutomovil.setColor("ROJO");
		unAutomovil.setVelocidadMaxima(180);
		unAutomovil.getInformacion();
		unAutomovil.PruebaDeEncendido();
	}
}