package ar.edu.ort.p1.examenes.ds.actas_materia.src;

public class Main {

	public static void main(String[] args) {

		Materia p1 = new Materia("Programacion 1");

		// Si pertenece a un cuatrimestre anterior le corresponde el acta de FINAL
		// PRACTICO sin importar la nota porque si curso en otro cuatrimestre y
		// permanece inscripto en la materia es porque ya la tiene aprobada.
		p1.agregarAlumno(new AlumnoLibre(11111111, "Noelia", 2, 8, 2));
		p1.agregarAlumno(new AlumnoLibre(22222222, "Fernanda", 1, 8, 4));

		// Si es del cuatrimestre en curso y la nota de final de cursada es mayor o
		// igual que siete (7) y tuvo la camara encendida durante las clases, le
		// corresponde el acta FINAL TEORICO
		p1.agregarAlumno(new AlumnoRegular(33333333, "Nicolas", 4, 7, true));

		// Si es del cuatrimestre en curso y la nota es mayor o igual que 4 pero menor
		// a 7 o mayor o igual a 7 pero no tuvo la camara encendida durante las clases,
		// le corresponde el acta FINAL PRACTICO.
		p1.agregarAlumno(new AlumnoRegular(44444444, "Julian", 2, 6, true));
		p1.agregarAlumno(new AlumnoRegular(55555555, "Erica", 2, 8, false));

		// Si es del cuatrimestre en curso, en cualquier otro caso le corresponde el
		// acta RECUPERATORIO.
		p1.agregarAlumno(new AlumnoRegular(66666666, "Laura", 4, 2, false));
		p1.agregarAlumno(new AlumnoRegular(77777777, "Ulises", 2, 2, true));

		/*----------------------------------------------------------------------------*/

		// Test ejercicio B
		p1.asignarActas();
		p1.mostarActas();
		System.out.println();

		// Test ejercicio C
		// Se hacen 2 implementaciones para este ejercicio
		p1.informarActaXCursoDesdeCola();
		p1.informarActaXCursoDesdeLista();
	}

}
