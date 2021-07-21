package ar.edu.ort.p1.extra.muestraenums.muestra_enums_con_atributos_java;

/**
 *
 * @author Charly Cimino Aprend� m�s Java en mi canal:
 *         https://www.youtube.com/c/CharlyCimino Encontr� m�s c�digo en mi repo
 *         de GitHub: https://github.com/CharlyCimino
 */
public class Principal {

	public static void main(String[] args) {
		Continente[] continentes = Continente.values();
		for (int i = 0; i < continentes.length; i++) {
			System.out.println(continentes[i].densidadPoblacion());
		}
	}
}