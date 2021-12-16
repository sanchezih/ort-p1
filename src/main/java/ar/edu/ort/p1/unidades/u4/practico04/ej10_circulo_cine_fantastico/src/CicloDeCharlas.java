package ar.edu.ort.p1.unidades.u4.practico04.ej10_circulo_cine_fantastico.src;

public class CicloDeCharlas {

	private static final int LIMITE_EXPECTADORES = 50;
	private static final int CANT_TANDAS = 2;
	private static final int MAX_CHARLAS = 5;
	private static final int DIAS_ENTRE_TANDAS = 10;
	private String titulo;
	private int cantEspectadores;
	private Charla[][] charlas;

	// METODOS

	public CicloDeCharlas(String titulo, Pelicula[] peliculas, Fecha fechaInicio, int cantEspectadores) {

		this.titulo = titulo;
		validarDatos(peliculas, cantEspectadores);
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

	private void validarDatos(Pelicula[] peliculas, int cantEspectadores) {
		if (peliculas.length > MAX_CHARLAS) {
			throw new IllegalArgumentException("La cantidad de peliculas no puede ser mayor a " + MAX_CHARLAS);
		}
		if (cantEspectadores <= 0 || cantEspectadores > LIMITE_EXPECTADORES) {
			throw new IllegalArgumentException(
					"La cantidad de espectadores no puede ser mayor a " + LIMITE_EXPECTADORES + " o ser menos que uno");
		}
	}

	public Ticket registrarEspectadorEnCharla(Espectador espectador, int nroCharla) {
		Ticket ticket = null;
		Charla charla;
		int posicionTanda, posicionCharla;

		posicionTanda = (nroCharla - 1) / charlas[0].length;
		posicionCharla = (nroCharla - 1) % charlas[0].length;
		charla = charlas[posicionTanda][posicionCharla];

		if (charla.agregoEspectador(espectador)) {
			ticket = new Ticket(charla.getFecha(), charla.getTitulo(), espectador.getNombre());
		}
		return ticket;
	}

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
