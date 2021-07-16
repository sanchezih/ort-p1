package edu.ort.p1.u4.practico04.ej01_pyme.src.pyme;

public class NominaDeEmpleados {
	private static int CANT_EMP_MAX = 3;
	private Empleado[] empleados = new Empleado[CANT_EMP_MAX];

	public int altaDeEmpleado(Empleado emp) {
		int i = 0;
		boolean hayLugar = false;
		while (i < this.empleados.length && !hayLugar) {
			if (this.empleados[i] == null) {
				this.empleados[i] = emp;
				hayLugar = true;
			} else {
				i++;
			}
		}
		return hayLugar ? i : -1;
	}

	public Empleado bajaDeEmpleado(String dni) {
		Empleado empEncontrado = null;
		int i = 0;
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

	public double sueldoTotal() {
		double acu = 0;
		for (int i = 0; i < this.empleados.length; i++) {
			if (this.empleados[i] != null) {
				acu += this.empleados[i].getSueldo();
			}
		}
		return acu;
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

}
