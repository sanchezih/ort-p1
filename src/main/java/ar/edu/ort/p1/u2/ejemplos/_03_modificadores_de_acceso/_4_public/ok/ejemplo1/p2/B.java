//Programa Java para ilustrar el modificador protected
package ar.edu.ort.p1.u2.ejemplos._03_modificadores_de_acceso._4_public.ok.ejemplo1.p2;

import ar.edu.ort.p1.u2.ejemplos._03_modificadores_de_acceso._4_public.ok.ejemplo1.p1.*;

public class B extends A {
	public static void main(String[] args) {
		A obj = new A();
		obj.mostrar();
	}
}