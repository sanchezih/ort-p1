package ar.edu.ort.p1.examenes.oop.menu_de_consola.src;

public class OpcionAccesoAMenu extends OpcionDeMenu {

	private Menu subMenu;

	public OpcionAccesoAMenu(String descripcion, char caracter, Menu subMenu) {
		super(descripcion, caracter);
		setSubMenu(subMenu);
	}

	public void setSubMenu(Menu subMenu) {
		if (subMenu == null)
			throw new RuntimeException("Debe existir un Menu para esta opcion de acceso a Menu");
		this.subMenu = subMenu;
	}

	@Override
	public void ejecutar() {
		this.subMenu.ejecutar();
	}

}
