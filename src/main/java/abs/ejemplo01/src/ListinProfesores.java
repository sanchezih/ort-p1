package abs.ejemplo01.src;

import java.util.ArrayList;
import java.util.Iterator;

public class ListinProfesores {

	private ArrayList<Profesor> listinProfesores;

	// Constructor
	public ListinProfesores() {
		listinProfesores = new ArrayList<Profesor>();
	}

	public void addProfesor(Profesor profesor) {
		listinProfesores.add(profesor);
	}

	public void imprimirListin() {
		String tempString = "";

		System.out.println("*** Se muestra el listado de profesores en el listin ***\n");

		for (Profesor tmp : listinProfesores) {
			System.out.println(tmp.toString());

			if (tmp instanceof ProfesorInterino) {
				tempString = "Interino";
			} else {
				tempString = "Titular";
			}

			System.out.println("Tipo: " + tempString + "\nSalario: " + (tmp.importeSalario()) + "\n");
		}
	}

	public float importeTotalNominaProfesorado() {
		float importeTotal = 0f;
		Iterator<Profesor> it = listinProfesores.iterator();
		while (it.hasNext()) {
			importeTotal = importeTotal + it.next().importeSalario();
		}
		return importeTotal;
	}
}