package ar.edu.ort.p1.examenes._01_oop.repuestos.src;

import java.util.ArrayList;
import java.util.Date;

public class Main {

	public static void main(String[] args) {

		Zona zona01 = new Zona("Zona Sur", 10, 2);
		Zona zona02 = new Zona("Zona Norte", 18, 1);

		Repuesto carburador = new Repuesto("c1", "Carburador", 10, 85);
		Repuesto bujia = new Repuesto("b1", "Bujia", 15, 30);

		ArrayList<RepuestoPedido> r1 = new ArrayList<>();
		r1.add(new RepuestoPedido(1, bujia));
		r1.add(new RepuestoPedido(2, carburador));

		DistribuidorCapital dc = new DistribuidorCapital(1, 5, 12000, false);

		Pedido p1 = new Pedido("p1", new Date(), 150, r1, zona02, dc);

		CachoCompeticion cp = new CachoCompeticion();
		cp.addPedido(p1);

		System.out.println(cp.esPosibleEnviarPedido("p1"));

		System.out.println(p1.calcularComisionAPagar());

	}

}
