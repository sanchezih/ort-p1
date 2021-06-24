package edu.ort.p1.extra.examenes._2021c1._2p.tema2.resuelto.src;

import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {

		Producto p01 = new Producto("P9001", 125, true);
		Producto p02 = new Producto("P9002", 172, false);
		Producto p03 = new Producto("P9003", 200, false);
		Producto p04 = new Producto("P9004", 225, true);

		/*----------------------------------------------------------------------------*/

		ArrayList<ItemOrden> itemsOpp01 = new ArrayList<ItemOrden>();
		itemsOpp01.add(new ItemOrden(2, p01));
		itemsOpp01.add(new ItemOrden(1, p03));

		OrdenPuertaPuerta opp01 = new OrdenPuertaPuerta(1, "2021-06-01", 125, itemsOpp01, true);

		/*----------------------------------------------------------------------------*/

		ArrayList<ItemOrden> itemsOpp02 = new ArrayList<ItemOrden>();
		itemsOpp02.add(new ItemOrden(2, p01));
		itemsOpp02.add(new ItemOrden(1, p03));

		OrdenPuertaPuerta opp02 = new OrdenPuertaPuerta(2, "2021-06-01", 125, itemsOpp02, true);

		/*----------------------------------------------------------------------------*/

		ArrayList<ItemOrden> itemsOpp03 = new ArrayList<ItemOrden>();
		itemsOpp03.add(new ItemOrden(2, p01));
		itemsOpp03.add(new ItemOrden(1, p03));

		OrdenPuertaPuerta opp03 = new OrdenPuertaPuerta(3, "2021-06-01", 125, itemsOpp03, true);

		/*----------------------------------------------------------------------------*/

		ArrayList<ItemOrden> itemsOrs01 = new ArrayList<ItemOrden>();
		itemsOrs01.add(new ItemOrden(2, p01));
		itemsOrs01.add(new ItemOrden(1, p03));

		OrdenRetiroSucursal ors01 = new OrdenRetiroSucursal(4, "2021-07-01", 5000, itemsOrs01, "Una sucursal", true);

		/*----------------------------------------------------------------------------*/
		ArrayList<ItemOrden> itemsOrs02 = new ArrayList<ItemOrden>();
		itemsOrs02.add(new ItemOrden(2, p01));
		itemsOrs02.add(new ItemOrden(1, p03));

		OrdenRetiroSucursal ors02 = new OrdenRetiroSucursal(9, "2021-07-01", 1350, itemsOrs02, "Una sucursal", true);

		/*----------------------------------------------------------------------------*/

		TodoLibre todoLibre = new TodoLibre();
		todoLibre.agregarOrden(ors01);
		todoLibre.agregarOrden(ors02);
		todoLibre.agregarOrden(opp01);

		todoLibre.agregarOrden(opp03);
		todoLibre.agregarOrden(opp02);

		todoLibre.mostrarColaDeOrdenes();

		// Ejercicio B
		 todoLibre.reordenarPorPrioridad();
			todoLibre.mostrarColaDeOrdenes();

		// Ejercicio C
		todoLibre.mostrarOrdenesRetiroSucursalSabadosPorMonto();
		todoLibre.mostrarColaDeOrdenes();
	}

}
