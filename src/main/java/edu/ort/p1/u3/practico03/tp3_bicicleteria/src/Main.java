package edu.ort.p1.u3.practico03.tp3_bicicleteria.src;

import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {
		Taller t1 = new Taller();
		ArrayList<Bicicleta> listaDeBicicletas = new ArrayList<Bicicleta>();
		Bicicleta bc1 = new BicicletaComun("Trek", "T-001", 1999);
		Bicicleta bc2 = new BicicletaComun("Trek", "T-002", 1999);
		Bicicleta be1 = new BicicletaElectrica("Lion", "L-10", 1999, 250);
		Bicicleta be2 = new BicicletaElectrica("Lion", "L-10", 1999, 251);
		Bicicleta be3 = new BicicletaElectrica("Lion", "L-10", 2000, 180);

		listaDeBicicletas.add(bc1);
		listaDeBicicletas.add(bc2);
		listaDeBicicletas.add(be1);
		listaDeBicicletas.add(be2);
		listaDeBicicletas.add(be3);

		t1.setListaDeBicicletas(listaDeBicicletas);

		// Ejercicio B y C
		System.out.println("El taller le podra prestar servicio a "
				+ t1.cantServiciosPosibles(t1.getListaDeBicicletas()) + " bicicletas");
	}
}
