package ar.edu.ort.p1.unidades.unidad05.practico05.ej04_depto_deportes_con_subclases.src;

import ar.edu.ort.tp1.u5.tda.impl.PilaNodos;

/**
 * https://www.baeldung.com/java-generic-array
 * 
 * https://ahdak.github.io/blog/effective-java-part-4/
 * 
 * @author ihsanch
 *
 */
public class PilaDePelotas extends PilaNodos<Pelota> {

	public PilaDePelotas() {
	}

	public PilaDePelotas(int limite) {
		super(limite);
	}
}
