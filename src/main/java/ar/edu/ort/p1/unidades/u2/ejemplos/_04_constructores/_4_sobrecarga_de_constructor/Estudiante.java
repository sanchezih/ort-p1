package ar.edu.ort.p1.unidades.u2.ejemplos._04_constructores._4_sobrecarga_de_constructor;

/**
 * Java program to overload constructors
 * 
 * @author ihsanch
 *
 */
public class Estudiante {
	int id;
	String name;
	int age;

	// Constructor con 2 argumentos
	Estudiante(int i, String n) {
		id = i;
		name = n;
	}

	// Constructor con 3 argumentos
	Estudiante(int i, String n, int a) {
		id = i;
		name = n;
		age = a;
	}

	void display() {
		System.out.println(id + " " + name + " " + age);
	}
}
