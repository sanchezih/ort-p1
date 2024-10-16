package ar.edu.ort.p1.unidades.unidad05.practico05.ej08_centro_de_vacunacion.src;

public class Main {

	public static void main(String[] args) {

		CentroDeVacunacion centro = new CentroDeVacunacion();

		// Agrego personas a la cola 0
		centro.agregarPersonaEnCola(0, new Persona("00000001", "Jose Primero", 30, false));
		centro.agregarPersonaEnCola(0, new Persona("00000002", "Marcos Segundo", 30, true));
		centro.agregarPersonaEnCola(0, new Persona("00000003", "Tomas Tercero", 30, false));
		centro.agregarPersonaEnCola(0, new Persona("00000004", "Martin Cuarto", 76, false));
		centro.agregarPersonaEnCola(0, new Medico("00000005", "Viviana Quinta", 76, false, "M0023"));
		centro.agregarPersonaEnCola(0, new Educador("00000006", "Ayelen Sexta", 76, false, NivelDeEducacion.PRIMARIO));

		centro.mostrarUnaCola(0);

		// Agrego personas a la cola 1
		centro.agregarPersonaEnCola(1, new Persona("00000007", "Maria Primera", 30, true));
		centro.agregarPersonaEnCola(1, new Persona("00000008", "Marta Segunda", 31, false));
		centro.agregarPersonaEnCola(1, new Medico("00000009", "Sofia Tercera", 35, false, "M7779"));
		centro.agregarPersonaEnCola(1, new Educador("00000010", "Catalina Cuarta", 65, false, NivelDeEducacion.SECUNDARIO));

		centro.mostrarUnaCola(1);

		// Agrego personas a la cola 2
		centro.agregarPersonaEnCola(2, new Persona("00000011", "Agustin Primero", 29, false));
		centro.agregarPersonaEnCola(2, new Persona("00000012", "Emiliano Segundo", 30, false));
		centro.agregarPersonaEnCola(2, new Medico("00000013", "Yolanda Tercera", 55, false, "M0882"));
		centro.agregarPersonaEnCola(2, new Educador("00000014", "Agostina Cuarta", 45, false, NivelDeEducacion.SECUNDARIO));
		centro.agregarPersonaEnCola(2, new Educador("00000015", "Angelica Quinta", 45, false, NivelDeEducacion.INICIAL));
		centro.agregarPersonaEnCola(2, new Educador("00000016", "Graciela Sexta", 45, false, NivelDeEducacion.INICIAL));

		centro.mostrarUnaCola(2);

		System.out.println();

		/*----------------------------------------------------------------------------*/

		// Test ejercicio B
		centro.mostrarColaPorPrioridadYOrden();

	}

}
