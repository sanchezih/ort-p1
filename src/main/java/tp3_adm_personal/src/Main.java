package tp3_adm_personal.src;

import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {

		ArrayList<Empleado> listaDeEmpleados = new ArrayList<Empleado>();
		Empleado ec1 = new EmpleadoAComision(31507904, "Maria", "Perez", 2018, 22);
		Empleado ec2 = new EmpleadoAComision(31293830, "Ignacio", "Sanchez", 2015, 23);
		Empleado ef1 = new EmpleadoASalarioFijo(31293830, "Julia", "Rossi", 2016);

		listaDeEmpleados.add(ec1);
		listaDeEmpleados.add(ec2);
		listaDeEmpleados.add(ef1);

		Empresa e1 = new Empresa(listaDeEmpleados);

		// Ejercicio 1
		e1.mostrarSalarios();

		// Ejercicio 2
		System.out.println("\nEl empleado con mas clientes captados es " + e1.empleadoConMasClientes().getNombre()
				+ " (" + ((EmpleadoAComision) e1.empleadoConMasClientes()).getCantClientesCaptados() + " clientes)");

	}

}
