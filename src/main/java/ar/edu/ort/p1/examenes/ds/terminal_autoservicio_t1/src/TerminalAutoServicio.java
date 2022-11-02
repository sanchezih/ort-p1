package ar.edu.ort.p1.examenes.ds.terminal_autoservicio_t1.src;

public class TerminalAutoServicio {

	private PilaDeBilletes pilaDeBilletes;

	public TerminalAutoServicio() {
		this.pilaDeBilletes = new PilaDeBilletes();
	}

	/**
	 * Ejercicio B: El metodo depositar, que recibe un Billete como parametro y debe
	 * devolver si el mismo logro almacenarse en la terminal o no.
	 * 
	 * @param billete
	 * @return
	 */
	public boolean depositar(Billete billete) {
		boolean sePuedeDepositar = billete.cumpleRequisito();

		if (sePuedeDepositar) {
			pilaDeBilletes.push(billete);
		}
		return sePuedeDepositar;
	}

	/**
	 * Ejercicio C: El metodo cantBilletesPorEstadoYValor que debe devolver (no
	 * mostrar por consola) la cantidad de billetes que hay almacenados en la
	 * terminal agrupados por estado y valor.
	 * 
	 * @return
	 */
	public int[][] cantBilletesPorEstadoYValor() {
		PilaDeBilletes pilaAux = new PilaDeBilletes();
		Billete billete;
		int[][] matriz = new int[Valor.values().length][Estado.values().length];

		while (!pilaDeBilletes.isEmpty()) {
			billete = pilaDeBilletes.pop();
			llenarMatriz(matriz, billete);
			pilaAux.push(billete);
		}

		while (!pilaAux.isEmpty()) {
			pilaDeBilletes.push(pilaAux.pop());
		}

		return matriz;
	}

	private void llenarMatriz(int[][] matriz, Billete billete) {
		int fila;
		int columna;
		fila = billete.getValor().ordinal();
		columna = billete.getEstado().ordinal();
		matriz[fila][columna]++;
	}

	/**
	 * Ejercicio D: El metodo listarBilletesOrdenadosPorValor que debe devolver (no
	 * mostrar por consola) una lista de todos los billetes almacenados en la
	 * terminal ordenados por valor.
	 * 
	 * @return
	 */
	public ListaBilletesOrdenadosPorValor listarBilletesOrdenadosPorValor() {

		PilaDeBilletes pilaAux = new PilaDeBilletes();
		Billete billete;
		ListaBilletesOrdenadosPorValor listaOrdenada = new ListaBilletesOrdenadosPorValor();

		while (!pilaDeBilletes.isEmpty()) {
			billete = pilaDeBilletes.pop();
			listaOrdenada.add(billete);
			pilaAux.push(billete);
		}

		while (!pilaAux.isEmpty()) {
			pilaDeBilletes.push(pilaAux.pop());
		}

		return listaOrdenada;
	}

}
