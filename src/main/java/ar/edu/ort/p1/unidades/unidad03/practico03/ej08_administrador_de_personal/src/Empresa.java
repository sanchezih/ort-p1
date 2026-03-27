package ar.edu.ort.p1.unidades.unidad03.practico03.ej08_administrador_de_personal.src;

import java.util.ArrayList;
import java.util.List;

public class Empresa {

	private List<Empleado> empleados;

	/*----------------------------------------------------------------------------*/

	public Empresa() {
		this.empleados = new ArrayList<>();
	}

	/*----------------------------------------------------------------------------*/

	/**
	 * Ejercicio B: La explotacion del metodo mostrarSalarios que imprima por
	 * consola el nombre completo de cada empleado junto a su salario.
	 */
	public void mostrarSalarios() {
		for (Empleado empleado : this.empleados) {
			empleado.mostrarDatos();
		}
	}

	/*----------------------------------------------------------------------------*/

	/**
	 * Ejercicio C: La explotacion del metodo empleadoConMasClientes que devuelva al
	 * empleado con mayor cantidad de clientes captados (se supone unico).
	 */
	public Empleado empleadoConMasClientes() {

		int maxClientes = -1;
		EmpleadoAComision ecmc = null;

		for (Empleado empleado : this.empleados) {
			if (empleado instanceof EmpleadoAComision) {
				EmpleadoAComision eac = (EmpleadoAComision) empleado;
				int cantCli = eac.getCantClientesCaptados();
				if (cantCli > maxClientes) {
					maxClientes = cantCli;
					ecmc = eac;
				}
			}
		}
		return ecmc;
	}

	/*----------------------------------------------------------------------------*/

	// Metodos complementarios

	public void agregarEmpleado(Empleado empleado) {
		this.empleados.add(empleado);
	}

}