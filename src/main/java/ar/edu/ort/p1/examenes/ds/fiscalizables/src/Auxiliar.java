package ar.edu.ort.p1.examenes.ds.fiscalizables.src;

public class Auxiliar extends Empleado {

	private final static int MAX_HS_SEMANALES = 20;
	private final static int MAX_ANTIGUEDAD = 10;
	private int cantHorasSemanales;

	/*----------------------------------------------------------------------------*/

	public Auxiliar(String dNI, int anioIngreso, int cantHorasSemanales) {
		super(dNI, anioIngreso);
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
