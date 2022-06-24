package ar.edu.ort.p1.examenes.ds.fiscalizables.src;

public class Instituto {
	private String codigo;
	private ColaEmpleados colaEmps;

	public Instituto(String codigo) {
		super();
		this.codigo = codigo;
		this.colaEmps = new ColaEmpleados();
	}

	/**
	 * Ejercicio B: El metodo empleadosEnFalta(), de la clase que corresponda, que
	 * debe devolver (no mostrar por consola) a los empleados que hayan presentado
	 * alguna irregularidad, en una coleccion que permita accederlos rápidamente
	 * conociendo su DNI. Deben desarrollarse tambien los metodos asociados que se
	 * usen, sean o no de la misma clase.
	 * 
	 * @return
	 */
	public ListaEmpsPorDNI empleadosEnFalta() {
		Empleado empCent;
		Empleado empActual;
		ListaEmpsPorDNI lista = new ListaEmpsPorDNI();

		empCent = new Auxiliar(null, -1, -1);
		this.colaEmps.add(empCent);
		empActual = this.colaEmps.remove();

		while (empCent != empActual) {
			if (empActual.hayIrregularidad()) {
				lista.add(empActual);
			} else {
				this.colaEmps.add(empActual);
			}
			empActual = this.colaEmps.remove();
		}
		return lista;
	}

	/*----------------------------------------------------------------------------*/

	// Metodos complementarios

	public void agregarEmpleado(Empleado empleado) {
		this.colaEmps.add(empleado);
	}
}
