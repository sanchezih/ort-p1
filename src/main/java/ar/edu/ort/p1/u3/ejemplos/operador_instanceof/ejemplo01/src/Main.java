package ar.edu.ort.p1.u3.ejemplos.operador_instanceof.ejemplo01.src;

public class Main {

	public static void main(String[] args) {
		String string = new String("No leas esto, solo es un ejemplo");
		if (string instanceof String) {
			System.out.println("Efectivamente s pertenece a la clase String");
		}
	}
}
