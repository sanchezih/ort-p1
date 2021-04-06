package abs.ejemplo01.src;

import java.util.Calendar;

public class TestAbstract {
	public static void main(String[] Args) {

		ProfesorSuplente pi1 = new ProfesorSuplente("Maria",	"Hernandez",	38, "S-001", Calendar.getInstance());
		ProfesorSuplente pi2 = new ProfesorSuplente("Andres",	"Molto",		41, "S-002", Calendar.getInstance());
		ProfesorSuplente pi3 = new ProfesorSuplente("Rosa",		"Rios",			31, "S-003", Calendar.getInstance());

		ProfesorTitular pt1 = new ProfesorTitular("Adriana",	"Perez",		43, "T-001");
		ProfesorTitular pt2 = new ProfesorTitular("Alberto",	"Centa",		36, "T-002");
		ProfesorTitular pt3 = new ProfesorTitular("Rosana",		"Garcia",		29, "T-003");

		ListinProfesores listinProfesorado = new ListinProfesores();
		listinProfesorado.addProfesor(pi1);
		listinProfesorado.addProfesor(pi2);
		listinProfesorado.addProfesor(pi3);
		listinProfesorado.addProfesor(pt1);
		listinProfesorado.addProfesor(pt2);
		listinProfesorado.addProfesor(pt3);

		listinProfesorado.imprimirListin();
		System.out.println("===> La suma de los salarios del profesorado es "
				+ listinProfesorado.importeTotalSalariosProfesorado());
	}
}