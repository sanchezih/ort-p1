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
		int idxPrimerNull = getIdxPrimerNull();

		if (idxPrimerNull > -1) {
			this.empleados[idxPrimerNull] = empleado;
		}
		return idxPrimerNull;
	}

	/**
	 * 
	 * @return
	 */
	private int getIdxPrimerNull() {
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
		Empleado empleadoEncontrado = null;

		while (i < this.empleados.length && empleadoEncontrado == null) {
			if (this.empleados[i] != null && this.empleados[i].getDni().equals(dni)) {
				empleadoEncontrado = this.empleados[i];
				this.empleados[i] = null;
			} else {
				i++;
			}
		}
		return empleadoEncontrado;
	}

	/*----------------------------------------------------------------------------*/

	/**
	 * 
	 * @return
	 */
	public int cantVacantes() {
		int cantidadDeVacantes = 0;

		for (int i = 0; i < this.empleados.length; i++) {
			if (this.empleados[i] == null) {
				cantidadDeVacantes++;
			}
		}
		return cantidadDeVacantes;
	}

	/*----------------------------------------------------------------------------*/

	/**
	 * 
	 * @return
	 */
	public double sueldoTotal() {
		double sueldoTotal = 0;

		for (int i = 0; i < this.empleados.length; i++) {
			if (this.empleados[i] != null) {
				sueldoTotal += this.empleados[i].getSueldo();
			}
		}
		return sueldoTotal;
	}

	/*----------------------------------------------------------------------------*/

	public void mostrarNomina() {
		System.out.println("Los elementos que hay en la nomina actualmente son: ");
		for (int i = 0; i < this.empleados.length; i++) {
			if (this.empleados[i] != null) {
				System.out.println(this.empleados[i].toString());
			} else {
				System.out.println("NULL");
			}
		}
		System.out.println();
	}

}
