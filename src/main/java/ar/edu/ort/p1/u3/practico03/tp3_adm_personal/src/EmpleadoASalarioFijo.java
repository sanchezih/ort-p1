package ar.edu.ort.p1.u3.practico03.tp3_adm_personal.src;

public class EmpleadoASalarioFijo extends Empleado {
	private static final double SALARIO_BASICO = 18000;
	private static final double SALARIO_AD_2_A_5 = 0.05;
	private static final double SALARIO_AD_6_A_10 = 0.1;
	private static final double SALARIO_AD_MAS_DE_10 = 0.15;

	public EmpleadoASalarioFijo(int dni, String nombre, String apellido, int anioIngreso) {
		super(dni, nombre, apellido, anioIngreso);
	}

	public double porcSegunAntiguedad() {
		int anios = getAniosDeAntiguedad();
		double porc = 0;
		if (anios < 2) {
			porc = 0;
		} else {
			if (anios >= 2 && anios <= 5) {
				porc = SALARIO_AD_2_A_5;
			} else {
				if (anios >= 6 && anios <= 10) {
					porc = SALARIO_AD_6_A_10;
				} else {
					porc = SALARIO_AD_MAS_DE_10;
				}
			}
		}
		return porc;
	}

	@Override
	public double getSalario() {
		return SALARIO_BASICO + (SALARIO_BASICO * porcSegunAntiguedad());
	}
}