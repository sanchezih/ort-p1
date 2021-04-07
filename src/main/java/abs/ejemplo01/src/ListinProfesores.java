package abs.ejemplo01.src;

import java.util.ArrayList;
import java.util.Iterator;

public class ListinProfesores {

	private ArrayList<Profesor> listinProfesores;

	// Constructor
	public ListinProfesores() {
		listinProfesores = new ArrayList<Profesor>(); // 1
	}

	public void addProfesor(Profesor profesor) {
		listinProfesores.add(profesor);
	}

	public void imprimirListin() {
		String tempString = "";

		for (Profesor profeTemp : listinProfesores) {
			System.out.println(profeTemp.toString());

			if (profeTemp instanceof ProfesorSuplente) { // 2
				tempString = "Interino";
			} else {
				tempString = "Titular";
			}

			System.out.println("Tipo: " + tempString + "\nSalario: " + (profeTemp.importeSalario()) + "\n"); // 2

		}
	}

	public float importeTotalSalariosProfesorado() {
		float importeTotal = 0f;

		Iterator<Profesor> it = listinProfesores.iterator();
		while (it.hasNext()) {
			importeTotal = importeTotal + it.next().importeSalario();
		}
		return importeTotal;
	}
}

/*
 * 1 Se crea un ArrayList de profesores que pueden titulares o suplentes y
 * realizar operaciones con esos conjuntos. El listin se basa en el tipo
 * estatico Profesor, pero su contenido dinamico siempre sera a base de
 * instancias de ProfesorTitular o de ProfesorSuplente ya que Profesor es una
 * clase abstracta, no instanciable.
 */

/*
 * 2 Ejemplo de uso de instanceof para determinar que tipo de profesor es.
 * Dinamicamente se determina de que tipo es cada objeto y al invocar el metodo
 * abstracto importeSalario() Java determina si debe utilizar el metodo propio
 * de un subtipo u otro.
 */