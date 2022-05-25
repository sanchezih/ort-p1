package ar.edu.ort.p1.unidades.u5.practico05.ej01_libros_dvds.src;

public class Main {

	public static void main(String[] args) {

		PilaDeLibros pilaDeLibros = new PilaDeLibros();
		pilaDeLibros.push(new Libro("978-987-86-4331-1", 319));
		pilaDeLibros.push(new Libro("978-987-3832-50-5", 285));
		pilaDeLibros.push(new Libro("978-987-1949-68-7", 292));

		/*----------------------------------------------------------------------------*/

		PilaDeDVDs pilaDeDVDs = new PilaDeDVDs();
		pilaDeDVDs.push(new DVD("Verbatim", true));
		pilaDeDVDs.push(new DVD("Sony", false));
		pilaDeDVDs.push(new DVD("TDK", true));

		/*----------------------------------------------------------------------------*/

		Empleado empleado = new Empleado("Juan");
		System.out.println("La cantidad de DVDs rayados es: " + empleado.cantDVDsRayados(pilaDeDVDs));
		System.out.println("El promedio es: " + empleado.paginasPromedio(pilaDeLibros));

	}

}
