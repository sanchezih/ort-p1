package ar.edu.ort.p1.u4.practico04.ej03_seleccion_argentina.src.seleccion;

public class Seleccion {

	private static int CANT_JUG = 23;
	private static int CANT_TIT = 11;
	private static int CANT_SUP = 7;
	private String nombre;
	private Jugador[] jugadores = new Jugador[CANT_JUG];

	public Seleccion() {
		inicializarSeleccion();
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public Jugador[] getJugadores() {
		return jugadores;
	}

	/*----------------------------------------------------------------------------*/

	public void cambio(int n1, int n2) {
		int idx1;
		int idx2;
		if (rangoValido(n1) && rangoValido(n2) && n1 != n2) {
			idx1 = idxJugador(n1);
			idx2 = idxJugador(n2);
			intercambiar(idx1, idx2);
		}
	}

	/*----------------------------------------------------------------------------*/

	public void cambioPorLesion(int nroLesion, String apeReemplazo) {
		int idxLesion;
		Jugador jugLesion;
		Jugador jugReemplazo;

		if (rangoValido(nroLesion)) {
			idxLesion = idxJugador(nroLesion);
			jugLesion = this.jugadores[idxLesion];
			jugReemplazo = new Jugador(apeReemplazo, nroLesion, jugLesion.getPosicion());
			this.jugadores[idxLesion] = jugReemplazo;
		}
	}

	/*----------------------------------------------------------------------------*/

	public Jugador[] obtenerReservas() {
		int cantReservas;
		Jugador[] reservas;
		cantReservas = CANT_JUG - CANT_TIT - CANT_SUP;
		reservas = new Jugador[cantReservas];
		for (int i = 0; i < reservas.length; i++) {
			reservas[i] = this.jugadores[i + (CANT_JUG - cantReservas)];
		}
		return reservas;
	}

	/*----------------------------------------------------------------------------*/

	public int[] cantJugadoresPorPosicion() {
		Posicion[] posiciones;
		int[] cantidades;
		posiciones = Posicion.values();
		cantidades = new int[posiciones.length];
		for (int i = 0; i < this.jugadores.length; i++) {
			Posicion p = this.jugadores[i].getPosicion();
			cantidades[p.ordinal()]++;
		}
		return cantidades;
	}

	/*----------------------------------------------------------------------------*/

	private int idxJugador(int nro) {
		int i = this.jugadores.length - 1;
		boolean jugEncontrado = false;
		while (i >= 0 && !jugEncontrado) {
			if (this.jugadores[i] != null && this.jugadores[i].getNroCamiseta() == nro) {
				jugEncontrado = true;
			} else {
				i--; // Recorre para atras para que, si no se encuentra, devuelva -1
			}
		}
		return i;
	}

	private boolean rangoValido(int nro) {
		final int MIN = 1;
		return nro >= MIN && nro <= CANT_JUG;
	}

	private void intercambiar(int i1, int i2) {
		Jugador aux;
		aux = this.jugadores[i1];
		this.jugadores[i1] = this.jugadores[i2];
		this.jugadores[i2] = aux;
	}

	public void mostrarJugadores() {
		for (int i = 0; i < this.jugadores.length; i++) {
			System.out.println(i + 1 + ". " + jugadores[i].getApellido() + " (" + jugadores[i].getNroCamiseta() + ")");
		}
	}

	public void mostrarJugadores(Jugador[] jugadores) {
		for (int i = 0; i < jugadores.length; i++) {
			System.out.println(i + 1 + ". " + jugadores[i].getApellido() + " (" + jugadores[i].getNroCamiseta() + ")");
		}
	}

	public void mostrarCantJugadoresPorPosicion(int[] cantJugadoresPorPosicion) {
		for (int i = 0; i < cantJugadoresPorPosicion.length; i++) {
			System.out.println(Posicion.values()[i] + ": \t" + cantJugadoresPorPosicion[i]);
		}
	}

	/*----------------------------------------------------------------------------*/

	private void inicializarSeleccion() {
		this.nombre = "Seleccion Argentina de Futbol";

		// Titulares
		this.jugadores[0] = new Jugador("Guzman", 1, Posicion.ARQUERO);
		this.jugadores[1] = new Jugador("Mercado", 2, Posicion.DEFENSOR);
		this.jugadores[2] = new Jugador("Tagliafico", 3, Posicion.DEFENSOR);
		this.jugadores[3] = new Jugador("Ansaldi", 4, Posicion.DEFENSOR);
		this.jugadores[4] = new Jugador("Biglia", 5, Posicion.MEDIOCAMPISTA);
		this.jugadores[5] = new Jugador("Fazio", 6, Posicion.DEFENSOR);
		this.jugadores[6] = new Jugador("Banega", 7, Posicion.MEDIOCAMPISTA);
		this.jugadores[7] = new Jugador("Acuna", 8, Posicion.DEFENSOR);
		this.jugadores[8] = new Jugador("Higuain", 9, Posicion.DELANTERO);
		this.jugadores[9] = new Jugador("Messi", 10, Posicion.DELANTERO);
		this.jugadores[10] = new Jugador("Di Maria", 11, Posicion.MEDIOCAMPISTA);

		// Suplentes
		this.jugadores[11] = new Jugador("Armani", 12, Posicion.ARQUERO);
		this.jugadores[12] = new Jugador("Meza", 13, Posicion.MEDIOCAMPISTA);
		this.jugadores[13] = new Jugador("Mascherano", 14, Posicion.MEDIOCAMPISTA);
		this.jugadores[14] = new Jugador("Perez", 15, Posicion.MEDIOCAMPISTA);
		this.jugadores[15] = new Jugador("Rojo", 16, Posicion.DEFENSOR);
		this.jugadores[16] = new Jugador("Otamendi", 17, Posicion.DEFENSOR);
		this.jugadores[17] = new Jugador("Salvio", 18, Posicion.DEFENSOR);

		// Reserva
		this.jugadores[18] = new Jugador("Aguero", 19, Posicion.DELANTERO);
		this.jugadores[19] = new Jugador("Lo Celso", 20, Posicion.MEDIOCAMPISTA);
		this.jugadores[20] = new Jugador("Dybala", 21, Posicion.DELANTERO);
		this.jugadores[21] = new Jugador("Pavon", 22, Posicion.MEDIOCAMPISTA);
		this.jugadores[22] = new Jugador("Caballero", 23, Posicion.ARQUERO);

	}
}
