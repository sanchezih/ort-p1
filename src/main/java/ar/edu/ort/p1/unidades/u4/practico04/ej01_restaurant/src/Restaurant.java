package ar.edu.ort.p1.unidades.u4.practico04.ej01_restaurant.src;

import java.util.ArrayList;

public class Restaurant {

	private static int CANT_CAJEROS = 5;
	private static int CANT_ROBOTS = 8;
	private ArrayList<Pedido> pedidos;

	public Restaurant() {
		this.pedidos = new ArrayList<Pedido>();
	}

	/*
	 * +montosPorCajero(): double[] +informeDePedidos(): InfoPedido[]
	 * +mostrarPedidosConMasRiesgo(): void -robotConMenorBateria(): Robot
	 * -buscarRobot(String): Robot -idxRobot(String): int
	 */

	/**
	 * La explotacion del método montosPorCajero que devuelva (no muestre por
	 * consola) el monto total de pedidos que tomó cada cajero.
	 */
	public double[] montosPorCajero() {
		int cantPedidos = this.pedidos.size();
		double[] montos;
		montos = new double[cantPedidos];
		for (int p = 0; p < cantPedidos; p++) {
			Pedido pedido = this.pedidos.get(p);
			montos[pedido.getIdCajero()] += pedido.getMonto();
		}
		return montos;
	}

}
