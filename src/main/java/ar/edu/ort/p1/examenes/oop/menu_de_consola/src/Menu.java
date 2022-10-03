package ar.edu.ort.p1.examenes.oop.menu_de_consola.src;

import java.util.ArrayList;

import ar.edu.ort.p1.util.Consola;

public class Menu implements Mostrable, Ejecutable {

	private String titulo;
	private ArrayList<OpcionDeMenu> opciones;
	private OpcionDeSalida opcionDeSalida;

	/*----------------------------------------------------------------------------*/

	/**
	 * Ejercicio C: Implementar el constructor de la clase Menu
	 * 
	 * @param titulo
	 */
	public Menu(String titulo) {
		this.setTitulo(titulo);
		this.opciones = new ArrayList<>();
		this.opcionDeSalida = new OpcionDeSalida();
	}

	/*----------------------------------------------------------------------------*/

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	/**
	 * 
	 */
	@Override
	public void mostrar() {
		System.out.println("-- " + this.titulo + " --");

		for (OpcionDeMenu opcionDeMenu : opciones) {
			opcionDeMenu.mostrar();
		}
		this.opcionDeSalida.mostrar();

	}

	/**
	 * Ejercicio Da: Metodo registrar(...) de Menu
	 * 
	 * @param op
	 * @return
	 */
	public boolean registrar(OpcionDeMenu op) {
		// Solo agrego cosas que NO sean OpcionDeSalida ya que este se guarda aparte
		if (!(op instanceof OpcionDeSalida)) {
			this.opciones.add(op);
		}
		return !(op instanceof OpcionDeSalida);
	}

	/**
	 * Ejercicio Db: Metodo ejecutar(...) de Menu
	 */
	@Override
	public void ejecutar() {

		char opcionSeleccionada;
		OpcionDeMenu opcion = null;

		this.mostrar();

		do {
			System.out.println("Ingrese la opcion deseada: ");
			opcionSeleccionada = Consola.leerCaracter();
			opcion = buscarOpcion(opcionSeleccionada);

		} while (opcionSeleccionada != OpcionDeSalida.CARACTER_PREDEF && opcion == null);

		// Si el caracter seleccionado no es el de salida, se ejecuta submenu

		if (opcionSeleccionada == OpcionDeSalida.CARACTER_PREDEF) {
			opcion = this.opcionDeSalida;
		}
		opcion.ejecutar();

	}

	/**
	 * 
	 * @param opcion
	 * @return
	 */
	private OpcionDeMenu buscarOpcion(char opcion) {
		int i = 0;
		OpcionDeMenu actual = null;
		OpcionDeMenu result = null;

		while (i < this.opciones.size() && result == null) {
			actual = this.opciones.get(i);
			if (actual.getCaracter() == opcion) {
				result = actual;
			} else {
				i++;
			}
		}
		return result;
	}

}
