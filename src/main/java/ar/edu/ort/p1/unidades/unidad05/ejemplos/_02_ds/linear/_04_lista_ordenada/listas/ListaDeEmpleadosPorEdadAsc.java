package ar.edu.ort.p1.unidades.unidad05.ejemplos._02_ds.linear._04_lista_ordenada.listas;

import ar.edu.ort.p1.unidades.unidad05.ejemplos._02_ds.linear._04_lista_ordenada.entidades.Empleado;
import ar.edu.ort.tp1.u5.tda.impl.ListaOrdenadaNodos;

public class ListaDeEmpleadosPorEdadAsc extends ListaOrdenadaNodos<Integer, Empleado> {

	/**
	 * Este metodo es utilizado para comparar dos elementos entre si.
	 * 
	 * Es invocado al momento de insertar un elemento en la lista.
	 * 
	 * Premisas:
	 * 
	 * El 1er parametro, es el elemento nuevo, el que se quiere insertar en la
	 * lista.
	 * 
	 * El 2do parametro, es el elemento que extraigo de la estructura.
	 * 
	 * Si trabajo con una lista ordenada ASC: param1 - param2.
	 * 
	 * Si trabajo con una lista ordenada DESC: param2 - param1
	 * 
	 * Si el metodo devuelve...
	 * 
	 * Cero (0): Se asume que los elementos son iguales.
	 * 
	 * Negativo (-): El elemento nuevo quedara a la izquierda del que se saco de la
	 * estructura para comparar.
	 * 
	 * Positivo (+): El elemento nuevo quedara a la derecha del que se saco de la
	 * estructura para comparar.
	 */
	@Override
	public int compare(Empleado empleado1, Empleado empleado2) {

		int edadEmpleado1 = empleado1.getEdad();
		int edadEmpleado2 = empleado2.getEdad();

		int res = edadEmpleado1 - edadEmpleado2;

		return res;
	}

	/**
	 * Tener en cuenta: Como la lista es ascendente, la implementacion del
	 * compareByKey la hago clave-claveDelObjeto. Si hubiese sido descendente,
	 * deberia haber hecho claveDelObjeto-clave
	 */
	@Override
	public int compareByKey(Integer clave, Empleado empleado) {

		int edadEmpleado = empleado.getEdad();

		return clave - edadEmpleado;
	}

}
