package ar.edu.ort.p1.examenes.ds.estadisticas_reclamos_infracciones.src;

public class DireccionGeneralTransito {

	private final static int CANT_TIPO_INFRACCION = 2;
	private ColaDeReclamosAtendidos reclamosAtendidos;

	public DireccionGeneralTransito() {
		this.reclamosAtendidos = new ColaDeReclamosAtendidos();
	}

	public int[][] informeReclamadasPorMesTipo() {

		int[][] informe;
		Reclamo centinela = null;
		Reclamo reclamo;

		informe = new int[Mes.values().length][CANT_TIPO_INFRACCION];
		reclamosAtendidos.add(centinela);
		reclamo = reclamosAtendidos.remove();

		while (reclamo != centinela) {
			procesarReclamo(reclamo, informe);
			reclamosAtendidos.add(reclamo);
			reclamo = reclamosAtendidos.remove();
		}
		return informe;
	}

	private void procesarReclamo(Reclamo reclamo, int[][] informe) {
		int columna;
		int fila;
		columna = calcularColumna(reclamo.getInfraccionReclamada());
		fila = reclamo.getInfraccionReclamada().mes().ordinal();
		informe[fila][columna] = informe[fila][columna] + 1;
	}

	private int calcularColumna(Infraccion infraccionReclamada) {
		return infraccionReclamada instanceof MalEstacionamiento ? 0 : 1;
	}

	public int cantidadMalEstacionamientoCaducados() {
		Reclamo centinela = null;
		Reclamo reclamo;
		int cantidad = 0;

		reclamosAtendidos.add(centinela);
		reclamo = reclamosAtendidos.remove();

		while (reclamo != centinela) {
			cantidad = cantidad + procesarReclamo(reclamo);
			reclamosAtendidos.add(reclamo);
			reclamo = reclamosAtendidos.remove();
		}
		return cantidad;
	}

	private int procesarReclamo(Reclamo reclamo) {
		Infraccion infraccion;
		infraccion = reclamo.getInfraccionReclamada();
		return infraccion instanceof MalEstacionamiento && reclamo.getInfraccionReclamada().caducada() ? 1 : 0;
	}

	public ListaInfraccionesReclamadasPorImporte infraccionesReclamadasPorImporte() {
		ListaInfraccionesReclamadasPorImporte lista;
		Reclamo centinela = null;
		Reclamo reclamo;

		lista = new ListaInfraccionesReclamadasPorImporte();
		reclamosAtendidos.add(centinela);
		reclamo = reclamosAtendidos.remove();

		while (reclamo != centinela) {
			lista.add(reclamo.getInfraccionReclamada());
			reclamosAtendidos.add(reclamo);
			reclamo = reclamosAtendidos.remove();
		}
		return lista;
	}

	/*----------------------------------------------------------------------------*/

	/* Metodos extra */

	public void agregarReclamo(Reclamo reclamo) {
		this.reclamosAtendidos.add(reclamo);
	}

	public void mostrarInformeReclamadasPorMesTipo() {

		int[][] matriz = informeReclamadasPorMesTipo();
		System.out
				.println("Ejercicio B --> Muestro la cantidad de infracciones reclamadas por tipo de infraccion y mes");
		System.out.println("\tME\tEV");
		for (int i = 0; i < matriz.length; i++) {
			System.out.print(((Mes.values()[i]).toString().substring(0, 3)) + "\t");
			for (int j = 0; j < matriz[i].length; j++) {
				System.out.print(matriz[i][j] + "\t");
			}
			System.out.println();
		}
		System.out.println();
	}

	public void mostrarCantidadMalEstacionamientoCaducados() {
		System.out.println("\nEjercicio D --> Muestro la cantidad de reclamos de mal estacionamiento caducados");
		System.out.println("La cantidad es: " + cantidadMalEstacionamientoCaducados());
	}

	public void mostrarInfraccionesReclamadasPorImporte() {
		System.out.println("\nEjercicio E --> Muestro la lista de reclamos por importe (asc)");

		for (Infraccion i : infraccionesReclamadasPorImporte()) {
			System.out.println(i.toString());
		}

	}
}
