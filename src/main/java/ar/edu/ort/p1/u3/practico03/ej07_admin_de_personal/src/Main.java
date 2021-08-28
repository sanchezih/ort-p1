package ar.edu.ort.p1.u3.practico03.ej07_admin_de_personal.src;

public class Main {

	public static void main(String[] args) {

		Empresa e1 = new Empresa();

		e1.agregarEmpleado(new EmpleadoAComision(31507904, "Maria", "Perez", 2018, 22));
		e1.agregarEmpleado(new EmpleadoAComision(31293830, "Ignacio", "Sanchez", 2015, 23));
		e1.agregarEmpleado(new EmpleadoASalarioFijo(31293830, "Julia", "Rossi", 2016));

		// Ejercicio 1
		e1.mostrarSalarios();

		// Ejercicio 2
		System.out.println("\nEl empleado con mas clientes captados es " + e1.empleadoConMasClientes().getNombre()
				+ " (" + ((EmpleadoAComision) e1.empleadoConMasClientes()).getCantClientesCaptados() + " clientes)");

	}

}
