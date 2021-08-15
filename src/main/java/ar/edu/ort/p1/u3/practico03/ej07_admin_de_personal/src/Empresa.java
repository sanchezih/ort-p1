package ar.edu.ort.p1.u3.practico03.ej07_admin_de_personal.src;

import java.util.ArrayList;

public class Empresa {
	private ArrayList<Empleado> listaDeEmpleados = new ArrayList<Empleado>();

	public Empresa(ArrayList<Empleado> listaDeEmpleados) {
		super();
		this.listaDeEmpleados = listaDeEmpleados;
	}

	public ArrayList<Empleado> getListaDeEmpleados() {
		return listaDeEmpleados;
	}

	public void setListaDeEmpleados(ArrayList<Empleado> listaDeEmpleados) {
		this.listaDeEmpleados = listaDeEmpleados;
	}

	public void mostrarSalarios() {
		for (Empleado e : this.listaDeEmpleados) {
			e.mostrarDatos();
		}
	}

	public Empleado empleadoConMasClientes() {
		EmpleadoAComision ecmc = null;
		int maxClientes = -1;
		for (Empleado e : this.listaDeEmpleados) {
			if (e instanceof EmpleadoAComision) {
				EmpleadoAComision eac = (EmpleadoAComision) e;
				int cantCli = eac.getCantClientesCaptados();
				if (cantCli > maxClientes) {
					maxClientes = cantCli;
					ecmc = eac;
				}
			}
		}
		return ecmc;
	}
}