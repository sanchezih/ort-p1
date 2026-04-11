package ar.edu.ort.p1.unidades.unidad03.practico03.ej15_ortprop.src;

public class Main {

	public static void main(String[] args) {

		Inmueble inmueble01 = new Inmueble("Campos 1340", "300", 6, 160000);

		inmueble01.agregarInteresado(new Cliente("Gonzalez", "Sandra", "47098172", "sandra@mail.com"));
		inmueble01.agregarInteresado(new Inmobiliaria("Inmobiliaria Lopez", "info@inmobiliarialopez.com.ar", "5"));

		// Test ejercicio B
		inmueble01.setPrecio(100000);

	}

}
