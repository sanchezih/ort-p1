package ar.edu.ort.p1.unidades.u4.practico04.ej10_circulo_cine_fantastico.src;

import ar.edu.ort.p1.util.Fecha;

public class CicloDeCharlas {

	private static final int LIMITE_EXPECTADORES = 50;
	private static final int CANT_TANDAS = 2;
	private static final int MAX_CHARLAS = 5;
	private static final int DIAS_ENTRE_TANDAS = 10;
	private String titulo;
	private int cantEspectadores;
	private Charla[][] charlas;

	/**
	 * Ejercicio B: La explotacion del constructor de la clase CicloDeCharlas, que
	 * debe generar las tandas y las charlas de acuerdo a los datos que llegan por
	 * parametro:
	 * 
	 * - El titulo del Ciclo de Charlas.
	 * 
	 * - Una coleccion con los titulos de las peliculas. (Debe ser de longitud 5 o
	 * menos)
	 * 
	 * - La fecha de inicio del ciclo. (Ver clase Fecha al final del enunciado)
	 * 
	 * - La cantidad maxima de espectadores por charla. (Debe ser 50 o menos)
	 * 
	 * @param titulo
	 * @param peliculas
	 * @param fechaInicio
	 * @param cantEspectadores
	 */
	public CicloDeCharlas(String titulo, Pelicula[] peliculas, Fecha fechaInicio, int cantEspectadores) {
		validarDatos(peliculas, cantEspectadores);
		this.titulo = titulo;
		this.charlas = crearCharlas(peliculas, fechaInicio, cantEspectadores);
	}

	private Charla[][] crearCharlas(Pelicula[] peliculas, Fecha fechaInicio, int cantEspectadores) {

		Charla[][] charlas = new Charla[CANT_TANDAS][peliculas.length];
		Charla charla;
		int nroCharla, mes = fechaInicio.getMes(), anio = fechaInicio.getAnio(), diaInicio = fechaInicio.getDia();
		Fecha fecha;

		for (int i = 0; i < charlas.length; i++) {
			for (int j = 0; j < charlas[i].length; j++) {
				fecha = new Fecha((j + diaInicio + (i * DIAS_ENTRE_TANDAS)), mes, anio);
				nroCharla = i * peliculas.length + j + 1;
				charla = new Charla(fecha, nroCharla, peliculas[j], cantEspectadores);
				charlas[i][j] = charla;
			}
		}
		return charlas;
	}

	/**
	 * Metodo que valida que la cantidad de peliculas que se pretende meter en un
	 * ciclo sea <= MAX_CHARLAS y que la cantidad maxima de espectadores que se
	 * pretende meter en un ciclo sea <= LIMITE_EXPECTADORES
	 * 
	 * @param peliculas
	 * @param cantEspectadores
	 */
	private void validarDatos(Pelicula[] peliculas, int cantEspectadores) {
		if (peliculas.length > MAX_CHARLAS) {
			throw new IllegalArgumentException("La cantidad de peliculas no puede ser mayor a " + MAX_CHARLAS);
		}
		if (cantEspectadores <= 0 || cantEspectadores > LIMITE_EXPECTADORES) {
			throw new IllegalArgumentException(
					"La cantidad de espectadores no puede ser mayor a " + LIMITE_EXPECTADORES + " o ser menos que uno");
		}
	}

	/*----------------------------------------------------------------------------*/

	/**
	 * Ejercicio D: La explotacion del metodo registrarEspectadorEnCharla de la
	 * clase CicloDeCharlas, cuyos parametros, implementacion y valor de retorno se
	 * explico mas arriba.
	 * 
	 * Para registrar un espectador a una charla, este debera indicar su nombre
	 * completo y el numero absoluto de la charla que le interese (por ejemplo, si
	 * hay 2 tandas de 5 charlas cada una, empezando a contar charlas desde 1, la
	 * segunda charla de la segunda tanda seria la numero 7)
	 * 
	 * @param espectador
	 * @param nroCharla
	 * @return
	 */
	public Ticket registrarEspectadorEnCharla(Espectador espectador, int nroCharla) {

		Ticket ticket = null;
		Charla charla;
		int posicionTanda, posicionCharla;

		posicionTanda = (nroCharla - 1) / charlas[0].length;
		posicionCharla = (nroCharla - 1) % charlas[0].length;
		charla = charlas[posicionTanda][posicionCharla];

		if (charla.agregarEspectador(espectador)) {
			ticket = new Ticket(charla.getFecha(), charla.getTitulo(), espectador.getNombre());
		}
		return ticket;
	}

	/*----------------------------------------------------------------------------*/

	/**
	 * Ejercicio E: El metodo verCartelera de la clase CicloDeCharlas, que permita
	 * imprimir en consola las tandas de charlas como se ilustra en el siguiente
	 * ejemplo
	 */
	public void verCartelera() {
		System.out.println("Ciclo de Charlas " + getTitulo() + " - " + charlas[0][0].getFecha());
		for (int i = 0; i < charlas.length; i++) {
			System.out.println("** Tanda " + (i + 1) + " **");
			mostrarCharlas(i);
		}
	}

	private void mostrarCharlas(int indice) {
		for (int i = 0; i < charlas[indice].length; i++) {
			charlas[indice][i].mostrar();
		}
	}

	public String getTitulo() {
		return titulo;
	}
}
