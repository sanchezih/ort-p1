package ar.edu.ort.p1.unidades.u1.ejemplos._enum._01_ejemplo_nivel_estudio.src;

import ar.edu.ort.p1.util.Consola;

/*-
 * Ver https://www.youtube.com/watch?v=HMOcwq5yXfs
 * Ver https://www.youtube.com/watch?v=-Q1f3eCPsfY
 * @author ihsanch
 *
 */
public class Main {

	public static void main(String[] args) {

		Empresa empresa = new Empresa();

		empresa.agregarPersona(new Persona("Pepe", "Fulano", NivelEstudio.SECUNDARIO));
		empresa.agregarPersona(new Persona("Maria", "Sultana", NivelEstudio.SECUNDARIO));
		empresa.agregarPersona(new Persona("Luis", "Mengano", NivelEstudio.TERCIARIO));
		empresa.agregarPersona(new Persona("Lito", "Garcia", NivelEstudio.SECUNDARIO));
		empresa.agregarPersona(new Persona("Matias", "Quilez", NivelEstudio.PRIMARIO));
		empresa.agregarPersona(new Persona("Rita", "Perez", NivelEstudio.UNIVERSITARIO));
		empresa.agregarPersona(new Persona("Alex", "Gomez", NivelEstudio.SECUNDARIO));
		empresa.agregarPersona(new Persona("Sara", "Jerez", NivelEstudio.SECUNDARIO));

		empresa.mostrarPorNivel(NivelEstudio.SECUNDARIO);

		System.out.println();

		/*----------------------------------------------------------------------------*/

		/* Metodos utiles */

		/* ordinal devuelve un int indicando en que orden se enumero esa constante */
		System.out.println(NivelEstudio.PRIMARIO.ordinal());
		System.out.println(NivelEstudio.UNIVERSITARIO.ordinal());
		System.out.println();

		/* Metodos para obtener el enum como cadena */
		System.out.println(NivelEstudio.PRIMARIO.name());
		System.out.println(NivelEstudio.PRIMARIO.toString());
		System.out.println();

		/*----------------------------------------------------------------------------*/

		/* Metodo estatico values, el cual devuelve un array del enum */
		NivelEstudio[] niveles = NivelEstudio.values();

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
		NivelEstudio.valueOf("PRIMARIO"); // Funciona porque es un valor esperado
		// NivelEstudio.valueOf("primario"); // Lanza IllegalArgumentException
	}
}
