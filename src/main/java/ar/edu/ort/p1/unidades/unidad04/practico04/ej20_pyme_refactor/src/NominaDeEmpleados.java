package ar.edu.ort.p1.unidades.unidad04.practico04.ej20_pyme_refactor.src;

public class NominaDeEmpleados {

	private static int CANT_EMP_MAX = 6;
	private Empleado[] empleados = new Empleado[CANT_EMP_MAX];
	private int idxUltimoElemento = -1;

	/*----------------------------------------------------------------------------*/

	/**
	 * Agrega un empleado a la nomina, si todavia hay lugar disponible.
	 * 
	 * 1.Verifica si el array tiene espacio libre.
	 * 
	 * 2. Si hay lugar, guarda el empleado en la siguiente posicion disponible.
	 * 
	 * 3. Actualiza el indice del ultimo elemento ocupado.
	 * 
	 * 4. Devuelve la posicion donde fue insertado.
	 * 
	 * 5. Si la nomina esta llena, devuelve -1.
	 * 
	 * @param empleado Empleado a incorporar.
	 * @return Indice donde se agrego el empleado o -1 si no habia espacio.
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
	 * Elimina un empleado de la nomina a partir de su DNI.
	 * 
	 * 1. Busca un empleado cuyo DNI coincida.
	 * 
	 * 2. Si lo encuentra:
	 * 
	 * 2.1. Guarda la referencia del empleado eliminado.
	 * 
	 * 2.2. Reemplaza su posicion con el ultimo empleado cargado (para evitar dejar
	 * huecos en el array).
	 * 
	 * 2.3. Limpia la ultima posicion.
	 * 
	 * 2.4. Actualiza el indice del ultimo elemento.
	 * 
	 * 3. Devuelve el empleado eliminado.
	 * 
	 * 4. Si no existe, devuelve null.
	 * 
	 * Importante: El orden de los empleados puede cambiar luego de la baja.
	 * 
	 * @param dni DNI del empleado a eliminar.
	 * @return Empleado eliminado o null si no se encontro.
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
	 * Calcula cuantos lugares libres quedan en la nomina.
	 * 
	 * 1. Toma la capacidad total del array.
	 * 
	 * 2. Resta la cantidad actual de empleados cargados.
	 * 
	 * @return Cantidad de vacantes disponibles.
	 */
	public int cantVacantes() {
		return this.empleados.length - 1 - idxUltimoElemento;
	}

	/*----------------------------------------------------------------------------*/

	/**
	 * Calcula el total de sueldos de todos los empleados cargados.
	 * 
	 * 1. Recorre unicamente las posiciones ocupadas del array.
	 * 
	 * 2. Acumula el sueldo de cada empleado.
	 * 
	 * 3. Devuelve la suma total.
	 * 
	 * @return Suma de todos los sueldos.
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
