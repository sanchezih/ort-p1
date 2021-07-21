package ar.edu.ort.p1.u5.ejemplos.generics._04_generics_herencia;

public class Jefe extends Empleado {

	public Jefe(String nombre, int edad, double salario) {
		super(nombre, edad, salario);
	}

	double incentivo(double incentivo) {
		return incentivo;
	}

}
