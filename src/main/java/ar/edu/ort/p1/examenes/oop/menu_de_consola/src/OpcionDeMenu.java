package ar.edu.ort.p1.examenes.oop.menu_de_consola.src;

public abstract class OpcionDeMenu implements Mostrable, Ejecutable {

	private String descripcion;
	private char caracter;

	/*----------------------------------------------------------------------------*/

	/**
	 * 
	 * @param descripcion
	 * @param caracter
	 */
	public OpcionDeMenu(String descripcion, char caracter) {
		this.setDescripcion(descripcion);
		this.setCaracter(caracter);
	}

	/*----------------------------------------------------------------------------*/

	public char getCaracter() {
		return caracter;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public void setCaracter(char caracter) {
		this.caracter = caracter;
	}

	public void mostrar() {
		System.out.println(this.caracter + " - " + this.descripcion);
	}
}
