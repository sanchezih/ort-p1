package ar.edu.ort.p1.unidades.unidad05.practico05.ej04_depto_deportes_con_subclases.src;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

import ar.edu.ort.tp1.u5.tda.interfaces.Pila;

/**
 * 
 * @author ihsanch
 *
 */
public class DepartamentoDeDeportes {

	private static final int CANT_PILAS = 3;
	private static final int PELOTAS_X_PILA = 5;

	private Pila<Pelota>[] pilas;

	/*----------------------------------------------------------------------------*/

	/**
	 * 
	 */
	public DepartamentoDeDeportes() {

		this.pilas = new PilaDePelotas[CANT_PILAS];

		for (int i = 0; i < CANT_PILAS; i++) {
			this.pilas[i] = new PilaDePelotas(PELOTAS_X_PILA);
		}
		inicializarDepartamento();
		dibujarPilas();
	}

	/*----------------------------------------------------------------------------*/

	/**
	 * Ejercicio B: La explotacion del metodo verPelotasEnTopes, que muestre la
	 * informacion completa de las tres pelotas actualmente visibles.
	 */
	public void verPelotasEnTopes() {
		for (int i = 0; i < CANT_PILAS; i++) {
			System.out.print("En la pila " + (i + 1) + ": ");
			if (!this.pilas[i].isEmpty()) {
				System.out.println(this.pilas[i].peek().toString());
			} else {
				System.out.println("No hay nada");
			}
		}
	}

	/*----------------------------------------------------------------------------*/

	/**
	 * Ejercicio C: La explotacion del metodo agregarPelota, que recibe una pelota y
	 * la guarda en la primera pila que tenga lugar para alojarla. Retorna si se
	 * pudo agregar o no.
	 * 
	 * @param pelota
	 * @return
	 */
	public boolean agregarPelota(Pelota pelota) {
		int i = 0;
		boolean fueAgregada = false;

		while (i < CANT_PILAS && !fueAgregada) {
			if (!this.pilas[i].isFull()) {
				this.pilas[i].push(pelota);
				fueAgregada = true;
			} else {
				i++;
			}
		}

		return fueAgregada;
	}

	/*----------------------------------------------------------------------------*/

	/**
	 * Ejercicio D: La explotacion del metodo buscarPelota, que recibe un codigo y
	 * devuelve la pelota correspondiente (o null si no existe).
	 * 
	 * @param codigo
	 * @return
	 */
	public Pelota buscarPelota(String codigo) {
		int i = 0;
		Pelota pelotaEncontrada = null;

		while (i < CANT_PILAS && pelotaEncontrada == null) {
			pelotaEncontrada = buscarPelotaEnPila(codigo, this.pilas[i]);
			i++;
		}
		return pelotaEncontrada;
	}

	/**
	 * 
	 * @param codigo
	 * @param pila
	 * @return
	 */
	private Pelota buscarPelotaEnPila(String codigo, Pila<Pelota> pila) {
		Pelota pelotaEncontrada = null;
		Pila<Pelota> pilaAux = new PilaDePelotas();

		while (!pila.isEmpty() && pelotaEncontrada == null) {
			Pelota pelotaAux = pila.pop();
			pilaAux.push(pelotaAux);
			if (pelotaAux.getCodigo() == codigo) {
				pelotaEncontrada = pelotaAux;
			}
		}

		while (!pilaAux.isEmpty()) {
			pila.push(pilaAux.pop());
		}
		return pelotaEncontrada;

	}

	/*----------------------------------------------------------------------------*/

	/**
	 * Ejercicio E: La explotacion del metodo pelotasPorTipo que retorne cuantas
	 * pelotas de cada tipo hay en cada pila.
	 * 
	 * @return
	 */
	public int[][] pelotasPorTipo() {

		int[][] cantPelotasPorTipoYPila = new int[CANT_PILAS][TipoPelota.values().length];

		for (int i = 0; i < CANT_PILAS; i++) {
			cantPelotasPorTipoYPila[i] = cantidadDePelotasPorTipo(this.pilas[i]);
		}
		return cantPelotasPorTipoYPila;
	}

	/**
	 * 
	 * @param pila
	 * @return
	 */
	private int[] cantidadDePelotasPorTipo(Pila<Pelota> pila) {

		Pila<Pelota> pilaAuxiliar = new PilaDePelotas();
		int[] cantidades = new int[TipoPelota.values().length];

		while (!pila.isEmpty()) {
			Pelota pelota = pila.pop();
			pilaAuxiliar.push(pelota);
			cantidades[pelota.getTipo().ordinal()]++;
		}
		while (!pilaAuxiliar.isEmpty()) {
			pila.push(pilaAuxiliar.pop());
		}
		return cantidades;
	}

	/*----------------------------------------------------------------------------*/

	// Metodos complementarios

	/**
	 * 
	 */
	private void inicializarDepartamento() {
		Random random = new Random();

		int min = 1;
		int cantPelotas = random.nextInt(CANT_PILAS * PELOTAS_X_PILA) + min;

		System.out.println("Para este ejemplo se utilizaran " + cantPelotas + " pelotas...");

		int metidas = 0;
		while (metidas < cantPelotas) {
			int tipoPelota = random.nextInt(TipoPelota.values().length);
			int numeroDePila = random.nextInt(CANT_PILAS);
			if (!this.pilas[numeroDePila].isFull()) {
				this.pilas[numeroDePila].push(new Pelota("unCodigo", TipoPelota.values()[tipoPelota]));
				metidas++;
			}
		}
	}

	/**
	 * 
	 */
	public void dibujarPilas() {
		char matrizDePelotas[][] = new char[PELOTAS_X_PILA][CANT_PILAS];

		for (int i = 0; i < CANT_PILAS; i++) {

			Pelota pelota = null;
			List<Pelota> listaDePelotas = new ArrayList<>();
			Pila<Pelota> pilaAux = new PilaDePelotas();

			while (!this.pilas[i].isEmpty()) {
				pelota = this.pilas[i].pop();
				pilaAux.push(pelota);
				listaDePelotas.add(pelota);

			}

			while (!pilaAux.isEmpty()) {
				this.pilas[i].push(pilaAux.pop());
			}

			Collections.reverse(listaDePelotas);
			for (int j = 0; j < listaDePelotas.size(); j++) {
				int columna = i;
				int fila = PELOTAS_X_PILA - j - 1;
				matrizDePelotas[fila][columna] = listaDePelotas.get(j).getInicial();
			}
		}
		dibujar(matrizDePelotas);
	}

	/**
	 * 
	 * @param matLetras
	 */
	private void dibujar(char[][] matLetras) {
		System.out.println();
		for (int i = 0; i < matLetras.length; i++) {
			System.out.print("| ");
			for (int j = 0; j < matLetras[i].length; j++) {
				char c = '-';
				c = matLetras[i][j];
				System.out.print(c + " | ");
			}
			System.out.println();
		}
		System.out.print("+");
		for (int k = 0; k < CANT_PILAS; k++) {
			System.out.print("---+");
		}
		System.out.println("\n");
	}

	/**
	 * 
	 * @param matriz
	 */
	public void dibujarMatrizDePelotas(int[][] matriz) {
		System.out.println("\tFUT\tBAS\tVOL");
		for (int i = 0; i < matriz.length; i++) {
			System.out.print("Pila " + (i + 1) + "\t");
			for (int j = 0; j < matriz[i].length; j++) {
				System.out.print(matriz[i][j] + "\t");
			}
			System.out.println();
		}
	}

}
