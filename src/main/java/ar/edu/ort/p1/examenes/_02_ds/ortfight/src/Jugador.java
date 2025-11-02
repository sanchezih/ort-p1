package ar.edu.ort.p1.examenes._02_ds.ortfight.src;

public class Jugador {

	private String id;
	private int region;
	private int ranking;
	private PilaDePartidas partidas;

	/**
	 * 
	 * @param id
	 * @param region
	 * @param ranking
	 * @param partidas
	 */
	public Jugador(String id, int region, int ranking) {
		this.id = id;
		this.region = region;
		this.ranking = ranking;
		this.partidas = new PilaDePartidas();
	}

	public String getId() {
		return id;
	}

	public int getRanking() {
		return ranking;
	}

	public int getRegion() {
		return region;
	}

	/**
	 * 
	 * @return
	 */
	public int[] obtenerResumenPartidas() { // nombre disitnto en ns
		int[] resumen;
		PilaDePartidas aux = new PilaDePartidas(); // falta en ns
		Partida partida;
		resumen = new int[Resultado.values().length];

		while (!partidas.isEmpty()) {
			partida = partidas.pop();
			aux.push(partida);
			resumen[partida.getResultado().ordinal()]++;
		}

		while (!aux.isEmpty()) {
			partidas.push(aux.pop());
		}

		return resumen;
	}

	@Override
	public String toString() {
		return "Jugador [id=" + id + ", region=" + region + ", ranking=" + ranking + "]";
	}

	/*----------------------------------------------------------------------------*/

	// Metodos complementarios

	public void agregarPartida(Partida partida) {
		this.partidas.push(partida);
	}

}
