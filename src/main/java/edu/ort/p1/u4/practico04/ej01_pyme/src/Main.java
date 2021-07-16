package edu.ort.p1.u4.practico04.ej01_pyme.src;

import edu.ort.p1.u4.practico04.ej01_pyme.src.pyme.Empleado;
import edu.ort.p1.u4.practico04.ej01_pyme.src.pyme.NominaDeEmpleados;
import edu.ort.p1.u4.practico04.ej01_pyme.src.pyme.Pyme;

public class Main {

	public static void main(String[] args) {

		Empleado e1 = new Empleado("10000000", "Perez", 100);
		Empleado e2 = new Empleado("10000001", "Lopez", 150);
		Empleado e3 = new Empleado("10000002", "Gomez", 300);
		Empleado e4 = new Empleado("10000003", "Gerez", 200);

		NominaDeEmpleados nomina = new NominaDeEmpleados();

		nomina.altaDeEmpleado(e1);
		nomina.altaDeEmpleado(e2);
		nomina.altaDeEmpleado(e3);
		nomina.altaDeEmpleado(e4);

		Pyme pyme = new Pyme(nomina);

		System.out.println("La cantidad de vacantes es: " + pyme.cantVacantes());
		System.out.println("La sumatoria de sueldos es: " + pyme.sueldoTotal());

	}

}
