package colecciones.ejemplo2;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class Empresa {

	public static void main(String[] args) {
		Collection<Empleado> colleccionEmpleados = new ArrayList<Empleado>(5);// tamanio
																				// inicial

		List<Empleado> empleados = new ArrayList<Empleado>(10);

		// pongo en la coleccion algunos empleados
		Empleado e1 = new Empleado("nombre empleado 1");
		Empleado e2 = new Empleado("nombre empleado 2");
		Empleado e3 = new Empleado("nombre empleado 3");

		empleados.add(e1);
		empleados.add(e2);
		empleados.add(e3);
		empleados.add(new Empleado("nombre empleado 4"));

		// otro caso
		colleccionEmpleados.add(e1);
		colleccionEmpleados.add(e2);
		colleccionEmpleados.add(e3);
		colleccionEmpleados.add(new Empleado("nombre empleado 4"));

		for (int indiceEmpleado = 0; indiceEmpleado < empleados.size(); indiceEmpleado++) {
			// IMPLEMENTANDO toString esto anda perfecto, muestra "El nombre es:
			// nombnre empleado 1"
			// despues "El nombre es: nombnre empleado 2", etc etc
			System.out.println("En la posicion (" + indiceEmpleado + ") hay ->" + empleados.get(indiceEmpleado));

			// No anda... xq es Collection
			// System.out.println("En la posicion [" + indiceEmpleado + "] hay
			// -->" + coleccionEmpleados.get(indiceEmpleado));
		}
		// la ultima posiciones va aimprimir la palabra "null"

		// Que pasa si quiero "BORRAR" lo que hay en la posicion 2? (tercer lugar)
		
		System.out.println("remuevo:" + empleados.remove(3));// en esa se borra,
																// al recorrer
																// la lista no
																// se muestra
		// empleados.remove(31);//compila, pero NO ANDA, esta fuera de rango...

		// no anda, xq es Collection
		// colleccionEmpleados.remove(3);

		// puedo "PISAR" lo que habia en una posicion, con otra cosa...
		empleados.add(1, new Empleado("Empleado nuevo1"));

		// imprimo resultados (para verlo, comentar las lineas
		for (int i = 0; i < empleados.size(); i++) {
			System.out.println("for comun:" + empleados.get(i));// recordar
																// posicion (3),
																// no se va a
																// mostrar y la
																// posicion (1)
																// esta el nuevo
		}
		// ver la diferencia usando Iterator o foreach
		for (Empleado empleado : empleados) {
			System.out.println("forach" + empleado);
		}
		for (Empleado empleado : colleccionEmpleados) {
			System.out.println("otro foreach" + empleado);
		}
	}

}
