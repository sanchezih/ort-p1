package ar.edu.ort.p1.unidades.u4.practico04.ej05_camiones.src;

import ar.edu.ort.p1.unidades.u4.practico04.ej05_camiones.src.empresa.Empresa;
import ar.edu.ort.p1.unidades.u4.practico04.ej05_camiones.src.empresa.Viaje;
import ar.edu.ort.p1.util.UtilArrays;

public class Main {

	public static void main(String[] args) {

		Empresa empresa = new Empresa();
		empresa.agregarViaje(new Viaje(1, "ch01", 1.0));
		empresa.agregarViaje(new Viaje(2, "ch02", 1.0));
		empresa.agregarViaje(new Viaje(2, "ch01", 1.0));

		/*----------------------------------------------------------------------------*/
		/**
		 * Ejercicio B: La explotacion del metodo obtenerCostosDeViajes que devuelva (no
		 * muestre por consola) el costo aproximado de cada viaje (honorarios +
		 * consumo).
		 */

		UtilArrays.mostrar(empresa.obtenerCostosDeViajes());

		/*----------------------------------------------------------------------------*/
		/**
		 * Ejercicio C: La explotacion del metodo obtenerViajesXChoferCamion que
		 * devuelva (no muestre por consola) la cantidad de viajes que realizo cada
		 * chofer con cada camion.
		 */
		dibujarMatriz(empresa.obtenerViajesXChoferCamion());

	}

	/*----------------------------------------------------------------------------*/

	public static void dibujarMatriz(int[][] matriz) {
		System.out.println("\nViajes X Chofer");
		System.out.println("\tCam1\tCam2\tCam3\tCam4\tCam5\tCam6\tCam7\tCam8\tCam9\tCam10");
		for (int i = 0; i < matriz.length; i++) {
			System.out.print("Chof" + (i + 1) + "\t");
			for (int j = 0; j < matriz[i].length; j++) {
				System.out.print(matriz[i][j] + "\t");
			}
			System.out.println();
		}
		System.out.println();
	}
}
