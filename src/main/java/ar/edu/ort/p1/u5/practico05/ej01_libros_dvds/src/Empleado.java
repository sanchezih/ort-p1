package ar.edu.ort.p1.u5.practico05.ej01_libros_dvds.src;

import ar.edu.ort.p1.common.PilaGenericaAL;
import edu.ort.tp1.u5.tda.Pila;
import edu.ort.tp1.u5.tda.nodos.PilaNodos;

public class Empleado {
	private String nombre;

	public Empleado(String nombre) {
		super();
		this.nombre = nombre;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	// Siempre trabajaremos con las interfaces, salvo cuando tengamos que instanciar
	public int cantDVDsRayados(Pila<DVD> pilaDVDs) {
		
		Pila<DVD> pilaAux = new PilaGenericaAL<DVD>(); /* Hago upcasting y utilizo otra impl de pila */
		int cantRayados = 0;

		while (!pilaDVDs.isEmpty()) {
			DVD elDVD = pilaDVDs.pop();
			pilaAux.push(elDVD);
			if (elDVD.isRayado()) {
				cantRayados++;
			}
		}
		while (!pilaAux.isEmpty()) {
			pilaDVDs.push(pilaAux.pop());
		}
		return cantRayados;
	}

	// Siempre trabajaremos con las interfaces, salvo cuando tengamos que instanciar
	public double paginasPromedio(Pila<Libro> pilaLibros) {
		
		Pila<Libro> pilaAux = new PilaNodos<Libro>(); // upcasting
		int cantLibros = 0;
		int acuPaginas = 0;
		double promedio = 0;

		while (!pilaLibros.isEmpty()) {
			Libro elLibro = pilaLibros.pop();
			pilaAux.push(elLibro);
			cantLibros++;
			acuPaginas += elLibro.getNroPaginas();
		}

		while (!pilaAux.isEmpty()) {
			pilaLibros.push(pilaAux.pop());
		}

		if (cantLibros > 0) {
			promedio = acuPaginas / (double) cantLibros;
		}
		return promedio;

	}

}
