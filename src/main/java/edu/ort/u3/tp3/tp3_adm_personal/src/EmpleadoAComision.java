package edu.ort.u3.tp3.tp3_adm_personal.src;

public class EmpleadoAComision extends Empleado {

	private static final double SALARIO_MINIMO = 20000;
	private static final double MONTO_A_COBRAR_X_CLIENTE = 1000;
	private int cantClientesCaptados;

	public EmpleadoAComision(int dni, String nombre, String apellido, int anioIngreso, int cantClientesCaptados) {
		super(dni, nombre, apellido, anioIngreso);
		this.cantClientesCaptados = cantClientesCaptados;
	}

	public int getCantClientesCaptados() {
		return cantClientesCaptados;
	}

	@Override
	public double getSalario() {
		double salarioAux = this.cantClientesCaptados * MONTO_A_COBRAR_X_CLIENTE;
		if (salarioAux <= SALARIO_MINIMO) {
			return SALARIO_MINIMO;
		} else {
			return salarioAux;
		}
	}
}