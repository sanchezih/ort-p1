package ar.edu.ort.p1.unidades.unidad03.practico03.ej08_administrador_de_personal.src;

public class EmpleadoAComision extends Empleado {

	private static final double SALARIO_MINIMO = 20000;
	private static final double MONTO_A_COBRAR_X_CLIENTE = 1000;
	private int cantClientesCaptados;

	/*----------------------------------------------------------------------------*/

	public EmpleadoAComision(String dni, String nombre, String apellido, int anioIngreso, int cantClientesCaptados) {
		super(dni, nombre, apellido, anioIngreso);
		this.cantClientesCaptados = cantClientesCaptados;
	}

	/*----------------------------------------------------------------------------*/

	public int getCantClientesCaptados() {
		return cantClientesCaptados;
	}

	/*----------------------------------------------------------------------------*/

	@Override
	public double getSalario() {
		double posibleSueldo = this.cantClientesCaptados * MONTO_A_COBRAR_X_CLIENTE;
		
		return posibleSueldo < SALARIO_MINIMO ? SALARIO_MINIMO : posibleSueldo; // Ternario
	}
}