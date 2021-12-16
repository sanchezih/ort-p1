package ar.edu.ort.p1.unidades.u2.ejemplos._03_modificadores_de_acceso._2_default.ok;

public class EjemploDefault1 {

	private static int atributo1;// Este atributo es privado
	static int contador = 0; // Contador con acceso por defecto

	public static void setAtributo1(int valor) {
		contador++; // Contador que lleva el registro de ediciones del atributo1
		atributo1 = valor; // Establecemos el valor del atributo
	}

	public static int getAtributo1() {
		return atributo1;// Retornamos el valor actual del atributo
	}
}