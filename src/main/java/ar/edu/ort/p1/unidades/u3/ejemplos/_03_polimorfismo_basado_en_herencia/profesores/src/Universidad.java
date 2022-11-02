package ar.edu.ort.p1.unidades.u3.ejemplos._03_polimorfismo_basado_en_herencia.profesores.src;

import java.util.ArrayList;
import java.util.Iterator;

public class Universidad {

	private ArrayList<Profesor> profesores;

	/**
	 * En el constructor se crea un ArrayList de profesores (titulares y suplentes).
	 * La lista se basa en el tipo Profesor, pero su contenido dinamico siempre sera
	 * en base a instancias de ProfesorTitular o de ProfesorSuplente ya que Profesor
	 * es una clase abstracta, no instanciable.
	 */
	public Universidad() {
		this.profesores = new ArrayList<Profesor>();
	}

	public void addProfesor(Profesor profesor) {
		this.profesores.add(profesor);
	}

	/**
	 * Ejemplo de uso de instanceof para determinar que tipo de profesor es.
	 * Dinamicamente se determina de que tipo es cada objeto y al invocar el metodo
	 * abstracto importeSalario() Java determina si debe utilizar el metodo propio
	 * de un subtipo u otro.
	 */
	public void imprimirListaDeProfesores() {
		String tempString = "";

		for (Profesor profesor : this.profesores) {
			System.out.println(profesor.toString());

			if (profesor instanceof ProfesorSuplente) {
				tempString = "Suplente";
			} else {
				tempString = "Titular";
			}
			System.out.println("Tipo: " + tempString + "\nSalario: " + (profesor.importeSalario()) + "\n");
		}
	}

	public float importeTotalSalariosProfesores() {

		float importeTotal = 0f;

		Iterator<Profesor> it = this.profesores.iterator();
		while (it.hasNext()) {
			importeTotal = importeTotal + it.next().importeSalario();
		}
		return importeTotal;
	}
}