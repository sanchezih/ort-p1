package ar.edu.ort.p1.unidades.u3.ejemplos.overriding.ejemplo02.src;

/**
 * En esta version de B, se invoca la version de superclase de mostrar() dentro
 * de la version de la subclase. Esto permite que se muestren todas las
 * variables de instancia.
 * 
 * Aqui, super.mostrar() llama a la version superclase de mostrar(). La
 * anulacion del metodo ocurre solo cuando las firmas de los dos metodos son
 * identicas. Si no lo son, entonces los dos metodos estan simplemente
 * sobrecargados.
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