package ar.edu.ort.p1.examenes._02_ds.festival_cine_independiente.src;

import ar.edu.ort.tp1.u5.tda.impl.ColaNodos;
import ar.edu.ort.tp1.u5.tda.interfaces.Cola;

public class Festival {

	private static final int CANT_PELICULAS = 10;

	private Pelicula[] peliculas;
	private ListaDeVipsPorDniAsc dniVips;
	private Cola<Registracion> registraciones;

	/*----------------------------------------------------------------------------*/

	public Festival() {
		this.peliculas = new Pelicula[CANT_PELICULAS];
		this.dniVips = new ListaDeVipsPorDniAsc();
		this.registraciones = new ColaNodos<>();

		inicializar();
	}

	/**
	 * Metodo que inicializa las estructuras
	 */
	private void inicializar() {

		// Se cargan las peliculas
		this.peliculas[0] = new Pelicula("Gladiator");
		this.peliculas[1] = new Pelicula("Titanic");
		this.peliculas[2] = new Pelicula("Inception");
		this.peliculas[3] = new Pelicula("Joker");
		this.peliculas[4] = new Pelicula("Amelie");
		this.peliculas[5] = new Pelicula("Avatar");
		this.peliculas[6] = new Pelicula("Dune");
		this.peliculas[7] = new Pelicula("Interstellar");
		this.peliculas[8] = new Pelicula("Frozen");
		this.peliculas[9] = new Pelicula("Coco");

		// Se carga la lista de DNIs VIPs
		this.dniVips.add(11111111);
		this.dniVips.add(22222222);
		this.dniVips.add(33333333);

		// Se cargan las registraciones
		this.registraciones.add(new Registracion(11111111, "Roberto Gonzalez", "Titanic"));
		this.registraciones.add(new Registracion(22222222, "Juan Perez", "Titanic"));
		this.registraciones.add(new Registracion(33333333, "Maria Lopez", "Titanic"));
	}

	public Pelicula[] getPeliculas() {
		return peliculas;
	}

	public Cola<Registracion> getRegistraciones() {
		return registraciones;
	}

	/*----------------------------------------------------------------------------*/

	/**
	 * 
	 */
	public void procesarRegistraciones() {

		Registracion registracion;
		Pelicula pelicula;

		// Se sacan 1 a 1 las registraciones de la cola de registraciones
		while (!this.registraciones.isEmpty()) {

			// Se obtiene 1 registracion
			registracion = this.registraciones.remove();

			// Se busca la pelicula de la registracion
			pelicula = buscarPelicula(registracion.getNombreDeLaPelicula());

			// Se acredita a la persona
			pelicula.acreditar(registracion, esVip(registracion.getDniDelInteresado()));
		}

	}

	/**
	 * 
	 * @param nombre
	 * @return
	 */
	private Pelicula buscarPelicula(String nombre) {
		
		Pelicula pelicula = null;
		int index = 0;

		while (pelicula == null && index < CANT_PELICULAS) {
			if (this.peliculas[index].mismoNombre(nombre)) {
				pelicula = this.peliculas[index];
			} else {
				index++;
			}
		}
		return pelicula;
	}

	/**
	 * 
	 * @param dni
	 * @return
	 */
	private boolean esVip(int dni) {
		return this.dniVips.exists(dni);
	}

	/*----------------------------------------------------------------------------*/

	/**
	 * Ejercicio 2: Devuelve una estructura que indica cuantos acreditados hay por
	 * tipo de funcion y por pelicula.
	 * 
	 * @return
	 */
	public int[][] obtenerAcreditadosPorTipoDeFuncionYPelicula() {
		int[][] matriz = new int[CANT_PELICULAS][TipoDeFuncion.values().length];
		int[] acreditadosPorTipoDeFuncion = null;

		for (int i = 0; i < CANT_PELICULAS; i++) {
			
			acreditadosPorTipoDeFuncion = this.peliculas[i].getAcreditadosPorTipoDeFuncion();
			
			for (int j = 0; j < acreditadosPorTipoDeFuncion.length; j++) {
				matriz[i][j] = acreditadosPorTipoDeFuncion[j];
			}
		}

		return matriz;
	}

}
