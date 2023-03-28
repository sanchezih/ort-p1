package ar.edu.ort.p1.unidades.u2.ejemplos._05_palabra_super._03_en_constructores.src;

public class Estudiante extends Persona {
	Estudiante() {
		super(); // Invoca al constructor de la clase padre
		System.out.println("Soy el constructor de la clase Estudiante");
	}
}