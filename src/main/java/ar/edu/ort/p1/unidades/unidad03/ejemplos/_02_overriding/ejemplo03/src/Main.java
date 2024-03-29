package ar.edu.ort.p1.unidades.unidad03.ejemplos._02_overriding.ejemplo03.src;

/**
 * La version mostrar() en Deportista toma un parametro de cadena (String). Esto
 * hace que su firma sea diferente de la de Persona, que no toma parametros. Por
 * lo tanto, no se produce overriding (ocultacion de nombre).
 * 
 * @author ihsanch
 *
 */
public class Main {
	public static void main(String[] args) {
		Deportista deportista = new Deportista("Eduardo", "Abate", 551);
		deportista.mostrar("Bienvenido"); // Esto llama a mostrar() en Deportista
		deportista.mostrar(); // Esto llama a mostrar() en Persona
	}
}