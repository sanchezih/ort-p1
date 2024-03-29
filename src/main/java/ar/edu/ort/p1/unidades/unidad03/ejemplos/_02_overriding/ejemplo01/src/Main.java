package ar.edu.ort.p1.unidades.unidad03.ejemplos._02_overriding.ejemplo01.src;

/**
 * Cuando se llama a un metodo anulado dentro de una subclase, siempre se
 * referira a la version de ese metodo definida por la subclase.
 * 
 * Cuando se invoca mostrar() en un objeto de tipo Deportista, se utiliza la
 * version mostrar() definida en Deportista. Es decir, la version mostrar()
 * dentro de Deportista anula la version declarada en Persona. Si desea acceder
 * a la version de la superclase de un metodo anulado, puede hacerlo utilizando
 * super.
 * 
 * @author ihsanch
 *
 */
public class Main {
	public static void main(String[] args) {
		Deportista deportista = new Deportista("Maria", "Perez", 541);
		deportista.mostrar(); // Esto llama a mostrar() en Deportista
	}
}