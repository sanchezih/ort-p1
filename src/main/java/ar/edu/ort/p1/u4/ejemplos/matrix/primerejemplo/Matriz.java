package ar.edu.ort.p1.u4.ejemplos.matrix.primerejemplo;

public class Matriz {

	private int tamanio;
	private int[][] datos;

	/*
	 * public Matriz() { tamanio = 3; datos = new int[tamanio][tamanio]; }
	 */

	public Matriz(int tam) {
		tamanio = tam;
		datos = new int[tam][tam];
	}

	public int getTamanno() {
		return tamanio;
	}

	public void asignarDatos(int[] d) {
		int cont = 0;
		if (d.length < tamanio * tamanio) {
			System.out.println("No hay datos suficientes");
		}
		for (int i = 0; i < tamanio; i++) {
			for (int j = 0; j < tamanio; j++) {
				datos[i][j] = d[cont];
				cont++;
			}
		}
	}

	public int getDatos(int i, int j) {
		if (i < 0 || i >= tamanio || j < 0 || j >= tamanio) {
			System.out.println("No hay datos suficientes");
			return -1;
		} else {
			return datos[i][j];
		}
	}

	public void suma(Matriz m) {
		if (m.getTamanno() != tamanio) {
			System.out.println("Tamanios no compatibles");
		} else {
			for (int i = 0; i < tamanio; i++) {
				for (int j = 0; j < tamanio; j++) {
					datos[i][j] += m.getDatos(i, j);
				}
			}
		}
	}

	public void producto(Matriz m) {
		int aux;
		int[][] datosAux = new int[tamanio][tamanio];
		if (m.getTamanno() != tamanio) {
			System.out.println("Tamanios no compatibles");
		} else {
			for (int i = 0; i < tamanio; i++) {
				for (int j = 0; j < tamanio; j++) {
					datosAux[i][j] = datos[i][j];
				}
			}
			for (int i = 0; i < tamanio; i++) {
				for (int j = 0; j < tamanio; j++) {
					aux = 0;
					for (int k = 0; k < tamanio; k++) {
						aux += datosAux[i][k] * m.getDatos(k, j);
					}
					datos[i][j] = aux;
				}
			}
		}
	}

	public void traspuesta() {
		int aux;
		for (int i = 0; i < tamanio; i++) {
			for (int j = 0; j < tamanio; j++) {
				if (i < j) {
					aux = datos[i][j];
					datos[i][j] = datos[j][i];
					datos[j][i] = aux;
				}
			}
		}
	}

	public void mostrar() {
		for (int i = 0; i < tamanio; i++) {
			for (int j = 0; j < tamanio; j++) {
				System.out.print(datos[i][j] + "\t");
			}
			System.out.println();
		}
		System.out.println();
	}
}