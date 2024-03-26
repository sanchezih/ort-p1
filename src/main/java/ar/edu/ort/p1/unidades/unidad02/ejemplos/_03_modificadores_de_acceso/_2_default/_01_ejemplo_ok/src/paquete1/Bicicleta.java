package ar.edu.ort.p1.unidades.unidad02.ejemplos._03_modificadores_de_acceso._2_default._01_ejemplo_ok.src.paquete1;

public class Bicicleta {

	private static String color;// Este atributo es privado
	static int contador = 0; // Contador con acceso por defecto

	/**
	 * 
	 * @param color
	 */
	public static void setColor(String c) {
		contador++; // Contador que lleva el registro de ediciones del atributo1
		color = c; // Establecemos el valor del atributo
	}

	/**
	 * 
	 * @return
	 */
	public static String getColor() {
		return color; // Retornamos el valor actual del atributo
	}
}