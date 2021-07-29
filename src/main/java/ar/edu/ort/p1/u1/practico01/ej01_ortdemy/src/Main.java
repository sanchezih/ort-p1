package ar.edu.ort.p1.u1.practico01.ej01_ortdemy.src;

public class Main {

	public static void main(String[] args) {

		/* Creacion de usuarios */
		Usuario usuarioVictoria = new Usuario("u11", "Victoria", "victoria@mail.com", true);
		Usuario usuarioAgustina = new Usuario("u12", "Agustina", "agustina@mail.com", true);
		Usuario usuarioMartin = new Usuario("u13", "Martin", "martin@mail.com", false);
		Usuario usuarioFelipe = new Usuario("u14", "Felipe", "felipe@mail.com", true);


		Usuario autorCarlos = new Usuario("u21", "Carlos", "carlos@mail.com", false);

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

		ortdemy.mostrarResultadoAlSuscribirseACurso("u11", "cu01");
		ortdemy.mostrarResultadoAlSuscribirseACurso("u12", "cu01");
		ortdemy.mostrarResultadoAlSuscribirseACurso("u13", "cu01");
		ortdemy.mostrarResultadoAlSuscribirseACurso("u14", "cu01");
	}

}
