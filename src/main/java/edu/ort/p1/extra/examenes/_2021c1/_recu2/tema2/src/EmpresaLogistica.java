package edu.ort.p1.extra.examenes._2021c1._recu2.tema2.src;

public class EmpresaLogistica {

	public final static int CANT_CAMIONES = 4;
	public final static int CANT_CHOFERES = 5;

	private Camion[] camiones = new Camion[CANT_CAMIONES];
	private Chofer[] choferes = new Chofer[CANT_CHOFERES];
	private ColaDeViajes viajesContratados;

	public EmpresaLogistica() {
		super();
		this.viajesContratados = new ColaDeViajes();
	}

	public int cantViajesSinDestino(String nombreDestino) {
		Viaje viajeAux;
		Viaje centinela = new Viaje(null, null, null);
		int cant = 0;

		viajesContratados.add(centinela);
		viajeAux = viajesContratados.remove();

		while (viajeAux != centinela) {
			if (!viajeAux.contieneDestino(nombreDestino)) {
				cant++;
			}
			viajesContratados.add(viajeAux);
			viajeAux = viajesContratados.remove();
		}
		return cant;
	}

	public void informarDestinosPorCamionChofer() {

		Viaje viajeAux;
		Viaje centinela = new Viaje(null, null, null);
		int[][] mat = new int[CANT_CAMIONES][CANT_CHOFERES];

		viajesContratados.add(centinela);
		viajeAux = viajesContratados.remove();

		while (viajeAux != centinela) {
			acumularEnMatriz(mat, viajeAux);
			viajesContratados.add(viajeAux);
			viajeAux = viajesContratados.remove();
		}
		mostrarMatriz(mat);
	}

	private void acumularEnMatriz(int[][] mat, Viaje viaje) {
		int indexCamion;
		int indexChofer;

		indexChofer = viaje.getLegajoChofer() - 1;
		indexCamion = idxCamion(viaje.getPatenteDeCamion());
		mat[indexCamion][indexChofer] += viaje.cantDestinos();
	}

//	private int idxCamion(int patente) {
//		int i = this.camiones.length - 1;
//		while (i >= 0 && this.camiones[i].getNroPatente() != patente) {
//			i--;
//		}
//		return i;
//	}

	private int idxCamion(int patente) {
		Camion camionEncontrado = null;
		int i = 0;
		while (i < this.camiones.length && camionEncontrado == null) {
			if (this.camiones[i] != null && this.camiones[i].getNroPatente() != patente) {
				i++;
			} else {
				camionEncontrado = this.camiones[i];
			}
		}
		return i;
	}

	public ListaCamionesOrdenadaPorAntiguedad renovarCamionesTranspSolido() {
		ListaCamionesOrdenadaPorAntiguedad camionesPorAntiguedad;
		camionesPorAntiguedad = new ListaCamionesOrdenadaPorAntiguedad();
		for (int i = 0; i < this.camiones.length; i++) {
			Camion c = this.camiones[i];
			if (c instanceof CamionDeSolidos && c.debeRenovarse()) {
				camionesPorAntiguedad.add(c);
			}
		}
		return camionesPorAntiguedad;
	}

	/*----------------------------------------------------------------------------*/
	
	/* Metodos extra */

	public void agregarViaje(Viaje viaje) {
		this.viajesContratados.add(viaje);
	}

	public void mostrarCantDeViajesProgramadosQueNoIncluyenAlDestino(String destino) {
		int cant = 0;
		cant = cantViajesSinDestino(destino);
		System.out.println("Ejercicio B\nDe los viajes programados, " + cant + " no incluyen al destino " + destino);
	}

	private void mostrarMatriz(int[][] matriz) {
		System.out.println("\nEjercicio C\nCantidad de destinos en total que visitara cada camion con cada chofer\n");

		for (int i = 0; i < matriz.length; i++) {
			System.out.println("Para el camion " + this.camiones[i] + ": ");
			for (int j = 0; j < matriz[i].length; j++) {
				System.out.print("Chofer " + this.choferes[j] + ": ");
				System.out.println(matriz[i][j] + " destinos recorridos");
			}
			System.out.println("\n");
		}
	}

	public int altaDeCamion(Camion camion) {
		int i = 0;
		boolean hayLugar = false;
		while (i < this.camiones.length && !hayLugar) {
			if (this.camiones[i] == null) {
				this.camiones[i] = camion;
				hayLugar = true;
			} else {
				i++;
			}
		}
		return hayLugar ? i : -1;
	}

	public int altaDeChofer(Chofer chofer) {
		int i = 0;
		boolean hayLugar = false;
		while (i < this.choferes.length && !hayLugar) {
			if (this.choferes[i] == null) {
				this.choferes[i] = chofer;
				hayLugar = true;
			} else {
				i++;
			}
		}
		return hayLugar ? i : -1;
	}

	public void mostrarCamionesTranspSolidoQueDebanSerRenovados() {
		System.out.println("\nEjercicio D\nMuestro la lista de camiones de trans. solido que deben ser renovados");
		for (Camion i : renovarCamionesTranspSolido()) {
			System.out.println(i.toString());
		}
	}
}
