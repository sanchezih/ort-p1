package ar.edu.ort.p1.unidades.unidad02.ejemplos._03_modificadores_de_acceso._2_default._01_ejemplo_ok.src.paquete1;

public class Main {

	public static void main(String[] args) {

		System.out.println("El color fue modificado " + UnaClaseDeEjemplo.getColorDeLaBicicleta() + " veces");

		Bicicleta.setColor("Verde");

		System.out.println("El color fue modificado " + UnaClaseDeEjemplo.getColorDeLaBicicleta() + " veces");

		Bicicleta.setColor("Rojo");

		System.out.println("El color fue modificado " + UnaClaseDeEjemplo.getColorDeLaBicicleta() + " veces");

	}

}
