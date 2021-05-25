package edu.ort.u5.ejemplos.generics._03_metodos_genericos;

public class Main {

	public static void main(String[] args) {

		String nombres[] = { "Maria", "Jose", "Rosa" };
		System.out.println(MisMatrices.getElementos(nombres));

		Empleado e1 = new Empleado("Ana");
		Empleado e2 = new Empleado("Luis");
		Empleado e3 = new Empleado("Ruben");
		Empleado e4 = new Empleado("Manuel");
		Empleado empleados[] = { e1, e2, e3, e4 };

		System.out.println(MisMatrices.getElementos(empleados));

		// Ejemplo con objetos de tipo String
		System.out.println(MisMatrices.getElementoMenor(nombres));

		// Ejemplo con objetos de tipo Integer
		Integer int1 = new Integer(1010);
		Integer int2 = new Integer(569);
		Integer int3 = new Integer(420);

		Integer enteros[] = { int1, int2, int3 };

		System.out.println(MisMatrices.getElementoMenor(enteros));

	}

}
