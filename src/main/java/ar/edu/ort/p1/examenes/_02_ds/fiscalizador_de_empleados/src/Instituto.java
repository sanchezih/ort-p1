package ar.edu.ort.p1.examenes._02_ds.fiscalizador_de_empleados.src;

import ar.edu.ort.p1.util.UtilCola;

public class Instituto {

	private String codigo;
	private ColaDeEmpleados empleados;

	/*----------------------------------------------------------------------------*/

	public Instituto(String codigo) {
		this.codigo = codigo;
		this.empleados = new ColaDeEmpleados();
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
	public ListaDeEmpleadosPorDNI empleadosEnFalta() {

		Empleado empleado = null;
		ListaDeEmpleadosPorDNI lista = new ListaDeEmpleadosPorDNI();
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
