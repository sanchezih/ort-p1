package ar.edu.ort.p1.examenes._02_ds.fiscalizador_de_empleados.src;

public class Auxiliar extends Empleado {

	private static final int MAX_HS_SEMANALES = 20;
	private static final int MAX_ANTIGUEDAD = 10;

	private int cantHorasSemanales;

	/*----------------------------------------------------------------------------*/

	public Auxiliar(String dni, int anioDeIngreso, int cantHorasSemanales) {
		super(dni, anioDeIngreso);
		this.cantHorasSemanales = cantHorasSemanales;
	}

	/*----------------------------------------------------------------------------*/

	/**
	 * 
	 */
	@Override
	public boolean hayIrregularidad() {
		return getAntiguedad() > MAX_ANTIGUEDAD || this.cantHorasSemanales < MAX_HS_SEMANALES;
	}

	@Override
	public String toString() {
		return this.getClass().getSimpleName() + " con DNI: " + getDni();
	}

}
