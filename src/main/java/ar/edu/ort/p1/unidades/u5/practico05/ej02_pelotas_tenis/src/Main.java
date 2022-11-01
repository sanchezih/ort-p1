package ar.edu.ort.p1.unidades.u5.practico05.ej02_pelotas_tenis.src;

public class Main {

	public static void main(String[] args) {

		for (int i = 0; i < 10000; i++) {
			System.out.println("El tubo esta usado? -> " + ClubDeTenis.esTuboUsado(new TuboPelotasDeTenis()));
			System.out.println();
		}

	}

}
