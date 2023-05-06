package ar.edu.ort.p1.examenes.ds.fiscalizables.src;

import ar.edu.ort.p1.util.UtilCola;

public class Instituto {

	private String codigo;
	private ColaDeEmpleados empleados;

	/*----------------------------------------------------------------------------*/

	public Instituto(String codigo) {
		super();
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

		Empleado empCent;
		Empleado empActual;
		ListaDeEmpleadosPorDNI lista = new ListaDeEmpleadosPorDNI();

		empCent = new Auxiliar(null, -1, -1);
		this.empleados.add(empCent);
		empActual = this.empleados.remove();

		while (empCent != empActual) {
			if (empActual.hayIrregularidad()) {
				lista.add(empActual);
			} else {
				this.empleados.add(empActual);
			}
			empActual = this.empleados.remove();
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
		UtilCola.mostrar(this.empleados);
	}
}
