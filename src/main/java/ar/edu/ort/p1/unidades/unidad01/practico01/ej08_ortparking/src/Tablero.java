package ar.edu.ort.p1.unidades.unidad01.practico01.ej08_ortparking.src;

import java.util.ArrayList;
import java.util.List;

public class Tablero {

	private List<Llave> llaves;

	/*----------------------------------------------------------------------------*/

	public Tablero() {
		this.llaves = new ArrayList<Llave>();
	}

	/*----------------------------------------------------------------------------*/

	/**
	 * El tablero cuenta con el metodo devolverLlave(...) (ya desarrollado) que
	 * devuelve la llave correcta a partir de la patente. De no encontrarla devuelve
	 * null.
	 * 
	 * @param patente
	 * @return
	 */
	public Llave devolverLlave(String patente) {

		int i = 0;
		Llave llaveEncontrada = null;
		Llave llaveAuxiliar;

		while (i < this.llaves.size() && llaveEncontrada == null) {
			llaveAuxiliar = this.llaves.get(i);
			if (llaveAuxiliar.getPatente() == patente) {
				llaveEncontrada = llaveAuxiliar;
			} else {
				i++;
			}
		}
		return llaveEncontrada;
	}

	/**
	 * 
	 * @param s
	 * @return
	 */
	public boolean existeLlave(String s) {
		return false;
	}

}
