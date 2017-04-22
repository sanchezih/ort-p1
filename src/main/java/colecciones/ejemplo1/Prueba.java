package colecciones.ejemplo1;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class Prueba {

	public static void main(String[] args) {

		// una collection no tiene tamanio inicial
		Collection lista = new ArrayList();
		List otraLista = new LinkedList();

		Collection conjunto = new HashSet();
		Set otroConjunto = new TreeSet();

		// voy a agregar empleados
		String emp1 = "Nombre empleado 1";
		String emp2 = "Nombre empleado 2";
		String emp3 = "Nombre empleado 3";
		String emp4 = "Nombre empleado 4";
		String emp5 = "Nombre empleado 5";
		String emp6 = "Nombre empleado 6";

		// se agregan a las colecciones con el metodo "add"
		lista.add(emp1);
		lista.add(emp2);
		lista.add(emp3);
		lista.add(null);
		lista.add(emp1);// agregue el empleado 1 nuevamente

		otraLista.add(emp3);
		otraLista.add(emp4);

		conjunto.add(emp1);
		conjunto.add(emp5);
		conjunto.add(null); // HashSet permite agregarle null

		otroConjunto.add(emp6);
		otroConjunto.add(emp2);
		// otroConjunto.add(null); // TreeSet NO permite agregarle null
		otroConjunto.add(emp6);// no tiene efecto, pues un conjunto no admite
								// elementos repetidos

		/*
		 * voy a recorrer el arreglo y mostrar lo que hay en cada posicion.
		 * 
		 */

		// metodo 1, con el for conocido...
		for (int i = 0; i < lista.size(); i++) {
			// System.out.println(lista...args ? ..) que va? no se puede. Con
			// Collection, metodo 2
		}
		for (int i = 0; i < conjunto.size(); i++) {
			// System.out.println(lista...args ? ..) que va? no se puede. Con
			// Collection, metodo 2
		}

		// metodo 2, con Iterator
		System.out.println("lista");
		for (Iterator i = lista.iterator(); i.hasNext();) {
			String e = (String) i.next();
			System.out.println(e);
		}

		// metodo 1-Bis. List
		System.out.println("otraLista");
		for (int i = 0; i < otraLista.size(); i++) {
			System.out.println(otraLista.get(i));
		}

		// metodo 2-Bis. Util para Set
		System.out.println("otroConjunto");
		for (Iterator i = otroConjunto.iterator(); i.hasNext();) {
			String e = (String) i.next();
			System.out.println(e);
		}

	}
}
