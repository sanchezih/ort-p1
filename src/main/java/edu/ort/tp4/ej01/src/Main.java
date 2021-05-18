package edu.ort.tp4.ej01.src;

import edu.ort.tp4.ej01.src.pyme.Empleado;
import edu.ort.tp4.ej01.src.pyme.NominaDeEmpleados;
import edu.ort.tp4.ej01.src.pyme.Pyme;

public class Main {

	public static void main(String[] args) {

		Empleado e1 = new Empleado("31507904", "Perez", 100);
		Empleado e2 = new Empleado("31293830", "Lopez", 150);
		Empleado e3 = new Empleado("30566841", "Gomez", 300);
		Empleado e4 = new Empleado("30566841", "sdsdd", 200);

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
