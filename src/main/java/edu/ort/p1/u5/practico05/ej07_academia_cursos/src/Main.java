package edu.ort.p1.u5.practico05.ej07_academia_cursos.src;

public class Main {
	public static void main(String[] args) {
		
		Alumno alumno01=new Alumno("12345678", "Pepe", 25);

		Curso curso01 = new Curso("c001", "P1", 4, NivelCurso.BASICO);
		Curso curso02 = new Curso("c002", "P2", 4, NivelCurso.INTERMEDIO);
		Curso curso03 = new Curso("c003", "P3", 4, NivelCurso.AVANZADO);

		Academia academia = new Academia();

		academia.getCursosPorNivel().add(curso03);
		academia.getCursosPorNivel().add(curso01);
		academia.getCursosPorNivel().add(curso02);
		/*----------------------------------------------------------------------------*/

		/**
		 * La explotación del metodo obtenerEstadistica, que reciba por parametro el
		 * codigo de un curso y se retornen los siguientes datos: I. Nombre del curso.
		 * II. Promedio de edad de los alumnos que posee.
		 */

		/*----------------------------------------------------------------------------*/

		/**
		 * La explotación del método listadoDeCursosPorNivel, que retorne una lista de
		 * cursos ordenados de menor a mayor nivel.
		 */
		for (Curso empleado : academia.listadoDeCursosPorNivel()) {
			System.out.println(empleado.toString());
		}

		/*----------------------------------------------------------------------------*/

		/**
		 * La explotación del método top5AlumnosMasLongevos, de la clase Curso que
		 * retorne a los 5 alumnos más longevos (mayor edad) que posea (si no llega a 5,
		 * devolver los que haya). Asumir que no hay edades repetidas.
		 */
		
		

	}

}
