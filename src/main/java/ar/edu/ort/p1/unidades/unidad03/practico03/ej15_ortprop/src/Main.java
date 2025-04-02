package ar.edu.ort.p1.unidades.unidad03.practico03.ej15_ortprop.src;

public class Main {

	public static void main(String[] args) {

		Inmueble i01 = new Inmueble("Campos 1340", "300", 6, 160000);

		i01.agregarInteresado(new Cliente("Gonzalez", "Sandra", "47098172", "sandra@mail.com"));

		// Test ejercicio B
		i01.setPrecio(140000);

	}

}
