package ar.edu.ort.p1.unidades.u4.practico04.ej01_restaurant.src;

import java.util.ArrayList;

public class Restaurant {

	private static int CANT_CAJEROS = 5;
	private static int CANT_ROBOTS = 8;

	private ArrayList<Pedido> pedidos;
	private Robot[] robots = new Robot[CANT_ROBOTS];
	private Cajero[] cajeros = new Cajero[CANT_CAJEROS];

	public Restaurant() {
		inicializarRestaurant();
		this.pedidos = new ArrayList<Pedido>();
	}

	/*----------------------------------------------------------------------------*/

	/**
	 * Ejercicio B: La explotacion del metodo montosPorCajero que devuelva (no
	 * muestre por consola) el monto total de pedidos que tomo cada cajero.
	 */
	public double[] montosPorCajero() {

		int cantPedidos = this.pedidos.size();
		double[] montos;
		montos = new double[CANT_CAJEROS];

		for (int p = 0; p < cantPedidos; p++) {
			Pedido pedido = this.pedidos.get(p);
			montos[pedido.getIdCajero()] += pedido.getMonto();
		}
		return montos;
	}

	/*----------------------------------------------------------------------------*/

	/**
	 * Ejercicio C: La explotacion del metodo informeDePedidos que devuelva (no
	 * muestre por consola) un vector de objetos que contengan, por cada pedido, la
	 * siguiente informacion:
	 * 
	 * -Monto del pedido.
	 * 
	 * -Apellido del cajero que lo tomo.
	 * 
	 * -Nivel de bateria del robot asignado para despacharlo.
	 * 
	 * @return
	 */
	public InfoPedido[] informeDePedidos() {
		InfoPedido[] infos;
		String apellido;
		int nivel;

		infos = new InfoPedido[pedidos.size()];

		for (int i = 0; i < infos.length; i++) {
			Pedido p = this.pedidos.get(i);
			apellido = this.cajeros[p.getIdCajero()].getApellido();
			Robot robot = buscarRobot(p.getCodRobot());
			if (robot != null) {
				nivel = robot.getNivelBateria();
			} else {
				nivel = -1;
			}
			infos[i] = new InfoPedido(p.getMonto(), apellido, nivel);
		}

		return infos;
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
			i--; // Se recorre para atras para que, si no se encuentra, se devuelva -1
		}
		return i;
	}

	/*----------------------------------------------------------------------------*/

	/**
	 * Ejercicio D: La explotacion del metodo mostrarPedidosConMasRiesgo que muestre
	 * por consola la informacion de los pedidos con mas riesgo de no ser
	 * entregados, debido al nivel de bateria de su robot despachador asignado
	 */
	public void mostrarPedidosConMasRiesgo() {
		int cantPedidos = this.pedidos.size();
		Robot robotMenorBateria;

		robotMenorBateria = robotConMenorBateria();

		for (int p = 0; p < cantPedidos; p++) {
			Pedido pedido = this.pedidos.get(p);
			if (pedido.getCodRobot() == robotMenorBateria.getCodigo()) {
				System.out.println(pedido);
			}
		}
	}

	/**
	 * Se asume que hay un solo robot con un nivel de bateria menor al del resto. Si
	 * hay mas de uno, se devolvera el primero
	 * 
	 * @return
	 */
	private Robot robotConMenorBateria() {
		int cantRobots = this.robots.length;
		int minNiv = Integer.MAX_VALUE; // Integer.MAX_VALUE retorna en Java el maximo valor entero posible
		Robot robotMenorNivel = null;

		for (int i = 0; i < cantRobots; i++) {
			Robot robot = this.robots[i];
			if (robot != null && robot.getNivelBateria() < minNiv) {
				minNiv = robot.getNivelBateria();
				robotMenorNivel = robot;
			}
		}
		return robotMenorNivel;
	}

	/*----------------------------------------------------------------------------*/

	// Metodos complementarios

	private void inicializarRestaurant() {

		// Agrego cajeros
		this.cajeros[0] = new Cajero(1, "Cid", 7);
		this.cajeros[1] = new Cajero(2, "Mayo", 3);
		this.cajeros[2] = new Cajero(3, "Guerrina", 24);
		this.cajeros[3] = new Cajero(4, "Perez", 21);
		this.cajeros[4] = new Cajero(5, "Garay", 18);

		// Agrego robots
		this.robots[0] = new Robot("R-00", 100);
		this.robots[1] = new Robot("R-01", 100);
		this.robots[2] = new Robot("R-02", 90);
		this.robots[3] = new Robot("R-03", 90);
		this.robots[4] = new Robot("R-04", 100);
		this.robots[5] = new Robot("R-05", 100);
		this.robots[6] = new Robot("R-06", 100);
		this.robots[7] = new Robot("R-07", 100);
	}

	public void agregarPedido(Pedido pedido) {
		this.pedidos.add(pedido);
	}
}
