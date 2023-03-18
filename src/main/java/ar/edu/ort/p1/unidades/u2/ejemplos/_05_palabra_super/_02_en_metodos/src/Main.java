package ar.edu.ort.p1.unidades.u2.ejemplos._05_palabra_super._02_en_metodos.src;

/**
 * Si solo llamamos al metodo message(), entonces se invoca el message() de la
 * clase actual, pero con el uso de la palabra clave super, tambien se puede
 * invocar a message() de la superclase.
 * 
 * @author ihsanch
 *
 */
public class Main {
	public static void main(String args[]) {
		Estudiante estudiante = new Estudiante();
		estudiante.display(); // Llamando a display() de Estudiante...

	}
}