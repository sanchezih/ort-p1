package ar.edu.ort.p1.examenes.ds.procesador_solicitudes_inscripcion.src;

public class Colegio {

	private static final int CANT_SEDES = 3;
	private Sede[] sedes;
	private ColaDeSolicitudes solicitudes;

	public Colegio() {
		this.sedes = new Sede[CANT_SEDES];
		this.solicitudes = new ColaDeSolicitudes();
		inicializar();
	}

	public ColaDeSolicitudes getSolicitudes() {
		return solicitudes;
	}

	/*----------------------------------------------------------------------------*/

	/**
	 * Ejercicio A: Un metodo llamado procesarSolicitudes que para cada solicitud a
	 * procesar consulte si para la sede solicitada y el turno solicitado hay
	 * vacantes. En el caso que haya se debe confirmar la solicitud y descontar la
	 * vacante utilizada
	 * 
	 * * Si la sede es propia, debe guardar la solicitud en una lista de espera de
	 * la sede ordenada por promedio de nota del alumno.
	 * 
	 * * Si es una sede tercerizada, debe guardarla en una lista de espera de la
	 * sede en el mismo orden que se proceso.
	 * 
	 * Al finalizar este proceso, quedaran en la estructura original solo las
	 * solicitudes que no fueron confirmadas, es decir, para las que no hubo
	 * vacante.
	 * 
	 */
	public void procesarSolicitudes() {

		Solicitud CENT = null;
		Solicitud solicitud;

		this.solicitudes.add(CENT);
		solicitud = this.solicitudes.remove();
		int pos = 0;
		Sede sede = null;

		while (solicitud != CENT) {
			pos = buscarSede(solicitud.getNombreSede());

			if (pos != -1 && this.sedes[pos].hayVacante(solicitud.getTurno())) {
				sede = this.sedes[pos];
				sede.procesarSolicitud(solicitud);
			} else {
				this.solicitudes.add(solicitud);
			}
			solicitud = this.solicitudes.remove();
		}
		System.out.println("Fin de procesamiento");
	}

	/**
	 * 
	 * @param nombre
	 * @return
	 */
	private int buscarSede(String nombre) {
		int pos = -1;
		int index = 0;

		while (index < CANT_SEDES && pos == -1) {
			if (sedes[index].getNombre().equals(nombre)) {
				pos = index;
			} else {
				index++;
			}
		}
		return pos;
	}

	/*----------------------------------------------------------------------------*/

	/**
	 * Ejercicio B: Desarrollar un metodo llamado informarDisponibles que muestre
	 * por pantalla y para cada turno cual es la sede que tiene mas vacantes
	 * disponibles.
	 */
	public void informarDisponibles() {
		Sede max = null;
		for (Turno turno : Turno.values()) {
			max = buscarMaximaSede(turno);
			System.out.println("Para el turno " + turno + " la sede con mas vacantes es " + max);
		}
	}

	/**
	 * 
	 * @param turno
	 * @return
	 */
	private Sede buscarMaximaSede(Turno turno) {
		Sede maxima = null;
		for (Sede sede : this.sedes) {
			if (maxima == null) {
				maxima = sede;
			} else {
				if (sede.getVacantes(turno) > maxima.getVacantes(turno)) {
					maxima = sede;
				}
			}
		}
		return maxima;
	}

	/*----------------------------------------------------------------------------*/

	/**
	 * Ejercicio C: Desarrollar un metodo llamado informarEstadistica que informe
	 * por pantalla la cantidad de solicitudes a procesar que hay para cada sede y
	 * zona de residencia.
	 */
	public void informarEstadistica() {
		System.out.println("Ejercicio C: Solicitudes a procesar que hay para cada sede y zona de residencia");
		System.out.println();

		int[][] estadisticas = buildEstadisticas();

		for (int i = 0; i < CANT_SEDES; i++) {
			System.out.println("Sede: " + this.sedes[i].getNombre());
			for (int j = 0; j < Alumno.MAX_ZONA; j++) {
				System.out.println("Zona " + (j + 1) + ": " + estadisticas[i][j] + " solicitudes");
			}
		}
		System.out.println();
	}

	private int[][] buildEstadisticas() {
		final Solicitud CENT = null;
		Solicitud solicitud;

		int[][] matriz = new int[CANT_SEDES][Alumno.MAX_ZONA];
		int fila;
		int columna;

		this.solicitudes.add(CENT);
		solicitud = this.solicitudes.remove();
		while (solicitud != CENT) {
			fila = buscarSede(solicitud.getNombreSede());
			columna = solicitud.getZonaDeAlumno() - 1;
			if (fila != -1) {
				matriz[fila][columna]++;
			}
			this.solicitudes.add(solicitud); // lo agregue yo
			solicitud = this.solicitudes.remove();
		}

		return matriz;
	}

