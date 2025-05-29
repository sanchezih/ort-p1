package ar.edu.ort.p1.examenes._02_ds.gimnasio.src;

public class Aerobica extends Maquina {

	private TipoAerobica tipo;

	/*----------------------------------------------------------------------------*/

	/**
	 * 
	 * @param codigo
	 * @param tipo
	 */
	public Aerobica(String codigo, TipoAerobica tipo) {
		super(codigo);
		this.tipo = tipo;
	}

	/*----------------------------------------------------------------------------*/

	@Override
	public boolean puedeAnotarse(Socio socio) {
		return super.puedeAnotarse(socio) && socio.getEdad() >= tipo.getEdadMinima();
	}

}
