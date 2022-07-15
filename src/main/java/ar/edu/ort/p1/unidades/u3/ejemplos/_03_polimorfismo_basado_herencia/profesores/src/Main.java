package ar.edu.ort.p1.unidades.u3.ejemplos._03_polimorfismo_basado_herencia.profesores.src;

import java.util.Calendar;

/**
 * En la clase de test creamos profesores titulares y suplentes y los vamos
 * agregando a una lista.
 * 
 * Posteriormente, invocamos el metodo imprimirLista(), que se basa en los
 * metodos toString de las subclases y de sus superclases mediante invocaciones
 * sucesivas a super.
 * 
 * @author ihsanch
 *
 */
public class Main {
	public static void main(String[] Args) {

		Universidad universidad = new Universidad();

		universidad.addProfesor(new ProfesorSuplente("Maria", "Hernandez", 38, "S-001", Calendar.getInstance()));
		universidad.addProfesor(new ProfesorSuplente("Andres", "Molto", 41, "S-002", Calendar.getInstance()));
		universidad.addProfesor(new ProfesorSuplente("Rosa", "Rios", 31, "S-003", Calendar.getInstance()));

		universidad.addProfesor(new ProfesorTitular("Adriana", "Perez", 43, "T-001"));
		universidad.addProfesor(new ProfesorTitular("Alberto", "Centa", 36, "T-002"));
		universidad.addProfesor(new ProfesorTitular("Rosana", "Garcia", 29, "T-003"));

		universidad.imprimirListaDeProfesores();
		System.out.println(
				"==> La suma de los salarios del profesorado es " + universidad.importeTotalSalariosProfesores());
	}
}
