package ar.edu.ort.p1.examenes.ds.empresa_constructora.src;

import java.util.ArrayList;

public class EmpresaConstructora {

	private final static int TIPOS_OBRA = 3;
	private final static int TIPO_CIVIL = 0;
	private final static int TIPO_RUTA = 1;
	private final static int TIPO_PUENTE = 2;

	private ArrayList<Obra> obras;

	/**
	 * Ejercicio C: El metodo tipoDeObraPorDificultad() de la clase que corresponda,
	 * que debe devolver (no mostrar por consola) la cantidad de obras que hay
	 * registradas para realizar en función de su tipo y dificultad.
	 * 
	 * @return
	 */
	public int[][] tipoDeObraPorDificultad() {

		int[][] matriz;
		matriz = new int[EmpresaConstructora.TIPOS_OBRA][Dificultad.values().length];

		for (Obra obra : this.obras) {
			matriz[tipoObra(obra)][obra.getDificultad().ordinal()]++;
		}
		return matriz;

	}

	private int tipoObra(Obra obra) {
		int tipo;

		if (obra instanceof Civil) {
			tipo = EmpresaConstructora.TIPO_CIVIL;
		} else {
			if (obra instanceof Ruta) {
				tipo = EmpresaConstructora.TIPO_RUTA;
			} else {
				tipo = EmpresaConstructora.TIPO_PUENTE;
			}
		}
		return tipo;
	}
}
