package ar.edu.ort.p1.unidades.unidad03.ejemplos._02_overriding.ejemplo02.src;

/**
 * En esta version de Deportista, se invoca la version de superclase de
 * mostrar() dentro de la version de la subclase. Esto permite que se muestren
 * todas las variables de instancia.
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
		Deportista deportista = new Deportista("Felipe", "Vargas", 829);
		deportista.mostrar(); // Esto llama a mostrar() en Deportista
	}
}