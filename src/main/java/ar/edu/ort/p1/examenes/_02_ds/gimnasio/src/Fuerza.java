package ar.edu.ort.p1.examenes._02_ds.gimnasio.src;

public class Fuerza extends Maquina {

	private int pesoMaximo;

	/*----------------------------------------------------------------------------*/

	public Fuerza(String codigo, int pesoMaximo) {
		super(codigo);
		this.pesoMaximo = pesoMaximo;
	}

	@Override
	public boolean puedeAnotarse(Socio socio) {
		return super.puedeAnotarse(socio) && socio.getPeso() <= pesoMaximo;
	}

}
