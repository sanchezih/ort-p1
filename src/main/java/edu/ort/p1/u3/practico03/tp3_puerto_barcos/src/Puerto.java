package edu.ort.p1.u3.practico03.tp3_puerto_barcos.src;

import java.util.ArrayList;

public class Puerto {
	private ArrayList<Amarra> listaDeAmarras = new ArrayList<Amarra>();

	public ArrayList<Amarra> getListaDeAmarras() {
		return listaDeAmarras;
	}

	public void setListaDeAmarras(ArrayList<Amarra> listaDeAmarras) {
		this.listaDeAmarras = listaDeAmarras;
	}

	public Puerto(ArrayList<Amarra> listaDeAmarras) {
		this.listaDeAmarras = listaDeAmarras;
	}

	public int barcosConAlquilerMayorA(double importeMinimo) {
		int cont = 0;
		for (Amarra a : this.listaDeAmarras) {
			if (a.getBarco() != null) {
				System.out.println("El costo de alquiler del barco " + a.getBarco().getMatricula() + " es: "
						+ a.getBarco().calcularCostoDelAlquiler());
				if (a.getBarco().calcularCostoDelAlquiler() > importeMinimo) {
					cont++;
				}
			}
		}
		return cont;
	}

	public Deportivo barcoConMayorConsumo() {
		Deportivo barcoConMayorConsumo = null;
		for (Amarra a : this.listaDeAmarras) {
			if (a.getBarco() != null) {
				if (barcoConMayorConsumo == null) {
					barcoConMayorConsumo = (Deportivo) a.getBarco();
				} else {
					if (a.getBarco() instanceof Deportivo) {
						if (((Deportivo) a.getBarco()).calcularConsumo() > barcoConMayorConsumo.calcularConsumo()) {
							barcoConMayorConsumo = (Deportivo) a.getBarco();
						}
					}
				}
			}
		}
		return barcoConMayorConsumo;
	}
}
