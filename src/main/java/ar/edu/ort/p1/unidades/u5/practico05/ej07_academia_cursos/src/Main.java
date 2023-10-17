package ar.edu.ort.p1.unidades.u5.practico05.ej07_academia_cursos.src;

public class Main {
	public static void main(String[] args) {

		Alumno alumno01 = new Alumno("12345678", "Erica", 30);
		Alumno alumno02 = new Alumno("12345678", "Nicolas", 31);
		Alumno alumno03 = new Alumno("12345678", "Carolina", 32);
		Alumno alumno04 = new Alumno("12345678", "Ulises", 33);
		Alumno alumno05 = new Alumno("12345678", "Facundo", 34);
		Alumno alumno06 = new Alumno("12345678", "Daniel", 35);

		Alumno alumno07 = new Alumno("12345678", "Fernanda", 36);
		Alumno alumno08 = new Alumno("12345678", "Betina", 27);
		Alumno alumno09 = new Alumno("12345678", "Ignacio", 22);
		Alumno alumno10 = new Alumno("12345678", "Natalia", 23);
		Alumno alumno11 = new Alumno("12345678", "Maximiliano", 20);

		Curso curso01 = new Curso("c001", "Programacion 1", 4, NivelCurso.BASICO);
		Curso curso02 = new Curso("c002", "Programacion 3", 4, NivelCurso.AVANZADO);
		Curso curso03 = new Curso("c003", "Programacion 2", 4, NivelCurso.INTERMEDIO);

		curso01.agregarAlumno(alumno01);
		curso01.agregarAlumno(alumno02);
		curso01.agregarAlumno(alumno03);
		curso01.agregarAlumno(alumno04);
		curso01.agregarAlumno(alumno05);
		curso01.agregarAlumno(alumno06);

		Academia academia = new Academia();

		academia.agregarCurso(curso03);
		academia.agregarCurso(curso01);
		academia.agregarCurso(curso02);

		/*----------------------------------------------------------------------------*/

		// Test ejercicio B
		System.out.println("Ejercicio B");
		academia.mostrarLaEstadisticaDeUnCurso("c003");
		academia.mostrarLaEstadisticaDeUnCurso("c001");

		/*----------------------------------------------------------------------------*/

		// Test ejercicio C
		System.out.println("Ejercicio C");
		academia.mostrarListaDeCursosOrdenadosDeMenorAMayorNivel();

		/*----------------------------------------------------------------------------*/

		// Test ejercicio D
		System.out.println("Ejercicio D");
		curso01.mostrarTop5AlumnosMasLongevos();
		curso02.mostrarTop5AlumnosMasLongevos();
	}

}
