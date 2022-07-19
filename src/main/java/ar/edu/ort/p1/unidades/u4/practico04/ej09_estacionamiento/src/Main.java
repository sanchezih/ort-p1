package ar.edu.ort.p1.unidades.u4.practico04.ej09_estacionamiento.src;

public class Main {

	public static void main(String[] args) {

		Estacionamiento estacionamiento = new Estacionamiento();

		/*----------------------------------------------------------------------------*/

		/**
		 * Ejercicio B: La explotacion del metodo retirar, que permita resolver lo
		 * pedido. Retorna el auto indicado o null en caso contrario.
		 */

		System.out.println("Ejercicio B - INTENTO RETIRAR AUTOS");
		System.out.println("\tPuedo retirar de 00? (Auto): " + estacionamiento.retirar(00)); // Hay auto
		System.out.println("\tPuedo retirar de 01? (Auto): " + estacionamiento.retirar(01)); // Hay auto
		System.out.println("\tPuedo retirar de 20? (Auto): " + estacionamiento.retirar(20)); // Hay auto
		System.out.println("\tPuedo retirar de 21? (Auto): " + estacionamiento.retirar(21)); // Hay auto
		System.out.println("\tPuedo retirar de 22? (Auto): " + estacionamiento.retirar(22)); // Hay auto
		System.out.println("\tPuedo retirar de 32? (Auto): " + estacionamiento.retirar(32)); // Hay auto
		System.out.println("\tPuedo retirar de 33? (Auto): " + estacionamiento.retirar(33)); // Hay auto
		System.out.println("\tPuedo retirar de 34? (Auto): " + estacionamiento.retirar(34)); // Hay auto
		System.out.println("\tPuedo retirar de 35? (Auto): " + estacionamiento.retirar(35)); // Hay auto
		System.out.println("\tPuedo retirar de 43? (Auto): " + estacionamiento.retirar(43)); // Hay auto
		System.out.println("\tPuedo retirar de 44? (Vacio): " + estacionamiento.retirar(44)); // No hay auto
		System.out.println("\tPuedo retirar de 51? (Vacio): " + estacionamiento.retirar(51)); // No hay auto

		/*----------------------------------------------------------------------------*/

		/**
		 * Ejercicio C: La explotacion del metodo autosMasMorososPorPiso que devuelva
		 * (no muestre por consola) de cada piso, el auto con mayor cantidad de pagos no
		 * efectuados durante este anio (se supone unico por piso).
		 */
		System.out.println();
		System.out.println("Ejercicio C - MUESTRO EL AUTO MAS MOROSOS DE CADA PISO");

		Auto[] losMasMorosos = estacionamiento.autosMasMorososPorPiso();
		for (int i = 0; i < losMasMorosos.length; i++) {
			System.out.println("\tPiso " + i + ": " + losMasMorosos[i]);
		}

	}

}
