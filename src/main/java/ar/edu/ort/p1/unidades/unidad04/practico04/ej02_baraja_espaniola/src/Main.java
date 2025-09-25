package ar.edu.ort.p1.unidades.unidad04.practico04.ej02_baraja_espaniola.src;

public class Main {

	public static final String ORDENADA = "La baraja esta ordenada";
	public static final String NO_ORDENADA = "La baraja no esta ordenada";

	public static void main(String[] args) {

		Baraja baraja = new Baraja();

		System.out.println(baraja.estaOrdenada() ? ORDENADA : NO_ORDENADA);
		baraja.mezclarBaraja();
		System.out.println(baraja.estaOrdenada() ? ORDENADA : NO_ORDENADA);

	}

}
