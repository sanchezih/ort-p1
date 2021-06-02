package edu.ort.p1.u5.ejemplos.generics._04_generics_herencia;

public class Main {

	public static void main(String[] args) {

		/* SIN CLASES GENERICAS */
		// Tener en cuenta que para Java conoce la relacion entre Empleado y Jefe
		// Empleado Administrativa = new Empleado("Elena", 45, 1500);
		// Jefe DirectoraComercial = new Jefe("Ana", 47, 3500);
		// Empleado nuevoEmpleado = DirectoraComercial;

		/* CON CLASES GENERICAS */
		// Tener en cuenta que para Java no existe relacion entre Clase<Empleado> y
		// Clase<Jefe>

		MiGenerica<Empleado> Administrativa = new MiGenerica<Empleado>();
		MiGenerica<Jefe> DirectoraComercial = new MiGenerica<Jefe>();
		// MiGenerica<Empleado> nuevoEmpleado = DirectoraComercial;

		MiGenerica.imprimirTrabajador(Administrativa);
		MiGenerica.imprimirTrabajadorConComodin(DirectoraComercial);

	}

}
