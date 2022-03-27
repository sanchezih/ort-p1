package ar.edu.ort.p1.unidades.u2.ejemplos._04_constructores._4_sobrecarga_de_constructor;

/**
 * Java program to overload constructors
 * 
 * @author ihsanch
 *
 */
public class Student5 {
	int id;
	String name;
	int age;

	// creating two arg constructor
	Student5(int i, String n) {
		id = i;
		name = n;
	}

	// creating three arg constructor
	Student5(int i, String n, int a) {
		id = i;
		name = n;
		age = a;
	}

	void display() {
		System.out.println(id + " " + name + " " + age);
	}
}
