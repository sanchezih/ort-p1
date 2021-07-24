package ar.edu.ort.p1.u2.ejemplos._01_herencia.herenciaAnimales.src;

import ar.edu.ort.p1.u2.ejemplos._01_herencia.herenciaAnimales.src.animales.Caballo;
import ar.edu.ort.p1.u2.ejemplos._01_herencia.herenciaAnimales.src.animales.Gato;
import ar.edu.ort.p1.u2.ejemplos._01_herencia.herenciaAnimales.src.animales.Perro;

public class Main {

	public static void main(String[] args) {

		Perro perro = new Perro("Teddy", "Croquetas", 10, "Chihuahua");
		Gato gato = new Gato("Pelusa", "Especial", 8, "Siames");
		Caballo caballo = new Caballo("Jhonny", "Pasto", 21, "Fino");

		// -->Nos muestra los detalles del objeto
		perro.mostrar();
		System.out.println("\n----------------------------------------------------------------------------\n");
		gato.mostrar();
		System.out.println("\n----------------------------------------------------------------------------\n");
		caballo.mostrar();

	}
}