package ar.edu.ort.p1.unidades.u4.practico04.ej05_empresa_camiones.src;

import ar.edu.ort.p1.util.UtilArrays;

public class Main {

	public static void main(String[] args) {

		Empresa empresa = new Empresa();

		System.out.println("Ejercicio B - Muestro el costo aproximado de cada viaje");
		UtilArrays.mostrar(empresa.obtenerCostosDeViajes());

		System.out.println();

		System.out.println("Ejercicio C");
		dibujarMatriz(empresa.obtenerViajesPorChoferCamion());

	}

	/*----------------------------------------------------------------------------*/

	public static void dibujarMatriz(int[][] matriz) {
		System.out.println("\n--------------------------------- Viajes Por Chofer ---------------------------------");
		System.out.println("\tCam0\tCam1\tCam2\tCam3\tCam4\tCam5\tCam6\tCam7\tCam8\tCam9");
		for (int i = 0; i < matriz.length; i++) {
			System.out.print("Chof" + (i + 13) + "\t");
			for (int j = 0; j < matriz[i].length; j++) {
				System.out.print(matriz[i][j] + "\t");
			}
			System.out.println();
		}
		System.out.println();
	}
}
