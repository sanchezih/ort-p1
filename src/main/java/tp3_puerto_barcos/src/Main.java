package tp3_puerto_barcos.src;

import java.util.ArrayList;

public class Main {

	public static ArrayList<Barco> barcos = new ArrayList<Barco>();
	public static ArrayList<Amarra> listaDeAmarras = new ArrayList<Amarra>();

	public static void main(String[] args) {

		Amarra a1 = new Amarra(1, "norte", true);
		Amarra a2 = new Amarra(2, "norte", true);
		Amarra a3 = new Amarra(3, "norte", true);
		Amarra a4 = new Amarra(4, "norte", true);

		listaDeAmarras.add(a1);
		listaDeAmarras.add(a2);
		listaDeAmarras.add(a3);
		listaDeAmarras.add(a4);

		Puerto puertoParana = new Puerto(listaDeAmarras);

		Barco barco1 = new Yate("ARG-5999", 1, 1980, "Julia Perez", 5);
		Barco barco2 = new Velero("ARG-5830", 1, 1997, "Alejandro Ruiz", 2);
		barcos.add(barco1);
		barcos.add(barco2);

		puertoParana.setBarcos(barcos);

		// System.out.println("El costo de alquiler para barco 1 es: " +
		// barco1.calcularAlquiler());
		// System.out.println("El costo de alquiler para barco 2 es: " +
		// barco2.calcularAlquiler());

		puertoParana.barcosConAlquilerMayorA(150);
	}

}
