package ar.edu.ort.p1.u3.ejemplos.clases_abstractas.src;

import java.util.ArrayList;
import java.util.Iterator;

public class Universidad {

	private ArrayList<Profesor> listaDeProfesores;

	public Universidad() {
		this.listaDeProfesores = new ArrayList<Profesor>(); // 1
	}

	public void addProfesor(Profesor profesor) {
		this.listaDeProfesores.add(profesor);
	}

	public void imprimirLista() {
		String tempString = "";

		for (Profesor profesor : this.listaDeProfesores) {
			System.out.println(profesor.toString());

			if (profesor instanceof ProfesorSuplente) { // 2
				tempString = "Suplente";
			} else {
				tempString = "Titular";
			}

			System.out.println("Tipo: " + tempString + "\nSalario: " + (profesor.importeSalario()) + "\n"); // 2
		}
	}

	public float importeTotalSalariosProfesores() {

		float importeTotal = 0f;

		Iterator<Profesor> it = this.listaDeProfesores.iterator();
		while (it.hasNext()) {
			importeTotal = importeTotal + it.next().importeSalario();
		}
		return importeTotal;
	}
}

/**
 * Nota 1. Se crea un ArrayList de profesores que pueden titulares o suplentes y
 * realizar operaciones con esos conjuntos. El listin se basa en el tipo
 * estatico Profesor, pero su contenido dinamico siempre sera a base de
 * instancias de ProfesorTitular o de ProfesorSuplente ya que Profesor es una
 * clase abstracta, no instanciable.
 * 
 * Nota 2. Ejemplo de uso de instanceof para determinar que tipo de profesor es.
 * Dinamicamente se determina de que tipo es cada objeto y al invocar el metodo
 * abstracto importeSalario() Java determina si debe utilizar el metodo propio
 * de un subtipo u otro.
 */
