package edu.ort.u5.ejemplos.generics._04_generics_herencia;

public class Main {

	public static void main(String[] args) {

		/* SIN CLASES GENERICAS */
		// Empleado Administrativa = new Empleado("Elena", 45, 1500);
		// Jefe DirectoraComercial = new Jefe("Ana", 47, 3500);
		// Empleado nuevoEmpleado = DirectoraComercial;

		/* CON CLASES GENERICAS */
		MiGenerica<Empleado> Administrativa = new MiGenerica<Empleado>();
		MiGenerica<Jefe> DirectoraComercial = new MiGenerica<Jefe>();
		// MiGenerica<Empleado> nuevoEmpleado = DirectoraComercial;

		MiGenerica.imprimirTrabajador(Administrativa);
		MiGenerica.imprimirTrabajadorConComodin(DirectoraComercial);

	}

}
