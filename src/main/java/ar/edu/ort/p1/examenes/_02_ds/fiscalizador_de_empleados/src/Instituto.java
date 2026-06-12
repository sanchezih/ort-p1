package ar.edu.ort.p1.examenes._02_ds.fiscalizador_de_empleados.src;

import ar.edu.ort.p1.util.UtilCola;
import ar.edu.ort.tp1.u5.tda.impl.ColaNodos;
import ar.edu.ort.tp1.u5.tda.interfaces.Cola;

public class Instituto {

	private String codigo;
	private Cola<Empleado> empleados;

	/*----------------------------------------------------------------------------*/

	public Instituto(String codigo) {
		this.codigo = codigo;
		this.empleados = new ColaNodos<>();
	}

	/*----------------------------------------------------------------------------*/

	/**
	 * Ejercicio B: El metodo empleadosEnFalta(), de la clase que corresponda, que
	 * debe devolver (no mostrar por consola) a los empleados que hayan presentado
	 * alguna irregularidad, en una coleccion que permita accederlos rapidamente
	 * conociendo su DNI. Deben desarrollarse tambien los metodos asociados que se
	 * usen, sean o no de la misma clase.
	 * 
	 * 1. Recorre la cola de empleados (Profesores y Auxiliares)
	 * 
	 * 2. Por cada empleado, si tiene alguna irregularidad, lo saco de la cola y lo
	 * pongo en la lista ordenada. Caso contrario, lo vuelvo a meter en la cola.
	 * 
	 * @return
	 */
	public ListaDeEmpleadosPorDniAsc empleadosEnFalta() {

		Empleado empleado = null;
		ListaDeEmpleadosPorDniAsc lista = new ListaDeEmpleadosPorDniAsc();
		Empleado empleadoCentinela = new Auxiliar(null, -1, -1);

		this.empleados.add(empleadoCentinela);
		empleado = this.empleados.remove();

		while (empleadoCentinela != empleado) {
			if (empleado.hayIrregularidad()) {
				lista.add(empleado);
			} else {
				this.empleados.add(empleado);
			}
			empleado = this.empleados.remove();
		}
		return lista;
	}

	/*----------------------------------------------------------------------------*/

	// Metodos complementarios

	/**
	 * 
	 * @param empleado
	 */
	public void agregarEmpleado(Empleado empleado) {
		this.empleados.add(empleado);
	}

	/**
	 * 
	 */
	public void mostrarColaDeEmpleados() {
		System.out.println("Cola de empleados al momento...");
		UtilCola.mostrarColaGenerica(this.empleados);
	}
}
