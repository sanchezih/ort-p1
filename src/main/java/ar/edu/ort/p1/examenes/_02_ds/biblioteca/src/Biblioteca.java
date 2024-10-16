package ar.edu.ort.p1.examenes._02_ds.biblioteca.src;

public class Biblioteca {

	private static final int CANT_SECCIONES = 4;
	private static final int LIBROS_X_SECCION = 25;

	private Libro libros[][];

	/*----------------------------------------------------------------------------*/

	public Biblioteca() {
		this.libros = new Libro[CANT_SECCIONES][LIBROS_X_SECCION];
		inicializar();
	}

	/*----------------------------------------------------------------------------*/

	/**
	 * Ejercicio 1: esarrollar el metodo tomarPrestado(...) en la clase
	 * correspondiente. Este metodo debe recibir como parámetros un usuario, la
	 * seccion a la que se dirige (numerada del 1 al 4) y el codigo del libro que
	 * desea tomar prestado.
	 * 
	 * El metodo debe registrar al usuario en la coleccion de espera del libro,
	 * siempre que cumpla con los requisitos antes establecidos para tomar prestado
	 * un libro y ademas:
	 * 
	 * - Para los libros de literatura clasica: no tener una edad inferior a la
	 * mínima recomendada para el tipo de libro.
	 * 
	 * -Para los libros tecnicos: solo se podran prestar libros tecnicos de
	 * complejidad alta a docentes, nunca a alumnos.
	 * 
	 * Si el usuario no puede tomar prestado el libro por algun motivo, el metodo
	 * debe imprimir un mensaje de error en la consola y no agregar al usuario al
	 * registro del libro.
	 * 
	 * @param usuario
	 * @param seccion
	 * @param codigoLibro
	 */
	public void tomarPrestado(Usuario usuario, int seccion, String codigoLibro) {

		Libro libro = null;
		boolean sePuedeReservar = false;

		if (usuario.puedeReservarLibro()) {
			libro = buscarLibro(seccion, codigoLibro);
			if (libro != null && libro.puedeLeer(usuario)) {
				sePuedeReservar = true;
			}
		}
		if (sePuedeReservar) {
			libro.anotar(usuario);
		} else {
			System.out.println("El usuario no puede reservar el libro");
		}
	}

	/**
	 * ABC
	 * 
	 * @param seccion
	 * @param codigoLibro
	 * @return
	 */
	private Libro buscarLibro(int seccion, String codigoLibro) {
		Libro libro = null;
		if (seccion > 0 && seccion <= CANT_SECCIONES) {
			libro = buscarLibro(codigoLibro, libros[seccion - 1]);
		}
		return libro;
	}

	/**
	 * 
	 * @param codigoLibro
	 * @param libros
	 * @return
	 */
	private Libro buscarLibro(String codigoLibro, Libro[] libros) {
		Libro libro = null;
		int i = 0;
		while (i < libros.length && libro == null) {
			if (libros[i] != null && libros[i].esLibro(codigoLibro)) { // IHS agregado por mi
				libro = libros[i];
			} else {
				i++;
			}
		}
		return libro;
	}

	/*----------------------------------------------------------------------------*/

	/**
	 * Ejercicio 2: Desarrollar el metodo generarListaPrioritaria(), que debe
	 * devolver una estructura por sección y ubicación que contenga a los usuarios
	 * que se hayan anotado para tomar prestado el libro alli almacenado, ordenando
	 * a los usuario por su edad, de mayor a menor.
	 * 
	 * @return
	 */
	public UsuariosPorEdad[][] generarListaPrioritaria() {

		UsuariosPorEdad[][] matriz = new UsuariosPorEdad[CANT_SECCIONES][LIBROS_X_SECCION];

		for (int f = 0; f < matriz.length; f++) {
			for (int c = 0; c < matriz[f].length; c++) {
				matriz[f][c] = libros[f][c].ordenarUsuariosPorEdad();
			}
		}

		return matriz;

	}

	/*----------------------------------------------------------------------------*/

	// Metodos complementarios

	private void inicializar() {
		this.libros[0][0] = new Tecnico("A01", "Un titulo", "Un autor", Complejidad.MEDIA);
	}

}
