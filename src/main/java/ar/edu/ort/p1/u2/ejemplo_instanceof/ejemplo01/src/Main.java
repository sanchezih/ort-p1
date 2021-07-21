package ar.edu.ort.p1.u2.ejemplo_instanceof.ejemplo01.src;

public class Main {

	public static void main(String[] args) {
		String s = new String("No leas esto, solo es un ejemplo");
		if (s instanceof String)
			System.out.println("Efectivamente s pertenece a la clase String");
	}
}
