package ar.edu.ort.p1.unidades.u2.ejemplos._03_modificadores_de_acceso._2_default._01_ejemplo_ok.src;

public class Bicicleta {

	private static String color;// Este atributo es privado
	static int contador = 0; // Contador con acceso por defecto

	/**
	 * 
	 * @param color
	 */
	public static void setColor(String color) {
		contador++; // Contador que lleva el registro de ediciones del atributo1
		color = color; // Establecemos el valor del atributo
	}

	/**
	 * 
	 * @return
	 */
	public static String getColor() {
		return color; // Retornamos el valor actual del atributo
	}
}