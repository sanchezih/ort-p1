package ar.edu.ort.p1.examenes.ds.empresa_constructora.src;

import java.util.ArrayList;

public class EmpresaConstructora {

	/*
	 * Si bien a simple vista nos podemos dar cuenta que esta no es la mejor
	 * implementacion, ya que si agregan mas tipos de obra hay que hacer
	 * modificaciones en estas constantes, en este momento hacer esto es una
	 * solucion aceptable.
	 */
	private final static int TIPOS_OBRA = 3;
	private final static int TIPO_CIVIL = 0;
	private final static int TIPO_RUTA = 1;
	private final static int TIPO_PUENTE = 2;

	private ArrayList<Obra> obras;

	/*----------------------------------------------------------------------------*/

	public EmpresaConstructora() {
		this.obras = new ArrayList<Obra>();
	}

	/*----------------------------------------------------------------------------*/

	/**
	 * Ejercicio C: El metodo tipoDeObraPorDificultad() de la clase que corresponda,
	 * que debe devolver (no mostrar por consola) la cantidad de obras que hay
	 * registradas para realizar en funcion de su tipo y dificultad.
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

	/**
	 * 
	 * @param obra
	 * @return
	 */
	private int tipoObra(Obra obra) {
		int tipo;

		if (obra instanceof ObraCivil) {
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

	/*----------------------------------------------------------------------------*/

	// Metodos complementarios

	public void agregarObra(Obra obra) {
		this.obras.add(obra);
	}

	/**
	 * 
	 */
	public void mostrarMatrizDeTipoDeObraPorDificultad() {
		System.out.println();
		System.out.println("Muestro ejercicio C");
		int[][] matriz = tipoDeObraPorDificultad();

		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz[i].length; j++) {
				System.out.print(matriz[i][j] + "\t");
			}
			System.out.println();

		}
	}
}
