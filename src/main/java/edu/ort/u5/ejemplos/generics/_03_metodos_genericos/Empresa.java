package edu.ort.u5.ejemplos.generics._03_metodos_genericos;

import java.util.ArrayList;

public class Empresa {
	private String nombre;
	private ArrayList<Empleado> listaDeEmpleados = new ArrayList<Empleado>();
	private ArrayList<Automovil> flotaDeAutomoviles = new ArrayList<Automovil>();

	public Empresa(String nombre, ArrayList<Empleado> listaDeEmpleados) {
		super();
		this.nombre = nombre;
		this.listaDeEmpleados = listaDeEmpleados;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public ArrayList<Empleado> getListaDeEmpleados() {
		return listaDeEmpleados;
	}

	public void setListaDeEmpleados(ArrayList<Empleado> listaDeEmpleados) {
		this.listaDeEmpleados = listaDeEmpleados;
	}

	public ArrayList<Automovil> getFlotaDeAutomoviles() {
		return flotaDeAutomoviles;
	}

	public void setFlotaDeAutomoviles(ArrayList<Automovil> flotaDeAutomoviles) {
		this.flotaDeAutomoviles = flotaDeAutomoviles;
	}

	public void mostrarNomina(ArrayList<Empleado> empleados) {
		for (Empleado e : empleados) {
			System.out.println(e.toString());
		}
	}

	public void mostrarFlota(ArrayList<Automovil> autos) {
		for (Automovil a : autos) {
			System.out.println(a.toString());
		}
	}
}
