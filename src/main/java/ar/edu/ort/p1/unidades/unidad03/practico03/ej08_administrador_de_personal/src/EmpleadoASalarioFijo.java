package ar.edu.ort.p1.unidades.unidad03.practico03.ej08_administrador_de_personal.src;

public class EmpleadoASalarioFijo extends Empleado {

	private static final double SALARIO_BASICO = 18000;
	private static final double SALARIO_AD_M2 = 0;
	private static final double SALARIO_AD_2_A_5 = 0.05;
	private static final double SALARIO_AD_6_A_10 = 0.1;
	private static final double SALARIO_AD_MAS_DE_10 = 0.15;

	/*----------------------------------------------------------------------------*/

	/**
	 * 
	 * @param dni
	 * @param nombre
	 * @param apellido
	 * @param anioIngreso
	 */
	public EmpleadoASalarioFijo(String dni, String nombre, String apellido, int anioIngreso) {
		super(dni, nombre, apellido, anioIngreso);
	}

	/*----------------------------------------------------------------------------*/

	/**
	 * 
	 * @return
	 */
	private double porcSegunAntiguedad() {

		int anios = getAniosDeAntiguedad();
		double porcentaje = SALARIO_AD_MAS_DE_10;

		if (anios < 2) {
			porcentaje = SALARIO_AD_M2;
		} else {
			if (anios >= 2 && anios <= 5) {
				porcentaje = SALARIO_AD_2_A_5;
			} else {
				if (anios >= 6 && anios <= 10) {
					porcentaje = SALARIO_AD_6_A_10;
				}
			}
		}
		return porcentaje;
	}

	/*----------------------------------------------------------------------------*/

	@Override
	public double getSalario() {
		return SALARIO_BASICO + (SALARIO_BASICO * porcSegunAntiguedad());
	}
}