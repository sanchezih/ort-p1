package edu.ort.herenciaAnimales.src;

import edu.ort.herenciaAnimales.src.entidades.Caballo;
import edu.ort.herenciaAnimales.src.entidades.Gato;
import edu.ort.herenciaAnimales.src.entidades.Perro;

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