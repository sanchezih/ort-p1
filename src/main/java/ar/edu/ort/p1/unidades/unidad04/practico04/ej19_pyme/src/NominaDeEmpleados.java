package ar.edu.ort.p1.unidades.unidad04.practico04.ej19_pyme.src;

public class NominaDeEmpleados {

	private static int CANT_EMP_MAX = 6;
	private Empleado[] empleados = new Empleado[CANT_EMP_MAX];

	/*----------------------------------------------------------------------------*/

	/**
	 * 
	 * @param empleado
	 * @return
	 */
	public int altaDeEmpleado(Empleado empleado) {
		int pos = idxPrimerNull();

		if (pos > -1) {
			this.empleados[pos] = empleado;
		}
		return pos;
	}

	/**
	 * 
	 * @return
	 */
	private int idxPrimerNull() {
		int i = 0;
		while (i < this.empleados.length && this.empleados[i] != null) {
			i++;
		}
		return i < this.empleados.length ? i : -1;
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
				this.empleados[i] = null;
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
		int cant = 0;

		for (int i = 0; i < this.empleados.length; i++) {
			if (this.empleados[i] == null) {
				cant++;
			}
		}
		return cant;
	}

	/*----------------------------------------------------------------------------*/

	/**
	 * 
	 * @return
	 */
	public double sueldoTotal() {
		double acu = 0;
		
		for (int i = 0; i < this.empleados.length; i++) {
			if (this.empleados[i] != null) {
				acu += this.empleados[i].getSueldo();
			}
		}
		return acu;
	}

}
