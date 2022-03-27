package ar.edu.ort.p1.unidades.u2.ejemplos._04_constructores._4_sobrecarga_de_constructor;

public class Main {

	public static void main(String args[]) {
		Student5 s1 = new Student5(111, "Karan");
		Student5 s2 = new Student5(222, "Aryan", 25);
		s1.display();
		s2.display();
	}

}
