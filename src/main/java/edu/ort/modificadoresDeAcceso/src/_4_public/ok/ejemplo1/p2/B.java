//Programa Java para ilustrar el modificador protected
package edu.ort.modificadoresDeAcceso.src._4_public.ok.ejemplo1.p2;

import edu.ort.modificadoresDeAcceso.src._4_public.ok.ejemplo1.p1.*;

public class B extends A {
	public static void main(String[] args) {
		A obj = new A();
		obj.mostrar();
	}
}