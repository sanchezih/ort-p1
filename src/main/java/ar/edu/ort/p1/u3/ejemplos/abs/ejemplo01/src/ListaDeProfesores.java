package ar.edu.ort.p1.u3.ejemplos.abs.ejemplo01.src;

import java.util.ArrayList;
import java.util.Iterator;

public class ListaDeProfesores {

	private ArrayList<Profesor> listaDeProfesores;

	/* Constructor */
	public ListaDeProfesores() {
		listaDeProfesores = new ArrayList<Profesor>(); // Ver nota 1
	}

	public void addProfesor(Profesor profesor) {
		listaDeProfesores.add(profesor);
	}

	public void imprimirLista() {
		String tempString = "";

		for (Profesor profesor : listaDeProfesores) {
			System.out.println(profesor.toString());

			if (profesor instanceof ProfesorSuplente) { // Ver nota 2
				tempString = "Suplente";
			} else {
				tempString = "Titular";
			}

			System.out.println("Tipo: " + tempString + "\nSalario: " + (profesor.importeSalario()) + "\n"); // Ver nota
																											// 2

		}
	}

	public float importeTotalSalariosProfesorado() {

		float importeTotal = 0f;

		Iterator<Profesor> it = listaDeProfesores.iterator();
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
