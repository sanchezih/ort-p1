package ar.edu.ort.p1.u4.practico04.ej01_restaurant.src;

import java.util.ArrayList;

import ar.edu.ort.p1.u4.practico04.ej03_seleccion_argentina.src.seleccion.Jugador;

public class Restaurant {
	private final static int CANT_CAJEROS = 5;
	private final static int CANT_ROBOTS = 8;
	private Cajero[] cajeros = new Cajero[CANT_CAJEROS];
	private Robot[] robots = new Robot[CANT_ROBOTS];
	private ArrayList<Pedido> pedidos;

	/**
	 * Ejercicio B: La explotacion del metodo montosPorCajero que debe devolver el
	 * monto total de pedidos que tomo cada cajero.
	 * 
	 * @return
	 */
	public double[] montosPorCajero() {
		int cantPedidos = this.pedidos.size();
		double[] montos;
		montos = new double[cantPedidos];

		for (int p = 0; p <= cantPedidos; p++) {
			Pedido pedido = this.pedidos.get(p);
			montos[pedido.getIdCajero()] += pedido.getMonto();
		}
		return montos;
	}

	/*----------------------------------------------------------------------------*/

	/**
	 * Ejercicio C: La explotacion del método mostrarPedidoConMasRiesgo que muestre
	 * por consola la informacion del pedido con mas riesgo de no ser entregado,
	 * debido al nivel de bateria de su robot despachador asignado.
	 */
	public void mostrarPedidoConMasRiesgo() {
		Pedido pMasRiesgo;
		pMasRiesgo = pedidoConMasRiesgo();
		if (pMasRiesgo != null) {
			System.out.println(pMasRiesgo);
		}
	}

	private Pedido pedidoConMasRiesgo() {
		int cantPedidos = this.pedidos.size();
		int minNiv = Integer.MAX_VALUE; // Integer.MAX_VALUE retorna en Java el maximo valor entero posible
		Pedido pMasRiesgo = null;
		for (int p = 0; p <= cantPedidos; p++) {
			Pedido pedido = this.pedidos.get(p);
			Robot robot = buscarRobot(pedido.getCodRobot());
			if (robot != null && robot.getNivelBateria() < minNiv) {
				minNiv = robot.getNivelBateria();
				pMasRiesgo = pedido;
			}
		}
		return pMasRiesgo;
	}

	private Robot buscarRobot(String cod) {
		Robot elRobot = null;
		int posRobot = idxRobot(cod);
		if (posRobot > 0) {
			elRobot = this.robots[posRobot];
		}
		return elRobot;
	}

	private int idxRobot(String cod) {
		int i = this.robots.length - 1;
		while (i >= 0 && this.robots[i].getCodigo() != cod) {
			i--;
		}
		return i;
	}
	/* Se recorre para atras para que, si no se encuentra, se devuelva -1 */

	/*----------------------------------------------------------------------------*/

}
