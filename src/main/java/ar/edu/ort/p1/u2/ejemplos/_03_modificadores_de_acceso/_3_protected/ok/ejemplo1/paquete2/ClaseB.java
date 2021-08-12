//Programa Java para ilustrar el modificador protected
package ar.edu.ort.p1.u2.ejemplos._03_modificadores_de_acceso._3_protected.ok.ejemplo1.paquete2;

import ar.edu.ort.p1.u2.ejemplos._03_modificadores_de_acceso._3_protected.ok.ejemplo1.paquete1.*;

public class ClaseB extends ClaseA {
	public static void main(String[] args) {
		ClaseB obj = new ClaseB();
		obj.mostrar();
	}
}