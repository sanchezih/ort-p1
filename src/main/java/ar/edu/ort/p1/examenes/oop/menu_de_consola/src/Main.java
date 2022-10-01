package ar.edu.ort.p1.examenes.oop.menu_de_consola.src;

public class Main {

	public static void main(String[] args) {
	
		Menu menu = new Menu("Principal");

		menu.registrar(new OpcionAccesoAMenu("Acceso a Submenu 1", '1', new Menu("Secundario 1")));
		menu.registrar(new OpcionAccesoAMenu("Acceso a Submenu 2", '2', new Menu("Secundario 2")));

		menu.ejecutar();

	}

}
