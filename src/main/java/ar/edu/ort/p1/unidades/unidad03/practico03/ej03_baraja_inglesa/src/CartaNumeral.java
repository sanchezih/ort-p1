package ar.edu.ort.p1.unidades.unidad03.practico03.ej03_baraja_inglesa.src;

public class CartaNumeral extends CartaConPalo {

	private int numero;

	/*----------------------------------------------------------------------------*/

	public CartaNumeral(int numero, Palo palo) {
		super(palo);
		this.numero = numero;
	}

	/*----------------------------------------------------------------------------*/

	@Override
	public String getRepresentacion() {
		return numero + super.getRepresentacion();
	}
}