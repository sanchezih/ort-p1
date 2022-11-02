package ar.edu.ort.p1.examenes.oop.menu_de_consola.src;

public class OpcionDeSalida extends OpcionDeMenu {

	private final static String DESCRIPCION_PREDEF = "SALIR";
	public final static char CARACTER_PREDEF = 'X';

	/*----------------------------------------------------------------------------*/

	/**
	 * 
	 */
	public OpcionDeSalida() {
		super(DESCRIPCION_PREDEF, CARACTER_PREDEF);
	}

	/*----------------------------------------------------------------------------*/

	@Override
	public void ejecutar() {
		// TODO Por ahora queda vacio segun enunciado
	}

}
