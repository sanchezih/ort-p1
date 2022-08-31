package ar.edu.ort.p1.unidades.u3.practico03.ej07_admin_de_personal.src;

public class Main {

	public static void main(String[] args) {

		Empresa empresa = new Empresa();

		empresa.agregarEmpleado(new EmpleadoAComision("31507900", "Maria", "Perez", 2018, 22));
		empresa.agregarEmpleado(new EmpleadoAComision("30982771", "Carina", "Vazquez", 2015, 23));

		empresa.agregarEmpleado(new EmpleadoASalarioFijo("31293830", "Julia", "Rossi", 2016));

		/*----------------------------------------------------------------------------*/

		// Test ejercicio B
		System.out.println("Ejercicio B: Muestro los salarios de los empleados");
		empresa.mostrarSalarios();

		// Test ejercicio C
		System.out.println("\nEjercicio C: El empleado con mas clientes captados es "
				+ empresa.empleadoConMasClientes().getNombre() + " ("
				+ ((EmpleadoAComision) empresa.empleadoConMasClientes()).getCantClientesCaptados() + " clientes)");

	}

}
