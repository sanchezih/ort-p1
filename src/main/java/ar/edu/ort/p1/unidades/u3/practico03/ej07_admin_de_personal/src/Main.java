package ar.edu.ort.p1.unidades.u3.practico03.ej07_admin_de_personal.src;

public class Main {

	public static void main(String[] args) {

		Empresa empresa = new Empresa();

		empresa.agregarEmpleado(new EmpleadoAComision(31507904, "Maria", "Perez", 2018, 22));
		empresa.agregarEmpleado(new EmpleadoAComision(31293830, "Carina", "Vazquez", 2015, 23));

		empresa.agregarEmpleado(new EmpleadoASalarioFijo(31293830, "Julia", "Rossi", 2016));

		/*----------------------------------------------------------------------------*/

		/* Ejercicio B */
		empresa.mostrarSalarios();

		/* Ejercicio C */
		System.out.println("\nEl empleado con mas clientes captados es " + empresa.empleadoConMasClientes().getNombre()
				+ " (" + ((EmpleadoAComision) empresa.empleadoConMasClientes()).getCantClientesCaptados()
				+ " clientes)");

	}

}
