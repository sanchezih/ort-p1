package ar.edu.ort.p1.unidades.u5.practico05.ej08_centro_vacunacion.src;

public class Main {

	public static void main(String[] args) {

		CentroDeVacunacion centro = new CentroDeVacunacion();

		// Agrego personas a la cola 0
		centro.agregarEnCola(0, new Persona("00000001", "Jose Primero", 30, false));
		centro.agregarEnCola(0, new Persona("00000002", "Marcos Segundo", 30, true));
		centro.agregarEnCola(0, new Persona("00000003", "Tomas Tercero", 30, false));
		centro.agregarEnCola(0, new Persona("00000004", "Martin Cuarto", 76, false));
		centro.agregarEnCola(0, new Medico("00000005", "Viviana Quinta", 76, false, "M0023"));
		centro.agregarEnCola(0, new Educador("00000006", "Ayelen Sexta", 76, false, NivelDeEducacion.PRIMARIO));

		// Agrego personas a la cola 1
		centro.agregarEnCola(1, new Persona("00000007", "Maria Primera", 30, true));
		centro.agregarEnCola(1, new Persona("00000008", "Marta Segunda", 31, false));
		centro.agregarEnCola(1, new Medico("00000009", "Sofia Tercera", 35, false, "M7779"));
		centro.agregarEnCola(1, new Educador("00000010", "Catalina Cuarta", 65, false, NivelDeEducacion.SECUNDARIO));

		// Agrego personas a la cola 2
		centro.agregarEnCola(2, new Persona("00000011", "Agustin Primero", 29, false));
		centro.agregarEnCola(2, new Persona("00000012", "Emiliano Segundo", 30, false));
		centro.agregarEnCola(2, new Medico("00000013", "Yolanda Tercera", 55, false, "M0882"));
		centro.agregarEnCola(2, new Educador("00000014", "Agostina Cuarta", 45, false, NivelDeEducacion.SECUNDARIO));
		centro.agregarEnCola(2, new Educador("00000015", "Angelica Quinta", 45, false, NivelDeEducacion.INICIAL));
		centro.agregarEnCola(2, new Educador("00000016", "Graciela Sexta", 45, false, NivelDeEducacion.INICIAL));

		/*----------------------------------------------------------------------------*/

		// Test ejercicio B
		centro.mostrarColaPorPrioridadYOrden();

	}

}
