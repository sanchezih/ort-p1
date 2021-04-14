package tp3_puerto_barcos.src;

import java.util.ArrayList;

public class Puerto {

	private ArrayList<Amarra> listaDeAmarras = new ArrayList<Amarra>();
	public static ArrayList<Barco> barcos = new ArrayList<Barco>();

	public ArrayList<Amarra> getListaDeAmarras() {
		return listaDeAmarras;
	}

	public void setListaDeAmarras(ArrayList<Amarra> listaDeAmarras) {
		this.listaDeAmarras = listaDeAmarras;
	}

	public static ArrayList<Barco> getBarcos() {
		return barcos;
	}

	public static void setBarcos(ArrayList<Barco> barcos) {
		Puerto.barcos = barcos;
	}

	public Puerto(ArrayList<Amarra> listaDeAmarras) {
		this.listaDeAmarras = listaDeAmarras;
	}

	public double barcosConAlquilerMayorA(double importeMinimo) {
		System.out.println("Voy a calcular que cantidad de barcos que abonan un importe mayor a " + importeMinimo);

		for (Barco barco : barcos) {

			barco.toString();

		}

		return 0;
	}

}
