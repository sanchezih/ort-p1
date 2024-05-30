package ar.edu.ort.p1.examenes._02_ds.fiscalizador_de_empleados.src;

public class Profesor extends Empleado {

	private final static int TURNOS = 3;
	private final static int DIAS_SEMANA = 5;
	private Nivel titulo;
	private Cargo[][] cargos = new Cargo[DIAS_SEMANA][TURNOS];

	/*----------------------------------------------------------------------------*/

	public Profesor(String dni, int anioDeIngreso, Nivel titulo, Cargo[][] cargos) {
		super(dni, anioDeIngreso);
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
		boolean isTodoOk = true;
		int i = 0;

		while (i < this.cargos.length && isTodoOk) {
			isTodoOk = cargosValidosSegunNivel(this.cargos[i]);
			i++;
		}
		return isTodoOk;
	}

	/**
	 * 
	 * @param cargosEnElDia
	 * @return
	 */
	private boolean cargosValidosSegunNivel(Cargo[] cargosEnElDia) {
		boolean isTodoOk = true;
		int i = 0;
		Cargo cargo = null;

		while (i < cargosEnElDia.length && isTodoOk) {
			cargo = cargosEnElDia[i];
			isTodoOk = cargo == null || this.titulo.ordinal() >= cargo.getTipo().ordinal();
			i++;
		}
		return isTodoOk;
	}

	/**
	 * 
	 * @param numeroDeTurno
	 * @param max
	 * @return
	 */
	private boolean cumpleCantCargos(int numeroDeTurno, int max) {
		int cant = 0;
		int i = 0;

		while (i < cargos.length && cant <= max) {
			if (cargos[i][numeroDeTurno] != null) {
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
