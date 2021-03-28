package herenciaAnimales.src;

import herenciaAnimales.src.entidades.Caballo;
import herenciaAnimales.src.entidades.Gato;
import herenciaAnimales.src.entidades.Perro;

public class Main {

	public static void main(String[] args) {

		Perro perro = new Perro("Teddy", "Croquetas", 10, "Chihuahua");
		Gato gato = new Gato("Pelusa", "Especial", 8, "Siames");
		Caballo caballo = new Caballo("Jhonny", "Pasto", 21, "Fino");

		// -->Nos muestra los detalles del objeto
		perro.mostrar();
		System.out.println("--------------------------------------------------");
		gato.mostrar();
		System.out.println("--------------------------------------------------");
		caballo.mostrar();

	}
}