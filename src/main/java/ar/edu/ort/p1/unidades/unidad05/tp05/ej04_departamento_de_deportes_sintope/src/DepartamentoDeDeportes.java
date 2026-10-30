package ar.edu.ort.p1.unidades.unidad05.tp05.ej04_departamento_de_deportes_sintope.src;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

import ar.edu.ort.tp1.u5.tda.impl.PilaNodos;
import ar.edu.ort.tp1.u5.tda.interfaces.Pila;

public class DepartamentoDeDeportes {

	private static final int CANT_PILAS = 3;

	private Pila<Pelota>[] pilas;

	/*----------------------------------------------------------------------------*/

//	/**
//	 * Ejemplo 1: Se crea un arreglo de PilaNodos sin especificar el tipo generico.
//	 * Aunque el atributo pilas es de tipo Pila<Pelota>[], el arreglo se crea como
//	 * PilaNodos[] y cada pila se instancia sin parametrizar.
//	 *
//	 * Esto genera warnings de type safety porque el compilador no puede comprobar
//	 * que se respete el tipo generico Pelota.
//	 */
//	public DepartamentoDeDeportes() {
//		this.pilas = new PilaNodos[CANT_PILAS]; // Warning: conversion no comprobada
//
//		for (int i = 0; i < CANT_PILAS; i++) {
//			this.pilas[i] = new PilaNodos(); // Warning: tipo generico sin especificar
//		}
//
//		inicializarDepartamento();
//		dibujarPilas();
//	}

	/**
	 * Ejemplo 2: Se utiliza una clase concreta, PilaDePelotas, que extiende
	 * PilaNodos<Pelota>.
	 *
	 * De esta manera, se puede crear un arreglo de PilaDePelotas sin warnings y
	 * cada elemento es una pila de Pelota.
	 *
	 * La contrapartida es que el arreglo queda limitado, en tiempo de ejecucion, a
	 * objetos PilaDePelotas o sus subclases.
	 */
	public DepartamentoDeDeportes() {
		this.pilas = new PilaDePelotas[CANT_PILAS]; // Sin warning

		for (int i = 0; i < CANT_PILAS; i++) {
			this.pilas[i] = new PilaDePelotas(); // Sin warning
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
		this.pilas[0].push(pelota);
		return true;
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
		Pila<Pelota> pilaAux = new PilaNodos<>();

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

		Pila<Pelota> pilaAuxiliar = new PilaNodos<>();
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
		int cantMaxPelotasPosiblesParaCadaEjecucion = 20;
		Random random = new Random();
		int metidas = 0;
		int min = 1;
		int cantPelotas = random.nextInt(cantMaxPelotasPosiblesParaCadaEjecucion) + min;

		System.out.println("Para este ejemplo se utilizaran " + cantPelotas + " pelotas... (Max. posible: "
				+ cantMaxPelotasPosiblesParaCadaEjecucion + ")");

		while (metidas < cantPelotas) {
			int tipoPelota = random.nextInt(TipoPelota.values().length);
			int numeroDePila = random.nextInt(CANT_PILAS);
			this.pilas[numeroDePila].push(new Pelota("unCodigo", TipoPelota.values()[tipoPelota]));
			metidas++;
		}
	}

	/**
	 * 
	 */
	public void dibujarPilas() {
		int alturaMaxima = 0;
		for (int i = 0; i < CANT_PILAS; i++) {
			int altura = 0;
			Pila<Pelota> pilaAux = new PilaNodos<>();
			while (!this.pilas[i].isEmpty()) {
				pilaAux.push(this.pilas[i].pop());
				altura++;
			}
			while (!pilaAux.isEmpty()) {
				this.pilas[i].push(pilaAux.pop());
			}
			if (altura > alturaMaxima) {
				alturaMaxima = altura;
			}
		}
		char[][] matrizDePelotas = new char[alturaMaxima][CANT_PILAS];
		for (int i = 0; i < CANT_PILAS; i++) {
			Pila<Pelota> pilaAux = new PilaNodos<>();
			List<Pelota> listaDePelotas = new ArrayList<>();
			while (!this.pilas[i].isEmpty()) {
				Pelota pelota = this.pilas[i].pop();
				pilaAux.push(pelota);
				listaDePelotas.add(pelota);
			}
			while (!pilaAux.isEmpty()) {
				this.pilas[i].push(pilaAux.pop());
			}
			Collections.reverse(listaDePelotas);
			for (int j = 0; j < listaDePelotas.size(); j++) {
				int fila = alturaMaxima - j - 1;
				matrizDePelotas[fila][i] = listaDePelotas.get(j).getInicial();
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
				char c = matLetras[i][j];
				if (c == '\0') {
					c = '-';
				}
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
