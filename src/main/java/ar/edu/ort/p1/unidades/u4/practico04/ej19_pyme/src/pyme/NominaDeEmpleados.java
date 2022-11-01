package ar.edu.ort.p1.unidades.u4.practico04.ej19_pyme.src.pyme;

public class NominaDeEmpleados {

	private static int CANT_EMP_MAX = 3;
	private Empleado[] empleados = new Empleado[CANT_EMP_MAX];

	public int altaDeEmpleado(Empleado empleado) {
		int pos;
		//pos = idxPrimerNull();
		pos=getPrimerPosicionLibre();
		if (pos > -1) {
			this.empleados[pos] = empleado;
		}
		return pos;
	}

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

	public int cantVacantes() {
		int cant = 0;
		for (int i = 0; i < this.empleados.length; i++) {
			if (this.empleados[i] == null) {
				cant++;
			}
		}
		return cant;
	}

	public double sueldoTotal() {
		double acu = 0;
		for (int i = 0; i < this.empleados.length; i++) {
			if (this.empleados[i] != null) {
				acu += this.empleados[i].getSueldo();
			}
		}
		return acu;
	}

	private int idxPrimerNull() {
		int i = 0;
		while (i < this.empleados.length && this.empleados[i] != null) {
			i++;
		}
		return i < this.empleados.length ? i : -1;
	}

	/**
	 * Otra impl para obtener la primer posicion libre del array
	 * @return
	 */
	private int getPrimerPosicionLibre() {
		boolean encontrado = false;
		int i = 0;
		while (i < this.empleados.length && !encontrado) {
			if (this.empleados[i] == null) {
				encontrado = true;
			} else
				i++;
		}
		return encontrado ? i : -1;
	}
}
