package ar.edu.ort.p1.unidades.u3.ejemplos._02_overriding.ejemplo01.src;

/**
 * Cuando se llama a un metodo anulado dentro de una subclase, siempre se
 * referira a la version de ese metodo definida por la subclase.
 * 
 * Cuando se invoca mostrar() en un objeto de tipo B, se utiliza la version
 * mostrar() definida en B. Es decir, la version mostrar() dentro de B anula la
 * version declarada en A. Si desea acceder a la version de la superclase de un
 * metodo anulado, puede hacerlo utilizando super.
 * 
 * @author ihsanch
 *
 */
public class Main {
	public static void main(String[] args) {
		B b = new B(1, 2, 3);
		b.mostrar(); // Esto llama a mostrar() en B
	}
}