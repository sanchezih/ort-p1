package edu.ort.p1.u2.modificadoresDeAcceso.src._3_protected.ok.ejemplo2.p2;

import edu.ort.p1.u2.modificadoresDeAcceso.src._3_protected.ok.ejemplo2.p1.EjemploProtected_1;

public class EjemploProtected_2 extends EjemploProtected_1 {
	public static void main(String[] args) {
		// La siguientes dos l�neas generan error, pues atributo2 es privado y atributo
		// 3 es default
		// System.out.println(atributo2);
		// System.out.println(atributo3);

		System.out.println(atributo1);// S� tenemos acceso a atributo1
	}
}