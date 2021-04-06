package abs.ejemplo01.src;

import java.util.Calendar;

public class TestAbstract {
	public static void main(String[] Args) {

		Calendar fecha1 = Calendar.getInstance();
		fecha1.set(2019, 10, 22); // Los meses van de 0 a 11, luego 10 representa noviembre

		ProfesorInterino pi1 = new ProfesorInterino("Maria", "Hernandez", 45, "I-001", fecha1);
		ProfesorInterino pi2 = new ProfesorInterino("Andres", "Molto", 87, "I-002", fecha1);
		ProfesorInterino pi3 = new ProfesorInterino("Rosa", "Rios", 76, "I-003", fecha1);

		ProfesorTitular pt1 = new ProfesorTitular("Adriana", "Perez", 23, "T-001");
		ProfesorTitular pt2 = new ProfesorTitular("Alberto", "Centa", 49, "T-002");
		ProfesorTitular pt3 = new ProfesorTitular("Alberto", "Centa", 49, "T-003");

		ListinProfesores listinProfesorado = new ListinProfesores();
		listinProfesorado.addProfesor(pi1);
		listinProfesorado.addProfesor(pi2);
		listinProfesorado.addProfesor(pi3);
		listinProfesorado.addProfesor(pt1);
		listinProfesorado.addProfesor(pt2);
		listinProfesorado.addProfesor(pt3);

		listinProfesorado.imprimirListin();
		System.out.println(
				"El importe de las nominas del profesorado es " + listinProfesorado.importeTotalNominaProfesorado());
	}
}