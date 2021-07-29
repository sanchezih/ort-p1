package ar.edu.ort.p1.u1.practico01.ej01_ortdemy.src;

public class Main {

	public static void main(String[] args) {

		/* Creacion de usuarios */
		Usuario usuarioVictoria = new Usuario("victoria", "Victoria", "victoria@mail.com", true);
		Usuario usuarioAgustina = new Usuario("agustina", "Agustina", "agustina@mail.com", true);
		Usuario usuarioMartin = new Usuario("martin", "Martin", "martin@mail.com", false);
		Usuario usuarioFelipe = new Usuario("felipe", "Felipe", "felipe@mail.com", true);

		Usuario autorCarlos = new Usuario("carlos", "Carlos", "carlos@mail.com", false);

		/* Creacion de categorias y agregado de cursos a cada una */
		Categoria categoriaDesarrolloWeb = new Categoria("ca01", "Desarrollo Web");
		categoriaDesarrolloWeb.agregarCurso(new Curso("cu01", "Introduccion a Angular", 150, 5, autorCarlos));
		categoriaDesarrolloWeb.agregarCurso(new Curso("cu02", "Introduccion a PHP", 150, 5, autorCarlos));
		categoriaDesarrolloWeb.agregarCurso(new Curso("cu03", "Introduccion a Java", 150, 5, autorCarlos));

		Categoria categoriaDesarrolloMovil = new Categoria("ca02", "Desarrollo Movil");
		categoriaDesarrolloMovil.agregarCurso(new Curso("cu03", "Google Flutter", 150, 5, autorCarlos));
		categoriaDesarrolloMovil.agregarCurso(new Curso("cu04", "Introuccion a Swift", 150, 5, autorCarlos));

		Categoria categoriaDesignThinking = new Categoria("ca03", "Design Thinking");
		categoriaDesignThinking.agregarCurso(new Curso("cu05", "Ludificacion", 150, 5, autorCarlos));

		/*----------------------------------------------------------------------------*/

		Ortdemy ortdemy = new Ortdemy();

		ortdemy.agregarCategoria(categoriaDesarrolloWeb);
		ortdemy.agregarCategoria(categoriaDesarrolloMovil);
		ortdemy.agregarCategoria(categoriaDesignThinking);

		ortdemy.agregarUsuario(usuarioVictoria);
		ortdemy.agregarUsuario(usuarioAgustina);
		ortdemy.agregarUsuario(usuarioMartin);
		ortdemy.agregarUsuario(usuarioFelipe);
		ortdemy.agregarUsuario(autorCarlos);

		ortdemy.mostrarResultadoAlSuscribirseACurso("victoria", "cu01");
		ortdemy.mostrarResultadoAlSuscribirseACurso("victoria", "cu01");
		ortdemy.mostrarResultadoAlSuscribirseACurso("martin", "cu01");
		ortdemy.mostrarResultadoAlSuscribirseACurso("felipe", "cu01");
	}

}
