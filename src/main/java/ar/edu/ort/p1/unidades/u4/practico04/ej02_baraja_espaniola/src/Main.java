package ar.edu.ort.p1.unidades.u4.practico04.ej02_baraja_espaniola.src;

public class Main {

	public static void main(String[] args) {

		/**
		 * Dada una baraja de cartas espaniolas sin comodines, de las que se sabe, de
		 * cada una, su numero y palo, desarrollar el metodo estaOrdenada en la clase
		 * Baraja que permita retornar si las cartas se encuentran ordenadas tal como se
		 * ilustra en la figura. Ayuda: Recorda que los palos se pueden enumerar. Los
		 * enumerados tienen metodos utiles que podran ayudarte a resolver el problema.
		 * https://www.youtube.com/watch?v=-Q1f3eCPsfY
		 * 
		 */
		
		Baraja baraja = new Baraja();

		// Descomentar la llamada al metodo mezclarBaraja() de la clase Baraja.
		System.out.println(baraja.estaOrdenada() ? "La baraja esta ordenada" : "La baraja no esta ordenada");

	}

}
