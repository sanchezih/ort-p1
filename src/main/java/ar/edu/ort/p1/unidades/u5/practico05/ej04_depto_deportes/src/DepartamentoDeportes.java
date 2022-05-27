package ar.edu.ort.p1.unidades.u5.practico05.ej04_depto_deportes.src;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

import ar.edu.ort.tp1.u5.tda.Pila;
import ar.edu.ort.tp1.u5.tda.nodos.PilaNodos;

public class DepartamentoDeportes {

	private final static int CANT_PILAS = 3;
	private final static int PELOTAS_X_PILA = 5;

	private PilaDePelotas[] pilas;

	// Constructor
	public DepartamentoDeportes() {
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
		boolean agregada = false;
		while (i < CANT_PILAS && !agregada) {
			if (!this.pilas[i].isFull()) {
				this.pilas[i].push(pelota);
				agregada = true;
			} else {
				i++;
			}
		}
		return agregada;
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

	private Pelota buscarPelotaEnPila(String codigo, Pila<Pelota> pila) {
		Pelota pelotaEncontrada = null;
		Pila<Pelota> pilaAux = new PilaNodos<Pelota>(); // upcasting

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
		int[][] cantPelotasPorTipoYPila;
		cantPelotasPorTipoYPila = new int[CANT_PILAS][TipoPelota.values().length];
		for (int i = 0; i < CANT_PILAS; i++) {
			cantPelotasPorTipoYPila[i] = cantPelotasPorTipo(this.pilas[i]);
		}
		return cantPelotasPorTipoYPila;
	}

	private int[] cantPelotasPorTipo(Pila<Pelota> pila) {
		Pila<Pelota> pilaAux = new PilaNodos<Pelota>(); // upcasting
		int[] cants;
		cants = new int[TipoPelota.values().length];
		while (!pila.isEmpty()) {
			Pelota p = pila.pop();
			pilaAux.push(p);
			cants[p.getTipo().ordinal()]++;
		}
		while (!pilaAux.isEmpty()) {
			pila.push(pilaAux.pop());
		}
		return cants;
	}
	/*----------------------------------------------------------------------------*/

	// Metodos complementarios

	private void inicializarDepartamento() {
		Random rand = new Random();

		int min = 1;
		int cantPelotas = rand.nextInt(CANT_PILAS * PELOTAS_X_PILA) + min;

		System.out.println("Para este ejemplo se utilizaran " + cantPelotas + " pelotas");

		int metidas = 0;
		while (metidas < cantPelotas) {
			int tipoPelota = rand.nextInt(TipoPelota.values().length);
			int numeroDePila = rand.nextInt(CANT_PILAS);
			if (!this.pilas[numeroDePila].isFull()) {
				this.pilas[numeroDePila].push(new Pelota("unCodigo", TipoPelota.values()[tipoPelota]));
				metidas++;
			}
		}
	}

	public void dibujarPilas() {
		char matrizDePelotas[][] = new char[PELOTAS_X_PILA][CANT_PILAS];
		for (int i = 0; i < CANT_PILAS; i++) {
			Pelota p = null;
			ArrayList<Pelota> arrayDePelotas = null;

			PilaDePelotas pilaAux = new PilaDePelotas();
			int cont = 0;
			arrayDePelotas = new ArrayList<Pelota>();
			while (!this.pilas[i].isEmpty()) {
				p = this.pilas[i].pop();
				pilaAux.push(p);
				arrayDePelotas.add(p);
				cont++;
			}
			while (!pilaAux.isEmpty()) {
				this.pilas[i].push(pilaAux.pop());
			}
			Collections.reverse(arrayDePelotas);
			for (int j = 0; j < arrayDePelotas.size(); j++) {
				int columna = i;
				int fila = PELOTAS_X_PILA - j - 1;
				matrizDePelotas[fila][columna] = arrayDePelotas.get(j).getInicial();
			}
		}
		dibujar(matrizDePelotas);
	}

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

}
