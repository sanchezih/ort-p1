package ar.edu.ort.p1.u4.practico04.ej19_pyme.src.pyme;

public class Pyme {

	private NominaDeEmpleados nomina;

	public Pyme(NominaDeEmpleados nomina) {
		super();
		this.nomina = nomina;
	}

	public int altaDeEmpleado(String dni, String apellido, double sueldo) {
		return this.nomina.altaDeEmpleado(new Empleado(dni, apellido, sueldo));
	}

	public Empleado bajaDeEmpleado(String dni) {
		return this.nomina.bajaDeEmpleado(dni);
	}

	public int cantVacantes() {
		return this.nomina.cantVacantes();
	}

	public double sueldoTotal() {
		return this.nomina.sueldoTotal();
	}
}
