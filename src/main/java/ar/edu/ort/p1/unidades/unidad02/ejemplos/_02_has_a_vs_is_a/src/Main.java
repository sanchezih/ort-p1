package ar.edu.ort.p1.unidades.unidad02.ejemplos._02_has_a_vs_is_a.src;

public class Main {

	public static void main(String[] args) {

		/*
		 * Podremos utilizar los metodos setColor(), setVelocidadMaxima​​() y
		 * getInformacion() debido a la relacion IS-A de la clase Automovil con la clase
		 * Vehiculo.
		 */
		Automovil automovil = new Automovil();
		automovil.setColor("ROJO");
		automovil.setVelocidadMaxima(180);
		automovil.getInformacion();
		automovil.PruebaDeEncendido();
	}
}