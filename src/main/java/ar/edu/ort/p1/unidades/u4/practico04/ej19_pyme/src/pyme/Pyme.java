package ar.edu.ort.p1.unidades.u4.practico04.ej19_pyme.src.pyme;

public class Pyme {

	private NominaDeEmpleados nomina;

	public Pyme() {
		this.nomina = new NominaDeEmpleados();
	}

	/**
	 * Ejercicio B: La explotacion del metodo altaDeEmpleado que recibe los datos de
	 * un empleado como parametro y lo agrega a la primera posicion disponible de la
	 * nomina. Se retorna el numero de posicion del nuevo empleado (o -1 si la
	 * nomina estaba completa)
	 * 
	 * @param dni
	 * @param apellido
	 * @param sueldo
	 * @return
	 */
	public int altaDeEmpleado(String dni, String apellido, double sueldo) {
		return this.nomina.altaDeEmpleado(new Empleado(dni, apellido, sueldo));
	}

	/**
	 * Ejercicio C: La explotacion del método bajaDeEmpleado que recibe el DNI de un
	 * empleado como parametro y lo quita de la nomina (colocando un null en esa
	 * posicion). Devuelve al empleado dado de baja o null si no se encontro.
	 * 
	 * @param dni
	 * @return
	 */
	public Empleado bajaDeEmpleado(String dni) {
		return this.nomina.bajaDeEmpleado(dni);
	}

	/**
	 * Ejercicio D: La explotacion del metodo cantVacantes que retorne cuantas
	 * vacantes hay en la nomina.
	 * 
	 * @return
	 */
	public int cantVacantes() {
		return this.nomina.cantVacantes();
	}

	/**
	 * Ejercicio E: La explotacion del metodo sueldoTotal que retorne el sueldo
	 * total de todos los empleados.
	 * 
	 * @return
	 */
	public double sueldoTotal() {
		return this.nomina.sueldoTotal();
	}
}
