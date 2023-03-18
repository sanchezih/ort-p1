package ar.edu.ort.p1.unidades.u3.practico03.ej11_comercio_informatico.src;

public interface Facturable {

	/**
	 * Si una interface contiene atributos, todos deben ser public static final, es
	 * decir, campos de clase, publicos y constantes.
	 * 
	 * No hace falta incluir las palabras public static final porque todos los
	 * campos seran tratados como si llevaran estas palabras.
	 * 
	 * Recordemos que static equivalia a "de clase" y final a "constante".
	 */
	public static final int IVA = 21;
	// int IVA = 21;

	/**
	 * Todo metodo es abstracto y publico aunque no este declarado como public
	 * abstract
	 */
	public abstract double getMontoFacturacion();
	// double getMontoFacturacion();
}
