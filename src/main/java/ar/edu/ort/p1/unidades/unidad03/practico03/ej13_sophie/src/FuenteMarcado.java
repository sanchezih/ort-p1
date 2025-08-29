package ar.edu.ort.p1.unidades.unidad03.practico03.ej13_sophie.src;

public class FuenteMarcado extends Fuente {

	public static final int MARCADO_DIVISION = 450;
	private double tamanioArchivoKB;
	private TipoMarcado tipo;

	/*----------------------------------------------------------------------------*/

	public FuenteMarcado(String nombre, String path, double tamanioArchivoKB, TipoMarcado tipo) {
		super(nombre, path);
		this.tamanioArchivoKB = tamanioArchivoKB;
		this.tipo = tipo;
	}

	/*----------------------------------------------------------------------------*/

	/**
	 * Ejercicio B: Realizar los metodos indiceCalidad de las clases calificables.
	 */
	@Override
	public double indiceCalidad() {
		return MARCADO_DIVISION / tamanioArchivoKB;
	}

}
