package edu.ort.p1.u4.tp4.ej05_camiones.src;

import java.util.ArrayList;

import edu.ort.p1.u4.tp4.ej04_viajes_tren.src.Reserva;
import edu.ort.p1.u4.tp4.ej05_camiones.src.empresa.Camion;
import edu.ort.p1.u4.tp4.ej05_camiones.src.empresa.Chofer;
import edu.ort.p1.u4.tp4.ej05_camiones.src.empresa.Empresa;
import edu.ort.p1.u4.tp4.ej05_camiones.src.empresa.Viaje;

public class Main {

	public static void main(String[] args) {

		Chofer chofer01 = new Chofer("ch01", "Angel", 10.0);
		Chofer chofer02 = new Chofer("ch02", "Nieves", 10.0);
		Chofer chofer03 = new Chofer("ch03", "Maria", 10.0);
		Chofer chofer04 = new Chofer("ch04", "Orlando", 10.0);
		Chofer chofer05 = new Chofer("ch05", "Pedro", 10.0);
		Chofer chofer06 = new Chofer("ch06", "Vera", 10.0);
		Chofer chofer07 = new Chofer("ch07", "Faustino", 10.0);
		Chofer chofer08 = new Chofer("ch08", "Mara", 10.0);
		Chofer chofer09 = new Chofer("ch09", "Jose", 10.0);
		Chofer chofer10 = new Chofer("ch10", "Brenda", 10.0);
		Chofer chofer11 = new Chofer("ch11", "Eva", 10.0);
		Chofer chofer12 = new Chofer("ch12", "Rodolfo", 10.0);
		Chofer chofer13 = new Chofer("ch13", "Ines", 10.0);
		Chofer chofer14 = new Chofer("ch14", "Noelia", 10.0);
		Chofer chofer15 = new Chofer("ch15", "Blanca", 10.0);
		Chofer chofer16 = new Chofer("ch16", "Juan", 10.0);
		Chofer chofer17 = new Chofer("ch17", "Luis", 10.0);
		Chofer chofer18 = new Chofer("ch18", "Isabel", 10.0);
		Chofer chofer19 = new Chofer("ch19", "Nicolas", 10.0);
		Chofer chofer20 = new Chofer("ch20", "Julian", 10.0);

		Chofer[] choferes = { chofer01, chofer02, chofer03, chofer04, chofer05, chofer06, chofer07, chofer08, chofer09,
				chofer10, chofer11, chofer12, chofer13, chofer14, chofer15, chofer16, chofer17, chofer18, chofer19,
				chofer20 };

		Camion camion01 = new Camion(1, 150.0);
		Camion camion02 = new Camion(2, 150.0);
		Camion camion03 = new Camion(3, 150.0);
		Camion camion04 = new Camion(4, 150.0);
		Camion camion05 = new Camion(5, 150.0);
		Camion camion06 = new Camion(6, 150.0);
		Camion camion07 = new Camion(7, 150.0);
		Camion camion08 = new Camion(8, 150.0);
		Camion camion09 = new Camion(9, 150.0);
		Camion camion10 = new Camion(10, 150.0);

		Camion[] camiones = { camion01, camion02, camion03, camion04, camion05, camion06, camion07, camion08, camion09,
				camion10 };

		ArrayList<Viaje> viajes = new ArrayList<Viaje>();
		Viaje viaje01 = new Viaje(1, "ch01", 1.0);
		Viaje viaje02 = new Viaje(2, "ch02", 1.0);
		Viaje viaje03 = new Viaje(2, "ch01", 1.0);

		viajes.add(viaje01);
		viajes.add(viaje02);
		viajes.add(viaje03);

		Empresa empresa = new Empresa(viajes, choferes, camiones);

		recorrerArray(empresa.obtenerCostosDeViajes());
		dibujarMatriz(empresa.obtenerViajesXChoferCamion());

	}

	public static void recorrerArray(double[] elementos) {
		for (int i = 0; i < elementos.length; i++) {
			System.out.println(elementos[i]);
		}
	}

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
