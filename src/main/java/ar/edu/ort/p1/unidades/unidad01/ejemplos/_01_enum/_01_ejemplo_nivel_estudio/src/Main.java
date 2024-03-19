package ar.edu.ort.p1.unidades.unidad01.ejemplos._01_enum._01_ejemplo_nivel_estudio.src;

import ar.edu.ort.p1.util.Consola;

public class Main {

	public static void main(String[] args) {

		Empresa empresa = new Empresa();

		empresa.agregarPersona(new Persona("Pepe", "Fulano", NivelDeEstudio.SECUNDARIO));
		empresa.agregarPersona(new Persona("Maria", "Sultana", NivelDeEstudio.SECUNDARIO));
		empresa.agregarPersona(new Persona("Luis", "Mengano", NivelDeEstudio.TERCIARIO));
		empresa.agregarPersona(new Persona("Lito", "Garcia", NivelDeEstudio.SECUNDARIO));
		empresa.agregarPersona(new Persona("Matias", "Quilez", NivelDeEstudio.PRIMARIO));
		empresa.agregarPersona(new Persona("Rita", "Perez", NivelDeEstudio.UNIVERSITARIO));
		empresa.agregarPersona(new Persona("Alex", "Gomez", NivelDeEstudio.SECUNDARIO));
		empresa.agregarPersona(new Persona("Sara", "Jerez", NivelDeEstudio.SECUNDARIO));

		empresa.mostrarPorNivel(NivelDeEstudio.SECUNDARIO); // Se puede cambiar

		System.out.println();

		/*----------------------------------------------------------------------------*/

		// Metodos utiles

		// ordinal devuelve un int indicando en que orden se enumero esa constante
		System.out.println(NivelDeEstudio.PRIMARIO.ordinal());
		System.out.println(NivelDeEstudio.UNIVERSITARIO.ordinal());
		System.out.println();

		// Metodos para obtener el enum como cadena
		System.out.println(NivelDeEstudio.PRIMARIO.name());
		System.out.println(NivelDeEstudio.PRIMARIO.toString());
		System.out.println();

		/*----------------------------------------------------------------------------*/

		// Metodo estatico values, el cual devuelve un array del enum
		NivelDeEstudio[] niveles = NivelDeEstudio.values();

		for (int i = 0; i < niveles.length; i++) {
			System.out.println((i + 1) + ") " + niveles[i]);
		}

		System.out.println();

		/*----------------------------------------------------------------------------*/

		/*
		 * Al tener los enum en un array, puedo hacer que el usuario ingrese
		 * directamente el numero
		 */
		int opcUsuario = Consola.leerEntero("Ingrese su nivel de estudios: ");
		System.out.println("Usted eligio " + niveles[opcUsuario - 1]);

		/*----------------------------------------------------------------------------*/

		/* valueOf nos permitira, en base a una cadena, mostrar el nivel de estudios */
		NivelDeEstudio.valueOf("PRIMARIO"); // Funciona porque es un valor esperado
		// NivelEstudio.valueOf("primario"); // Lanza IllegalArgumentException
	}
}
