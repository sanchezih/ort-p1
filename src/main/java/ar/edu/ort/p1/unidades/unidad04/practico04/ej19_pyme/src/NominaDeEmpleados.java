package ar.edu.ort.p1.unidades.unidad04.practico04.ej19_pyme.src;

public class NominaDeEmpleados {

	private static int CANT_EMP_MAX = 6;
	private Empleado[] empleados = new Empleado[CANT_EMP_MAX];

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
	 * Ejercicio C: La explotacion del metodo bajaDeEmpleado que recibe el DNI de un
	 * empleado como parametro y lo quita de la nomina (colocando un null en esa
	 * posicion).
	 * 
	 * Devuelve al empleado dado de baja o null si no se encontro.
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
	 * Ejercicio D: La explotacion del metodo cantVacantes que retorne cuantas
	 * vacantes hay en la nomina.
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
	 * Ejercicio E: La explotacion del metodo sueldoTotal que retorne el sueldo
	 * total de todos los empleados.
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
