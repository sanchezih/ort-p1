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

	public void mostrarColaEmps() {
		Empleado empCent;
		Empleado empActual;
		int i = 1;

		System.out.println("Cola al momento...");

		empCent = new Auxiliar(null, -1, -1);
		this.colaEmps.add(empCent);
		empActual = this.colaEmps.remove();
		while (empCent != empActual) {
			System.out.println("\t" + i + ". " + empActual);
			this.colaEmps.add(empActual);
			empActual = this.colaEmps.remove();
			i++;
		}
	}
}
