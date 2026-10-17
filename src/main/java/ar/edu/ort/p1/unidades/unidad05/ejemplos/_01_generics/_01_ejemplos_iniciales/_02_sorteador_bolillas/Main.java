package ar.edu.ort.p1.unidades.unidad05.ejemplos._01_generics._01_ejemplos_iniciales._02_sorteador_bolillas;

public class Main {

	private static int CANT_MAX_BOLILLAS = 5;

	private static Bolillero bolillero = new Bolillero(CANT_MAX_BOLILLAS);

	public static void main(String[] args) {
		isVacio();
		System.out.println();
		llenarBolillero();
		System.out.println();
		isVacio();
		System.out.println();
		sortearBolillas();
		System.out.println();
		isVacio();
	}

	/*----------------------------------------------------------------------------*/

	private static void llenarBolillero() {
		for (int i = 0; i < CANT_MAX_BOLILLAS; i++) {
			bolillero.add(new Bolilla(i));
			// bolillero.add("Azul"); // No puedo agregar elementos que no sean bolillas
		}
		System.out.println("Se lleno el bolillero con " + CANT_MAX_BOLILLAS + " bolillas");
	}

	private static void sortearBolillas() {
		System.out.println("Comienzo a vaciar el bolillero...");
		while (!bolillero.isEmpty()) {
			System.out.println("\t -> Sale: " + bolillero.remove());
		}
	}

	private static void isVacio() {
		System.out.println("El bolillero esta vacio? -> " + bolillero.isEmpty());
	}

}
