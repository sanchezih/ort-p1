package ar.edu.ort.p1.unidades.u4.practico04.ej19_pyme.src;

import ar.edu.ort.p1.unidades.u4.practico04.ej19_pyme.src.pyme.Pyme;

public class Main {

	public static void main(String[] args) {

		Pyme pyme = new Pyme();

		System.out.println("La cantidad de vacantes es: " + pyme.cantVacantes());
		pyme.altaDeEmpleado("10000000", "Perez", 100);
		pyme.altaDeEmpleado("10000001", "Lopez", 100);
		pyme.altaDeEmpleado("10000002", "Gomez", 100);
		pyme.altaDeEmpleado("10000003", "Gerez", 200); // A Gerez no se lo inserta en el array
		System.out.println("La cantidad de vacantes es: " + pyme.cantVacantes());

		System.out.println("La sumatoria de sueldos es: " + pyme.sueldoTotal());

	}

}
