package ar.edu.ort.p1.unidades.unidad05.practico05.ej02_club_de_tenis.src;

public class Main {

	public static void main(String[] args) {

		int CANT_TUBOS = 500;

		System.out
				.println("======================== VERIFICACION DE " + CANT_TUBOS + " TUBOS ========================");
		System.out.println();

		for (int i = 0; i < CANT_TUBOS; i++) {
			System.out.println("El tubo esta usado? -> " + ClubDeTenis.esTuboUsado(new TuboDePelotasDeTenis()));
			System.out.println();
		}

	}

}
