package ar.edu.ort.p1.unidades.unidad04.practico04.ej20_pyme_refactor.src;

public class NominaDeEmpleados {

	private static int CANT_EMP_MAX = 6;
	private Empleado[] empleados = new Empleado[CANT_EMP_MAX];
	private int idxUltimoElemento = -1;

	/*----------------------------------------------------------------------------*/

	/**
	 * 
	 * @param empleado
	 * @return
	 */
	public int altaDeEmpleado(Empleado empleado) {
		int pos = idxUltimoElemento;
		int idx = pos == this.empleados.length - 1 ? -1 : pos + 1;

		if (idx > -1) {
			this.empleados[idx] = empleado;
			idxUltimoElemento++;
		}
		return idx;
	}

	/*----------------------------------------------------------------------------*/

	/**
	 * 
	 * @param dni
	 * @return
	 */
	public Empleado bajaDeEmpleado(String dni) {
		int i = 0;
		Empleado empEncontrado = null;
		while (i < this.empleados.length && empEncontrado == null) {
			if (this.empleados[i] != null && this.empleados[i].getDni().equals(dni)) {
				empEncontrado = this.empleados[i];

				// Si se quiere eliminar el ultimo elemento, no hay que pisar
				if (i != idxUltimoElemento) {
					this.empleados[i] = this.empleados[idxUltimoElemento];
				}

				this.empleados[idxUltimoElemento] = null;
				idxUltimoElemento--;
			} else {
				i++;
			}
		}
		return empEncontrado;
	}

	/*----------------------------------------------------------------------------*/

	/**
	 * 
	 * @return
	 */
	public int cantVacantes() {
		return this.empleados.length - 1 - idxUltimoElemento;
	}

	/*----------------------------------------------------------------------------*/

	/**
	 * 
	 * @return
	 */
	public double sueldoTotal() {
		double sueldosAcumulados = 0;
		for (int i = 0; i <= idxUltimoElemento; i++) {
			sueldosAcumulados += this.empleados[i].getSueldo();
		}
		return sueldosAcumulados;
	}

	/*----------------------------------------------------------------------------*/

	public void mostrarNomina() {
		System.out.println("Los elementos que hay en la nomina actualmente son: ");

		for (int i = 0; i <= idxUltimoElemento; i++) {
			System.out.println(this.empleados[i].toString());
		}

		for (int i = idxUltimoElemento + 1; i < this.empleados.length; i++) {
			System.out.println("NULL");
		}

		System.out.println();
	}

}
