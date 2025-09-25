package ar.edu.ort.p1.unidades.unidad04.practico04.ej20_pyme_refactor.src;

public class Main {

	public static void main(String[] args) {

		Pyme pyme = new Pyme();
		pyme.mostrarNomina();

		/*----------------------------------------------------------------------------*/

		// Test ejercicio B
		System.out.println("EJERCICIO B - Se agregan los empleados a la nomina...");
		System.out.println("Empleado agregado en la posicion " + pyme.altaDeEmpleado("11111111", "Perez", 10000));
		System.out.println("Empleado agregado en la posicion " + pyme.altaDeEmpleado("22222222", "Lopez", 15000));
		System.out.println("Empleado agregado en la posicion " + pyme.altaDeEmpleado("33333333", "Gomez", 20000));
		System.out.println("Empleado agregado en la posicion " + pyme.altaDeEmpleado("44444444", "Ruiz", 7000));
		System.out.println("Empleado agregado en la posicion " + pyme.altaDeEmpleado("55555555", "Paez", 11000));
		System.out.println("Empleado agregado en la posicion " + pyme.altaDeEmpleado("66666666", "Gonzalez", 18000));

		// A Gerez no se lo inserta en el array
		System.out.println("Empleado agregado en la posicion " + pyme.altaDeEmpleado("77777777", "Gerez", 20000));

		System.out.println();

		pyme.mostrarNomina();

		/*----------------------------------------------------------------------------*/

		// Test ejercicio C
		System.out.println("EJERCICIO C - Se dan de baja los siguientes empleados...");
		System.out.println("Se da de baja al empleado " + pyme.bajaDeEmpleado("22222222"));
		System.out.println("Se da de baja al empleado " + pyme.bajaDeEmpleado("88888888"));

		pyme.mostrarNomina();

		/*----------------------------------------------------------------------------*/

		// Test ejercicio D
		System.out.println();
		System.out.println("EJERCICIO D - La cantidad de vacantes en la nomina es: " + pyme.cantVacantes());
		System.out.println();

		/*----------------------------------------------------------------------------*/

		pyme.mostrarNomina();

		// Test ejercicio E
		System.out.println("EJERCICIO E - La sumatoria de sueldos es: " + pyme.sueldoTotal());

	}

}
