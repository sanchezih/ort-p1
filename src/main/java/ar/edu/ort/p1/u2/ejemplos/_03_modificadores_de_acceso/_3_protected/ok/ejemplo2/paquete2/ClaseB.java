package ar.edu.ort.p1.u2.ejemplos._03_modificadores_de_acceso._3_protected.ok.ejemplo2.paquete2;

import ar.edu.ort.p1.u2.ejemplos._03_modificadores_de_acceso._3_protected.ok.ejemplo2.paquete1.ClaseA;

public class ClaseB extends ClaseA {

	public static void main(String[] args) {

		/**
		 * La siguientes dos lineas generaran error en tiempo de compilacion, porque
		 * atributo2 es privado y atributo3 es default
		 */
		// System.out.println(atributo2);
		// System.out.println(atributo3);

		/**
		 * La siguiente linea no generaran error porque atributo1 es protected
		 */
		System.out.println(atributo1);
	}
}