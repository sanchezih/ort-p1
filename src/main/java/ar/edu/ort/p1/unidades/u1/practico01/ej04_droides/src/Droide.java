package ar.edu.ort.p1.unidades.u1.practico01.ej04_droides.src;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import com.google.gson.Gson;

public class Droide {

	static int count = 0;
	static int cantFS = 0;

	private String id;
	private ArrayList<Pieza> piezasOperativas;
	private ArrayList<Pieza> piezasNoOperativas;
	private ArrayList<Droide> droidesFueraDeServicio;

	public Droide(String id) {
		super();
		this.id = id;
		this.piezasOperativas = new ArrayList<Pieza>();
		this.piezasNoOperativas = new ArrayList<Pieza>();
		this.droidesFueraDeServicio = new ArrayList<Droide>();
		inicializar();
	}

	/*----------------------------------------------------------------------------*/

	/**
	 * Ejercicio B: La explotacion del metodo autoRepararse de la clase Droide, que
	 * no recibe parametros. Debe intentar reemplazar sus piezas no operativas por
	 * las piezas operativas que pudiera encontrar en alguno de los otros droides.
	 * Cada vez que una pieza se reemplaza la pieza no operativa original se
	 * descarta. Este metodo devuelve alguno de estos resultados:
	 * 
	 * COMPLETAMENTE_OPERATIVO: cuando todas las piezas del droide estan operativas.
	 * 
	 * REPARACION_PARCIAL: cuando quedan algunas piezas no operativas, pero alguna
	 * se pudo reemplazar.
	 * 
	 * REPARACION_IMPOSIBLE: cuando no se logre reparar ninguna de las piezas no
	 * operativas que pudiera tener.
	 * 
	 * @return
	 */
	public ResultadoReparacion autoRepararse() {
		int i = 0;
		Pieza pieza;
		Pieza piezaOperativa;
		boolean encontreAlMenosUnaPieza = false;

		while (i < this.piezasNoOperativas.size()) {
			pieza = this.piezasNoOperativas.get(i);
			piezaOperativa = this.buscarPiezaOperativa(pieza.getNombre());
			if (piezaOperativa != null) {
				encontreAlMenosUnaPieza = true;
				this.reemplazarPieza(pieza, piezaOperativa);
			} else {
				i++;
			}
		}
		return this.obtenerResultadoReparacion(encontreAlMenosUnaPieza);
	}

	/**
	 * 
	 * @param nombrePieza
	 * @return
	 */
	private Pieza buscarPiezaOperativa(String nombrePieza) {
		int i = 0;
		Droide droide;
		Pieza piezaEncontrada = null;
		while (i < this.droidesFueraDeServicio.size() && piezaEncontrada == null) {
			droide = this.droidesFueraDeServicio.get(i);
			piezaEncontrada = droide.obtenerPiezaOperativa(nombrePieza);
			i++;
		}
		return piezaEncontrada;
	}

	/**
	 * 
	 * @param nombrePieza
	 * @return
	 */
	private Pieza obtenerPiezaOperativa(String nombrePieza) {
		int i = 0;
		Pieza pieza;
		Pieza piezaEncontrada = null;
		while (i < this.piezasOperativas.size() && piezaEncontrada == null) {
			pieza = this.piezasOperativas.get(i);
			if (pieza.getNombre().equals(nombrePieza)) {
				piezaEncontrada = this.piezasOperativas.remove(i);
			} else {
				i++;
			}
		}
		return piezaEncontrada;
	}

	/**
	 * 
	 * @param piezaNoOperativa
	 * @param piezaOperativa
	 */
	private void reemplazarPieza(Pieza piezaNoOperativa, Pieza piezaOperativa) {
		this.piezasNoOperativas.remove(piezaNoOperativa);
		this.piezasOperativas.add(piezaOperativa);
	}

	/**
	 * 
	 * @param encontreAlMenosUnaPieza
	 * @return
	 */
	private ResultadoReparacion obtenerResultadoReparacion(boolean encontreAlMenosUnaPieza) {
		ResultadoReparacion resultado = ResultadoReparacion.REPARACION_IMPOSIBLE;
		if (this.piezasNoOperativas.isEmpty()) {
			resultado = ResultadoReparacion.COMPLETAMENTE_OPERATIVO;
		} else {
			if (encontreAlMenosUnaPieza) {
				resultado = ResultadoReparacion.REPARACION_PARCIAL;
			}
		}
		return resultado;
	}

	@Override
	public String toString() {
		return "Droide [id=" + id + ", piezasOperativas=" + piezasOperativas + ", piezasNoOperativas="
				+ piezasNoOperativas + ", droidesFueraDeServicio=" + droidesFueraDeServicio + "]";
	}

	/*----------------------------------------------------------------------------*/

	// Metodos complementarios

	private void inicializar() {

		// Array de 6 piezas
		ArrayList<Pieza> piezas = new ArrayList<Pieza>(List.of( //
				new Pieza("Bateria de litio"), //
				new Pieza("Sensor de proximidad"), //
				new Pieza("Sensor de temperatura"), //
				new Pieza("Sensor de humedad"), //
				new Pieza("Antena"), //
				new Pieza("Visor nocturno")));

		Random random = new Random();

		for (Pieza pieza : piezas) {
			if (random.nextBoolean()) {
				this.piezasOperativas.add(pieza);
			} else {
				this.piezasNoOperativas.add(pieza);
			}
		}

		count = count + 1;

		if (count <= 1) {
			cantFS = (int) (Math.random() * 3 + 1);
			for (int i = 0; i < cantFS; i++) {
				this.droidesFueraDeServicio.add(new Droide(null));
			}
		}

	}

	/**
	 * 
	 * @return
	 */
	public String mostrar() {
		Gson gson = new Gson();
		return "Droide: " + gson.toJson(this, Droide.class);
	}

}
