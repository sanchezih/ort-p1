package edu.ort.p1.extra.muestraenums.muestra_metodos_enum_java;

/**
 *
 * @author Charly Cimino Aprendé más Java en mi canal:
 *         https://www.youtube.com/c/CharlyCimino Encontrá más código en mi
 *         repo de GitHub: https://github.com/CharlyCimino
 */
public class Principal {

	public static void main(String[] args) {
//        System.out.println(NivelEstudio.PRIMARIO.ordinal());
//        System.out.println(NivelEstudio.PRIMARIO.toString());

//        NivelEstudio[] niveles = NivelEstudio.values();
//        for (int i = 0; i < niveles.length; i++) {
//            System.out.println((i + 1) + ") " + niveles[i]);
//        }
//        int opcUsuario = Consola.leerEntero("Ingrese su nivel de estudios: ");
//        System.out.println("Usted eligió " + niveles[opcUsuario - 1]);
		NivelEstudio.valueOf("PRIMARIO"); // Funciona
		// NivelEstudio.valueOf("primario"); // Lanza IllegalArgumentException
	}
}