	/*----------------------------------------------------------------------------*/

	// Metodos complementarios

	private void inicializar() {

		// Creo las sedes
		this.sedes[0] = new Propia("Moron", "Direccion Fake 9182");
		this.sedes[1] = new Propia("San Justo", "Direccion Fake 1992");
		this.sedes[2] = new Tercerizada("Moreno", "Direccion Fake 1234");
//		this.sedes[3] = new Propia("Castelar", "Direccion Fake 5556");
//		this.sedes[4] = new Tercerizada("Martinez", "Direccion Fake 831");
//		this.sedes[5] = new Propia("Belgrano", "Direccion Fake 9977");
//		this.sedes[6] = new Propia("Tigre", "Direccion Fake 1111");
//		this.sedes[7] = new Propia("Olivos", "Direccion Fake 1212");

		// Creo las solicitudes

		this.solicitudes.add(new Solicitud(new Alumno("11111111", "Maria", 8.5F, 3), 10928, "Moron", Turno.MANIANA));
		this.solicitudes.add(new Solicitud(new Alumno("11111111", "Maria", 8.5F, 3), 10928, "Moron", Turno.MANIANA));
		this.solicitudes.add(new Solicitud(new Alumno("11111111", "Maria", 8.5F, 3), 10928, "Moron", Turno.MANIANA));

		this.solicitudes.add(new Solicitud(new Alumno("11111111", "Maria", 8.5F, 3), 10928, "Moron", Turno.TARDE));
		this.solicitudes.add(new Solicitud(new Alumno("11111111", "Maria", 8.5F, 3), 10928, "Moron", Turno.TARDE));
		this.solicitudes.add(new Solicitud(new Alumno("11111111", "Maria", 8.5F, 3), 10928, "Moron", Turno.TARDE));
		this.solicitudes.add(new Solicitud(new Alumno("11111111", "Maria", 8.5F, 3), 10928, "Moron", Turno.TARDE));
		this.solicitudes.add(new Solicitud(new Alumno("11111111", "Maria", 8.5F, 3), 10928, "Moron", Turno.TARDE));
		this.solicitudes.add(new Solicitud(new Alumno("11111111", "Maria", 8.5F, 3), 10928, "Moron", Turno.TARDE));

		this.solicitudes.add(new Solicitud(new Alumno("11111111", "Maria", 8.5F, 3), 10928, "Moron", Turno.NOCHE));

		this.solicitudes.add(new Solicitud(new Alumno("11111111", "Maria", 8.5F, 3), 10928, "San Justo", Turno.NOCHE));

		this.solicitudes.add(new Solicitud(new Alumno("11111111", "Maria", 8.5F, 3), 10928, "Moron", Turno.MEDIODIA));
		this.solicitudes.add(new Solicitud(new Alumno("11111111", "Maria", 8.5F, 3), 10928, "Moron", Turno.MEDIODIA));

		this.solicitudes
				.add(new Solicitud(new Alumno("11111111", "Maria", 8.5F, 3), 10928, "San Justo", Turno.MEDIODIA));
		this.solicitudes.add(new Solicitud(new Alumno("11111111", "Maria", 8.5F, 3), 10928, "Moreno", Turno.MEDIODIA));
		this.solicitudes
				.add(new Solicitud(new Alumno("11111111", "Maria", 8.5F, 3), 10928, "San Justo", Turno.MEDIODIA));
		this.solicitudes
				.add(new Solicitud(new Alumno("11111111", "Maria", 8.5F, 3), 10928, "San Justo", Turno.MEDIODIA));
		this.solicitudes
				.add(new Solicitud(new Alumno("22222222", "Juan", 7.9F, 3), 23118, "Nombre de sede fake", Turno.NOCHE));
		this.solicitudes.add(new Solicitud(new Alumno("33333333", "Juliana", 8.5F, 3), 87661, "Moreno", Turno.MANIANA));
		this.solicitudes
				.add(new Solicitud(new Alumno("44444444", "Erica", 8.5F, 1), 77650, "San Justo", Turno.MANIANA));
		this.solicitudes
				.add(new Solicitud(new Alumno("55555555", "Fernando", 7.0F, 2), 31441, "San Justo", Turno.NOCHE));
		this.solicitudes.add(new Solicitud(new Alumno("66666666", "Luis", 6.0F, 2), 55412, "San Justo", Turno.TARDE));

	}

}
