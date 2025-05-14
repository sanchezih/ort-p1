package ar.edu.ort.p1.unidades.unidad04.practico04.ej05_empresa_camiones.src;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Empresa {

	private static int CANT_CAMIONES = 10;
	private static int CANT_CHOFERES = 20;
	
	private List<Viaje> viajes;
	private Chofer[] choferes = new Chofer[CANT_CHOFERES];
	private Camion[] camiones = new Camion[CANT_CAMIONES];

	/*----------------------------------------------------------------------------*/

	public Empresa() {
		this.viajes = new ArrayList<>();
		inicializarEmpresa();
	}

	/*----------------------------------------------------------------------------*/

	/**
	 * Ejercicio B: La explotacion del metodo obtenerCostosDeViajes que devuelva (no
	 * muestre por consola) el costo aproximado de cada viaje (honorarios +
	 * consumo).
	 * 
	 * En este metodo optamos por devolver un array de double ya que se puede saber
	 * la cantidad de viajes llamando a viajes.size() y de double porque se esperaba
	 * tener el precio ya calculado para cada viaje (honorarios del chofer + el
	 * consumo del camion (costoPorKm * los KMs del viaje)).
	 * 
	 * @return
	 */
	public double[] obtenerCostosDeViajes() {

		Camion camion = null;
		Chofer chofer = null;
		int cantViajes = this.viajes.size();
		double costoDelViaje = 0;
		double[] costos = new double[cantViajes];

		for (int i = 0; i < cantViajes; i++) {
			Viaje viaje = this.viajes.get(i);

			// Camion por posicionamiento directo
			camion = this.camiones[viaje.getIdCamion()];

			costoDelViaje = camion.getCostoPorKm() * viaje.getKms();

			// Chofer por posicionamiento indirecto
			int idxChofer = getIdxChofer(viaje.getIdChofer());

			chofer = this.choferes[idxChofer];
			costoDelViaje += chofer.getPagoPorViaje();
			costos[i] = costoDelViaje;
		}
		return costos;
	}

	/**
	 * Recibe el id de un chofer y retorna la posicion del array en la que se
	 * encuentra dicho chofer
	 * 
	 * @param idChofer
	 * @return
	 */
	private int getIdxChofer(String idChofer) {
		int i = this.choferes.length - 1;

		while (i >= 0 && this.choferes[i].getId() != idChofer) {
			i--; // Se recorre para atras para que, si no se encuentra, se devuelva -1
		}
		return i;
	}

	/*----------------------------------------------------------------------------*/

	/**
	 * Ejercicio C: La explotacion del metodo obtenerViajesXChoferCamion que
	 * devuelva (no muestre por consola) la cantidad de viajes que realizo cada
	 * chofer con cada camion.
	 * 
	 * @return
	 */
	public int[][] obtenerViajesPorChoferCamion() {

		int[][] matrizViajesXChofer = new int[this.choferes.length][this.camiones.length];

		for (Viaje viaje : this.viajes) {
			int idChofer = getIdxChofer(viaje.getIdChofer());
			int idCamion = viaje.getIdCamion();

			matrizViajesXChofer[idChofer][idCamion]++; // matrizViajesXChofer[idChofer][idCamion] =
														// matrizViajesXChofer[idChofer][idCamion] + 1
		}
		return matrizViajesXChofer;
	}

	/*----------------------------------------------------------------------------*/

	// Metodos complementarios

	private void inicializarEmpresa() {

		final int CANT_VIAJES = 20;
		final int LIMITE_KMS = 100;

		System.out.println(
				"Se hace una prueba con " + CANT_VIAJES + " viajes " + "de max. " + LIMITE_KMS + " KMs. c/u\n");

		// Agrego camiones. Los camiones tienen id de 0 a 9 y se especifica cual es su
		// costoPorKm.
		this.camiones[0] = new Camion(0, 50.0);
		this.camiones[1] = new Camion(1, 50.0);
		this.camiones[2] = new Camion(2, 50.0);
		this.camiones[3] = new Camion(3, 100.0);
		this.camiones[4] = new Camion(4, 100.0);
		this.camiones[5] = new Camion(5, 180.0);
		this.camiones[6] = new Camion(6, 180.0);
		this.camiones[7] = new Camion(7, 180.0);
		this.camiones[8] = new Camion(8, 180.0);
		this.camiones[9] = new Camion(9, 180.0);

		// Agrego choferes y especifico cuanto cobra cada uno por viaje.
		this.choferes[0] = new Chofer("ch13", "Angel", 10.0);
		this.choferes[1] = new Chofer("ch14", "Nieves", 10.0);
		this.choferes[2] = new Chofer("ch15", "Maria", 12.0);
		this.choferes[3] = new Chofer("ch16", "Orlando", 12.0);
		this.choferes[4] = new Chofer("ch17", "Pedro", 14.0);
		this.choferes[5] = new Chofer("ch18", "Vera", 14.0);
		this.choferes[6] = new Chofer("ch19", "Faustino", 15.0);
		this.choferes[7] = new Chofer("ch20", "Mara", 15.0);
		this.choferes[8] = new Chofer("ch21", "Jose", 15.0);
		this.choferes[9] = new Chofer("ch22", "Brenda", 20.0);
		this.choferes[10] = new Chofer("ch23", "Eva", 20.0);
		this.choferes[11] = new Chofer("ch24", "Rodolfo", 20.0);
		this.choferes[12] = new Chofer("ch25", "Ines", 30.0);
		this.choferes[13] = new Chofer("ch26", "Noelia", 350.0);
		this.choferes[14] = new Chofer("ch27", "Blanca", 35.0);
		this.choferes[15] = new Chofer("ch28", "Juan", 35.0);
		this.choferes[16] = new Chofer("ch29", "Luis", 35.0);
		this.choferes[17] = new Chofer("ch30", "Isabel", 35.0);
		this.choferes[18] = new Chofer("ch31", "Nicolas", 35.0);
		this.choferes[19] = new Chofer("ch32", "Julian", 35.0);

		for (int i = 0; i < CANT_VIAJES; i++) {
			Random random = new Random();
			int idCamion = random.nextInt(CANT_CAMIONES + 0) + 0;
			int idChofer = random.nextInt(CANT_CHOFERES + 0) + 0;
			double kms = 0 + (LIMITE_KMS - 0) * random.nextDouble();

			this.viajes.add(new Viaje(idCamion, this.choferes[idChofer].getId(),
					Double.parseDouble(String.format("%.1f", kms))));
		}
		for (int j = 0; j < this.viajes.size(); j++) {
			System.out.println(this.viajes.get(j).toString());
		}
		System.out.println();
	}

}
