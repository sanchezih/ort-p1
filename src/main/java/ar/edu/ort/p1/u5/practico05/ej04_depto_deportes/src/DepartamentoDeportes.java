package ar.edu.ort.p1.u5.practico05.ej04_depto_deportes.src;

import edu.ort.tp1.u5.tda.Pila;
import edu.ort.tp1.u5.tda.nodos.PilaNodos;

public class DepartamentoDeportes {

	private final static int CANT_PILAS = 3;
	private final static int PELOTAS_X_PILA = 5;
	private Pila<Pelota>[] pilas;

	public DepartamentoDeportes() {
		this.pilas = new PilaNodos[CANT_PILAS];
		for (int i = 0; i < CANT_PILAS; i++) {
			this.pilas[i] = new PilaNodos<Pelota>(PELOTAS_X_PILA);
		}
	}

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

	public void verPelotasEnTopes() {
		for (int i = 0; i < CANT_PILAS; i++) {
			System.out.println("En la pila " + (i + 1) + ": ");
			if (!this.pilas[i].isEmpty()) {
				System.out.println(this.pilas[i].peek().toString());
			} else {
				System.out.println("No hay nada");
			}
		}
	}

	public Pelota buscarPelota(String codigo) {
		int i = 0;
		Pelota pelotaEncontrada = null;
		while (i < CANT_PILAS && pelotaEncontrada == null) {
			pelotaEncontrada = buscarPelotaEnPila(codigo, this.pilas[i]);
			i++;
		}
		return pelotaEncontrada;
	}

	public int[][] pelotasPorTipo() {
		int[][] cantPelotasPorTipoYPila;
		cantPelotasPorTipoYPila = new int[CANT_PILAS][TipoPelota.values().length];
		for (int i = 0; i < CANT_PILAS; i++) {
			cantPelotasPorTipoYPila[i] = cantPelotasPorTipo(this.pilas[i]);
		}
		return cantPelotasPorTipoYPila;
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
}
