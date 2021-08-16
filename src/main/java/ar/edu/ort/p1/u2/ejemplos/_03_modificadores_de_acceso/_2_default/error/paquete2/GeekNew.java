/**
 * Java program to illustrate error while using class from different package with default modifier
 */

package ar.edu.ort.p1.u2.ejemplos._03_modificadores_de_acceso._2_default.error.paquete2;

import ar.edu.ort.p1.u2.ejemplos._03_modificadores_de_acceso._2_default.error.paquete1.*;

//This class is having default access modifier 
public class GeekNew {

	public static void main(String args[]) {

		// Accessing class Geek from package paquete1
		// Geek obj = new Geek();
		// obj.display();

	}
}