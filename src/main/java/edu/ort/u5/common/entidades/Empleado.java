package edu.ort.u5.common.entidades;

import java.util.Objects;

/**
 * The class Employee is just to show that we can store any kind of object
 * inside the list, it could be objects of any other thing like String,
 * Integer...
 */
public class Empleado {

	String nombre;
	Integer edad;
	String puesto;

	public Empleado(String nombre, Integer edad, String puesto) {
		this.nombre = nombre;
		this.edad = edad;
		this.puesto = puesto;
	}

	@Override
	public String toString() {
		return this.nombre;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Empleado other = (Empleado) obj;
		return Objects.equals(edad, other.edad) && Objects.equals(nombre, other.nombre)
				&& Objects.equals(puesto, other.puesto);
	}
}
