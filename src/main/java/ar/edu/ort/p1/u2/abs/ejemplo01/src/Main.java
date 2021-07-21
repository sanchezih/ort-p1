/*
 * En la clase de test creamos profesores titulares y suplentes y los vamos
 * a�adiendo a un list�n. Posteriormente, invocamos el m�todo imprimirListin(),
 * que se basa en los m�todos toString de las subclases y de sus superclases
 * mediante invocaciones sucesivas a super.
 */

package ar.edu.ort.p1.u2.abs.ejemplo01.src;

import java.util.Calendar;

public class Main {
	public static void main(String[] Args) {
		
		ProfesorSuplente ps1 = new ProfesorSuplente("Maria", "Hernandez", 38, "S-001", Calendar.getInstance());
		ProfesorSuplente ps2 = new ProfesorSuplente("Andres", "Molto", 41, "S-002", Calendar.getInstance());
		ProfesorSuplente ps3 = new ProfesorSuplente("Rosa", "Rios", 31, "S-003", Calendar.getInstance());

		ProfesorTitular pt1 = new ProfesorTitular("Adriana", "Perez", 43, "T-001");
		ProfesorTitular pt2 = new ProfesorTitular("Alberto", "Centa", 36, "T-002");
		ProfesorTitular pt3 = new ProfesorTitular("Rosana", "Garcia", 29, "T-003");

		ListinProfesores listinProfesorado = new ListinProfesores();
		listinProfesorado.addProfesor(ps1);
		listinProfesorado.addProfesor(ps2);
		listinProfesorado.addProfesor(ps3);
		listinProfesorado.addProfesor(pt1);
		listinProfesorado.addProfesor(pt2);
		listinProfesorado.addProfesor(pt3);

		listinProfesorado.imprimirListin();
		System.out.println("===> La suma de los salarios del profesorado es "
				+ listinProfesorado.importeTotalSalariosProfesorado());
	}
}
