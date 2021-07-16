package edu.ort.p1.u5.practico05.ej08_centro_vacunacion.src;

public class Main {
	public static void main(String[] args) {

		CentroVacunacion centro = new CentroVacunacion();

		ColaDePersonas cola1 = new ColaDePersonas();
		cola1.add(new Persona("11111111", "Jose", 30, false));
		cola1.add(new Persona("11111111", "Marcos", 30, true));
		cola1.add(new Persona("11111111", "Tomas", 30, false));
		cola1.add(new Persona("11111111", "Martin", 76, false));
		cola1.add(new Medico("11111111", "Viviana", 76, false, "M0023"));
		cola1.add(new Educador("11111111", "Ayelen", 76, false, NivelEducacion.PRIMARIO));

		ColaDePersonas cola2 = new ColaDePersonas();
		cola2.add(new Persona("11111111", "Maria", 30, true));
		cola2.add(new Persona("11111111", "Marta", 31, false));
		cola2.add(new Medico("11111111", "Sofia", 35, false, "M7779"));
		cola2.add(new Educador("11111111", "Catalina", 65, false, NivelEducacion.SECUNDARIO));

		ColaDePersonas cola3 = new ColaDePersonas();
		cola3.add(new Persona("11111111", "Agustin", 30, true));
		cola3.add(new Persona("11111111", "Emiliano", 30, false));
		cola3.add(new Medico("11111111", "Yolanda", 55, false, "M0882"));
		cola3.add(new Educador("11111111", "Agostina", 45, false, NivelEducacion.SECUNDARIO));
		cola3.add(new Educador("11111111", "Angelica", 45, false, NivelEducacion.INICIAL));
		cola3.add(new Educador("11111111", "Graciela", 45, false, NivelEducacion.INICIAL));

		centro.cargarColas(cola1, cola2, cola3);

		/*----------------------------------------------------------------------------*/

		/**
		 * La explotacion del metodo obtenerColaPorPrioridadYOrden el cual debe devolver
		 * una nueva y unica cola con todos los vacunables a la espera, pero ordenados
		 * por prioridad, dejando las colas anteriores vacias. Ante igualdad en la
		 * prioridad, se desempata por orden de llegada en la cola correspondiente. Si
		 * persiste el empate, es indistinto quien va primero.
		 */

		centro.mostrarColaPorPrioridadYOrden();
	}

}
