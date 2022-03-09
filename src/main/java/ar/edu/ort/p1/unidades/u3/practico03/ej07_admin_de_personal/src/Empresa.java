package ar.edu.ort.p1.unidades.u3.practico03.ej07_admin_de_personal.src;

import java.util.ArrayList;

public class Empresa {

	private ArrayList<Empleado> empleados = new ArrayList<Empleado>();

	public Empresa() {
		this.empleados = new ArrayList<Empleado>();
	}

	/*----------------------------------------------------------------------------*/

	/**
	 * Ejercicio B: La explotacion del metodo mostrarSalarios que imprima por
	 * consola el nombre completo de cada empleado junto a su salario.
	 */
	public void mostrarSalarios() {
		System.out.println("Muestro los salarios de los empleados");
		for (Empleado e : this.empleados) {
			e.mostrarDatos();
		}
	}

	/*----------------------------------------------------------------------------*/

	/**
	 * Ejercicio C: La explotacion del metodo empleadoConMasClientes que devuelva al
	 * empleado con mayor cantidad de clientes captados (se supone unico).
	 */
	public EmpleadoAComision empleadoConMasClientes() {

		EmpleadoAComision ecmc = null;
		int maxClientes = -1;

		for (Empleado e : this.empleados) {
			if (e instanceof EmpleadoAComision) {
				EmpleadoAComision eac = (EmpleadoAComision) e;
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

	// Metodos extra

	public void agregarEmpleado(Empleado empleado) {
		this.empleados.add(empleado);
	}

}