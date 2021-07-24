package ar.edu.ort.p1.u2.ejemplos._03_modificadores_de_acceso._3_protected.ok.ejemplo2.p1;

public class EjemploProtected_1 {
	protected static int atributo1;// Atributo protected
	private static int atributo2; // Atributo privado
	int atributo3;// Atributo por default

	public static int getAtributo2() {
		return atributo2;
	}
}