package ar.edu.ort.p1.unidades.u2.ejemplos._04_constructores._4_sobrecarga_de_constructor;

public class Main {

	public static void main(String args[]) {
		Estudiante s1 = new Estudiante(111, "Karan");
		Estudiante s2 = new Estudiante(222, "Aryan", 25);
		s1.display();
		s2.display();
	}

}
