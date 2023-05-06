package ar.edu.ort.p1.examenes.ds.fiscalizables.src;

public class Profesor extends Empleado {

	private final static int TURNOS = 3;
	private final static int DIAS_SEMANA = 5;
	private Nivel titulo;
	private Cargo[][] cargos = new Cargo[DIAS_SEMANA][TURNOS];

	/*----------------------------------------------------------------------------*/

	public Profesor(String dni, int anioIngreso, Nivel titulo, Cargo[][] cargos) {
		super(dni, anioIngreso);
		this.titulo = titulo;
		this.cargos = cargos;
	}

	/*----------------------------------------------------------------------------*/

	/**
	 * 
	 */
	@Override
	public boolean hayIrregularidad() {

		final int NOCTURNO = 2;
		final int MAX_CARGOS_NOCTURNOS = 3;

		return !cargosValidosSegunNivel() || !cumpleCantCargos(NOCTURNO, MAX_CARGOS_NOCTURNOS);
	}

	/**
	 * 
	 * @return
	 */
	private boolean cargosValidosSegunNivel() {
		boolean todoOk = true;
		int i = 0;
		while (i < this.cargos.length && todoOk) {
			todoOk = cargosValidosSegunNivel(this.cargos[i]);
			i++;
		}
		return todoOk;
	}

	/**
	 * 
	 * @param cargosEnElDia
	 * @return
	 */
	private boolean cargosValidosSegunNivel(Cargo[] cargosEnElDia) {
		boolean todoOk = true;
		int i = 0;
		Cargo cargo;

		while (i < cargosEnElDia.length && todoOk) {
			cargo = cargosEnElDia[i];
			todoOk = cargo == null || this.titulo.ordinal() >= cargo.getTipo().ordinal();
			i++;
		}
		return todoOk;
	}

	/**
	 * 
	 * @param nroTurno
	 * @param max
	 * @return
	 */
	private boolean cumpleCantCargos(int nroTurno, int max) {
		int cant = 0;
		int i = 0;
		while (i < cargos.length && cant <= max) {
			if (cargos[i][nroTurno] != null) {
				cant++;
			}
			i++;
		}
		return i == cargos.length;
	}

	@Override
	public String toString() {
		return this.getClass().getSimpleName() + " con DNI: " + getDni();
	}

}
