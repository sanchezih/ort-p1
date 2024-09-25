package ar.edu.ort.p1.unidades.unidad04.practico04.ej20_pyme_refactor.src;

public class NominaDeEmpleados {

	private static int CANT_EMP_MAX = 3;
	private Empleado[] empleados = new Empleado[CANT_EMP_MAX];
	private int idxUltimoElemento = -1;

	/*----------------------------------------------------------------------------*/

	/**
	 * Ejercicio B: La explotacion del metodo altaDeEmpleado que recibe los datos de
	 * un empleado como parametro y lo agrega a la primera posicion disponible de la
	 * nomina.
	 * 
	 * Se retorna el numero de posicion del nuevo empleado (o -1 si la nomina estaba
	 * completa).
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

	/**
	 * Ejercicio D: La explotacion del metodo cantVacantes que retorne cuantas
	 * vacantes hay en la nomina.
	 * 
	 * Nota: Por como esta implementado el mentodo bajaDeEmpleado, no es necesario
	 * recorrer toda la estructura ya que se puede saber en que posicion se
	 * encuentra el ultimo elemento.
	 * 
	 * @return
	 */
	public int cantVacantes() {
		return this.empleados.length - 1 - idxUltimoElemento;
	}

	/**
	 * Ejercicio E: La explotacion del metodo sueldoTotal que retorne el sueldo
	 * total de todos los empleados.
	 * 
	 * Nota: Por como esta implementado el mentodo bajaDeEmpleado, no es necesario
	 * recorrer toda la estructura ya que se puede saber en que posicion se
	 * encuentra el ultimo elemento.
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

}
