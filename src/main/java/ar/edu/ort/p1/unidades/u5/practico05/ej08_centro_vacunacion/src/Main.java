package ar.edu.ort.p1.unidades.u5.practico05.ej08_centro_vacunacion.src;

public class Main {
	public static void main(String[] args) {

		CentroVacunacion centro = new CentroVacunacion();

		// Agrego personas a la cola 0
		centro.agregarEnCola(0, new Persona("11111111", "Jose", 30, false));
		centro.agregarEnCola(0, new Persona("11111111", "Marcos", 30, true));
		centro.agregarEnCola(0, new Persona("11111111", "Tomas", 30, false));
		centro.agregarEnCola(0, new Persona("11111111", "Martin", 76, false));
		centro.agregarEnCola(0, new Medico("11111111", "Viviana", 76, false, "M0023"));
		centro.agregarEnCola(0, new Educador("11111111", "Ayelen", 76, false, NivelEducacion.PRIMARIO));

		// Agrego personas a la cola 1
		centro.agregarEnCola(1, new Persona("11111111", "Maria", 30, true));
		centro.agregarEnCola(1, new Persona("11111111", "Marta", 31, false));
		centro.agregarEnCola(1, new Medico("11111111", "Sofia", 35, false, "M7779"));
		centro.agregarEnCola(1, new Educador("11111111", "Catalina", 65, false, NivelEducacion.SECUNDARIO));

		// Agrego personas a la cola 2
		centro.agregarEnCola(2, new Persona("11111111", "Agustin", 29, false));
		centro.agregarEnCola(2, new Persona("11111111", "Emiliano", 30, false));
		centro.agregarEnCola(2, new Medico("11111111", "Yolanda", 55, false, "M0882"));
		centro.agregarEnCola(2, new Educador("11111111", "Agostina", 45, false, NivelEducacion.SECUNDARIO));
		centro.agregarEnCola(2, new Educador("11111111", "Angelica", 45, false, NivelEducacion.INICIAL));
		centro.agregarEnCola(2, new Educador("11111111", "Graciela", 45, false, NivelEducacion.INICIAL));

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
