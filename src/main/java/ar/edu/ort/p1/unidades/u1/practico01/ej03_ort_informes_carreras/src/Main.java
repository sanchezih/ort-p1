package ar.edu.ort.p1.unidades.u1.practico01.ej03_ort_informes_carreras.src;

public class Main {

	public static void main(String[] args) {

		/* Creo las materias */
		Materia orgEmpresarialAprobada = new Materia("Organizacion Empresarial", "2019-01", Estado.APROBADA);
		Materia orgEmpresarialEnCurso = new Materia("Organizacion Empresarial", "2019-01", Estado.EN_CURSO);
		Materia introInformaticaAprobada = new Materia("Introduccion a la Informatica", "2019-01", Estado.APROBADA);

		/* Creo los alumnos */
		Alumno fernanda = new Alumno("Fernanda", "fernanda@mail.com");
		Alumno luis = new Alumno("Luis", "luis@mail.com");
		Alumno facundo = new Alumno("Facundo", "facundo@mail.com");
		Alumno melina = new Alumno("Melina", "melina@mail.com");

		fernanda.agregarMateria(orgEmpresarialEnCurso);
		luis.agregarMateria(introInformaticaAprobada);
		facundo.agregarMateria(introInformaticaAprobada);

		/* Creo las carreras */
		Carrera analistaDeSistemas = new Carrera();
		Carrera biotecnologia = new Carrera();

		/* Creo alumnos a las carreras */
		analistaDeSistemas.agregarAlumno(fernanda);
		analistaDeSistemas.agregarAlumno(luis);
		analistaDeSistemas.agregarAlumno(facundo);

		/* Creo ORT */
		ORT ort = new ORT();
		ort.agregarCarrera(analistaDeSistemas);
		ort.agregarCarrera(biotecnologia);

		/*----------------------------------------------------------------------------*/

		analistaDeSistemas.mostrarInformeMaxMaterias();

	}

}
