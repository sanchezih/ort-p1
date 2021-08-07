package ar.edu.ort.p1.u1.ejemplos.miembros_de_clase.src;

public class Auto {

	/**
	 * A aquellos miembros que sean estaticos, es decir, de clase, se los debe
	 * subrayar para diferenciarlos con miembros de instancia. Supongamos un sistema
	 * para una concesionaria, cuyos autos comparten la misma marca. Si el
	 * fabricante cambia de nombre, todos los coches cambiaran el nombre de la
	 * marca. Tal variable marca podria ser de clase (static en Java) al igual que
	 * el metodo getMarca(), para evitar que se copie el mismo valor en cada
	 * instancia.
	 */
	private static String marca;
	private String modelo;
	private String patente;

	public static String getMarca() {
		return Auto.marca;
	}

	public String getModelo() {
		return modelo;
	}

	public void encender() {

	}

	public void apagar() {

	}

}
