package ar.edu.ort.p1.unidades.u3.ejemplos.overriding.ejemplo03.src;

/**
 * La version mostrar() en B toma un parametro de cadena (String). Esto hace que
 * su firma sea diferente de la de A, que no toma parametros. Por lo tanto, no
 * se produce overriding (ocultacion de nombre).
 * 
 * @author ihsanch
 *
 */
public class Main {
	public static void main(String[] args) {
		B b = new B(1, 2, 3);
		b.mostrar("Esto es k: "); // Esto llama a mostrar() en B
		b.mostrar(); // Esto llama a mostrar() en A
	}
}