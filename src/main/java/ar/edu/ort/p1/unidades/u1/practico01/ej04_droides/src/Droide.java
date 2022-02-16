package ar.edu.ort.p1.unidades.u1.practico01.ej04_droides.src;

import java.util.ArrayList;

public class Droide {
	private ArrayList<Pieza> piezasOperativas;
	private ArrayList<Pieza> piezasNoOperativas;
	private ArrayList<Droide> droidesFueraDeServicio;

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
	private ResultadoReparacion autoRepararse() {
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

	private void reemplazarPieza(Pieza piezaNoOperativa, Pieza piezaOperativa) {
		this.piezasNoOperativas.remove(piezaNoOperativa);
		this.piezasOperativas.add(piezaOperativa);
	}

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

}
