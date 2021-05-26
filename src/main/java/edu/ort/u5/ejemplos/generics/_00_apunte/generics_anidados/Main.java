package edu.ort.u5.ejemplos.generics._00_apunte.generics_anidados;

import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {

		ParDeZapatos zapatos = new ParDeZapatos("Negros");
		Caja<ParDeZapatos> cajaDeZapatos = new Caja<>();
		cajaDeZapatos.guardar(zapatos);
		ArrayList<Caja<ParDeZapatos>> miColeccionDeZapatos = new ArrayList<>();
		miColeccionDeZapatos.add(cajaDeZapatos);

	}

}
